package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

/** 
	"Data Specification Physical Unit"

	"Data Specification Template for Physical Units."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/")
public class RC01Impl implements Serializable, RC01 {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Data Specification Physical Unit", ""));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Data Specification Template for Physical Units.", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"has conversion factor"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor", "rC01ConversionFactor"})
	 java.util.ArrayList<? extends String> _rC01ConversionFactor;


	/**
	"has definition"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition", "rC01Definition"})
	 java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _rC01Definition;


	/**
	"has DIN notation"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation", "rC01DinNotation"})
	 java.util.ArrayList<? extends String> _rC01DinNotation;


	/**
	"has ECE code"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode", "rC01EceCode"})
	 java.util.ArrayList<? extends String> _rC01EceCode;


	/**
	"has ECE name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName", "rC01EceName"})
	 java.util.ArrayList<? extends String> _rC01EceName;


	/**
	"has NIST name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName", "rC01NistName"})
	 java.util.ArrayList<? extends String> _rC01NistName;


	/**
	"has registration authority"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId", "rC01RegistrationAuthorityId"})
	 java.util.ArrayList<? extends String> _rC01RegistrationAuthorityId;


	/**
	"has SI name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName", "rC01SiName"})
	 java.util.ArrayList<? extends String> _rC01SiName;


	/**
	"has SI notation"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation", "rC01SiNotation"})
	 java.util.ArrayList<? extends String> _rC01SiNotation;


	/**
	"has supplier"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier", "rC01Supplier"})
	 java.util.ArrayList<? extends String> _rC01Supplier;


	/**
	"unit has name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName", "rC01UnitName"})
	 java.util.ArrayList<? extends String> _rC01UnitName;


	/**
	"unit has symbol"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol", "rC01UnitSymbol"})
	 java.util.ArrayList<? extends String> _rC01UnitSymbol;


	// no manual construction
	RC01Impl() {
		id = VocabUtil.getInstance().createRandomUrl("rC01");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public java.util.List<TypedLiteral> getLabel() {
		return this.label;
	}

	public java.util.List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public java.util.Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		java.util.Map<String,Object> resultset = new HashMap<String, Object>();
		while (iter.hasNext()) {
			String key = iter.next();
			resultset.put(key,urifyObjects(this.properties.get(key)));
		}
		return resultset ;
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
		} else if (value instanceof java.util.Map) {
			java.util.Map<String, Object> result_map = new HashMap<String, Object>();
			((java.util.Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
	if (this.properties == null) this.properties = new java.util.HashMap<String,Object>();
	if (property.startsWith("@")) {return ;};
	this.properties.put(property, value) ;
	}
	// accessor method implementations as derived from information model

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor")
	java.util.ArrayList<? extends String> getRC01ConversionFactor() {
		return _rC01ConversionFactor;
	}

	final public void setRC01ConversionFactor (java.util.ArrayList<? extends String> _rC01ConversionFactor_) {
		this._rC01ConversionFactor = _rC01ConversionFactor_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getRC01Definition() {
		return _rC01Definition;
	}

	final public void setRC01Definition (java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _rC01Definition_) {
		this._rC01Definition = _rC01Definition_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation")
	java.util.ArrayList<? extends String> getRC01DinNotation() {
		return _rC01DinNotation;
	}

	final public void setRC01DinNotation (java.util.ArrayList<? extends String> _rC01DinNotation_) {
		this._rC01DinNotation = _rC01DinNotation_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode")
	java.util.ArrayList<? extends String> getRC01EceCode() {
		return _rC01EceCode;
	}

	final public void setRC01EceCode (java.util.ArrayList<? extends String> _rC01EceCode_) {
		this._rC01EceCode = _rC01EceCode_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName")
	java.util.ArrayList<? extends String> getRC01EceName() {
		return _rC01EceName;
	}

	final public void setRC01EceName (java.util.ArrayList<? extends String> _rC01EceName_) {
		this._rC01EceName = _rC01EceName_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName")
	java.util.ArrayList<? extends String> getRC01NistName() {
		return _rC01NistName;
	}

	final public void setRC01NistName (java.util.ArrayList<? extends String> _rC01NistName_) {
		this._rC01NistName = _rC01NistName_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName")
	java.util.ArrayList<? extends String> getRC01SiName() {
		return _rC01SiName;
	}

	final public void setRC01SiName (java.util.ArrayList<? extends String> _rC01SiName_) {
		this._rC01SiName = _rC01SiName_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation")
	java.util.ArrayList<? extends String> getRC01SiNotation() {
		return _rC01SiNotation;
	}

	final public void setRC01SiNotation (java.util.ArrayList<? extends String> _rC01SiNotation_) {
		this._rC01SiNotation = _rC01SiNotation_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId")
	java.util.ArrayList<? extends String> getRC01RegistrationAuthorityId() {
		return _rC01RegistrationAuthorityId;
	}

	final public void setRC01RegistrationAuthorityId (java.util.ArrayList<? extends String> _rC01RegistrationAuthorityId_) {
		this._rC01RegistrationAuthorityId = _rC01RegistrationAuthorityId_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier")
	java.util.ArrayList<? extends String> getRC01Supplier() {
		return _rC01Supplier;
	}

	final public void setRC01Supplier (java.util.ArrayList<? extends String> _rC01Supplier_) {
		this._rC01Supplier = _rC01Supplier_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName")
	java.util.ArrayList<? extends String> getRC01UnitName() {
		return _rC01UnitName;
	}

	final public void setRC01UnitName (java.util.ArrayList<? extends String> _rC01UnitName_) {
		this._rC01UnitName = _rC01UnitName_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol")
	java.util.ArrayList<? extends String> getRC01UnitSymbol() {
		return _rC01UnitSymbol;
	}

	final public void setRC01UnitSymbol (java.util.ArrayList<? extends String> _rC01UnitSymbol_) {
		this._rC01UnitSymbol = _rC01UnitSymbol_;
	}

}
