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
* "Blob Certificate"
* "Certificate provided as BLOB."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:BlobCertificate")
public class DefaultBlobCertificate implements Serializable, BlobCertificate {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Blob Certificate", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Certificate provided as BLOB.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "Blob Certificate"
	* "Certificate as BLOB."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate", "blobCertificate"})
	protected byte blobCertificate;


	/**
	* "contains extension"
	* "Extensions contained in the certificate."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension", "containedExtension"})
	protected List<Reference> containedExtension;


	/**
	* "is last certificate"
	* "Denotes whether this certificate is the certificated that fast added last."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate", "lastCertificate"})
	protected boolean lastCertificate;


	/**
	* "has policy administration point"
	* "The access control administration policy point of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint", "policyAdministrationPoint"})
	protected PolicyAdministrationPoint policyAdministrationPoint;


	// no manual construction
	protected DefaultBlobCertificate() {
		id = VocabUtil.getInstance().createRandomUrl("blobCertificate");
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

	/**
	* This function returns a hash code value for the BlobCertificate for the benefit of e.g. hash tables.
	* @return a hash code value for the BlobCertificate
	*/
	public int hashCode() {
		return Objects.hash(new Object[]{super.hashCode(), this.blobCertificate, this.containedExtension, this.lastCertificate});
	}

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this BlobCertificate is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultBlobCertificate other = (DefaultBlobCertificate) obj;
			return super.equals(other) && Objects.equals(this.blobCertificate, other.blobCertificate) && Objects.equals(this.containedExtension, other.containedExtension) && Objects.equals(this.lastCertificate, other.lastCertificate);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "Certificate as BLOB."@en
	* @return Returns the byte for the property blobCertificate.
	* More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate")
	final public byte getBlobCertificate() {
		return blobCertificate;
	}

	
	/**
	* "Certificate as BLOB."@en
	* @param blobCertificate desired value for the property blobCertificate.
	* More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate
	*/
	final public void setBlobCertificate (byte blobCertificate) {
		this.blobCertificate = blobCertificate;
	}

	/**
	* "Extensions contained in the certificate."@en
	* @return Returns the List of Reference for the property containedExtension.
	* More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension")
	final public List<Reference> getContainedExtension() {
		return containedExtension;
	}

	
	/**
	* "Extensions contained in the certificate."@en
	* @param containedExtension desired value for the property containedExtension.
	* More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension
	*/
	final public void setContainedExtension (List<Reference> containedExtension) {
		this.containedExtension = containedExtension;
	}

	/**
	* "Denotes whether this certificate is the certificated that fast added last."@en
	* @return Returns the boolean for the property lastCertificate.
	* More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate")
	final public boolean getLastCertificate() {
		return lastCertificate;
	}

	
	/**
	* "Denotes whether this certificate is the certificated that fast added last."@en
	* @param lastCertificate desired value for the property lastCertificate.
	* More information under https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate
	*/
	final public void setLastCertificate (boolean lastCertificate) {
		this.lastCertificate = lastCertificate;
	}

	/**
	* "The access control administration policy point of the AAS."@en
	* @return Returns the PolicyAdministrationPoint for the property policyAdministrationPoint.
	* More information under https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint")
	final public PolicyAdministrationPoint getPolicyAdministrationPoint() {
		return policyAdministrationPoint;
	}

	
	/**
	* "The access control administration policy point of the AAS."@en
	* @param policyAdministrationPoint desired value for the property policyAdministrationPoint.
	* More information under https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint
	*/
	final public void setPolicyAdministrationPoint (PolicyAdministrationPoint policyAdministrationPoint) {
		this.policyAdministrationPoint = policyAdministrationPoint;
	}
}
