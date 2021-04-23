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
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor", "conversionFactor"})
	protected List<String> conversionFactors;


	/**
	* "has definition"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition", "definition"})
	protected List<TypedLiteral> definitions;


	/**
	* "has DIN notation"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation", "dinNotation"})
	protected List<String> dinNotations;


	/**
	* "has ECE code"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode", "eceCode"})
	protected List<String> eceCodes;


	/**
	* "has ECE name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName", "eceName"})
	protected List<String> eceNames;


	/**
	* "has NIST name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName", "nistName"})
	protected List<String> nistNames;


	/**
	* "has registration authority"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId", "registrationAuthorityId"})
	protected List<String> registrationAuthorityIds;


	/**
	* "has SI name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName", "siName"})
	protected List<String> siNames;


	/**
	* "has SI notation"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation", "siNotation"})
	protected List<String> siNotations;


	/**
	* "has supplier"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier", "supplier"})
	protected List<String> suppliers;


	/**
	* "unit has name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName", "unitName"})
	protected List<String> unitNames;


	/**
	* "unit has symbol"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol", "unitSymbol"})
	protected List<String> unitSymbols;


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

	public int hashCode() {
		return Objects.hash(new Object[]{this.conversionFactors,
			this.definitions,
			this.dinNotations,
			this.eceCodes,
			this.eceNames,
			this.nistNames,
			this.siNames,
			this.siNotations,
			this.registrationAuthorityIds,
			this.suppliers,
			this.unitNames,
			this.unitSymbols});
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
			return Objects.equals(this.conversionFactors, other.conversionFactors) &&
				Objects.equals(this.definitions, other.definitions) &&
				Objects.equals(this.dinNotations, other.dinNotations) &&
				Objects.equals(this.eceCodes, other.eceCodes) &&
				Objects.equals(this.eceNames, other.eceNames) &&
				Objects.equals(this.nistNames, other.nistNames) &&
				Objects.equals(this.siNames, other.siNames) &&
				Objects.equals(this.siNotations, other.siNotations) &&
				Objects.equals(this.registrationAuthorityIds, other.registrationAuthorityIds) &&
				Objects.equals(this.suppliers, other.suppliers) &&
				Objects.equals(this.unitNames, other.unitNames) &&
				Objects.equals(this.unitSymbols, other.unitSymbols);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor")
	final public List<String> getConversionFactors() {
		return conversionFactors;
	}
	
	final public void setConversionFactors (List<String> conversionFactors) {
		this.conversionFactors = conversionFactors;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition")
	final public List<TypedLiteral> getDefinitions() {
		return definitions;
	}
	
	final public void setDefinitions (List<TypedLiteral> definitions) {
		this.definitions = definitions;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation")
	final public List<String> getDinNotations() {
		return dinNotations;
	}
	
	final public void setDinNotations (List<String> dinNotations) {
		this.dinNotations = dinNotations;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode")
	final public List<String> getEceCodes() {
		return eceCodes;
	}
	
	final public void setEceCodes (List<String> eceCodes) {
		this.eceCodes = eceCodes;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName")
	final public List<String> getEceNames() {
		return eceNames;
	}
	
	final public void setEceNames (List<String> eceNames) {
		this.eceNames = eceNames;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName")
	final public List<String> getNistNames() {
		return nistNames;
	}
	
	final public void setNistNames (List<String> nistNames) {
		this.nistNames = nistNames;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName")
	final public List<String> getSiNames() {
		return siNames;
	}
	
	final public void setSiNames (List<String> siNames) {
		this.siNames = siNames;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation")
	final public List<String> getSiNotations() {
		return siNotations;
	}
	
	final public void setSiNotations (List<String> siNotations) {
		this.siNotations = siNotations;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId")
	final public List<String> getRegistrationAuthorityIds() {
		return registrationAuthorityIds;
	}
	
	final public void setRegistrationAuthorityIds (List<String> registrationAuthorityIds) {
		this.registrationAuthorityIds = registrationAuthorityIds;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier")
	final public List<String> getSuppliers() {
		return suppliers;
	}
	
	final public void setSuppliers (List<String> suppliers) {
		this.suppliers = suppliers;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName")
	final public List<String> getUnitNames() {
		return unitNames;
	}
	
	final public void setUnitNames (List<String> unitNames) {
		this.unitNames = unitNames;
	}

	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol")
	final public List<String> getUnitSymbols() {
		return unitSymbols;
	}
	
	final public void setUnitSymbols (List<String> unitSymbols) {
		this.unitSymbols = unitSymbols;
	}

}
