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
	"Security"

	"Container for security relevant information of the AAS."@en*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = SecurityImpl.class),})
public interface Security {

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
	"has access control policy points"

	"Access control policy points of the AAS."@en
	*/
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Security/accessControlPolicyPoints")
	PolicyAdministrationPoint getSecurityAccessControlPolicyPoints();
	/**
	"has certificate"

	"Certificates of the AAS."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Security/certificate")
	java.util.ArrayList<? extends Certificate> getSecurityCertificate();
	/**
	"has required certificate extension"

	"Certificate extensions as required by the AAS."@en
	*/
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Security/requiredCertificateExtension")
	java.util.ArrayList<? extends Reference> getSecurityRequiredCertificateExtension();
}
