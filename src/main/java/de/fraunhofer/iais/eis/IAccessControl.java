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
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = AccessControlImpl.class)
})
public interface IAccessControl {

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

	// accessor methods as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule")
	public List<? extends IAccessPermissionRule> getAccessControlAccessPermissionRule();

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes")
	public ISubmodel getAccessControlSelectableSubjectAttributes();

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes")
	public ISubmodel getAccessControlDefaultSubjectAttributes();

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions")
	public ISubmodel getAccessControlSelectablePermissions();

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions")
	public ISubmodel getAccessControlDefaultPermissions();

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes")
	public ISubmodel getAccessControlSelectableEnvironmentAttributes();

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes")
	public ISubmodel getAccessControlDefaultEnvironmentAttributes();

}
