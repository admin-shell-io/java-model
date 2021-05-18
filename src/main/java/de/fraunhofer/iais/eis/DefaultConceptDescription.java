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
	* "has content"
	* "Link from a ConceptDescription to its explaining DataSpecificationContent."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/content")
	protected List<DataSpecificationContent> contents;


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
	* "has description"
	* "Description or comments on the element. The description can be provided in several languages."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	protected List<LangStringSet> descriptions;


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


	/**
	* "has referable category"
	* "The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory")
	protected String referableCategory;


	// no manual construction
	protected DefaultConceptDescription() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this.contents,
			this.isCaseOfs,
			this.dataSpecifications,
			this.administration,
			this.identification,
			this.referableCategory,
			this.descriptions,
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
			return Objects.equals(this.contents, other.contents) &&
				Objects.equals(this.isCaseOfs, other.isCaseOfs) &&
				Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
				Objects.equals(this.administration, other.administration) &&
				Objects.equals(this.identification, other.identification) &&
				Objects.equals(this.referableCategory, other.referableCategory) &&
				Objects.equals(this.descriptions, other.descriptions) &&
				Objects.equals(this.displayName, other.displayName) &&
				Objects.equals(this.idShort, other.idShort);
		}
	}

	@Override
	public Object deepCopy() {
		DefaultConceptDescription other = new DefaultConceptDescription();
		other.contents = (List<DataSpecificationContent>) Util.clone(this.contents);
		other.isCaseOfs = (List<Reference>) Util.clone(this.isCaseOfs);
		other.dataSpecifications = (List<Reference>) Util.clone(this.dataSpecifications);
		other.administration = (AdministrativeInformation) Util.clone(this.administration);
		other.identification = (Identifier) Util.clone(this.identification);
		other.referableCategory = (String) Util.clone(this.referableCategory);
		other.descriptions = (List<LangStringSet>) Util.clone(this.descriptions);
		other.displayName = (LangStringSet) Util.clone(this.displayName);
		other.idShort = (String) Util.clone(this.idShort);
		return other;
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@IRI("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/content")
	final public List<DataSpecificationContent> getContents() {
		return contents;
	}
	
	final public void setContents (List<DataSpecificationContent> contents) {
		this.contents = contents;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/ConceptDescription/isCaseOf")
	final public List<Reference> getIsCaseOfs() {
		return isCaseOfs;
	}
	
	final public void setIsCaseOfs (List<Reference> isCaseOfs) {
		this.isCaseOfs = isCaseOfs;
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

	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory")
	final public String getReferableCategory() {
		return referableCategory;
	}
	
	final public void setReferableCategory (String referableCategory) {
		this.referableCategory = referableCategory;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	final public List<LangStringSet> getDescriptions() {
		return descriptions;
	}
	
	final public void setDescriptions (List<LangStringSet> descriptions) {
		this.descriptions = descriptions;
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
