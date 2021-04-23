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
* "Operation Variable"
* "An operation variable is a submodel element that is used as input or output variable of an operation."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:OperationVariable")
public class DefaultOperationVariable implements Serializable, OperationVariable {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Operation Variable", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("An operation variable is a submodel element that is used as input or output variable of an operation.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "value"
	* "Describes the needed argument for an operation via a submodel element of kind=Template."@en
	* "The submodel element value of an operation variable shall be of kind=Template."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/OperationVariable/value", "operationVariableValue"})
	protected SubmodelElement operationVariableValue;


	// no manual construction
	protected DefaultOperationVariable() {
		id = VocabUtil.getInstance().createRandomUrl("operationVariable");
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
		return Objects.hash(new Object[]{this.operationVariableValue});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultOperationVariable other = (DefaultOperationVariable) obj;
			return Objects.equals(this.operationVariableValue, other.operationVariableValue);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/OperationVariable/value")
	final public SubmodelElement getOperationVariableValue() {
		return operationVariableValue;
	}
	
	final public void setOperationVariableValue (SubmodelElement operationVariableValue) {
		this.operationVariableValue = operationVariableValue;
	}
}
