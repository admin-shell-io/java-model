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

/** 
* "Permission Per Object"
* "Table that defines access permissions for a specified object. The object is any referable element in the AAS. Additionally object attributes can be defined that further specify the kind of object the permissions apply to."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:PermissionsPerObject")
public class DefaultPermissionsPerObject implements Serializable, PermissionsPerObject {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Permission Per Object", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("Table that defines access permissions for a specified object. The object is any referable element in the AAS. Additionally object attributes can be defined that further specify the kind of object the permissions apply to.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has object"
	* "Element to which permission shall be assigned."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object", "permissionsPerObjectObject"})
	protected Referable permissionsPerObjectObject;


	/**
	* "has object permission"
	* "Permissions assigned to the object. The permissions hold for all subjects as specified in the access permission rule."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission", "permissionsPerObjectPermission"})
	protected List<Permission> permissionsPerObjectPermissions;


	/**
	* "has target object attributes"
	* "Target object attributes that need to be fulfilled so that the access permissions apply to the accessing subject."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes", "permissionsPerObjectTargetObjectAttributes"})
	protected ObjectAttributes permissionsPerObjectTargetObjectAttributes;


	// no manual construction
	protected DefaultPermissionsPerObject() {
		id = VocabUtil.getInstance().createRandomUrl("permissionsPerObject");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public List<TypedLiteral> getLabels() {
		return this.labels;
	}

	public List<TypedLiteral> getComments() {
		return this.comments;
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
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	public int hashCode() {
		return Objects.hash(new Object[]{this.permissionsPerObjectObject,
			this.permissionsPerObjectPermissions,
			this.permissionsPerObjectTargetObjectAttributes});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultPermissionsPerObject other = (DefaultPermissionsPerObject) obj;
			return Objects.equals(this.permissionsPerObjectObject, other.permissionsPerObjectObject) &&
				Objects.equals(this.permissionsPerObjectPermissions, other.permissionsPerObjectPermissions) &&
				Objects.equals(this.permissionsPerObjectTargetObjectAttributes, other.permissionsPerObjectTargetObjectAttributes);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object")
	final public Referable getPermissionsPerObjectObject() {
		return permissionsPerObjectObject;
	}
	
	final public void setPermissionsPerObjectObject (Referable permissionsPerObjectObject) {
		this.permissionsPerObjectObject = permissionsPerObjectObject;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission")
	final public List<Permission> getPermissionsPerObjectPermissions() {
		return permissionsPerObjectPermissions;
	}
	
	final public void setPermissionsPerObjectPermissions (List<Permission> permissionsPerObjectPermissions) {
		this.permissionsPerObjectPermissions = permissionsPerObjectPermissions;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes")
	final public ObjectAttributes getPermissionsPerObjectTargetObjectAttributes() {
		return permissionsPerObjectTargetObjectAttributes;
	}
	
	final public void setPermissionsPerObjectTargetObjectAttributes (ObjectAttributes permissionsPerObjectTargetObjectAttributes) {
		this.permissionsPerObjectTargetObjectAttributes = permissionsPerObjectTargetObjectAttributes;
	}
}
