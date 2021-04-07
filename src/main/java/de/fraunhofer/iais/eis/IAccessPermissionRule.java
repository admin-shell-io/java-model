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
	"Access Permission Rule"

	"Table that defines access permissions per authenticated subject for a set of objects (referable elements)."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = AccessPermissionRuleImpl.class),})
public interface IAccessPermissionRule extends IReferable
, IQualifiable {

	// standard methods

	@JsonProperty("@id")
	public URI getId();
	public List<TypedLiteral> getLabel();
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	"Set of object-permission pairs that define the permissions per object within the access permission rule."@en
	@return the List of accessPermissionRulePermissionsPerObject
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/permissionsPerObject")
	public List<? extends IPermissionsPerObject> getAccessPermissionRulePermissionsPerObject();

	/**
	"Target subject attributes that need to be fulfilled by the accessing subject to get the permissions defined by this rule."@en
	@return the ISubjectAttributes of accessPermissionRuleTargetSubjectAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/targetSubjectAttributes")
	public ISubjectAttributes getAccessPermissionRuleTargetSubjectAttributes();
}
