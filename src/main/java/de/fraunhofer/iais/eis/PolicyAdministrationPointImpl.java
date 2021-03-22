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
	"Policy Administration Point"

	"Definition of a security administration point (PDP)."@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:PolicyAdministrationPoint")
public class PolicyAdministrationPointImpl implements Serializable, PolicyAdministrationPoint {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Policy Administration Point", ""));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Definition of a security administration point (PDP).", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"has external access control"

	"Endpoint to an external access control defining a policy administration point to be used by the AAS."@en
	*/
	@NotNull@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl", "policyAdministrationPointExternalAccessControl"})
	 boolean _policyAdministrationPointExternalAccessControl;


	/**
	"has local access control"

	"The policy administration point of access control as realized by the AAS itself."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl", "policyAdministrationPointLocalAccessControl"})
	 AccessControl _policyAdministrationPointLocalAccessControl;


	// no manual construction
	PolicyAdministrationPointImpl() {
		id = VocabUtil.getInstance().createRandomUrl("policyAdministrationPoint");
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
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl")
	AccessControl getPolicyAdministrationPointLocalAccessControl() {
		return _policyAdministrationPointLocalAccessControl;
	}

	final public void setPolicyAdministrationPointLocalAccessControl (AccessControl _policyAdministrationPointLocalAccessControl_) {
		this._policyAdministrationPointLocalAccessControl = _policyAdministrationPointLocalAccessControl_;
	}

	final public 
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl")
	boolean getPolicyAdministrationPointExternalAccessControl() {
		return _policyAdministrationPointExternalAccessControl;
	}

	final public void setPolicyAdministrationPointExternalAccessControl (boolean _policyAdministrationPointExternalAccessControl_) {
		this._policyAdministrationPointExternalAccessControl = _policyAdministrationPointExternalAccessControl_;
	}
}
