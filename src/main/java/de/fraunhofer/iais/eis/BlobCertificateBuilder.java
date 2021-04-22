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

public class BlobCertificateBuilder {

	private DefaultBlobCertificate defaultBlobCertificate;

	public BlobCertificateBuilder() {
		defaultBlobCertificate = new DefaultBlobCertificate();
	}

	public BlobCertificateBuilder(URI id) {
		this();
		defaultBlobCertificate.id = id;
	}

	/**
	* This function allows setting a value for blobCertificateBlobCertificate
	* @param blobCertificateBlobCertificate desired value to be set
	* @return Builder object with new value for blobCertificateBlobCertificate
	*/
	final public BlobCertificateBuilder blobCertificateBlobCertificate(byte blobCertificateBlobCertificate) {
		this.defaultBlobCertificate.blobCertificateBlobCertificate = blobCertificateBlobCertificate;
		return this;
	}


	/**
	* This function allows setting a value for blobCertificateContainedExtensions
	* @param blobCertificateContainedExtensions desired value to be set
	* @return Builder object with new value for blobCertificateContainedExtensions
	*/
	final public BlobCertificateBuilder blobCertificateContainedExtensions(List<Reference> blobCertificateContainedExtensions) {
		this.defaultBlobCertificate.blobCertificateContainedExtensions = blobCertificateContainedExtensions;
		return this;
	}


	/**
	* This function allows setting a value for blobCertificateLastCertificate
	* @param blobCertificateLastCertificate desired value to be set
	* @return Builder object with new value for blobCertificateLastCertificate
	*/
	final public BlobCertificateBuilder blobCertificateLastCertificate(boolean blobCertificateLastCertificate) {
		this.defaultBlobCertificate.blobCertificateLastCertificate = blobCertificateLastCertificate;
		return this;
	}


	/**
	* This function allows setting a value for certificatePolicyAdministrationPoint
	* @param certificatePolicyAdministrationPoint desired value to be set
	* @return Builder object with new value for certificatePolicyAdministrationPoint
	*/
	final public BlobCertificateBuilder certificatePolicyAdministrationPoint(PolicyAdministrationPoint certificatePolicyAdministrationPoint) {
		this.defaultBlobCertificate.certificatePolicyAdministrationPoint = certificatePolicyAdministrationPoint;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public BlobCertificate build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultBlobCertificate);
		return defaultBlobCertificate;
	}
}
