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

public class SecurityBuilder {

	private DefaultSecurity defaultSecurity;

	public SecurityBuilder() {
		defaultSecurity = new DefaultSecurity();
	}

	public SecurityBuilder(URI id) {
		this();
		defaultSecurity.id = id;
	}

	/**
	* This function allows setting a value for securityAccessControlPolicyPoints
	* @param securityAccessControlPolicyPoints desired value to be set
	* @return Builder object with new value for securityAccessControlPolicyPoints
	*/
	final public SecurityBuilder securityAccessControlPolicyPoints(PolicyAdministrationPoint securityAccessControlPolicyPoints) {
		this.defaultSecurity.securityAccessControlPolicyPoints = securityAccessControlPolicyPoints;
		return this;
	}


	/**
	* This function allows setting a value for securityCertificates
	* @param securityCertificates desired value to be set
	* @return Builder object with new value for securityCertificates
	*/
	final public SecurityBuilder securityCertificates(List<Certificate> securityCertificates) {
		this.defaultSecurity.securityCertificates = securityCertificates;
		return this;
	}


	/**
	* This function allows setting a value for securityRequiredCertificateExtensions
	* @param securityRequiredCertificateExtensions desired value to be set
	* @return Builder object with new value for securityRequiredCertificateExtensions
	*/
	final public SecurityBuilder securityRequiredCertificateExtensions(List<Reference> securityRequiredCertificateExtensions) {
		this.defaultSecurity.securityRequiredCertificateExtensions = securityRequiredCertificateExtensions;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Security build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultSecurity);
		return defaultSecurity;
	}
}
