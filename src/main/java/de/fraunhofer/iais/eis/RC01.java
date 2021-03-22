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

	"Data Specification Template for Physical Units."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = RC01Impl.class),})
public interface RC01 extends DataSpecificationContent {

	// standard methods

	@JsonProperty("@id")
	@javax.validation.constraints.NotNull URI getId();
	java.util.List<TypedLiteral> getLabel();
	java.util.List<TypedLiteral> getComment();
	String toRdf();

	// getter and setter for generic property map
	public java.util.Map<String,Object> getProperties();
	public void setProperty(String property, Object value);

	// accessor methods as derived from information model
	/**
	"has conversion factor"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/conversionFactor")
	java.util.ArrayList<? extends String> getRC01ConversionFactor();
	/**
	"has definition"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/definition")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getRC01Definition();
	/**
	"has DIN notation"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/dinNotation")
	java.util.ArrayList<? extends String> getRC01DinNotation();
	/**
	"has ECE code"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceCode")
	java.util.ArrayList<? extends String> getRC01EceCode();
	/**
	"has ECE name"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/eceName")
	java.util.ArrayList<? extends String> getRC01EceName();
	/**
	"has NIST name"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/nistName")
	java.util.ArrayList<? extends String> getRC01NistName();
	/**
	"has SI name"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siName")
	java.util.ArrayList<? extends String> getRC01SiName();
	/**
	"has SI notation"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/siNotation")
	java.util.ArrayList<? extends String> getRC01SiNotation();
	/**
	"has registration authority"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/registrationAuthorityId")
	java.util.ArrayList<? extends String> getRC01RegistrationAuthorityId();
	/**
	"has supplier"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/supplier")
	java.util.ArrayList<? extends String> getRC01Supplier();
	/**
	"unit has name"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitName")
	java.util.ArrayList<? extends String> getRC01UnitName();
	/**
	"unit has symbol"
	*/
	
	
	@JsonProperty("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationPhysicalUnit/3/0/RC01/unitSymbol")
	java.util.ArrayList<? extends String> getRC01UnitSymbol();
}
