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
* "Policy Administration Point"
* "Definition of a security administration point (PDP)."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:PolicyAdministrationPoint")
public class PolicyAdministrationPointImpl implements Serializable, IPolicyAdministrationPoint {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Policy Administration Point", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Definition of a security administration point (PDP).", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has external access control"
	* "Endpoint to an external access control defining a policy administration point to be used by the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl", "policyAdministrationPointExternalAccessControl"})
	protected boolean _policyAdministrationPointExternalAccessControl;


	/**
	* "has local access control"
	* "The policy administration point of access control as realized by the AAS itself."@en
	* "Constraint AASd-009: Either there is an external policy administration point endpoint defined or the AAS has its own access control."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl", "policyAdministrationPointLocalAccessControl"})
	protected IAccessControl _policyAdministrationPointLocalAccessControl;


	// no manual construction
	protected PolicyAdministrationPointImpl() {
		id = VocabUtil.getInstance().createRandomUrl("policyAdministrationPoint");
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
	* "The policy administration point of access control as realized by the AAS itself."@en
	* "Constraint AASd-009: Either there is an external policy administration point endpoint defined or the AAS has its own access control."@en
	* @return Returns the IAccessControl for the property policyAdministrationPointLocalAccessControl.
	* More information under https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl")
	final public IAccessControl getPolicyAdministrationPointLocalAccessControl() {
		return _policyAdministrationPointLocalAccessControl;
	}

	
	/**
	* "The policy administration point of access control as realized by the AAS itself."@en
	* "Constraint AASd-009: Either there is an external policy administration point endpoint defined or the AAS has its own access control."@en
	* @param _policyAdministrationPointLocalAccessControl_ desired value for the property policyAdministrationPointLocalAccessControl.
	* More information under https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl
	*/
	final public void setPolicyAdministrationPointLocalAccessControl (IAccessControl _policyAdministrationPointLocalAccessControl_) {
		this._policyAdministrationPointLocalAccessControl = _policyAdministrationPointLocalAccessControl_;
	}

	/**
	* "Endpoint to an external access control defining a policy administration point to be used by the AAS."@en
	* @return Returns the boolean for the property policyAdministrationPointExternalAccessControl.
	* More information under https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl")
	final public boolean getPolicyAdministrationPointExternalAccessControl() {
		return _policyAdministrationPointExternalAccessControl;
	}

	
	/**
	* "Endpoint to an external access control defining a policy administration point to be used by the AAS."@en
	* @param _policyAdministrationPointExternalAccessControl_ desired value for the property policyAdministrationPointExternalAccessControl.
	* More information under https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl
	*/
	final public void setPolicyAdministrationPointExternalAccessControl (boolean _policyAdministrationPointExternalAccessControl_) {
		this._policyAdministrationPointExternalAccessControl = _policyAdministrationPointExternalAccessControl_;
	}
}
