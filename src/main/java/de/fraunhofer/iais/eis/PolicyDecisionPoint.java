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
* "Policy Decision Point"
* "Defines a security policy decision point (PDP). "@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = DefaultPolicyDecisionPoint.class)
})
public interface PolicyDecisionPoint {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	public URI getId();

	/**
	* This function retrieves a human readable labels about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable labels
	*/
	public List<TypedLiteral> getLabels();

	/**
	* This function retrieves a human readable explanatory comments about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comments
	*/
	public List<TypedLiteral> getComments();

	/**
	* This function returns a hash code value for the PolicyDecisionPoint for the benefit of e.g. hash tables.
	* @return a hash code value for the PolicyDecisionPoint
	*/
	public int hashCode();

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this PolicyDecisionPoint is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj);

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "If externalPolicyDecisionPoints True then Endpoints to external available decision points taking into consideration for access control for the AAS need to be configured."@en
	* @return Returns the boolean for the property externalPolicyDecisionPoints.
	* More information under https://admin-shell.io/aas/3/0/RC01/PolicyDecisionPoint/externalPolicyDecisionPoints
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyDecisionPoint/externalPolicyDecisionPoints")
	public boolean getExternalPolicyDecisionPoints();

}
