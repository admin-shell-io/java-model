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
* "Submodel Element Collection"
* "A submodel element collection is a set or list of submodel elements."@en
* "Constraint AASd-059: If the semanticId of a SubmodelElementCollection references a ConceptDescription then the category of the ConceptDescription shall be COLLECTION or ENTITY."@en
* "Constraint AASd-092: If the semanticId of a SubmodelElementCollection with SubmodelElementCollection/allowDuplicates == false references a ConceptDescription then the ConceptDescription/category shall be ENTITY."@en
* "Constraint AASd-093: If the semanticId of a SubmodelElementCollection with SubmodelElementCollection/allowDuplicates == true references a ConceptDescription then the ConceptDescription/category shall be COLLECTION."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:SubmodelElementCollection")
public class DefaultSubmodelElementCollection implements Serializable, SubmodelElementCollection {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Submodel Element Collection", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("A submodel element collection is a set or list of submodel elements.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "allow duplicates"
	* "If allowDuplicates=true then it is allowed that the collection contains the same element several times. Default = false"@en
	* "Constraint AASd-026: If allowDuplicates==false then it is not allowed that the collection contains several elements with the same semantics (i.e. the same semanticId)."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates", "allowDuplicates"})
	protected List<Boolean> allowDuplicates;


	/**
	* "ordered"
	* "If ordered=false then the elements in the property collection are not ordered. If ordered=true then the elements in the collection are ordered. Default = false"@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered", "ordered"})
	protected List<Boolean> ordered;


	/**
	* "has value"
	* "Submodel element contained in the collection."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value", "value"})
	protected List<SubmodelElement> value;


	// no manual construction
	protected DefaultSubmodelElementCollection() {
		id = VocabUtil.getInstance().createRandomUrl("submodelElementCollection");
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
	* This function returns a hash code value for the SubmodelElementCollection for the benefit of e.g. hash tables.
	* @return a hash code value for the SubmodelElementCollection
	*/
	public int hashCode() {
		return Objects.hash(new Object[]{super.hashCode(), this.allowDuplicates, this.ordered, this.value});
	}

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this SubmodelElementCollection is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultSubmodelElementCollection other = (DefaultSubmodelElementCollection) obj;
			return super.equals(other) && Objects.equals(this.allowDuplicates, other.allowDuplicates) && Objects.equals(this.ordered, other.ordered) && Objects.equals(this.value, other.value);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "If allowDuplicates=true then it is allowed that the collection contains the same element several times. Default = false"@en
	* "Constraint AASd-026: If allowDuplicates==false then it is not allowed that the collection contains several elements with the same semantics (i.e. the same semanticId)."@en
	* @return Returns the List of Boolean for the property allowDuplicates.
	* More information under https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates")
	final public List<Boolean> getAllowDuplicates() {
		return allowDuplicates;
	}

	
	/**
	* "If allowDuplicates=true then it is allowed that the collection contains the same element several times. Default = false"@en
	* "Constraint AASd-026: If allowDuplicates==false then it is not allowed that the collection contains several elements with the same semantics (i.e. the same semanticId)."@en
	* @param allowDuplicates desired value for the property allowDuplicates.
	* More information under https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates
	*/
	final public void setAllowDuplicates (List<Boolean> allowDuplicates) {
		this.allowDuplicates = allowDuplicates;
	}

	/**
	* "If ordered=false then the elements in the property collection are not ordered. If ordered=true then the elements in the collection are ordered. Default = false"@en
	* @return Returns the List of Boolean for the property ordered.
	* More information under https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered")
	final public List<Boolean> getOrdered() {
		return ordered;
	}

	
	/**
	* "If ordered=false then the elements in the property collection are not ordered. If ordered=true then the elements in the collection are ordered. Default = false"@en
	* @param ordered desired value for the property ordered.
	* More information under https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered
	*/
	final public void setOrdered (List<Boolean> ordered) {
		this.ordered = ordered;
	}

	/**
	* "Submodel element contained in the collection."@en
	* @return Returns the List of SubmodelElement for the property value.
	* More information under https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value")
	final public List<SubmodelElement> getValue() {
		return value;
	}

	
	/**
	* "Submodel element contained in the collection."@en
	* @param value desired value for the property value.
	* More information under https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value
	*/
	final public void setValue (List<SubmodelElement> value) {
		this.value = value;
	}

}
