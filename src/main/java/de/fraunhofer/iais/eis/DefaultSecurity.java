package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** 
* "Security"
* "Container for security relevant information of the AAS."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:Security")
public class DefaultSecurity implements Serializable, Security {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Security", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("Container for security relevant information of the AAS.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has access control policy points"
	* "Access control policy points of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Security/accessControlPolicyPoints", "securityAccessControlPolicyPoints"})
	protected PolicyAdministrationPoint securityAccessControlPolicyPoints;


	/**
	* "has certificate"
	* "Certificates of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Security/certificate", "securityCertificate"})
	protected List<Certificate> securityCertificates;


	/**
	* "has required certificate extension"
	* "Certificate extensions as required by the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Security/requiredCertificateExtension", "securityRequiredCertificateExtension"})
	protected List<Reference> securityRequiredCertificateExtensions;


	// no manual construction
	protected DefaultSecurity() {
		id = VocabUtil.getInstance().createRandomUrl("security");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public List<TypedLiteral> getLabels() {
		return this.labels;
	}

	public List<TypedLiteral> getComments() {
		return this.comments;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	public int hashCode() {
		return Objects.hash(new Object[]{this.securityAccessControlPolicyPoints,
			this.securityCertificates,
			this.securityRequiredCertificateExtensions});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultSecurity other = (DefaultSecurity) obj;
			return Objects.equals(this.securityAccessControlPolicyPoints, other.securityAccessControlPolicyPoints) &&
				Objects.equals(this.securityCertificates, other.securityCertificates) &&
				Objects.equals(this.securityRequiredCertificateExtensions, other.securityRequiredCertificateExtensions);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Security/accessControlPolicyPoints")
	final public PolicyAdministrationPoint getSecurityAccessControlPolicyPoints() {
		return securityAccessControlPolicyPoints;
	}
	
	final public void setSecurityAccessControlPolicyPoints (PolicyAdministrationPoint securityAccessControlPolicyPoints) {
		this.securityAccessControlPolicyPoints = securityAccessControlPolicyPoints;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Security/certificate")
	final public List<Certificate> getSecurityCertificates() {
		return securityCertificates;
	}
	
	final public void setSecurityCertificates (List<Certificate> securityCertificates) {
		this.securityCertificates = securityCertificates;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Security/requiredCertificateExtension")
	final public List<Reference> getSecurityRequiredCertificateExtensions() {
		return securityRequiredCertificateExtensions;
	}
	
	final public void setSecurityRequiredCertificateExtensions (List<Reference> securityRequiredCertificateExtensions) {
		this.securityRequiredCertificateExtensions = securityRequiredCertificateExtensions;
	}
}
