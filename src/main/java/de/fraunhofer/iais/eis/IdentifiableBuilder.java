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

public class IdentifiableBuilder {

	private IdentifiableImpl identifiableImpl;

	public IdentifiableBuilder() {
		identifiableImpl = new IdentifiableImpl();
	}

	public IdentifiableBuilder(URI id) {
		this();
		identifiableImpl.id = id;
	}

	/**
	* This function allows setting a value for identifiableAdministration
	* @param _identifiableAdministration_ desired value to be set
	* @return Builder object with new value for identifiableAdministration
	*/
	final public IdentifiableBuilder _identifiableAdministration_(IAdministrativeInformation _identifiableAdministration_) {
		this.identifiableImpl._identifiableAdministration = _identifiableAdministration_;
		return this;
	}


	/**
	* This function allows setting a value for identifiableIdentification
	* @param _identifiableIdentification_ desired value to be set
	* @return Builder object with new value for identifiableIdentification
	*/
	final public IdentifiableBuilder _identifiableIdentification_(IIdentifier _identifiableIdentification_) {
		this.identifiableImpl._identifiableIdentification = _identifiableIdentification_;
		return this;
	}


	/**
	* This function allows setting a value for referableReferableCategory
	* @param _referableReferableCategory_ desired value to be set
	* @return Builder object with new value for referableReferableCategory
	*/
	final public IdentifiableBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.identifiableImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	/**
	* This function allows setting a value for referableDescription
	* @param _referableDescription_ desired value to be set
	* @return Builder object with new value for referableDescription
	*/
	final public IdentifiableBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.identifiableImpl._referableDescription = _referableDescription_;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param _referableDisplayName_ desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public IdentifiableBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
		this.identifiableImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param _referableIdShort_ desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public IdentifiableBuilder _referableIdShort_(String _referableIdShort_) {
		this.identifiableImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param _referableParent_ desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public IdentifiableBuilder _referableParent_(URI _referableParent_) {
		this.identifiableImpl._referableParent = _referableParent_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public IIdentifiable build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(identifiableImpl);
		return identifiableImpl;
	}
}
