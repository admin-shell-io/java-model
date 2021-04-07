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
	"Operation Variable"

	"An operation variable is a submodel element that is used as input or output variable of an operation."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:OperationVariable")
public class OperationVariableImpl implements Serializable, IOperationVariable {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Operation Variable", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("An operation variable is a submodel element that is used as input or output variable of an operation.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	"value"

	"Describes the needed argument for an operation via a submodel element of kind=Template."@en

	"The submodel element value of an operation variable shall be of kind=Template."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/OperationVariable/value", "operationVariableValue"})
	protected ISubmodelElement _operationVariableValue;


	// no manual construction
	protected OperationVariableImpl() {
		id = VocabUtil.getInstance().createRandomUrl("operationVariable");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public List<TypedLiteral> getLabel() {
		return this.label;
	}

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


	// accessor method implementations as derived from the Asset Administration Shell ontology

	/**
	"Describes the needed argument for an operation via a submodel element of kind=Template."@en

	"The submodel element value of an operation variable shall be of kind=Template."@en
	@return the ISubmodelElement of operationVariableValue
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/OperationVariable/value")
	final public ISubmodelElement getOperationVariableValue() {
		return _operationVariableValue;
	}

	final public void setOperationVariableValue (ISubmodelElement _operationVariableValue_) {
		this._operationVariableValue = _operationVariableValue_;
	}
}
