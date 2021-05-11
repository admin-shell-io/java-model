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

public class ReferableBuilder {

	private DefaultReferable defaultReferable;

	public ReferableBuilder() {
		defaultReferable = new DefaultReferable();
	}

	public ReferableBuilder(URI id) {
		this();
		defaultReferable.id = id;
	}

	/**
	* This function allows setting a value for referableCategory
	* @param referableCategory desired value to be set
	* @return Builder object with new value for referableCategory
	*/
	final public ReferableBuilder referableCategory(String referableCategory) {
		this.defaultReferable.referableCategory = referableCategory;
		return this;
	}


	/**
	* This function allows setting a value for description
	* @param description desired value to be set
	* @return Builder object with new value for description
	*/
	final public ReferableBuilder description(TypedLiteral description) {
		this.defaultReferable.description = description;
		return this;
	}


	/**
	* This function allows setting a value for displayName
	* @param displayName desired value to be set
	* @return Builder object with new value for displayName
	*/
	final public ReferableBuilder displayName(TypedLiteral displayName) {
		this.defaultReferable.displayName = displayName;
		return this;
	}


	/**
	* This function allows setting a value for idShort
	* @param idShort desired value to be set
	* @return Builder object with new value for idShort
	*/
	final public ReferableBuilder idShort(String idShort) {
		this.defaultReferable.idShort = idShort;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public Referable build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultReferable);
		return defaultReferable;
	}
}
