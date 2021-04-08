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

public class FormulaBuilder {

	private FormulaImpl formulaImpl;

	public FormulaBuilder() {
		formulaImpl = new FormulaImpl();
	}

	public FormulaBuilder(URI id) {
		this();
		formulaImpl.id = id;
	}

	/**
	* This function allows setting a value for formulaDependsOn
	* @param _formulaDependsOn_ desired value to be set
	* @return Builder object with new value for formulaDependsOn
	*/
	final public FormulaBuilder _formulaDependsOn_(ArrayList<? extends IReference> _formulaDependsOn_) {
		this.formulaImpl._formulaDependsOn = _formulaDependsOn_;
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public IFormula build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(formulaImpl);
		return formulaImpl;
	}
}
