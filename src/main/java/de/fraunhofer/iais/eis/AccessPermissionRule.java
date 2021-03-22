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
	"Access Permission Rule"

	"Table that defines access permissions per authenticated subject for a set of objects (referable elements)."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = AccessPermissionRuleImpl.class),})
public interface AccessPermissionRule extends Referable
, Qualifiable {

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
	"has permissions per object"

	"Set of object-permission pairs that define the permissions per object within the access permission rule."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/permissionsPerObject")
	java.util.ArrayList<? extends PermissionsPerObject> getAccessPermissionRulePermissionsPerObject();
	/**
	"has target subject attributes"

	"Target subject attributes that need to be fulfilled by the accessing subject to get the permissions defined by this rule."@en
	*/
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/targetSubjectAttributes")
	SubjectAttributes getAccessPermissionRuleTargetSubjectAttributes();
}
