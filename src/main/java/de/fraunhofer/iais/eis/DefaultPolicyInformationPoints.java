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
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Policy Information Points", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("Defines the security policy information points (PIP). Serves as the retrieval source of attributes, or the data required for policy evaluation to provide the information needed by the policy decision point to make the decisions.", "en"));

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
	protected List<Submodel> internalInformationPoints;


	// no manual construction
	protected DefaultPolicyInformationPoints() {
		id = VocabUtil.getInstance().createRandomUrl("policyInformationPoints");
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

	public int hashCode() {
		return Objects.hash(new Object[]{this.externalInformationPoints,
			this.internalInformationPoints});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultPolicyInformationPoints other = (DefaultPolicyInformationPoints) obj;
			return Objects.equals(this.externalInformationPoints, other.externalInformationPoints) &&
				Objects.equals(this.internalInformationPoints, other.internalInformationPoints);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/externalInformationPoints")
	final public boolean getExternalInformationPoints() {
		return externalInformationPoints;
	}
	
	final public void setExternalInformationPoints (boolean externalInformationPoints) {
		this.externalInformationPoints = externalInformationPoints;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyInformationPoints/internalInformationPoint")
	final public List<Submodel> getInternalInformationPoints() {
		return internalInformationPoints;
	}
	
	final public void setInternalInformationPoints (List<Submodel> internalInformationPoints) {
		this.internalInformationPoints = internalInformationPoints;
	}
}
