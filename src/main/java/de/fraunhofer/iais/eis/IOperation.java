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
* "Operation"
* "An operation is a submodel element with input and output variables."@en
* "Constraint AASd-060: The semanticId of a Operation submodel element shall only reference a ConceptDescription with the category FUNCTION."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = OperationImpl.class)
})
public interface IOperation extends ISubmodelElement {

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
	* "Input parameter of the operation."@en
	* @return Returns the List of IOperationVariable for the property operationInputVariable.
	* More information under https://admin-shell.io/aas/3/0/RC01/Operation/inputVariable
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Operation/inputVariable")
	public List<? extends IOperationVariable> getOperationInputVariable();

	/**
	* "Parameter that is input and output of the operation."@en
	* @return Returns the List of IOperationVariable for the property operationInoutputVariable.
	* More information under https://admin-shell.io/aas/3/0/RC01/Operation/inoutputVariable
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Operation/inoutputVariable")
	public List<? extends IOperationVariable> getOperationInoutputVariable();

	/**
	* "Output parameter of the operation."@en
	* @return Returns the List of IOperationVariable for the property operationOutputVariable.
	* More information under https://admin-shell.io/aas/3/0/RC01/Operation/outputVariable
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Operation/outputVariable")
	public List<? extends IOperationVariable> getOperationOutputVariable();

}
