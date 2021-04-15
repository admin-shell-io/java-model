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
* "Policy Information Points"
* "Defines the security policy information points (PIP). Serves as the retrieval source of attributes, or the data required for policy evaluation to provide the information needed by the policy decision point to make the decisions."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:PolicyInformationPoints")
public class DefaultPolicyInformationPoints implements Serializable, PolicyInformationPoints {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Policy Information Points", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Defines the security policy information points (PIP). Serves as the retrieval source of attributes, or the data required for policy evaluation to provide the information needed by the policy decision point to make the decisions.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has external information point"
	* "If externalInformationPoints True then at least one Endpoint to external available information needs to be configured for the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints", "externalInformationPoints"})
	protected boolean externalInformationPoints;


	/**
	* "has internal information point"
	* "References to submodels defining information used by security access permission rules."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint", "internalInformationPoint"})
	protected List<Submodel> internalInformationPoint;


	// no manual construction
	protected DefaultPolicyInformationPoints() {
		id = VocabUtil.getInstance().createRandomUrl("policyInformationPoints");
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
	* This function returns a hash code value for the PolicyInformationPoints for the benefit of e.g. hash tables.
	* @return a hash code value for the PolicyInformationPoints
	*/
	public int hashCode() {
		return Objects.hash(new Object[]{super.hashCode(), this.externalInformationPoints, this.internalInformationPoint});
	}

	/**
	* This function indicates wheather some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this PolicyInformationPoints is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultPolicyInformationPoints other = (DefaultPolicyInformationPoints) obj;
			return super.equals(other) && Objects.equals(this.externalInformationPoints, other.externalInformationPoints) && Objects.equals(this.internalInformationPoint, other.internalInformationPoint);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "If externalInformationPoints True then at least one Endpoint to external available information needs to be configured for the AAS."@en
	* @return Returns the boolean for the property externalInformationPoints.
	* More information under https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints")
	final public boolean getExternalInformationPoints() {
		return externalInformationPoints;
	}

	
	/**
	* "If externalInformationPoints True then at least one Endpoint to external available information needs to be configured for the AAS."@en
	* @param externalInformationPoints desired value for the property externalInformationPoints.
	* More information under https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints
	*/
	final public void setExternalInformationPoints (boolean externalInformationPoints) {
		this.externalInformationPoints = externalInformationPoints;
	}

	/**
	* "References to submodels defining information used by security access permission rules."@en
	* @return Returns the List of Submodel for the property internalInformationPoint.
	* More information under https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint")
	final public List<Submodel> getInternalInformationPoint() {
		return internalInformationPoint;
	}

	
	/**
	* "References to submodels defining information used by security access permission rules."@en
	* @param internalInformationPoint desired value for the property internalInformationPoint.
	* More information under https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint
	*/
	final public void setInternalInformationPoint (List<Submodel> internalInformationPoint) {
		this.internalInformationPoint = internalInformationPoint;
	}
}
