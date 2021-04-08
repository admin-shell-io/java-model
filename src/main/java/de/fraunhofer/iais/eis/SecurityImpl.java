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
public class SecurityImpl implements Serializable, ISecurity {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Security", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Container for security relevant information of the AAS.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has access control policy points"
	* "Access control policy points of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Security/accessControlPolicyPoints", "securityAccessControlPolicyPoints"})
	protected IPolicyAdministrationPoint _securityAccessControlPolicyPoints;


	/**
	* "has certificate"
	* "Certificates of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Security/certificate", "securityCertificate"})
	protected ArrayList<? extends ICertificate> _securityCertificate;


	/**
	* "has required certificate extension"
	* "Certificate extensions as required by the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Security/requiredCertificateExtension", "securityRequiredCertificateExtension"})
	protected ArrayList<? extends IReference> _securityRequiredCertificateExtension;


	// no manual construction
	protected SecurityImpl() {
		id = VocabUtil.getInstance().createRandomUrl("security");
	}

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment() {
		return this.comment;
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


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "Access control policy points of the AAS."@en
	* @return Returns the IPolicyAdministrationPoint for the property securityAccessControlPolicyPoints.
	* More information under https://admin-shell.io/aas/3/0/RC01/Security/accessControlPolicyPoints
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Security/accessControlPolicyPoints")
	final public IPolicyAdministrationPoint getSecurityAccessControlPolicyPoints() {
		return _securityAccessControlPolicyPoints;
	}

	
	/**
	* "Access control policy points of the AAS."@en
	* @param _securityAccessControlPolicyPoints_ desired value for the property securityAccessControlPolicyPoints.
	* More information under https://admin-shell.io/aas/3/0/RC01/Security/accessControlPolicyPoints
	*/
	final public void setSecurityAccessControlPolicyPoints (IPolicyAdministrationPoint _securityAccessControlPolicyPoints_) {
		this._securityAccessControlPolicyPoints = _securityAccessControlPolicyPoints_;
	}

	/**
	* "Certificates of the AAS."@en
	* @return Returns the List of ICertificate for the property securityCertificate.
	* More information under https://admin-shell.io/aas/3/0/RC01/Security/certificate
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Security/certificate")
	final public List<? extends ICertificate> getSecurityCertificate() {
		return _securityCertificate;
	}

	
	/**
	* "Certificates of the AAS."@en
	* @param _securityCertificate_ desired value for the property securityCertificate.
	* More information under https://admin-shell.io/aas/3/0/RC01/Security/certificate
	*/
	final public void setSecurityCertificate (ArrayList<? extends ICertificate> _securityCertificate_) {
		this._securityCertificate = _securityCertificate_;
	}

	/**
	* "Certificate extensions as required by the AAS."@en
	* @return Returns the List of IReference for the property securityRequiredCertificateExtension.
	* More information under https://admin-shell.io/aas/3/0/RC01/Security/requiredCertificateExtension
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Security/requiredCertificateExtension")
	final public List<? extends IReference> getSecurityRequiredCertificateExtension() {
		return _securityRequiredCertificateExtension;
	}

	
	/**
	* "Certificate extensions as required by the AAS."@en
	* @param _securityRequiredCertificateExtension_ desired value for the property securityRequiredCertificateExtension.
	* More information under https://admin-shell.io/aas/3/0/RC01/Security/requiredCertificateExtension
	*/
	final public void setSecurityRequiredCertificateExtension (ArrayList<? extends IReference> _securityRequiredCertificateExtension_) {
		this._securityRequiredCertificateExtension = _securityRequiredCertificateExtension_;
	}
}
