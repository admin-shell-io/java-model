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
* "Data Specification Physical Unit"
* "Data Specification Template for Physical Units."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/")
public class DefaultRC01 implements Serializable, RC01 {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Data Specification Physical Unit", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Data Specification Template for Physical Units.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has conversion factor"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor", "conversionFactor"})
	protected List<String> conversionFactor;


	/**
	* "has definition"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition", "definition"})
	protected List<TypedLiteral> definition;


	/**
	* "has DIN notation"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation", "dinNotation"})
	protected List<String> dinNotation;


	/**
	* "has ECE code"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode", "eceCode"})
	protected List<String> eceCode;


	/**
	* "has ECE name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName", "eceName"})
	protected List<String> eceName;


	/**
	* "has NIST name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName", "nistName"})
	protected List<String> nistName;


	/**
	* "has registration authority"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId", "registrationAuthorityId"})
	protected List<String> registrationAuthorityId;


	/**
	* "has SI name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName", "siName"})
	protected List<String> siName;


	/**
	* "has SI notation"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation", "siNotation"})
	protected List<String> siNotation;


	/**
	* "has supplier"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier", "supplier"})
	protected List<String> supplier;


	/**
	* "unit has name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName", "unitName"})
	protected List<String> unitName;


	/**
	* "unit has symbol"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol", "unitSymbol"})
	protected List<String> unitSymbol;


	// no manual construction
	protected DefaultRC01() {
		id = VocabUtil.getInstance().createRandomUrl("rC01");
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
	* This function returns a hash code value for the RC01 for the benefit of e.g. hash tables.
	* @return a hash code value for the RC01
	*/
	public int hashCode() {
		return Objects.hash(new Object[]{super.hashCode(), this.conversionFactor, this.definition, this.dinNotation, this.eceCode, this.eceName, this.nistName, this.siName, this.siNotation, this.registrationAuthorityId, this.supplier, this.unitName, this.unitSymbol});
	}

	/**
	* This function indicates wheather some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this RC01 is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultRC01 other = (DefaultRC01) obj;
			return super.equals(other) && Objects.equals(this.conversionFactor, other.conversionFactor) && Objects.equals(this.definition, other.definition) && Objects.equals(this.dinNotation, other.dinNotation) && Objects.equals(this.eceCode, other.eceCode) && Objects.equals(this.eceName, other.eceName) && Objects.equals(this.nistName, other.nistName) && Objects.equals(this.siName, other.siName) && Objects.equals(this.siNotation, other.siNotation) && Objects.equals(this.registrationAuthorityId, other.registrationAuthorityId) && Objects.equals(this.supplier, other.supplier) && Objects.equals(this.unitName, other.unitName) && Objects.equals(this.unitSymbol, other.unitSymbol);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* @return Returns the List of String for the property conversionFactor.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor")
	final public List<String> getConversionFactor() {
		return conversionFactor;
	}

	
	/**
	* @param conversionFactor desired value for the property conversionFactor.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor
	*/
	final public void setConversionFactor (List<String> conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	/**
	* @return Returns the List of TypedLiteral for the property definition.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition")
	final public List<TypedLiteral> getDefinition() {
		return definition;
	}

	
	/**
	* @param definition desired value for the property definition.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition
	*/
	final public void setDefinition (List<TypedLiteral> definition) {
		this.definition = definition;
	}

	/**
	* @return Returns the List of String for the property dinNotation.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation")
	final public List<String> getDinNotation() {
		return dinNotation;
	}

	
	/**
	* @param dinNotation desired value for the property dinNotation.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation
	*/
	final public void setDinNotation (List<String> dinNotation) {
		this.dinNotation = dinNotation;
	}

	/**
	* @return Returns the List of String for the property eceCode.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode")
	final public List<String> getEceCode() {
		return eceCode;
	}

	
	/**
	* @param eceCode desired value for the property eceCode.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode
	*/
	final public void setEceCode (List<String> eceCode) {
		this.eceCode = eceCode;
	}

	/**
	* @return Returns the List of String for the property eceName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName")
	final public List<String> getEceName() {
		return eceName;
	}

	
	/**
	* @param eceName desired value for the property eceName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName
	*/
	final public void setEceName (List<String> eceName) {
		this.eceName = eceName;
	}

	/**
	* @return Returns the List of String for the property nistName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName")
	final public List<String> getNistName() {
		return nistName;
	}

	
	/**
	* @param nistName desired value for the property nistName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName
	*/
	final public void setNistName (List<String> nistName) {
		this.nistName = nistName;
	}

	/**
	* @return Returns the List of String for the property siName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName")
	final public List<String> getSiName() {
		return siName;
	}

	
	/**
	* @param siName desired value for the property siName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName
	*/
	final public void setSiName (List<String> siName) {
		this.siName = siName;
	}

	/**
	* @return Returns the List of String for the property siNotation.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation")
	final public List<String> getSiNotation() {
		return siNotation;
	}

	
	/**
	* @param siNotation desired value for the property siNotation.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation
	*/
	final public void setSiNotation (List<String> siNotation) {
		this.siNotation = siNotation;
	}

	/**
	* @return Returns the List of String for the property registrationAuthorityId.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId")
	final public List<String> getRegistrationAuthorityId() {
		return registrationAuthorityId;
	}

	
	/**
	* @param registrationAuthorityId desired value for the property registrationAuthorityId.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId
	*/
	final public void setRegistrationAuthorityId (List<String> registrationAuthorityId) {
		this.registrationAuthorityId = registrationAuthorityId;
	}

	/**
	* @return Returns the List of String for the property supplier.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier")
	final public List<String> getSupplier() {
		return supplier;
	}

	
	/**
	* @param supplier desired value for the property supplier.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier
	*/
	final public void setSupplier (List<String> supplier) {
		this.supplier = supplier;
	}

	/**
	* @return Returns the List of String for the property unitName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName")
	final public List<String> getUnitName() {
		return unitName;
	}

	
	/**
	* @param unitName desired value for the property unitName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName
	*/
	final public void setUnitName (List<String> unitName) {
		this.unitName = unitName;
	}

	/**
	* @return Returns the List of String for the property unitSymbol.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol")
	final public List<String> getUnitSymbol() {
		return unitSymbol;
	}

	
	/**
	* @param unitSymbol desired value for the property unitSymbol.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol
	*/
	final public void setUnitSymbol (List<String> unitSymbol) {
		this.unitSymbol = unitSymbol;
	}

}
