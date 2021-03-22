package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/** 
	"Permission Per Object"

	"Table that defines access permissions for a specified object. The object is any referable element in the AAS. Additionally object attributes can be defined that further specify the kind of object the permissions apply to."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:PermissionsPerObject")
public class PermissionsPerObjectImpl implements Serializable, PermissionsPerObject {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Permission Per Object", ""));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Table that defines access permissions for a specified object. The object is any referable element in the AAS. Additionally object attributes can be defined that further specify the kind of object the permissions apply to.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"has object"

	"Element to which permission shall be assigned."@en
	*/
	@NotNull@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object", "permissionsPerObjectObject"})
	 Referable _permissionsPerObjectObject;


	/**
	"has object permission"

	"Permissions assigned to the object. The permissions hold for all subjects as specified in the access permission rule."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission", "permissionsPerObjectPermission"})
	 java.util.ArrayList<? extends Permission> _permissionsPerObjectPermission;


	/**
	"has target object attributes"

	"Target object attributes that need to be fulfilled so that the access permissions apply to the accessing subject."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes", "permissionsPerObjectTargetObjectAttributes"})
	 ObjectAttributes _permissionsPerObjectTargetObjectAttributes;


	// no manual construction
	PermissionsPerObjectImpl() {
		id = VocabUtil.getInstance().createRandomUrl("permissionsPerObject");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public java.util.List<TypedLiteral> getLabel() {
		return this.label;
	}

	public java.util.List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public java.util.Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		java.util.Map<String,Object> resultset = new HashMap<String, Object>();
		while (iter.hasNext()) {
			String key = iter.next();
			resultset.put(key,urifyObjects(this.properties.get(key)));
		}
		return resultset ;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof java.util.Map) {
			java.util.Map<String, Object> result_map = new HashMap<String, Object>();
			((java.util.Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
	if (this.properties == null) this.properties = new java.util.HashMap<String,Object>();
	if (property.startsWith("@")) {return ;};
	this.properties.put(property, value) ;
	}
	// accessor method implementations as derived from information model

	final public 
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object")
	Referable getPermissionsPerObjectObject() {
		return _permissionsPerObjectObject;
	}

	final public void setPermissionsPerObjectObject (Referable _permissionsPerObjectObject_) {
		this._permissionsPerObjectObject = _permissionsPerObjectObject_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission")
	java.util.ArrayList<? extends Permission> getPermissionsPerObjectPermission() {
		return _permissionsPerObjectPermission;
	}

	final public void setPermissionsPerObjectPermission (java.util.ArrayList<? extends Permission> _permissionsPerObjectPermission_) {
		this._permissionsPerObjectPermission = _permissionsPerObjectPermission_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes")
	ObjectAttributes getPermissionsPerObjectTargetObjectAttributes() {
		return _permissionsPerObjectTargetObjectAttributes;
	}

	final public void setPermissionsPerObjectTargetObjectAttributes (ObjectAttributes _permissionsPerObjectTargetObjectAttributes_) {
		this._permissionsPerObjectTargetObjectAttributes = _permissionsPerObjectTargetObjectAttributes_;
	}
}
