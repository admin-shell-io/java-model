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
* "Data Specification Physical Unit"
* "Data Specification Template for Physical Units."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = RC01Impl.class)
})
public interface IRC01 extends IDataSpecificationContent {

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


	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor")
	public List<? extends String> getRC01ConversionFactor();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition")
	public List<? extends TypedLiteral> getRC01Definition();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation")
	public List<? extends String> getRC01DinNotation();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode")
	public List<? extends String> getRC01EceCode();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName")
	public List<? extends String> getRC01EceName();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName")
	public List<? extends String> getRC01NistName();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName")
	public List<? extends String> getRC01SiName();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation")
	public List<? extends String> getRC01SiNotation();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId")
	public List<? extends String> getRC01RegistrationAuthorityId();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier")
	public List<? extends String> getRC01Supplier();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName")
	public List<? extends String> getRC01UnitName();

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol")
	public List<? extends String> getRC01UnitSymbol();

}
