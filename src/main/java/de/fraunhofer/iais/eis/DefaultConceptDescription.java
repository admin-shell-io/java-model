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
* "Concept Description"
* "The semantics of a property or other elements that may have a semantic description is defined by a concept description. The description of the concept should follow a standardized schema (realized as data specification template)."@en
* "Constraint AASd-051: A ConceptDescription shall have one of the following categories: VALUE, PROPERTY, REFERENCE, DOCUMENT, CAPABILITY, RELATIONSHIP, COLLECTION, FUNCTION, EVENT, ENTITY, APPLICATION_CLASS, QUALIFIER, VIEW. Default: PROPERTY."@en 
*/

public class DefaultConceptDescription implements ConceptDescription {


	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "embedded data speciification"
	* "The embedded data specification template of the description of the concept."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/embeddedDataSpecification")
	protected List<DataSpecification> embeddedDataSpecifications;


	/**
	* "is case of"
	* "Reference to an external definition the concept is compatible to or was derived from."@en
	* "Compare to is-case-of relationship in ISO 13584-32 and IEC EN 61360."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/isCaseOf")
	protected List<Reference> isCaseOfs;


	/**
	* "has Data Specification"
	* "Global reference to the data specification template used by the element."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	protected List<Reference> dataSpecifications;


	/**
	* "has administration"
	* "Administrative information of an identifiable element."@en
	* "Some of the administrative information like the version number might need to be part of the identification."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
	protected AdministrativeInformation administration;


	/**
	* "has identification"
	* "The globally unique identification of the element."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
	protected Identifier identification;


	/**
	* "has referable category"
	* "The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
	protected String category;


	/**
	* "has description"
	* "Description or comments on the element. The description can be provided in several languages."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	protected LangStringSet description;


	/**
	* "has display name"
	* "Display name. Can be provided in several languages."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	protected LangStringSet displayName;


	/**
	* "has short id"
	* "Identifying string of the element within its name space."@en
	* "Constraint AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+."@en
	* "Constraint AASd-003: idShort shall be matched case-insensitive."@en
	* "Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace."@en
	* "Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. "@en
	* "Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	protected String idShort;


	// no manual construction
	protected DefaultConceptDescription() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this.isCaseOfs,
			this.embeddedDataSpecifications,
			this.dataSpecifications,
			this.administration,
			this.identification,
			this.category,
			this.description,
			this.displayName,
			this.idShort});
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
			DefaultConceptDescription other = (DefaultConceptDescription) obj;
			return Objects.equals(this.isCaseOfs, other.isCaseOfs) &&
				Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications) &&
				Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
				Objects.equals(this.administration, other.administration) &&
				Objects.equals(this.identification, other.identification) &&
				Objects.equals(this.category, other.category) &&
				Objects.equals(this.description, other.description) &&
				Objects.equals(this.displayName, other.displayName) &&
				Objects.equals(this.idShort, other.idShort);
		}
	}

	@Override
	public Object deepCopy() {
		DefaultConceptDescription other = new DefaultConceptDescription();
		other.isCaseOfs = (List<Reference>) Util.clone(this.isCaseOfs);
		other.embeddedDataSpecifications = (List<DataSpecification>) Util.clone(this.embeddedDataSpecifications);
		other.dataSpecifications = (List<Reference>) Util.clone(this.dataSpecifications);
		other.administration = (AdministrativeInformation) Util.clone(this.administration);
		other.identification = (Identifier) Util.clone(this.identification);
		other.category = (String) Util.clone(this.category);
		other.description = (LangStringSet) Util.clone(this.description);
		other.displayName = (LangStringSet) Util.clone(this.displayName);
		other.idShort = (String) Util.clone(this.idShort);
		return other;
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@IRI("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/isCaseOf")
	final public List<Reference> getIsCaseOfs() {
		return isCaseOfs;
	}
	
	final public void setIsCaseOfs (List<Reference> isCaseOfs) {
		this.isCaseOfs = isCaseOfs;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/embeddedDataSpecification")
	final public List<DataSpecification> getEmbeddedDataSpecifications() {
		return embeddedDataSpecifications;
	}
	
	final public void setEmbeddedDataSpecifications (List<DataSpecification> embeddedDataSpecifications) {
		this.embeddedDataSpecifications = embeddedDataSpecifications;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	final public List<Reference> getDataSpecifications() {
		return dataSpecifications;
	}
	
	final public void setDataSpecifications (List<Reference> dataSpecifications) {
		this.dataSpecifications = dataSpecifications;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
	final public AdministrativeInformation getAdministration() {
		return administration;
	}
	
	final public void setAdministration (AdministrativeInformation administration) {
		this.administration = administration;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
	final public Identifier getIdentification() {
		return identification;
	}
	
	final public void setIdentification (Identifier identification) {
		this.identification = identification;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
	final public String getCategory() {
		return category;
	}
	
	final public void setCategory (String category) {
		this.category = category;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	final public LangStringSet getDescription() {
		return description;
	}
	
	final public void setDescription (LangStringSet description) {
		this.description = description;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	final public LangStringSet getDisplayName() {
		return displayName;
	}
	
	final public void setDisplayName (LangStringSet displayName) {
		this.displayName = displayName;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	final public String getIdShort() {
		return idShort;
	}
	
	final public void setIdShort (String idShort) {
		this.idShort = idShort;
	}
}
