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
* "Access Control"
* "Access Control defines the local access control policy administration point. Access Control has the major task to define the access permission rules."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:AccessControl")
public class AccessControlImpl implements Serializable, IAccessControl {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Access Control", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Access Control defines the local access control policy administration point. Access Control has the major task to define the access permission rules.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has access permission rule"
	* "Access permission rules of the AAS describing the rights assigned to (already authenticated) subjects to access elements of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule", "accessControlAccessPermissionRule"})
	protected ArrayList<? extends IAccessPermissionRule> _accessControlAccessPermissionRule;


	/**
	* "has default environment attributes"
	* "Reference to a submodel defining default environment attributes, i.e. attributes that are not describing the asset itself. The submodel is of kind=Type. At the same type the values of these environment attributes need to be accessible when evaluating the access permission rules. This is realized as a policy information point."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes", "accessControlDefaultEnvironmentAttributes"})
	protected ISubmodel _accessControlDefaultEnvironmentAttributes;


	/**
	* "has default permissions"
	* "Reference to a submodel defining the default permissions for the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions", "accessControlDefaultPermissions"})
	protected ISubmodel _accessControlDefaultPermissions;


	/**
	* "has default subject attributes"
	* "Reference to a submodel defining the default subjects attributes for the AAS that can be used to describe access permission rules."@en
	* "The submodel is of kind=Type."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes", "accessControlDefaultSubjectAttributes"})
	protected ISubmodel _accessControlDefaultSubjectAttributes;


	/**
	* "has selectable environment attributes"
	* "Reference to a submodel defining which environment attributes can be accessed via the permission rules."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes", "accessControlSelectableEnvironmentAttributes"})
	protected ISubmodel _accessControlSelectableEnvironmentAttributes;


	/**
	* "has selectable permissions"
	* "Reference to a submodel defining which permissions can be assigned to the subjects."@en
	* "Default: reference to the submodel referenced via defaultPermissions"@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions", "accessControlSelectablePermissions"})
	protected ISubmodel _accessControlSelectablePermissions;


	/**
	* "has selectable subject attributes"
	* "Reference to a submodel defining the authenticated subjects that are configured for the AAS. They are selectable by the access permission rules to assign permissions to the subjects."@en
	* "Default: reference to the submodel referenced via defaultSubjectAttributes."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes", "accessControlSelectableSubjectAttributes"})
	protected ISubmodel _accessControlSelectableSubjectAttributes;


	// no manual construction
	protected AccessControlImpl() {
		id = VocabUtil.getInstance().createRandomUrl("accessControl");
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
	* "Access permission rules of the AAS describing the rights assigned to (already authenticated) subjects to access elements of the AAS."@en
	* @return Returns the List of IAccessPermissionRule for the property accessControlAccessPermissionRule.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule")
	final public List<? extends IAccessPermissionRule> getAccessControlAccessPermissionRule() {
		return _accessControlAccessPermissionRule;
	}

	
	/**
	* "Access permission rules of the AAS describing the rights assigned to (already authenticated) subjects to access elements of the AAS."@en
	* @param _accessControlAccessPermissionRule_ desired value for the property accessControlAccessPermissionRule.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule
	*/
	final public void setAccessControlAccessPermissionRule (ArrayList<? extends IAccessPermissionRule> _accessControlAccessPermissionRule_) {
		this._accessControlAccessPermissionRule = _accessControlAccessPermissionRule_;
	}

	/**
	* "Reference to a submodel defining the authenticated subjects that are configured for the AAS. They are selectable by the access permission rules to assign permissions to the subjects."@en
	* "Default: reference to the submodel referenced via defaultSubjectAttributes."@en
	* @return Returns the ISubmodel for the property accessControlSelectableSubjectAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes")
	final public ISubmodel getAccessControlSelectableSubjectAttributes() {
		return _accessControlSelectableSubjectAttributes;
	}

	
	/**
	* "Reference to a submodel defining the authenticated subjects that are configured for the AAS. They are selectable by the access permission rules to assign permissions to the subjects."@en
	* "Default: reference to the submodel referenced via defaultSubjectAttributes."@en
	* @param _accessControlSelectableSubjectAttributes_ desired value for the property accessControlSelectableSubjectAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes
	*/
	final public void setAccessControlSelectableSubjectAttributes (ISubmodel _accessControlSelectableSubjectAttributes_) {
		this._accessControlSelectableSubjectAttributes = _accessControlSelectableSubjectAttributes_;
	}

	/**
	* "Reference to a submodel defining the default subjects attributes for the AAS that can be used to describe access permission rules."@en
	* "The submodel is of kind=Type."@en
	* @return Returns the ISubmodel for the property accessControlDefaultSubjectAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes")
	final public ISubmodel getAccessControlDefaultSubjectAttributes() {
		return _accessControlDefaultSubjectAttributes;
	}

	
	/**
	* "Reference to a submodel defining the default subjects attributes for the AAS that can be used to describe access permission rules."@en
	* "The submodel is of kind=Type."@en
	* @param _accessControlDefaultSubjectAttributes_ desired value for the property accessControlDefaultSubjectAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes
	*/
	final public void setAccessControlDefaultSubjectAttributes (ISubmodel _accessControlDefaultSubjectAttributes_) {
		this._accessControlDefaultSubjectAttributes = _accessControlDefaultSubjectAttributes_;
	}

	/**
	* "Reference to a submodel defining which permissions can be assigned to the subjects."@en
	* "Default: reference to the submodel referenced via defaultPermissions"@en
	* @return Returns the ISubmodel for the property accessControlSelectablePermissions.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions")
	final public ISubmodel getAccessControlSelectablePermissions() {
		return _accessControlSelectablePermissions;
	}

	
	/**
	* "Reference to a submodel defining which permissions can be assigned to the subjects."@en
	* "Default: reference to the submodel referenced via defaultPermissions"@en
	* @param _accessControlSelectablePermissions_ desired value for the property accessControlSelectablePermissions.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions
	*/
	final public void setAccessControlSelectablePermissions (ISubmodel _accessControlSelectablePermissions_) {
		this._accessControlSelectablePermissions = _accessControlSelectablePermissions_;
	}

	/**
	* "Reference to a submodel defining the default permissions for the AAS."@en
	* @return Returns the ISubmodel for the property accessControlDefaultPermissions.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions")
	final public ISubmodel getAccessControlDefaultPermissions() {
		return _accessControlDefaultPermissions;
	}

	
	/**
	* "Reference to a submodel defining the default permissions for the AAS."@en
	* @param _accessControlDefaultPermissions_ desired value for the property accessControlDefaultPermissions.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions
	*/
	final public void setAccessControlDefaultPermissions (ISubmodel _accessControlDefaultPermissions_) {
		this._accessControlDefaultPermissions = _accessControlDefaultPermissions_;
	}

	/**
	* "Reference to a submodel defining which environment attributes can be accessed via the permission rules."@en
	* @return Returns the ISubmodel for the property accessControlSelectableEnvironmentAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes")
	final public ISubmodel getAccessControlSelectableEnvironmentAttributes() {
		return _accessControlSelectableEnvironmentAttributes;
	}

	
	/**
	* "Reference to a submodel defining which environment attributes can be accessed via the permission rules."@en
	* @param _accessControlSelectableEnvironmentAttributes_ desired value for the property accessControlSelectableEnvironmentAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes
	*/
	final public void setAccessControlSelectableEnvironmentAttributes (ISubmodel _accessControlSelectableEnvironmentAttributes_) {
		this._accessControlSelectableEnvironmentAttributes = _accessControlSelectableEnvironmentAttributes_;
	}

	/**
	* "Reference to a submodel defining default environment attributes, i.e. attributes that are not describing the asset itself. The submodel is of kind=Type. At the same type the values of these environment attributes need to be accessible when evaluating the access permission rules. This is realized as a policy information point."@en
	* @return Returns the ISubmodel for the property accessControlDefaultEnvironmentAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes")
	final public ISubmodel getAccessControlDefaultEnvironmentAttributes() {
		return _accessControlDefaultEnvironmentAttributes;
	}

	
	/**
	* "Reference to a submodel defining default environment attributes, i.e. attributes that are not describing the asset itself. The submodel is of kind=Type. At the same type the values of these environment attributes need to be accessible when evaluating the access permission rules. This is realized as a policy information point."@en
	* @param _accessControlDefaultEnvironmentAttributes_ desired value for the property accessControlDefaultEnvironmentAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes
	*/
	final public void setAccessControlDefaultEnvironmentAttributes (ISubmodel _accessControlDefaultEnvironmentAttributes_) {
		this._accessControlDefaultEnvironmentAttributes = _accessControlDefaultEnvironmentAttributes_;
	}
}
