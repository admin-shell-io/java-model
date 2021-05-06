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
public class DefaultPermissionsPerObject implements PermissionsPerObject {

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
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object", "object"})
	protected Referable object;


	/**
	* "has object permission"
	* "Permissions assigned to the object. The permissions hold for all subjects as specified in the access permission rule."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission", "permission"})
	protected List<Permission> permissions;


	/**
	* "has target object attributes"
	* "Target object attributes that need to be fulfilled so that the access permissions apply to the accessing subject."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes", "targetObjectAttributes"})
	protected ObjectAttributes targetObjectAttributes;


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

	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this.object,
			this.permissions,
			this.targetObjectAttributes});
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultPermissionsPerObject other = (DefaultPermissionsPerObject) obj;
			return Objects.equals(this.object, other.object) &&
				Objects.equals(this.permissions, other.permissions) &&
				Objects.equals(this.targetObjectAttributes, other.targetObjectAttributes);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object")
	final public Referable getObject() {
		return object;
	}
	
	final public void setObject (Referable object) {
		this.object = object;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission")
	final public List<Permission> getPermissions() {
		return permissions;
	}
	
	final public void setPermissions (List<Permission> permissions) {
		this.permissions = permissions;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes")
	final public ObjectAttributes getTargetObjectAttributes() {
		return targetObjectAttributes;
	}
	
	final public void setTargetObjectAttributes (ObjectAttributes targetObjectAttributes) {
		this.targetObjectAttributes = targetObjectAttributes;
	}
}
