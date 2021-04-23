package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
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
* "Subject Attributes"
* "A set of data elements that further classifies a specific subject."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:SubjectAttributes")
public class DefaultSubjectAttributes implements Serializable, SubjectAttributes {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Subject Attributes", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("A set of data elements that further classifies a specific subject.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has subject attribute"
	* "A data element that further classifies a specific subject. "@en
	* "Constraint AASs-015: The data element SubjectAttributes/subjectAttribute shall be part of the submodel that is referenced within the \'selectableSubjectAttributes\' attribute of \'AccessControl\'."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/SubjectAttributes/subjectAttribute", "subjectAttributesSubjectAttribute"})
	protected List<DataElement> subjectAttributesSubjectAttributes;


	// no manual construction
	protected DefaultSubjectAttributes() {
		id = VocabUtil.getInstance().createRandomUrl("subjectAttributes");
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

	public int hashCode() {
		return Objects.hash(new Object[]{this.subjectAttributesSubjectAttributes});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultSubjectAttributes other = (DefaultSubjectAttributes) obj;
			return Objects.equals(this.subjectAttributesSubjectAttributes, other.subjectAttributesSubjectAttributes);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/SubjectAttributes/subjectAttribute")
	final public List<DataElement> getSubjectAttributesSubjectAttributes() {
		return subjectAttributesSubjectAttributes;
	}
	
	final public void setSubjectAttributesSubjectAttributes (List<DataElement> subjectAttributesSubjectAttributes) {
		this.subjectAttributesSubjectAttributes = subjectAttributesSubjectAttributes;
	}
}
