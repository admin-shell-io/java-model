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

import com.fasterxml.jackson.annotation.JsonIgnore;

/** 
* "Data Specification Physical Unit"
* "Data Specification Template for Physical Units."@en 
*/

public class DefaultRC01 implements RC01 {


	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has conversion factor"
	*/
	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor")
	protected List<String> conversionFactors;


	/**
	* "has definition"
	*/
	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition")
	protected List<TypedLiteral> definitions;


	/**
	* "has DIN notation"
	*/
	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation")
	protected List<String> dinNotations;


	/**
	* "has ECE code"
	*/
	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode")
	protected List<String> eceCodes;


	/**
	* "has ECE name"
	*/
	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName")
	protected List<String> eceNames;


	/**
	* "has NIST name"
	*/
	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName")
	protected List<String> nistNames;


	/**
	* "has registration authority"
	*/
	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId")
	protected List<String> registrationAuthorityIds;


	/**
	* "has SI name"
	*/
	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName")
	protected List<String> siNames;


	/**
	* "has SI notation"
	*/
	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation")
	protected List<String> siNotations;


	/**
	* "has supplier"
	*/
	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier")
	protected List<String> suppliers;


	/**
	* "unit has name"
	*/
	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName")
	protected List<String> unitNames;


	/**
	* "unit has symbol"
	*/
	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol")
	protected List<String> unitSymbols;


	// no manual construction
	protected DefaultRC01() {
	}

	@Override
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

	@Override
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

	@Override
	public Object deepCopy() {
		DefaultRC01 other = new DefaultRC01();
		other.conversionFactors = (List<String>) Util.clone(this.conversionFactors);
		other.definitions = (List<TypedLiteral>) Util.clone(this.definitions);
		other.dinNotations = (List<String>) Util.clone(this.dinNotations);
		other.eceCodes = (List<String>) Util.clone(this.eceCodes);
		other.eceNames = (List<String>) Util.clone(this.eceNames);
		other.nistNames = (List<String>) Util.clone(this.nistNames);
		other.siNames = (List<String>) Util.clone(this.siNames);
		other.siNotations = (List<String>) Util.clone(this.siNotations);
		other.registrationAuthorityIds = (List<String>) Util.clone(this.registrationAuthorityIds);
		other.suppliers = (List<String>) Util.clone(this.suppliers);
		other.unitNames = (List<String>) Util.clone(this.unitNames);
		other.unitSymbols = (List<String>) Util.clone(this.unitSymbols);
		return other;
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor")
	final public List<String> getConversionFactors() {
		return conversionFactors;
	}
	
	final public void setConversionFactors (List<String> conversionFactors) {
		this.conversionFactors = conversionFactors;
	}

	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition")
	final public List<TypedLiteral> getDefinitions() {
		return definitions;
	}
	
	final public void setDefinitions (List<TypedLiteral> definitions) {
		this.definitions = definitions;
	}

	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation")
	final public List<String> getDinNotations() {
		return dinNotations;
	}
	
	final public void setDinNotations (List<String> dinNotations) {
		this.dinNotations = dinNotations;
	}

	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode")
	final public List<String> getEceCodes() {
		return eceCodes;
	}
	
	final public void setEceCodes (List<String> eceCodes) {
		this.eceCodes = eceCodes;
	}

	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName")
	final public List<String> getEceNames() {
		return eceNames;
	}
	
	final public void setEceNames (List<String> eceNames) {
		this.eceNames = eceNames;
	}

	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName")
	final public List<String> getNistNames() {
		return nistNames;
	}
	
	final public void setNistNames (List<String> nistNames) {
		this.nistNames = nistNames;
	}

	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName")
	final public List<String> getSiNames() {
		return siNames;
	}
	
	final public void setSiNames (List<String> siNames) {
		this.siNames = siNames;
	}

	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation")
	final public List<String> getSiNotations() {
		return siNotations;
	}
	
	final public void setSiNotations (List<String> siNotations) {
		this.siNotations = siNotations;
	}

	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId")
	final public List<String> getRegistrationAuthorityIds() {
		return registrationAuthorityIds;
	}
	
	final public void setRegistrationAuthorityIds (List<String> registrationAuthorityIds) {
		this.registrationAuthorityIds = registrationAuthorityIds;
	}

	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier")
	final public List<String> getSuppliers() {
		return suppliers;
	}
	
	final public void setSuppliers (List<String> suppliers) {
		this.suppliers = suppliers;
	}

	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName")
	final public List<String> getUnitNames() {
		return unitNames;
	}
	
	final public void setUnitNames (List<String> unitNames) {
		this.unitNames = unitNames;
	}

	@IRI("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol")
	final public List<String> getUnitSymbols() {
		return unitSymbols;
	}
	
	final public void setUnitSymbols (List<String> unitSymbols) {
		this.unitSymbols = unitSymbols;
	}

}
