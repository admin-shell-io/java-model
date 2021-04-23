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
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Access Control", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("Access Control defines the local access control policy administration point. Access Control has the major task to define the access permission rules.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has access permission rule"
	* "Access permission rules of the AAS describing the rights assigned to (already authenticated) subjects to access elements of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule", "accessControlAccessPermissionRule"})
	protected List<AccessPermissionRule> accessControlAccessPermissionRules;


	/**
	* "has default environment attributes"
	* "Reference to a submodel defining default environment attributes, i.e. attributes that are not describing the asset itself. The submodel is of kind=Type. At the same type the values of these environment attributes need to be accessible when evaluating the access permission rules. This is realized as a policy information point."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes", "accessControlDefaultEnvironmentAttributes"})
	protected Submodel accessControlDefaultEnvironmentAttributes;


	/**
	* "has default permissions"
	* "Reference to a submodel defining the default permissions for the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions", "accessControlDefaultPermissions"})
	protected Submodel accessControlDefaultPermissions;


	/**
	* "has default subject attributes"
	* "Reference to a submodel defining the default subjects attributes for the AAS that can be used to describe access permission rules."@en
	* "The submodel is of kind=Type."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes", "accessControlDefaultSubjectAttributes"})
	protected Submodel accessControlDefaultSubjectAttributes;


	/**
	* "has selectable environment attributes"
	* "Reference to a submodel defining which environment attributes can be accessed via the permission rules."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes", "accessControlSelectableEnvironmentAttributes"})
	protected Submodel accessControlSelectableEnvironmentAttributes;


	/**
	* "has selectable permissions"
	* "Reference to a submodel defining which permissions can be assigned to the subjects."@en
	* "Default: reference to the submodel referenced via defaultPermissions"@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions", "accessControlSelectablePermissions"})
	protected Submodel accessControlSelectablePermissions;


	/**
	* "has selectable subject attributes"
	* "Reference to a submodel defining the authenticated subjects that are configured for the AAS. They are selectable by the access permission rules to assign permissions to the subjects."@en
	* "Default: reference to the submodel referenced via defaultSubjectAttributes."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes", "accessControlSelectableSubjectAttributes"})
	protected Submodel accessControlSelectableSubjectAttributes;


	// no manual construction
	protected DefaultAccessControl() {
		id = VocabUtil.getInstance().createRandomUrl("accessControl");
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

	public int hashCode() {
		return Objects.hash(new Object[]{this.accessControlAccessPermissionRules,
			this.accessControlSelectableSubjectAttributes,
			this.accessControlDefaultSubjectAttributes,
			this.accessControlSelectablePermissions,
			this.accessControlDefaultPermissions,
			this.accessControlSelectableEnvironmentAttributes,
			this.accessControlDefaultEnvironmentAttributes});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultAccessControl other = (DefaultAccessControl) obj;
			return Objects.equals(this.accessControlAccessPermissionRules, other.accessControlAccessPermissionRules) &&
				Objects.equals(this.accessControlSelectableSubjectAttributes, other.accessControlSelectableSubjectAttributes) &&
				Objects.equals(this.accessControlDefaultSubjectAttributes, other.accessControlDefaultSubjectAttributes) &&
				Objects.equals(this.accessControlSelectablePermissions, other.accessControlSelectablePermissions) &&
				Objects.equals(this.accessControlDefaultPermissions, other.accessControlDefaultPermissions) &&
				Objects.equals(this.accessControlSelectableEnvironmentAttributes, other.accessControlSelectableEnvironmentAttributes) &&
				Objects.equals(this.accessControlDefaultEnvironmentAttributes, other.accessControlDefaultEnvironmentAttributes);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule")
	final public List<AccessPermissionRule> getAccessControlAccessPermissionRules() {
		return accessControlAccessPermissionRules;
	}
	
	final public void setAccessControlAccessPermissionRules (List<AccessPermissionRule> accessControlAccessPermissionRules) {
		this.accessControlAccessPermissionRules = accessControlAccessPermissionRules;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes")
	final public Submodel getAccessControlSelectableSubjectAttributes() {
		return accessControlSelectableSubjectAttributes;
	}
	
	final public void setAccessControlSelectableSubjectAttributes (Submodel accessControlSelectableSubjectAttributes) {
		this.accessControlSelectableSubjectAttributes = accessControlSelectableSubjectAttributes;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes")
	final public Submodel getAccessControlDefaultSubjectAttributes() {
		return accessControlDefaultSubjectAttributes;
	}
	
	final public void setAccessControlDefaultSubjectAttributes (Submodel accessControlDefaultSubjectAttributes) {
		this.accessControlDefaultSubjectAttributes = accessControlDefaultSubjectAttributes;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions")
	final public Submodel getAccessControlSelectablePermissions() {
		return accessControlSelectablePermissions;
	}
	
	final public void setAccessControlSelectablePermissions (Submodel accessControlSelectablePermissions) {
		this.accessControlSelectablePermissions = accessControlSelectablePermissions;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions")
	final public Submodel getAccessControlDefaultPermissions() {
		return accessControlDefaultPermissions;
	}
	
	final public void setAccessControlDefaultPermissions (Submodel accessControlDefaultPermissions) {
		this.accessControlDefaultPermissions = accessControlDefaultPermissions;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes")
	final public Submodel getAccessControlSelectableEnvironmentAttributes() {
		return accessControlSelectableEnvironmentAttributes;
	}
	
	final public void setAccessControlSelectableEnvironmentAttributes (Submodel accessControlSelectableEnvironmentAttributes) {
		this.accessControlSelectableEnvironmentAttributes = accessControlSelectableEnvironmentAttributes;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes")
	final public Submodel getAccessControlDefaultEnvironmentAttributes() {
		return accessControlDefaultEnvironmentAttributes;
	}
	
	final public void setAccessControlDefaultEnvironmentAttributes (Submodel accessControlDefaultEnvironmentAttributes) {
		this.accessControlDefaultEnvironmentAttributes = accessControlDefaultEnvironmentAttributes;
	}
}
