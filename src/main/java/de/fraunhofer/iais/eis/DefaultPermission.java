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
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Permission", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("Description of a single permission.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has kind of permission"
	* "Description of the kind of permission. Possible kind of permission also include the denial of the permission."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission", "permissionKindOfPermission"})
	protected PermissionKind permissionKindOfPermission;


	/**
	* "has permission"
	* "Reference to a property that defines the semantics of the permission."@en
	* "Constraint AASs-010: The property referenced in Permission/permission shall have the category \'CONSTANT\'."@en
	* "Constraint AASs-011: The property referenced in Permission/permission shall be part of the submodel that is referenced within the \'selectablePermissions\' attribute of \'AccessControl\'."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Permission/permission", "permissionPermission"})
	protected Property permissionPermission;


	// no manual construction
	protected DefaultPermission() {
		id = VocabUtil.getInstance().createRandomUrl("permission");
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
		return Objects.hash(new Object[]{this.permissionKindOfPermission,
			this.permissionPermission});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultPermission other = (DefaultPermission) obj;
			return Objects.equals(this.permissionKindOfPermission, other.permissionKindOfPermission) &&
				Objects.equals(this.permissionPermission, other.permissionPermission);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Permission/kindOfPermission")
	final public PermissionKind getPermissionKindOfPermission() {
		return permissionKindOfPermission;
	}
	
	final public void setPermissionKindOfPermission (PermissionKind permissionKindOfPermission) {
		this.permissionKindOfPermission = permissionKindOfPermission;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Permission/permission")
	final public Property getPermissionPermission() {
		return permissionPermission;
	}
	
	final public void setPermissionPermission (Property permissionPermission) {
		this.permissionPermission = permissionPermission;
	}
}
