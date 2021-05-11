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

public class SubmodelBuilder {

	private DefaultSubmodel defaultSubmodel;

	public SubmodelBuilder() {
		defaultSubmodel = new DefaultSubmodel();
	}

	public SubmodelBuilder(URI id) {
		this();
		defaultSubmodel.id = id;
	}

	/**
	* This function allows setting a value for submodelElements
	* @param submodelElements desired value to be set
	* @return Builder object with new value for submodelElements
	*/
	final public SubmodelBuilder submodelElements(List<SubmodelElement> submodelElements) {
		this.defaultSubmodel.submodelElements = submodelElements;
		return this;
	}


	/**
	* This function allows setting a value for qualifiers
	* @param qualifiers desired value to be set
	* @return Builder object with new value for qualifiers
	*/
	final public SubmodelBuilder qualifiers(List<Constraint> qualifiers) {
		this.defaultSubmodel.qualifiers = qualifiers;
		return this;
	}


	/**
	* This function allows setting a value for dataSpecifications
	* @param dataSpecifications desired value to be set
	* @return Builder object with new value for dataSpecifications
	*/
	final public SubmodelBuilder dataSpecifications(List<Reference> dataSpecifications) {
		this.defaultSubmodel.dataSpecifications = dataSpecifications;
		return this;
	}


	/**
	* This function allows setting a value for administration
	* @param administration desired value to be set
	* @return Builder object with new value for administration
	*/
	final public SubmodelBuilder administration(AdministrativeInformation administration) {
		this.defaultSubmodel.administration = administration;
		return this;
	}


	/**
	* This function allows setting a value for identification
	* @param identification desired value to be set
	* @return Builder object with new value for identification
	*/
	final public SubmodelBuilder identification(Identifier identification) {
		this.defaultSubmodel.identification = identification;
		return this;
	}


	/**
	* This function allows setting a value for referableCategory
	* @param referableCategory desired value to be set
	* @return Builder object with new value for referableCategory
	*/
	final public SubmodelBuilder referableCategory(String referableCategory) {
		this.defaultSubmodel.referableCategory = referableCategory;
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param description desired value to be set
	* @return Builder object with new value for description
	*/
	final public SubmodelBuilder description(TypedLiteral description) {
		this.defaultSubmodel.description = description;
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	final public SubmodelBuilder displayName(TypedLiteral displayName) {
		this.defaultSubmodel.displayName = displayName;
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	final public SubmodelBuilder idShort(String idShort) {
		this.defaultSubmodel.idShort = idShort;
		return this;
	}


	/**
	* This function allows setting a value for kind
	* @param kind desired value to be set
	* @return Builder object with new value for kind
	*/
	final public SubmodelBuilder kind(ModelingKind kind) {
		this.defaultSubmodel.kind = kind;
		return this;
	}


	/**
	* This function allows setting a value for semanticId
	* @param semanticId desired value to be set
	* @return Builder object with new value for semanticId
	*/
	final public SubmodelBuilder semanticId(Reference semanticId) {
		this.defaultSubmodel.semanticId = semanticId;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Submodel build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultSubmodel);
		return defaultSubmodel;
	}
}
