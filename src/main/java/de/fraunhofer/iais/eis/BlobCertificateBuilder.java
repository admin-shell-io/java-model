package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BlobCertificateBuilder {

	private Map<String, Object> map;

	public BlobCertificateBuilder() {
		this.map = new HashMap<>();
	}

	public BlobCertificateBuilder(Map<String, Object> map) {
		this();
		for (Map.Entry<String, Object> entry : map.entrySet()){
			this.map.put(entry.getKey(), Util.clone(entry.getValue()));
		}
	}


	/**
	* This function allows setting a value for blobCertificate
	* @param blobCertificate desired value to be set
	* @return Builder object with new value for blobCertificate
	*/
	public BlobCertificateBuilder blobCertificate(Blob blobCertificate) {
		this.map.put("blobCertificate", blobCertificate);
		return this;
	}


	/**
	* This function allows setting a value for containedExtensions
	* @param containedExtensions desired value to be set
	* @return Builder object with new value for containedExtensions
	*/
	public BlobCertificateBuilder containedExtensions(List<Reference> containedExtensions) {
		this.map.put("containedExtensions", containedExtensions);
		return this;
	}


	/**
	* This function allows setting a value for lastCertificate
	* @param lastCertificate desired value to be set
	* @return Builder object with new value for lastCertificate
	*/
	public BlobCertificateBuilder lastCertificate(boolean lastCertificate) {
		this.map.put("lastCertificate", lastCertificate);
		return this;
	}


	/**
	* This function allows setting a value for policyAdministrationPoint
	* @param policyAdministrationPoint desired value to be set
	* @return Builder object with new value for policyAdministrationPoint
	*/
	public BlobCertificateBuilder policyAdministrationPoint(PolicyAdministrationPoint policyAdministrationPoint) {
		this.map.put("policyAdministrationPoint", policyAdministrationPoint);
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/
	final public BlobCertificate build() throws ConstraintViolationException {
		DefaultBlobCertificate defaultBlobCertificate = Util.fillInstanceFromMap(new DefaultBlobCertificate(), this.map);
		return defaultBlobCertificate;
	}
}
