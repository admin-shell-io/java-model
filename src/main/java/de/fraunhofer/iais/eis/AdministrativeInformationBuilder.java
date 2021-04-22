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

public class AdministrativeInformationBuilder {

	private DefaultAdministrativeInformation defaultAdministrativeInformation;

	public AdministrativeInformationBuilder() {
		defaultAdministrativeInformation = new DefaultAdministrativeInformation();
	}

	public AdministrativeInformationBuilder(URI id) {
		this();
		defaultAdministrativeInformation.id = id;
	}

	/**
	* This function allows setting a value for administrativeInformationVersion
	* @param administrativeInformationVersion desired value to be set
	* @return Builder object with new value for administrativeInformationVersion
	*/
	final public AdministrativeInformationBuilder administrativeInformationVersion(String administrativeInformationVersion) {
		this.defaultAdministrativeInformation.administrativeInformationVersion = administrativeInformationVersion;
		return this;
	}


	/**
	* This function allows setting a value for administrativeInformationRevision
	* @param administrativeInformationRevision desired value to be set
	* @return Builder object with new value for administrativeInformationRevision
	*/
	final public AdministrativeInformationBuilder administrativeInformationRevision(String administrativeInformationRevision) {
		this.defaultAdministrativeInformation.administrativeInformationRevision = administrativeInformationRevision;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecifications
	* @param hasDataSpecificationDataSpecifications desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecifications
	*/
	final public AdministrativeInformationBuilder hasDataSpecificationDataSpecifications(List<Reference> hasDataSpecificationDataSpecifications) {
		this.defaultAdministrativeInformation.hasDataSpecificationDataSpecifications = hasDataSpecificationDataSpecifications;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public AdministrativeInformation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultAdministrativeInformation);
		return defaultAdministrativeInformation;
	}
}
