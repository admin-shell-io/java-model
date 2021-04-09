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
* "Access Permission Rule"
* "Table that defines access permissions per authenticated subject for a set of objects (referable elements)."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = AccessPermissionRuleImpl.class)
})
public interface IAccessPermissionRule extends IReferable, IQualifiable {

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


	/**
	* "Set of object-permission pairs that define the permissions per object within the access permission rule."@en
	* @return Returns the List of IPermissionsPerObject for the property accessPermissionRulePermissionsPerObject.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/permissionsPerObject
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/permissionsPerObject")
	public List<? extends IPermissionsPerObject> getAccessPermissionRulePermissionsPerObject();

	/**
	* "Target subject attributes that need to be fulfilled by the accessing subject to get the permissions defined by this rule."@en
	* @return Returns the ISubjectAttributes for the property accessPermissionRuleTargetSubjectAttributes.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/targetSubjectAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/targetSubjectAttributes")
	public ISubjectAttributes getAccessPermissionRuleTargetSubjectAttributes();

}
