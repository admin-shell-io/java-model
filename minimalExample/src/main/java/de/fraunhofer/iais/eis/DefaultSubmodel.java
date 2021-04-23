package de.fraunhofer.iais.eis;

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
* "Submodel"
* "A Submodel defines a specific aspect of the asset represented by the AAS. A submodel is used to structure the virtual representation and technical functionality of an Administration Shell into distinguishable parts. Each submodel refers to a well-defined domain or subject matter. Submodels can become standardized and thus become submodels types. Submodels can have different life-cycles."@en
* "Describe the different types of Data related to the I4.0 Asset"@en
* "Constraint AASd-062: The semanticId of a Submodel shall only reference a ConceptDescription with the category APPLICATION_CLASS."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:Submodel")
public class DefaultSubmodel implements Serializable, Submodel {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Submodel", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("A Submodel defines a specific aspect of the asset represented by the AAS. A submodel is used to structure the virtual representation and technical functionality of an Administration Shell into distinguishable parts. Each submodel refers to a well-defined domain or subject matter. Submodels can become standardized and thus become submodels types. Submodels can have different life-cycles.", "en"), new TypedLiteral("Describe the different types of Data related to the I4.0 Asset", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has Submodel Element"
	* "A submodel consists of zero or more submodel elements."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement", "submodelElement"})
	protected List<SubmodelElement> submodelElement;


	// no manual construction
	protected DefaultSubmodel() {
		id = VocabUtil.getInstance().createRandomUrl("submodel");
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
	* This function returns a hash code value for the Submodel for the benefit of e.g. hash tables.
	* @return a hash code value for the Submodel
	*/
	public int hashCode() {
		return Objects.hash(new Object[]{super.hashCode(), this.submodelElement});
	}

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this Submodel is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultSubmodel other = (DefaultSubmodel) obj;
			return super.equals(other) && Objects.equals(this.submodelElement, other.submodelElement);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "A submodel consists of zero or more submodel elements."@en
	* @return Returns the List of SubmodelElement for the property submodelElement.
	* More information under https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement")
	final public List<SubmodelElement> getSubmodelElement() {
		return submodelElement;
	}

	
	/**
	* "A submodel consists of zero or more submodel elements."@en
	* @param submodelElement desired value for the property submodelElement.
	* More information under https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement
	*/
	final public void setSubmodelElement (List<SubmodelElement> submodelElement) {
		this.submodelElement = submodelElement;
	}
}
