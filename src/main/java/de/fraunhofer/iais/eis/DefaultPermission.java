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
* "Permission"
* "Description of a single permission."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:Permission")
public class DefaultPermission implements Serializable, Permission {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Permission", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Description of a single permission.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has kind of permission"
	* "Description of the kind of permission. Possible kind of permission also include the denial of the permission."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission", "kindOfPermission"})
	protected PermissionKind kindOfPermission;


	/**
	* "has permission"
	* "Reference to a property that defines the semantics of the permission."@en
	* "Constraint AASs-010: The property referenced in Permission/permission shall have the category \'CONSTANT\'."@en
	* "Constraint AASs-011: The property referenced in Permission/permission shall be part of the submodel that is referenced within the \'selectablePermissions\' attribute of \'AccessControl\'."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Permission/permission", "permission"})
	protected Property permission;


	// no manual construction
	protected DefaultPermission() {
		id = VocabUtil.getInstance().createRandomUrl("permission");
	}

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment() {
		return this.comment;
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

	/**
	* This function returns a hash code value for the Permission for the benefit of e.g. hash tables.
	* @return a hash code value for the Permission
	*/
	public int hashCode() {
		return Objects.hash(new Object[]{super.hashCode(), this.kindOfPermission, this.permission});
	}

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this Permission is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultPermission other = (DefaultPermission) obj;
			return super.equals(other) && Objects.equals(this.kindOfPermission, other.kindOfPermission) && Objects.equals(this.permission, other.permission);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "Description of the kind of permission. Possible kind of permission also include the denial of the permission."@en
	* @return Returns the PermissionKind for the property kindOfPermission.
	* More information under https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission")
	final public PermissionKind getKindOfPermission() {
		return kindOfPermission;
	}

	
	/**
	* "Description of the kind of permission. Possible kind of permission also include the denial of the permission."@en
	* @param kindOfPermission desired value for the property kindOfPermission.
	* More information under https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission
	*/
	final public void setKindOfPermission (PermissionKind kindOfPermission) {
		this.kindOfPermission = kindOfPermission;
	}

	/**
	* "Reference to a property that defines the semantics of the permission."@en
	* "Constraint AASs-010: The property referenced in Permission/permission shall have the category \'CONSTANT\'."@en
	* "Constraint AASs-011: The property referenced in Permission/permission shall be part of the submodel that is referenced within the \'selectablePermissions\' attribute of \'AccessControl\'."@en
	* @return Returns the Property for the property permission.
	* More information under https://admin-shell.io/aas/3/0/RC01/Permission/permission
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Permission/permission")
	final public Property getPermission() {
		return permission;
	}

	
	/**
	* "Reference to a property that defines the semantics of the permission."@en
	* "Constraint AASs-010: The property referenced in Permission/permission shall have the category \'CONSTANT\'."@en
	* "Constraint AASs-011: The property referenced in Permission/permission shall be part of the submodel that is referenced within the \'selectablePermissions\' attribute of \'AccessControl\'."@en
	* @param permission desired value for the property permission.
	* More information under https://admin-shell.io/aas/3/0/RC01/Permission/permission
	*/
	final public void setPermission (Property permission) {
		this.permission = permission;
	}
}
