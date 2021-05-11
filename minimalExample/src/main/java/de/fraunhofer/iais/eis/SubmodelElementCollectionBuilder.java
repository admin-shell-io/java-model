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
	* This function allows setting a value for ordereds
	* @param ordereds desired value to be set
	* @return Builder object with new value for ordereds
	*/
	final public SubmodelElementCollectionBuilder ordereds(List<Boolean> ordereds) {
		this.defaultSubmodelElementCollection.ordereds = ordereds;
		return this;
	}


	/**
	* This function allows setting a value for values
	* @param values desired value to be set
	* @return Builder object with new value for values
	*/
	final public SubmodelElementCollectionBuilder values(List<SubmodelElement> values) {
		this.defaultSubmodelElementCollection.values = values;
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
