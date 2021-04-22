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
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Data Specification Physical Unit", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("Data Specification Template for Physical Units.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has conversion factor"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor", "rC01ConversionFactor"})
	protected List<String> rC01ConversionFactors;


	/**
	* "has definition"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition", "rC01Definition"})
	protected List<TypedLiteral> rC01Definitions;


	/**
	* "has DIN notation"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation", "rC01DinNotation"})
	protected List<String> rC01DinNotations;


	/**
	* "has ECE code"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode", "rC01EceCode"})
	protected List<String> rC01EceCodes;


	/**
	* "has ECE name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName", "rC01EceName"})
	protected List<String> rC01EceNames;


	/**
	* "has NIST name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName", "rC01NistName"})
	protected List<String> rC01NistNames;


	/**
	* "has registration authority"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId", "rC01RegistrationAuthorityId"})
	protected List<String> rC01RegistrationAuthorityIds;


	/**
	* "has SI name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName", "rC01SiName"})
	protected List<String> rC01SiNames;


	/**
	* "has SI notation"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation", "rC01SiNotation"})
	protected List<String> rC01SiNotations;


	/**
	* "has supplier"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier", "rC01Supplier"})
	protected List<String> rC01Suppliers;


	/**
	* "unit has name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName", "rC01UnitName"})
	protected List<String> rC01UnitNames;


	/**
	* "unit has symbol"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol", "rC01UnitSymbol"})
	protected List<String> rC01UnitSymbols;


	// no manual construction
	protected DefaultRC01() {
		id = VocabUtil.getInstance().createRandomUrl("rC01");
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
		return Objects.hash(new Object[]{this.rC01ConversionFactors,
			this.rC01Definitions,
			this.rC01DinNotations,
			this.rC01EceCodes,
			this.rC01EceNames,
			this.rC01NistNames,
			this.rC01SiNames,
			this.rC01SiNotations,
			this.rC01RegistrationAuthorityIds,
			this.rC01Suppliers,
			this.rC01UnitNames,
			this.rC01UnitSymbols});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultRC01 other = (DefaultRC01) obj;
			return Objects.equals(this.rC01ConversionFactors, other.rC01ConversionFactors) &&
				Objects.equals(this.rC01Definitions, other.rC01Definitions) &&
				Objects.equals(this.rC01DinNotations, other.rC01DinNotations) &&
				Objects.equals(this.rC01EceCodes, other.rC01EceCodes) &&
				Objects.equals(this.rC01EceNames, other.rC01EceNames) &&
				Objects.equals(this.rC01NistNames, other.rC01NistNames) &&
				Objects.equals(this.rC01SiNames, other.rC01SiNames) &&
				Objects.equals(this.rC01SiNotations, other.rC01SiNotations) &&
				Objects.equals(this.rC01RegistrationAuthorityIds, other.rC01RegistrationAuthorityIds) &&
				Objects.equals(this.rC01Suppliers, other.rC01Suppliers) &&
				Objects.equals(this.rC01UnitNames, other.rC01UnitNames) &&
				Objects.equals(this.rC01UnitSymbols, other.rC01UnitSymbols);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor")
	final public List<String> getRC01ConversionFactors() {
		return rC01ConversionFactors;
	}
	
	final public void setRC01ConversionFactors (List<String> rC01ConversionFactors) {
		this.rC01ConversionFactors = rC01ConversionFactors;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition")
	final public List<TypedLiteral> getRC01Definitions() {
		return rC01Definitions;
	}
	
	final public void setRC01Definitions (List<TypedLiteral> rC01Definitions) {
		this.rC01Definitions = rC01Definitions;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation")
	final public List<String> getRC01DinNotations() {
		return rC01DinNotations;
	}
	
	final public void setRC01DinNotations (List<String> rC01DinNotations) {
		this.rC01DinNotations = rC01DinNotations;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode")
	final public List<String> getRC01EceCodes() {
		return rC01EceCodes;
	}
	
	final public void setRC01EceCodes (List<String> rC01EceCodes) {
		this.rC01EceCodes = rC01EceCodes;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName")
	final public List<String> getRC01EceNames() {
		return rC01EceNames;
	}
	
	final public void setRC01EceNames (List<String> rC01EceNames) {
		this.rC01EceNames = rC01EceNames;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName")
	final public List<String> getRC01NistNames() {
		return rC01NistNames;
	}
	
	final public void setRC01NistNames (List<String> rC01NistNames) {
		this.rC01NistNames = rC01NistNames;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName")
	final public List<String> getRC01SiNames() {
		return rC01SiNames;
	}
	
	final public void setRC01SiNames (List<String> rC01SiNames) {
		this.rC01SiNames = rC01SiNames;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation")
	final public List<String> getRC01SiNotations() {
		return rC01SiNotations;
	}
	
	final public void setRC01SiNotations (List<String> rC01SiNotations) {
		this.rC01SiNotations = rC01SiNotations;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId")
	final public List<String> getRC01RegistrationAuthorityIds() {
		return rC01RegistrationAuthorityIds;
	}
	
	final public void setRC01RegistrationAuthorityIds (List<String> rC01RegistrationAuthorityIds) {
		this.rC01RegistrationAuthorityIds = rC01RegistrationAuthorityIds;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier")
	final public List<String> getRC01Suppliers() {
		return rC01Suppliers;
	}
	
	final public void setRC01Suppliers (List<String> rC01Suppliers) {
		this.rC01Suppliers = rC01Suppliers;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName")
	final public List<String> getRC01UnitNames() {
		return rC01UnitNames;
	}
	
	final public void setRC01UnitNames (List<String> rC01UnitNames) {
		this.rC01UnitNames = rC01UnitNames;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol")
	final public List<String> getRC01UnitSymbols() {
		return rC01UnitSymbols;
	}
	
	final public void setRC01UnitSymbols (List<String> rC01UnitSymbols) {
		this.rC01UnitSymbols = rC01UnitSymbols;
	}

}
