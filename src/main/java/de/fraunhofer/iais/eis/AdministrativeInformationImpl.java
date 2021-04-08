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
* "Administrative Information"
* "Every Identifiable may have administrative information. Administrative information includes for example 1) Information about the version of the element 2) Information about who created or who made the last change to the element 3) Information about the languages available in case the element contains text, for translating purposed also themmaster or default language may be definedIn the first version of the AAS metamodel only version information as defined by IEC 61360 is defined. In later versions additional attributes may be added."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:AdministrativeInformation")
public class AdministrativeInformationImpl implements Serializable, IAdministrativeInformation {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Administrative Information", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Every Identifiable may have administrative information. Administrative information includes for example 1) Information about the version of the element 2) Information about who created or who made the last change to the element 3) Information about the languages available in case the element contains text, for translating purposed also themmaster or default language may be definedIn the first version of the AAS metamodel only version information as defined by IEC 61360 is defined. In later versions additional attributes may be added.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has revision"
	* "Revision of the element."@en
	* "Constraint AASd-005: A revision requires a version. This means, if there is no version there is no revision neither."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision", "administrativeInformationRevision"})
	protected String _administrativeInformationRevision;


	/**
	* "has version"
	* "Version of the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version", "administrativeInformationVersion"})
	protected String _administrativeInformationVersion;


	/**
	* "has Data Specification"
	* "Global reference to the data specification template used by the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification", "hasDataSpecificationDataSpecification"})
	protected ArrayList<? extends IReference> _hasDataSpecificationDataSpecification;


	// no manual construction
	protected AdministrativeInformationImpl() {
		id = VocabUtil.getInstance().createRandomUrl("administrativeInformation");
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
	* "Version of the element."@en
	* @return Returns the String for the property administrativeInformationVersion.
	* More information under https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version")
	final public String getAdministrativeInformationVersion() {
		return _administrativeInformationVersion;
	}

	
	/**
	* "Version of the element."@en
	* @param _administrativeInformationVersion_ desired value for the property administrativeInformationVersion.
	* More information under https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version
	*/
	final public void setAdministrativeInformationVersion (String _administrativeInformationVersion_) {
		this._administrativeInformationVersion = _administrativeInformationVersion_;
	}

	/**
	* "Revision of the element."@en
	* "Constraint AASd-005: A revision requires a version. This means, if there is no version there is no revision neither."@en
	* @return Returns the String for the property administrativeInformationRevision.
	* More information under https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision")
	final public String getAdministrativeInformationRevision() {
		return _administrativeInformationRevision;
	}

	
	/**
	* "Revision of the element."@en
	* "Constraint AASd-005: A revision requires a version. This means, if there is no version there is no revision neither."@en
	* @param _administrativeInformationRevision_ desired value for the property administrativeInformationRevision.
	* More information under https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision
	*/
	final public void setAdministrativeInformationRevision (String _administrativeInformationRevision_) {
		this._administrativeInformationRevision = _administrativeInformationRevision_;
	}

	/**
	* "Global reference to the data specification template used by the element."@en
	* @return Returns the List of IReference for the property hasDataSpecificationDataSpecification.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	final public List<? extends IReference> getHasDataSpecificationDataSpecification() {
		return _hasDataSpecificationDataSpecification;
	}

	
	/**
	* "Global reference to the data specification template used by the element."@en
	* @param _hasDataSpecificationDataSpecification_ desired value for the property hasDataSpecificationDataSpecification.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification
	*/
	final public void setHasDataSpecificationDataSpecification (ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
	}
}
