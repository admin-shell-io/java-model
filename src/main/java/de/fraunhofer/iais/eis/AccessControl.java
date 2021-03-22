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

	"Access Control defines the local access control policy administration point. Access Control has the major task to define the access permission rules."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = AccessControlImpl.class),})
public interface AccessControl {

	// standard methods

	@JsonProperty("@id")
	@javax.validation.constraints.NotNull URI getId();
	java.util.List<TypedLiteral> getLabel();
	java.util.List<TypedLiteral> getComment();
	String toRdf();

	// getter and setter for generic property map
	public java.util.Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from information model
	/**
	"has access permission rule"

	"Access permission rules of the AAS describing the rights assigned to (already authenticated) subjects to access elements of the AAS."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/accessPermissionRule")
	java.util.ArrayList<? extends AccessPermissionRule> getAccessControlAccessPermissionRule();
	/**
	"has selectable subject attributes"

	"Reference to a submodel defining the authenticated subjects that are configured for the AAS. They are selectable by the access permission rules to assign permissions to the subjects."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableSubjectAttributes")
	Submodel getAccessControlSelectableSubjectAttributes();
	/**
	"has default subject attributes"

	"Reference to a submodel defining the default subjects attributes for the AAS that can be used to describe access permission rules."@en
	*/
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultSubjectAttributes")
	Submodel getAccessControlDefaultSubjectAttributes();
	/**
	"has selectable permissions"

	"Reference to a submodel defining which permissions can be assigned to the subjects."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectablePermissions")
	Submodel getAccessControlSelectablePermissions();
	/**
	"has default permissions"

	"Reference to a submodel defining the default permissions for the AAS."@en
	*/
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultPermissions")
	Submodel getAccessControlDefaultPermissions();
	/**
	"has selectable environment attributes"

	"Reference to a submodel defining which environment attributes can be accessed via the permission rules."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/selectableEnvironmentAttributes")
	Submodel getAccessControlSelectableEnvironmentAttributes();
	/**
	"has default environment attributes"

	"Reference to a submodel defining default environment attributes, i.e. attributes that are not describing the asset itself. The submodel is of kind=Type. At the same type the values of these environment attributes need to be accessible when evaluating the access permission rules. This is realized as a policy information point."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControl/defaultEnvironmentAttributes")
	Submodel getAccessControlDefaultEnvironmentAttributes();
}
