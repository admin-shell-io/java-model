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
* "Administrative Information"
* "Every Identifiable may have administrative information. Administrative information includes for example 1) Information about the version of the element 2) Information about who created or who made the last change to the element 3) Information about the languages available in case the element contains text, for translating purposed also themmaster or default language may be definedIn the first version of the AAS metamodel only version information as defined by IEC 61360 is defined. In later versions additional attributes may be added."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:AdministrativeInformation")
public class DefaultAdministrativeInformation implements Serializable, AdministrativeInformation {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Administrative Information", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("Every Identifiable may have administrative information. Administrative information includes for example 1) Information about the version of the element 2) Information about who created or who made the last change to the element 3) Information about the languages available in case the element contains text, for translating purposed also themmaster or default language may be definedIn the first version of the AAS metamodel only version information as defined by IEC 61360 is defined. In later versions additional attributes may be added.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has revision"
	* "Revision of the element."@en
	* "Constraint AASd-005: A revision requires a version. This means, if there is no version there is no revision neither."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision", "administrativeInformationRevision"})
	protected String administrativeInformationRevision;


	/**
	* "has version"
	* "Version of the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version", "administrativeInformationVersion"})
	protected String administrativeInformationVersion;


	/**
	* "has Data Specification"
	* "Global reference to the data specification template used by the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification", "hasDataSpecificationDataSpecification"})
	protected List<Reference> hasDataSpecificationDataSpecifications;


	// no manual construction
	protected DefaultAdministrativeInformation() {
		id = VocabUtil.getInstance().createRandomUrl("administrativeInformation");
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
		return Objects.hash(new Object[]{this.administrativeInformationVersion,
			this.administrativeInformationRevision,
			this.hasDataSpecificationDataSpecifications});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultAdministrativeInformation other = (DefaultAdministrativeInformation) obj;
			return Objects.equals(this.administrativeInformationVersion, other.administrativeInformationVersion) &&
				Objects.equals(this.administrativeInformationRevision, other.administrativeInformationRevision) &&
				Objects.equals(this.hasDataSpecificationDataSpecifications, other.hasDataSpecificationDataSpecifications);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/version")
	final public String getAdministrativeInformationVersion() {
		return administrativeInformationVersion;
	}
	
	final public void setAdministrativeInformationVersion (String administrativeInformationVersion) {
		this.administrativeInformationVersion = administrativeInformationVersion;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AdministrativeInformation/revision")
	final public String getAdministrativeInformationRevision() {
		return administrativeInformationRevision;
	}
	
	final public void setAdministrativeInformationRevision (String administrativeInformationRevision) {
		this.administrativeInformationRevision = administrativeInformationRevision;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	final public List<Reference> getHasDataSpecificationDataSpecifications() {
		return hasDataSpecificationDataSpecifications;
	}
	
	final public void setHasDataSpecificationDataSpecifications (List<Reference> hasDataSpecificationDataSpecifications) {
		this.hasDataSpecificationDataSpecifications = hasDataSpecificationDataSpecifications;
	}
}
