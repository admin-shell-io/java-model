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
* "Access Control"
* "Access Control defines the local access control policy administration point. Access Control has the major task to define the access permission rules."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:AccessControl")
public class DefaultAccessControl implements Serializable, AccessControl {

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
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule", "accessPermissionRule"})
	protected List<AccessPermissionRule> accessPermissionRule;


	/**
	* "has default environment attributes"
	* "Reference to a submodel defining default environment attributes, i.e. attributes that are not describing the asset itself. The submodel is of kind=Type. At the same type the values of these environment attributes need to be accessible when evaluating the access permission rules. This is realized as a policy information point."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes", "defaultEnvironmentAttributes"})
	protected Submodel defaultEnvironmentAttributes;


	/**
	* "has default permissions"
	* "Reference to a submodel defining the default permissions for the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions", "defaultPermissions"})
	protected Submodel defaultPermissions;


	/**
	* "has default subject attributes"
	* "Reference to a submodel defining the default subjects attributes for the AAS that can be used to describe access permission rules."@en
	* "The submodel is of kind=Type."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes", "defaultSubjectAttributes"})
	protected Submodel defaultSubjectAttributes;


	/**
	* "has selectable environment attributes"
	* "Reference to a submodel defining which environment attributes can be accessed via the permission rules."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes", "selectableEnvironmentAttributes"})
	protected Submodel selectableEnvironmentAttributes;


	/**
	* "has selectable permissions"
	* "Reference to a submodel defining which permissions can be assigned to the subjects."@en
	* "Default: reference to the submodel referenced via defaultPermissions"@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions", "selectablePermissions"})
	protected Submodel selectablePermissions;


	/**
	* "has selectable subject attributes"
	* "Reference to a submodel defining the authenticated subjects that are configured for the AAS. They are selectable by the access permission rules to assign permissions to the subjects."@en
	* "Default: reference to the submodel referenced via defaultSubjectAttributes."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes", "selectableSubjectAttributes"})
	protected Submodel selectableSubjectAttributes;


	// no manual construction
	protected DefaultAccessControl() {
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

	/**
	* This function returns a hash code value for the AccessControl for the benefit of e.g. hash tables.
	* @return a hash code value for the AccessControl
	*/
	public int hashCode() {
		return Objects.hash(new Object[]{super.hashCode(), this.accessPermissionRule, this.selectableSubjectAttributes, this.defaultSubjectAttributes, this.selectablePermissions, this.defaultPermissions, this.selectableEnvironmentAttributes, this.defaultEnvironmentAttributes});
	}

	/**
	* This function indicates wheather some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this AccessControl is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultAccessControl other = (DefaultAccessControl) obj;
			return super.equals(other) && Objects.equals(this.accessPermissionRule, other.accessPermissionRule) && Objects.equals(this.selectableSubjectAttributes, other.selectableSubjectAttributes) && Objects.equals(this.defaultSubjectAttributes, other.defaultSubjectAttributes) && Objects.equals(this.selectablePermissions, other.selectablePermissions) && Objects.equals(this.defaultPermissions, other.defaultPermissions) && Objects.equals(this.selectableEnvironmentAttributes, other.selectableEnvironmentAttributes) && Objects.equals(this.defaultEnvironmentAttributes, other.defaultEnvironmentAttributes);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "Access permission rules of the AAS describing the rights assigned to (already authenticated) subjects to access elements of the AAS."@en
	* @return Returns the List of AccessPermissionRule for the property accessPermissionRule.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule")
	final public List<AccessPermissionRule> getAccessPermissionRule() {
		return accessPermissionRule;
	}

	
	/**
	* "Access permission rules of the AAS describing the rights assigned to (already authenticated) subjects to access elements of the AAS."@en
	* @param accessPermissionRule desired value for the property accessPermissionRule.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule
	*/
	final public void setAccessPermissionRule (List<AccessPermissionRule> accessPermissionRule) {
		this.accessPermissionRule = accessPermissionRule;
	}

