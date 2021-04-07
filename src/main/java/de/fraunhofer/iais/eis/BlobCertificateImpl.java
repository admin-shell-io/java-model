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
	"Blob Certificate"

	"Certificate provided as BLOB."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:BlobCertificate")
public class BlobCertificateImpl implements Serializable, IBlobCertificate {

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
	"Blob Certificate"

	"Certificate as BLOB."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate", "blobCertificateBlobCertificate"})
	protected byte _blobCertificateBlobCertificate;


	/**
	"contains extension"

	"Extensions contained in the certificate."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension", "blobCertificateContainedExtension"})
	protected ArrayList<? extends IReference> _blobCertificateContainedExtension;


	/**
	"is last certificate"

	"Denotes whether this certificate is the certificated that fast added last."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate", "blobCertificateLastCertificate"})
	protected boolean _blobCertificateLastCertificate;


	/**
	"has policy administration point"

	"The access control administration policy point of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint", "certificatePolicyAdministrationPoint"})
	protected IPolicyAdministrationPoint _certificatePolicyAdministrationPoint;


	// no manual construction
	protected BlobCertificateImpl() {
		id = VocabUtil.getInstance().createRandomUrl("blobCertificate");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public List<TypedLiteral> getLabel() {
		return this.label;
	}

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
	"Certificate as BLOB."@en
	@return the byte of blobCertificateBlobCertificate
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/blobCertificate")
	final public byte getBlobCertificateBlobCertificate() {
		return _blobCertificateBlobCertificate;
	}

	final public void setBlobCertificateBlobCertificate (byte _blobCertificateBlobCertificate_) {
		this._blobCertificateBlobCertificate = _blobCertificateBlobCertificate_;
	}

	/**
	"Extensions contained in the certificate."@en
	@return the List of blobCertificateContainedExtension
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/containedExtension")
	final public List<? extends IReference> getBlobCertificateContainedExtension() {
		return _blobCertificateContainedExtension;
	}

	final public void setBlobCertificateContainedExtension (ArrayList<? extends IReference> _blobCertificateContainedExtension_) {
		this._blobCertificateContainedExtension = _blobCertificateContainedExtension_;
	}

	/**
	"Denotes whether this certificate is the certificated that fast added last."@en
	@return the boolean of blobCertificateLastCertificate
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/BlobCertificate/lastCertificate")
	final public boolean getBlobCertificateLastCertificate() {
		return _blobCertificateLastCertificate;
	}

	final public void setBlobCertificateLastCertificate (boolean _blobCertificateLastCertificate_) {
		this._blobCertificateLastCertificate = _blobCertificateLastCertificate_;
	}

	/**
	"The access control administration policy point of the AAS."@en
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Certificate/policyAdministrationPoint")
	final public IPolicyAdministrationPoint getCertificatePolicyAdministrationPoint() {
		return _certificatePolicyAdministrationPoint;
	}

	final public void setCertificatePolicyAdministrationPoint (IPolicyAdministrationPoint _certificatePolicyAdministrationPoint_) {
		this._certificatePolicyAdministrationPoint = _certificatePolicyAdministrationPoint_;
	}
}
