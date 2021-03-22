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
	"Access Control"

	"Access Control defines the local access control policy administration point. Access Control has the major task to define the access permission rules."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:AccessControl")
public class AccessControlImpl implements Serializable, AccessControl {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Access Control", ""));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Access Control defines the local access control policy administration point. Access Control has the major task to define the access permission rules.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"has access permission rule"

	"Access permission rules of the AAS describing the rights assigned to (already authenticated) subjects to access elements of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule", "accessControlAccessPermissionRule"})
	 java.util.ArrayList<? extends AccessPermissionRule> _accessControlAccessPermissionRule;


	/**
	"has default environment attributes"

	"Reference to a submodel defining default environment attributes, i.e. attributes that are not describing the asset itself. The submodel is of kind=Type. At the same type the values of these environment attributes need to be accessible when evaluating the access permission rules. This is realized as a policy information point."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes", "accessControlDefaultEnvironmentAttributes"})
	 Submodel _accessControlDefaultEnvironmentAttributes;


	/**
	"has default permissions"

	"Reference to a submodel defining the default permissions for the AAS."@en
	*/
	@NotNull@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions", "accessControlDefaultPermissions"})
	 Submodel _accessControlDefaultPermissions;


	/**
	"has default subject attributes"

	"Reference to a submodel defining the default subjects attributes for the AAS that can be used to describe access permission rules."@en
	*/
	@NotNull@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes", "accessControlDefaultSubjectAttributes"})
	 Submodel _accessControlDefaultSubjectAttributes;


	/**
	"has selectable environment attributes"

	"Reference to a submodel defining which environment attributes can be accessed via the permission rules."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes", "accessControlSelectableEnvironmentAttributes"})
	 Submodel _accessControlSelectableEnvironmentAttributes;


	/**
	"has selectable permissions"

	"Reference to a submodel defining which permissions can be assigned to the subjects."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions", "accessControlSelectablePermissions"})
	 Submodel _accessControlSelectablePermissions;


	/**
	"has selectable subject attributes"

	"Reference to a submodel defining the authenticated subjects that are configured for the AAS. They are selectable by the access permission rules to assign permissions to the subjects."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes", "accessControlSelectableSubjectAttributes"})
	 Submodel _accessControlSelectableSubjectAttributes;


	// no manual construction
	AccessControlImpl() {
		id = VocabUtil.getInstance().createRandomUrl("accessControl");
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
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule")
	java.util.ArrayList<? extends AccessPermissionRule> getAccessControlAccessPermissionRule() {
		return _accessControlAccessPermissionRule;
	}

	final public void setAccessControlAccessPermissionRule (java.util.ArrayList<? extends AccessPermissionRule> _accessControlAccessPermissionRule_) {
		this._accessControlAccessPermissionRule = _accessControlAccessPermissionRule_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes")
	Submodel getAccessControlSelectableSubjectAttributes() {
		return _accessControlSelectableSubjectAttributes;
	}

	final public void setAccessControlSelectableSubjectAttributes (Submodel _accessControlSelectableSubjectAttributes_) {
		this._accessControlSelectableSubjectAttributes = _accessControlSelectableSubjectAttributes_;
	}

	final public 
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes")
	Submodel getAccessControlDefaultSubjectAttributes() {
		return _accessControlDefaultSubjectAttributes;
	}

	final public void setAccessControlDefaultSubjectAttributes (Submodel _accessControlDefaultSubjectAttributes_) {
		this._accessControlDefaultSubjectAttributes = _accessControlDefaultSubjectAttributes_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions")
	Submodel getAccessControlSelectablePermissions() {
		return _accessControlSelectablePermissions;
	}

	final public void setAccessControlSelectablePermissions (Submodel _accessControlSelectablePermissions_) {
		this._accessControlSelectablePermissions = _accessControlSelectablePermissions_;
	}

	final public 
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions")
	Submodel getAccessControlDefaultPermissions() {
		return _accessControlDefaultPermissions;
	}

	final public void setAccessControlDefaultPermissions (Submodel _accessControlDefaultPermissions_) {
		this._accessControlDefaultPermissions = _accessControlDefaultPermissions_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes")
	Submodel getAccessControlSelectableEnvironmentAttributes() {
		return _accessControlSelectableEnvironmentAttributes;
	}

	final public void setAccessControlSelectableEnvironmentAttributes (Submodel _accessControlSelectableEnvironmentAttributes_) {
		this._accessControlSelectableEnvironmentAttributes = _accessControlSelectableEnvironmentAttributes_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes")
	Submodel getAccessControlDefaultEnvironmentAttributes() {
		return _accessControlDefaultEnvironmentAttributes;
	}

	final public void setAccessControlDefaultEnvironmentAttributes (Submodel _accessControlDefaultEnvironmentAttributes_) {
		this._accessControlDefaultEnvironmentAttributes = _accessControlDefaultEnvironmentAttributes_;
	}
}
