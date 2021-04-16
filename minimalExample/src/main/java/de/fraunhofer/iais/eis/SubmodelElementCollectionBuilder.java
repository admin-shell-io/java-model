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

public class SubmodelElementCollectionBuilder {

	private DefaultSubmodelElementCollection defaultSubmodelElementCollection;

	public SubmodelElementCollectionBuilder() {
		defaultSubmodelElementCollection = new DefaultSubmodelElementCollection();
	}

	public SubmodelElementCollectionBuilder(URI id) {
		this();
		defaultSubmodelElementCollection.id = id;
	}

	/**
	* This function allows setting a value for allowDuplicates
	* @param allowDuplicates desired value to be set
	* @return Builder object with new value for allowDuplicates
	*/
	final public SubmodelElementCollectionBuilder allowDuplicates(List<Boolean> allowDuplicates) {
		this.defaultSubmodelElementCollection.allowDuplicates = allowDuplicates;
		return this;
	}


	/**
	* This function allows setting a value for ordered
	* @param ordered desired value to be set
	* @return Builder object with new value for ordered
	*/
	final public SubmodelElementCollectionBuilder ordered(List<Boolean> ordered) {
		this.defaultSubmodelElementCollection.ordered = ordered;
		return this;
	}


	/**
	* This function allows setting a value for value
	* @param value desired value to be set
	* @return Builder object with new value for value
	*/
	final public SubmodelElementCollectionBuilder value(List<SubmodelElement> value) {
		this.defaultSubmodelElementCollection.value = value;
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public SubmodelElementCollection build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultSubmodelElementCollection);
		return defaultSubmodelElementCollection;
	}
}
