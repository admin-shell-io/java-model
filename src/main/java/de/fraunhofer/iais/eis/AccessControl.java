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
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = DefaultAccessControl.class)
})
public interface AccessControl {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	public URI getId();

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel();

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment();

	/**
	* This function returns a hash code value for the AccessControl for the benefit of e.g. hash tables.
	* @return a hash code value for the AccessControl
	*/
	public int hashCode();

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this AccessControl is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj);

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "Access permission rules of the AAS describing the rights assigned to (already authenticated) subjects to access elements of the AAS."@en
	* @return Returns the List of AccessPermissionRule for the property accessPermissionRule.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule")
	public List<AccessPermissionRule> getAccessPermissionRule();

	/**
	* "Reference to a submodel defining the authenticated subjects that are configured for the AAS. They are selectable by the access permission rules to assign permissions to the subjects."@en
	* "Default: reference to the submodel referenced via defaultSubjectAttributes."@en
	* @return Returns the Submodel for the property selectableSubjectAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes")
	public Submodel getSelectableSubjectAttributes();

	/**
	* "Reference to a submodel defining the default subjects attributes for the AAS that can be used to describe access permission rules."@en
	* "The submodel is of kind=Type."@en
	* @return Returns the Submodel for the property defaultSubjectAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes")
	public Submodel getDefaultSubjectAttributes();

	/**
	* "Reference to a submodel defining which permissions can be assigned to the subjects."@en
	* "Default: reference to the submodel referenced via defaultPermissions"@en
	* @return Returns the Submodel for the property selectablePermissions.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions")
	public Submodel getSelectablePermissions();

	/**
	* "Reference to a submodel defining the default permissions for the AAS."@en
	* @return Returns the Submodel for the property defaultPermissions.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions")
	public Submodel getDefaultPermissions();

	/**
	* "Reference to a submodel defining which environment attributes can be accessed via the permission rules."@en
	* @return Returns the Submodel for the property selectableEnvironmentAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes")
	public Submodel getSelectableEnvironmentAttributes();

	/**
	* "Reference to a submodel defining default environment attributes, i.e. attributes that are not describing the asset itself. The submodel is of kind=Type. At the same type the values of these environment attributes need to be accessible when evaluating the access permission rules. This is realized as a policy information point."@en
	* @return Returns the Submodel for the property defaultEnvironmentAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes")
	public Submodel getDefaultEnvironmentAttributes();

}
