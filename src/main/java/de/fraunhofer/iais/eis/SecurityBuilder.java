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

public class SecurityBuilder {

	private SecurityImpl securityImpl;

	public SecurityBuilder() {
		securityImpl = new SecurityImpl();
	}

	public SecurityBuilder(URI id) {
		this();
		securityImpl.id = id;
	}

	/**
	* This function allows setting a value for securityAccessControlPolicyPoints
	* @param _securityAccessControlPolicyPoints_ desired value to be set
	* @return Builder object with new value for securityAccessControlPolicyPoints
	*/
	final public SecurityBuilder _securityAccessControlPolicyPoints_(IPolicyAdministrationPoint _securityAccessControlPolicyPoints_) {
		this.securityImpl._securityAccessControlPolicyPoints = _securityAccessControlPolicyPoints_;
		return this;
	}


	/**
	* This function allows setting a value for securityCertificate
	* @param _securityCertificate_ desired value to be set
	* @return Builder object with new value for securityCertificate
	*/
	final public SecurityBuilder _securityCertificate_(ArrayList<? extends ICertificate> _securityCertificate_) {
		this.securityImpl._securityCertificate = _securityCertificate_;
		return this;
	}


	/**
	* This function allows setting a value for securityRequiredCertificateExtension
	* @param _securityRequiredCertificateExtension_ desired value to be set
	* @return Builder object with new value for securityRequiredCertificateExtension
	*/
	final public SecurityBuilder _securityRequiredCertificateExtension_(ArrayList<? extends IReference> _securityRequiredCertificateExtension_) {
		this.securityImpl._securityRequiredCertificateExtension = _securityRequiredCertificateExtension_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public ISecurity build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(securityImpl);
		return securityImpl;
	}
}