	/**
	* "Reference to a submodel defining the authenticated subjects that are configured for the AAS. They are selectable by the access permission rules to assign permissions to the subjects."@en
	* "Default: reference to the submodel referenced via defaultSubjectAttributes."@en
	* @return Returns the Submodel for the property selectableSubjectAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes")
	final public Submodel getSelectableSubjectAttributes() {
		return selectableSubjectAttributes;
	}

	
	/**
	* "Reference to a submodel defining the authenticated subjects that are configured for the AAS. They are selectable by the access permission rules to assign permissions to the subjects."@en
	* "Default: reference to the submodel referenced via defaultSubjectAttributes."@en
	* @param selectableSubjectAttributes desired value for the property selectableSubjectAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes
	*/
	final public void setSelectableSubjectAttributes (Submodel selectableSubjectAttributes) {
		this.selectableSubjectAttributes = selectableSubjectAttributes;
	}

	/**
	* "Reference to a submodel defining the default subjects attributes for the AAS that can be used to describe access permission rules."@en
	* "The submodel is of kind=Type."@en
	* @return Returns the Submodel for the property defaultSubjectAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes")
	final public Submodel getDefaultSubjectAttributes() {
		return defaultSubjectAttributes;
	}

	
	/**
	* "Reference to a submodel defining the default subjects attributes for the AAS that can be used to describe access permission rules."@en
	* "The submodel is of kind=Type."@en
	* @param defaultSubjectAttributes desired value for the property defaultSubjectAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes
	*/
	final public void setDefaultSubjectAttributes (Submodel defaultSubjectAttributes) {
		this.defaultSubjectAttributes = defaultSubjectAttributes;
	}

	/**
	* "Reference to a submodel defining which permissions can be assigned to the subjects."@en
	* "Default: reference to the submodel referenced via defaultPermissions"@en
	* @return Returns the Submodel for the property selectablePermissions.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions")
	final public Submodel getSelectablePermissions() {
		return selectablePermissions;
	}

	
	/**
	* "Reference to a submodel defining which permissions can be assigned to the subjects."@en
	* "Default: reference to the submodel referenced via defaultPermissions"@en
	* @param selectablePermissions desired value for the property selectablePermissions.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions
	*/
	final public void setSelectablePermissions (Submodel selectablePermissions) {
		this.selectablePermissions = selectablePermissions;
	}

	/**
	* "Reference to a submodel defining the default permissions for the AAS."@en
	* @return Returns the Submodel for the property defaultPermissions.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions")
	final public Submodel getDefaultPermissions() {
		return defaultPermissions;
	}

	
	/**
	* "Reference to a submodel defining the default permissions for the AAS."@en
	* @param defaultPermissions desired value for the property defaultPermissions.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions
	*/
	final public void setDefaultPermissions (Submodel defaultPermissions) {
		this.defaultPermissions = defaultPermissions;
	}

	/**
	* "Reference to a submodel defining which environment attributes can be accessed via the permission rules."@en
	* @return Returns the Submodel for the property selectableEnvironmentAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes")
	final public Submodel getSelectableEnvironmentAttributes() {
		return selectableEnvironmentAttributes;
	}

	
	/**
	* "Reference to a submodel defining which environment attributes can be accessed via the permission rules."@en
	* @param selectableEnvironmentAttributes desired value for the property selectableEnvironmentAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes
	*/
	final public void setSelectableEnvironmentAttributes (Submodel selectableEnvironmentAttributes) {
		this.selectableEnvironmentAttributes = selectableEnvironmentAttributes;
	}

	/**
	* "Reference to a submodel defining default environment attributes, i.e. attributes that are not describing the asset itself. The submodel is of kind=Type. At the same type the values of these environment attributes need to be accessible when evaluating the access permission rules. This is realized as a policy information point."@en
	* @return Returns the Submodel for the property defaultEnvironmentAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes")
	final public Submodel getDefaultEnvironmentAttributes() {
		return defaultEnvironmentAttributes;
	}

	
	/**
	* "Reference to a submodel defining default environment attributes, i.e. attributes that are not describing the asset itself. The submodel is of kind=Type. At the same type the values of these environment attributes need to be accessible when evaluating the access permission rules. This is realized as a policy information point."@en
	* @param defaultEnvironmentAttributes desired value for the property defaultEnvironmentAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes
	*/
	final public void setDefaultEnvironmentAttributes (Submodel defaultEnvironmentAttributes) {
		this.defaultEnvironmentAttributes = defaultEnvironmentAttributes;
	}
}
