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

	private Map<String, Object> map;

	public SubmodelBuilder() {
		this.map = new HashMap<>();
	}

	public SubmodelBuilder(Map<String, Object> map) {
		this();
		for (Map.Entry<String, Object> entry : map.entrySet()){
			this.map.put(entry.getKey(), Util.clone(entry.getValue()));
		}
	}


	/**
	* This function allows setting a value for submodelElements
	* @param submodelElements desired value to be set
	* @return Builder object with new value for submodelElements
	*/
	public SubmodelBuilder submodelElements(List<SubmodelElement> submodelElements) {
		this.map.put("submodelElements", submodelElements);
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/
	final public Submodel build() throws ConstraintViolationException {
		DefaultSubmodel defaultSubmodel = Util.fillInstanceFromMap(new DefaultSubmodel(), this.map);
		return defaultSubmodel;
	}
}
