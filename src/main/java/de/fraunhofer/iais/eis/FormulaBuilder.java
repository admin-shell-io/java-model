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

public class FormulaBuilder {

	private Map<String, Object> map;

	public FormulaBuilder() {
		this.map = new HashMap<>();
	}

	public FormulaBuilder(Map<String, Object> map) {
		this();
		for (Map.Entry<String, Object> entry : map.entrySet()){
			this.map.put(entry.getKey(), Util.clone(entry.getValue()));
		}
	}


	/**
	* This function allows setting a value for dependsOns
	* @param dependsOns desired value to be set
	* @return Builder object with new value for dependsOns
	*/
	public FormulaBuilder dependsOns(List<Reference> dependsOns) {
		this.map.put("dependsOns", dependsOns);
		return this;
	}


	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/
	final public Formula build() throws ConstraintViolationException {
		DefaultFormula defaultFormula = Util.fillInstanceFromMap(new DefaultFormula(), this.map);
		return defaultFormula;
	}
}
