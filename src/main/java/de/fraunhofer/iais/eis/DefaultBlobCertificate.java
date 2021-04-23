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
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Blob Certificate", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("Certificate provided as BLOB.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "Blob Certificate"
	* "Certificate as BLOB."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate", "blobCertificateBlobCertificate"})
	protected byte blobCertificateBlobCertificate;


	/**
	* "contains extension"
	* "Extensions contained in the certificate."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension", "blobCertificateContainedExtension"})
	protected List<Reference> blobCertificateContainedExtensions;


	/**
	* "is last certificate"
	* "Denotes whether this certificate is the certificated that fast added last."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate", "blobCertificateLastCertificate"})
	protected boolean blobCertificateLastCertificate;


	/**
	* "has policy administration point"
	* "The access control administration policy point of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint", "certificatePolicyAdministrationPoint"})
	protected PolicyAdministrationPoint certificatePolicyAdministrationPoint;


	// no manual construction
	protected DefaultBlobCertificate() {
		id = VocabUtil.getInstance().createRandomUrl("blobCertificate");
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

	public int hashCode() {
		return Objects.hash(new Object[]{this.blobCertificateBlobCertificate,
			this.blobCertificateContainedExtensions,
			this.blobCertificateLastCertificate,
			this.certificatePolicyAdministrationPoint});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultBlobCertificate other = (DefaultBlobCertificate) obj;
			return Objects.equals(this.blobCertificateBlobCertificate, other.blobCertificateBlobCertificate) &&
				Objects.equals(this.blobCertificateContainedExtensions, other.blobCertificateContainedExtensions) &&
				Objects.equals(this.blobCertificateLastCertificate, other.blobCertificateLastCertificate) &&
				Objects.equals(this.certificatePolicyAdministrationPoint, other.certificatePolicyAdministrationPoint);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate")
	final public byte getBlobCertificateBlobCertificate() {
		return blobCertificateBlobCertificate;
	}
	
	final public void setBlobCertificateBlobCertificate (byte blobCertificateBlobCertificate) {
		this.blobCertificateBlobCertificate = blobCertificateBlobCertificate;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension")
	final public List<Reference> getBlobCertificateContainedExtensions() {
		return blobCertificateContainedExtensions;
	}
	
	final public void setBlobCertificateContainedExtensions (List<Reference> blobCertificateContainedExtensions) {
		this.blobCertificateContainedExtensions = blobCertificateContainedExtensions;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate")
	final public boolean getBlobCertificateLastCertificate() {
		return blobCertificateLastCertificate;
	}
	
	final public void setBlobCertificateLastCertificate (boolean blobCertificateLastCertificate) {
		this.blobCertificateLastCertificate = blobCertificateLastCertificate;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint")
	final public PolicyAdministrationPoint getCertificatePolicyAdministrationPoint() {
		return certificatePolicyAdministrationPoint;
	}
	
	final public void setCertificatePolicyAdministrationPoint (PolicyAdministrationPoint certificatePolicyAdministrationPoint) {
		this.certificatePolicyAdministrationPoint = certificatePolicyAdministrationPoint;
	}
}
