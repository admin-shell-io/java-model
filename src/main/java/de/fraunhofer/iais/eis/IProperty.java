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
* "Property"
* "A property is a data element that has a single value."@en
* "Constraint AASd-052a: If the semanticId of a Property references a ConceptDescription then the ConceptDescription/category shall be one of  following values: VALUE, PROPERTY."@en
* "Constraint AASd-065: If the semanticId of a Property or MultiLanguageProperty references a ConceptDescription with the  category VALUE then the value of the property is identical to  DataSpecificationIEC61360/value and the valueId of the property is identical to DataSpecificationIEC61360/valueId."@en
* "Constraint AASd-066: If the semanticId of a Property or MultiLanguageProperty references a ConceptDescription with the  category PROPERTY and DataSpecificationIEC61360/valueList is defined the value and valueId of the property is identical to one of the value reference pair types references in the value list, i.e. ValueReferencePairType/value or ValueReferencePairType/valueId, resp."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = PropertyImpl.class)
})
public interface IProperty extends IDataElement {

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
	* "The following categories are defined for properties and multi-language properties: CONSTANT, PARAMETER, and VARIABLE."@en
	* @return Returns the List of Category for the property propertyPropertyCategory.
	* More information under https://admin-shell.io/aas/3/0/RC01/Property/propertyCategory
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Property/propertyCategory")
	public List<? extends Category> getPropertyPropertyCategory();

	/**
	* "The value of the property instance."@en
	* @return Returns the TypedLiteral for the property propertyValue.
	* More information under https://admin-shell.io/aas/3/0/RC01/Property/value
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Property/value")
	public TypedLiteral getPropertyValue();

	/**
	* "Reference to the global unique id of a coded value."@en
	* "Constraint AASd-007: if both, the value and the valueId are present then the value needs to be identical to the value of the referenced coded value in valueId."@en
	* @return Returns the IReference for the property propertyValueId.
	* More information under https://admin-shell.io/aas/3/0/RC01/Property/valueId
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Property/valueId")
	public IReference getPropertyValueId();

}
