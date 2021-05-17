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

public class PermissionsPerObjectBuilder {

	private Map<String, Object> map;

	public PermissionsPerObjectBuilder() {
		this.map = new HashMap<>();
	}

	public PermissionsPerObjectBuilder(Map<String, Object> map) {
		this();
		for (Map.Entry<String, Object> entry : map.entrySet()){
			this.map.put(entry.getKey(), Util.clone(entry.getValue()));
		}
	}


	/**
	* This function allows setting a value for object
	* @param object desired value to be set
	* @return Builder object with new value for object
	*/
	public PermissionsPerObjectBuilder object(Referable object) {
		this.map.put("object", object);
		return this;
	}


	/**
	* This function allows setting a value for permissions
	* @param permissions desired value to be set
	* @return Builder object with new value for permissions
	*/
	public PermissionsPerObjectBuilder permissions(List<Permission> permissions) {
		this.map.put("permissions", permissions);
		return this;
	}


	/**
	* This function allows setting a value for targetObjectAttributes
	* @param targetObjectAttributes desired value to be set
	* @return Builder object with new value for targetObjectAttributes
	*/
	public PermissionsPerObjectBuilder targetObjectAttributes(ObjectAttributes targetObjectAttributes) {
		this.map.put("targetObjectAttributes", targetObjectAttributes);
		return this;
	}

	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/
	final public PermissionsPerObject build() throws ConstraintViolationException {
		DefaultPermissionsPerObject defaultPermissionsPerObject = Util.fillInstanceFromMap(new DefaultPermissionsPerObject(), this.map);
		return defaultPermissionsPerObject;
	}
}
