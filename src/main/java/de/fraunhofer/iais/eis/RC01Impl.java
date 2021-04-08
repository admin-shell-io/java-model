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
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/")
public class RC01Impl implements Serializable, IRC01 {

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
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor", "rC01ConversionFactor"})
	protected ArrayList<? extends String> _rC01ConversionFactor;


	/**
	* "has definition"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition", "rC01Definition"})
	protected ArrayList<? extends TypedLiteral> _rC01Definition;


	/**
	* "has DIN notation"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation", "rC01DinNotation"})
	protected ArrayList<? extends String> _rC01DinNotation;


	/**
	* "has ECE code"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode", "rC01EceCode"})
	protected ArrayList<? extends String> _rC01EceCode;


	/**
	* "has ECE name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName", "rC01EceName"})
	protected ArrayList<? extends String> _rC01EceName;


	/**
	* "has NIST name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName", "rC01NistName"})
	protected ArrayList<? extends String> _rC01NistName;


	/**
	* "has registration authority"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId", "rC01RegistrationAuthorityId"})
	protected ArrayList<? extends String> _rC01RegistrationAuthorityId;


	/**
	* "has SI name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName", "rC01SiName"})
	protected ArrayList<? extends String> _rC01SiName;


	/**
	* "has SI notation"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation", "rC01SiNotation"})
	protected ArrayList<? extends String> _rC01SiNotation;


	/**
	* "has supplier"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier", "rC01Supplier"})
	protected ArrayList<? extends String> _rC01Supplier;


	/**
	* "unit has name"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName", "rC01UnitName"})
	protected ArrayList<? extends String> _rC01UnitName;


	/**
	* "unit has symbol"
	*/
	@JsonAlias({"https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol", "rC01UnitSymbol"})
	protected ArrayList<? extends String> _rC01UnitSymbol;


	// no manual construction
	protected RC01Impl() {
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


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* @return Returns the List of String for the property rC01ConversionFactor.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor")
	final public List<? extends String> getRC01ConversionFactor() {
		return _rC01ConversionFactor;
	}

	
	/**
	* @param _rC01ConversionFactor_ desired value for the property rC01ConversionFactor.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor
	*/
	final public void setRC01ConversionFactor (ArrayList<? extends String> _rC01ConversionFactor_) {
		this._rC01ConversionFactor = _rC01ConversionFactor_;
	}

	/**
	* @return Returns the List of TypedLiteral for the property rC01Definition.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition")
	final public List<? extends TypedLiteral> getRC01Definition() {
		return _rC01Definition;
	}

	
	/**
	* @param _rC01Definition_ desired value for the property rC01Definition.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition
	*/
	final public void setRC01Definition (ArrayList<? extends TypedLiteral> _rC01Definition_) {
		this._rC01Definition = _rC01Definition_;
	}

	/**
	* @return Returns the List of String for the property rC01DinNotation.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation")
	final public List<? extends String> getRC01DinNotation() {
		return _rC01DinNotation;
	}

	
	/**
	* @param _rC01DinNotation_ desired value for the property rC01DinNotation.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation
	*/
	final public void setRC01DinNotation (ArrayList<? extends String> _rC01DinNotation_) {
		this._rC01DinNotation = _rC01DinNotation_;
	}

	/**
	* @return Returns the List of String for the property rC01EceCode.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode")
	final public List<? extends String> getRC01EceCode() {
		return _rC01EceCode;
	}

	
	/**
	* @param _rC01EceCode_ desired value for the property rC01EceCode.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode
	*/
	final public void setRC01EceCode (ArrayList<? extends String> _rC01EceCode_) {
		this._rC01EceCode = _rC01EceCode_;
	}

	/**
	* @return Returns the List of String for the property rC01EceName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName")
	final public List<? extends String> getRC01EceName() {
		return _rC01EceName;
	}

	
	/**
	* @param _rC01EceName_ desired value for the property rC01EceName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName
	*/
	final public void setRC01EceName (ArrayList<? extends String> _rC01EceName_) {
		this._rC01EceName = _rC01EceName_;
	}

	/**
	* @return Returns the List of String for the property rC01NistName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName")
	final public List<? extends String> getRC01NistName() {
		return _rC01NistName;
	}

	
	/**
	* @param _rC01NistName_ desired value for the property rC01NistName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName
	*/
	final public void setRC01NistName (ArrayList<? extends String> _rC01NistName_) {
		this._rC01NistName = _rC01NistName_;
	}

	/**
	* @return Returns the List of String for the property rC01SiName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName")
	final public List<? extends String> getRC01SiName() {
		return _rC01SiName;
	}

	
	/**
	* @param _rC01SiName_ desired value for the property rC01SiName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName
	*/
	final public void setRC01SiName (ArrayList<? extends String> _rC01SiName_) {
		this._rC01SiName = _rC01SiName_;
	}

	/**
	* @return Returns the List of String for the property rC01SiNotation.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation")
	final public List<? extends String> getRC01SiNotation() {
		return _rC01SiNotation;
	}

	
	/**
	* @param _rC01SiNotation_ desired value for the property rC01SiNotation.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation
	*/
	final public void setRC01SiNotation (ArrayList<? extends String> _rC01SiNotation_) {
		this._rC01SiNotation = _rC01SiNotation_;
	}

	/**
	* @return Returns the List of String for the property rC01RegistrationAuthorityId.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId")
	final public List<? extends String> getRC01RegistrationAuthorityId() {
		return _rC01RegistrationAuthorityId;
	}

	
	/**
	* @param _rC01RegistrationAuthorityId_ desired value for the property rC01RegistrationAuthorityId.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId
	*/
	final public void setRC01RegistrationAuthorityId (ArrayList<? extends String> _rC01RegistrationAuthorityId_) {
		this._rC01RegistrationAuthorityId = _rC01RegistrationAuthorityId_;
	}

	/**
	* @return Returns the List of String for the property rC01Supplier.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier")
	final public List<? extends String> getRC01Supplier() {
		return _rC01Supplier;
	}

	
	/**
	* @param _rC01Supplier_ desired value for the property rC01Supplier.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier
	*/
	final public void setRC01Supplier (ArrayList<? extends String> _rC01Supplier_) {
		this._rC01Supplier = _rC01Supplier_;
	}

	/**
	* @return Returns the List of String for the property rC01UnitName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName")
	final public List<? extends String> getRC01UnitName() {
		return _rC01UnitName;
	}

	
	/**
	* @param _rC01UnitName_ desired value for the property rC01UnitName.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName
	*/
	final public void setRC01UnitName (ArrayList<? extends String> _rC01UnitName_) {
		this._rC01UnitName = _rC01UnitName_;
	}

	/**
	* @return Returns the List of String for the property rC01UnitSymbol.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol
	*/
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol")
	final public List<? extends String> getRC01UnitSymbol() {
		return _rC01UnitSymbol;
	}

	
	/**
	* @param _rC01UnitSymbol_ desired value for the property rC01UnitSymbol.
	* More information under https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol
	*/
	final public void setRC01UnitSymbol (ArrayList<? extends String> _rC01UnitSymbol_) {
		this._rC01UnitSymbol = _rC01UnitSymbol_;
	}

}
