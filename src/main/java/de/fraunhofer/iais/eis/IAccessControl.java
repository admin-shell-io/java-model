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
	"Access Control"

	"Access Control defines the local access control policy administration point. Access Control has the major task to define the access permission rules."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = AccessControlImpl.class),})
public interface IAccessControl {

	// standard methods

	@JsonProperty("@id")
	public URI getId();
	public List<TypedLiteral> getLabel();
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	"Access permission rules of the AAS describing the rights assigned to (already authenticated) subjects to access elements of the AAS."@en
	@return the List of accessControlAccessPermissionRule
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule")
	public List<? extends IAccessPermissionRule> getAccessControlAccessPermissionRule();

	/**
	"Reference to a submodel defining the authenticated subjects that are configured for the AAS. They are selectable by the access permission rules to assign permissions to the subjects."@en

	"Default: reference to the submodel referenced via defaultSubjectAttributes."@en
	@return the ISubmodel of accessControlSelectableSubjectAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes")
	public ISubmodel getAccessControlSelectableSubjectAttributes();

	/**
	"Reference to a submodel defining the default subjects attributes for the AAS that can be used to describe access permission rules."@en

	"The submodel is of kind=Type."@en
	@return the ISubmodel of accessControlDefaultSubjectAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes")
	public ISubmodel getAccessControlDefaultSubjectAttributes();

	/**
	"Reference to a submodel defining which permissions can be assigned to the subjects."@en

	"Default: reference to the submodel referenced via defaultPermissions"@en
	@return the ISubmodel of accessControlSelectablePermissions
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions")
	public ISubmodel getAccessControlSelectablePermissions();

	/**
	"Reference to a submodel defining the default permissions for the AAS."@en
	@return the ISubmodel of accessControlDefaultPermissions
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions")
	public ISubmodel getAccessControlDefaultPermissions();

	/**
	"Reference to a submodel defining which environment attributes can be accessed via the permission rules."@en
	@return the ISubmodel of accessControlSelectableEnvironmentAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes")
	public ISubmodel getAccessControlSelectableEnvironmentAttributes();

	/**
	"Reference to a submodel defining default environment attributes, i.e. attributes that are not describing the asset itself. The submodel is of kind=Type. At the same type the values of these environment attributes need to be accessible when evaluating the access permission rules. This is realized as a policy information point."@en
	@return the ISubmodel of accessControlDefaultEnvironmentAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes")
	public ISubmodel getAccessControlDefaultEnvironmentAttributes();
}
