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

public class IdentifierBuilder {

	private Map<String, Object> map;

	public IdentifierBuilder() {
		this.map = new HashMap<>();
	}

	public IdentifierBuilder(Map<String, Object> map) {
		this();
		for (Map.Entry<String, Object> entry : map.entrySet()){
			this.map.put(entry.getKey(), Util.clone(entry.getValue()));
		}
	}


	/**
	* This function allows setting a value for identifier
	* @param identifier desired value to be set
	* @return Builder object with new value for identifier
	*/
	public IdentifierBuilder identifier(String identifier) {
		this.map.put("identifier", identifier);
		return this;
	}


	/**
	* This function allows setting a value for idType
	* @param idType desired value to be set
	* @return Builder object with new value for idType
	*/
	public IdentifierBuilder idType(IdentifierType idType) {
		this.map.put("idType", idType);
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/
	final public Identifier build() throws ConstraintViolationException {
		DefaultIdentifier defaultIdentifier = Util.fillInstanceFromMap(new DefaultIdentifier(), this.map);
		return defaultIdentifier;
	}
}
