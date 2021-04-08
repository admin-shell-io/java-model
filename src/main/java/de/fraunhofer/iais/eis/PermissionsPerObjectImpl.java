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

/** 
* "Permission Per Object"
* "Table that defines access permissions for a specified object. The object is any referable element in the AAS. Additionally object attributes can be defined that further specify the kind of object the permissions apply to."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:PermissionsPerObject")
public class PermissionsPerObjectImpl implements Serializable, IPermissionsPerObject {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Permission Per Object", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Table that defines access permissions for a specified object. The object is any referable element in the AAS. Additionally object attributes can be defined that further specify the kind of object the permissions apply to.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has object"
	* "Element to which permission shall be assigned."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object", "permissionsPerObjectObject"})
	protected IReferable _permissionsPerObjectObject;


	/**
	* "has object permission"
	* "Permissions assigned to the object. The permissions hold for all subjects as specified in the access permission rule."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission", "permissionsPerObjectPermission"})
	protected ArrayList<? extends IPermission> _permissionsPerObjectPermission;


	/**
	* "has target object attributes"
	* "Target object attributes that need to be fulfilled so that the access permissions apply to the accessing subject."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes", "permissionsPerObjectTargetObjectAttributes"})
	protected IObjectAttributes _permissionsPerObjectTargetObjectAttributes;


	// no manual construction
	protected PermissionsPerObjectImpl() {
		id = VocabUtil.getInstance().createRandomUrl("permissionsPerObject");
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


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "Element to which permission shall be assigned."@en
	* @return Returns the IReferable for the property permissionsPerObjectObject.
	* More information under https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object")
	final public IReferable getPermissionsPerObjectObject() {
		return _permissionsPerObjectObject;
	}

	
	/**
	* "Element to which permission shall be assigned."@en
	* @param _permissionsPerObjectObject_ desired value for the property permissionsPerObjectObject.
	* More information under https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/object
	*/
	final public void setPermissionsPerObjectObject (IReferable _permissionsPerObjectObject_) {
		this._permissionsPerObjectObject = _permissionsPerObjectObject_;
	}

	/**
	* "Permissions assigned to the object. The permissions hold for all subjects as specified in the access permission rule."@en
	* @return Returns the List of IPermission for the property permissionsPerObjectPermission.
	* More information under https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission")
	final public List<? extends IPermission> getPermissionsPerObjectPermission() {
		return _permissionsPerObjectPermission;
	}

	
	/**
	* "Permissions assigned to the object. The permissions hold for all subjects as specified in the access permission rule."@en
	* @param _permissionsPerObjectPermission_ desired value for the property permissionsPerObjectPermission.
	* More information under https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/permission
	*/
	final public void setPermissionsPerObjectPermission (ArrayList<? extends IPermission> _permissionsPerObjectPermission_) {
		this._permissionsPerObjectPermission = _permissionsPerObjectPermission_;
	}

	/**
	* "Target object attributes that need to be fulfilled so that the access permissions apply to the accessing subject."@en
	* @return Returns the IObjectAttributes for the property permissionsPerObjectTargetObjectAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes")
	final public IObjectAttributes getPermissionsPerObjectTargetObjectAttributes() {
		return _permissionsPerObjectTargetObjectAttributes;
	}

	
	/**
	* "Target object attributes that need to be fulfilled so that the access permissions apply to the accessing subject."@en
	* @param _permissionsPerObjectTargetObjectAttributes_ desired value for the property permissionsPerObjectTargetObjectAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/PermissionsPerObject/targetObjectAttributes
	*/
	final public void setPermissionsPerObjectTargetObjectAttributes (IObjectAttributes _permissionsPerObjectTargetObjectAttributes_) {
		this._permissionsPerObjectTargetObjectAttributes = _permissionsPerObjectTargetObjectAttributes_;
	}
}
