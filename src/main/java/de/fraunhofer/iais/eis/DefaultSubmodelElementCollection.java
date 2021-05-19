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
* "Submodel Element Collection"
* "A submodel element collection is a set or list of submodel elements."@en
* "Constraint AASd-059: If the semanticId of a SubmodelElementCollection references a ConceptDescription then the category of the ConceptDescription shall be COLLECTION or ENTITY."@en
* "Constraint AASd-092: If the semanticId of a SubmodelElementCollection with SubmodelElementCollection/allowDuplicates == false references a ConceptDescription then the ConceptDescription/category shall be ENTITY."@en
* "Constraint AASd-093: If the semanticId of a SubmodelElementCollection with SubmodelElementCollection/allowDuplicates == true references a ConceptDescription then the ConceptDescription/category shall be COLLECTION."@en 
*/

public class DefaultSubmodelElementCollection implements SubmodelElementCollection {


	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has Data Specification"
	* "Global reference to the data specification template used by the element."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	protected List<Reference> dataSpecifications;


	/**
	* "has kind"
	* "ModelingKind of the element: either type or instance."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
	protected ModelingKind kind;


	/**
	* "has semantic ID"
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	protected Reference semanticId;


	/**
	* "has qualifier"
	* "Additional qualification of a qualifiable element."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
	protected List<Constraint> qualifiers;


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
	protected TypedLiteral description;


	/**
	* "has display name"
	* "Display name. Can be provided in several languages."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	protected TypedLiteral displayName;


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
	* "allow duplicates"
	* "If allowDuplicates=true then it is allowed that the collection contains the same element several times. Default = false"@en
	* "Constraint AASd-026: If allowDuplicates==false then it is not allowed that the collection contains several elements with the same semantics (i.e. the same semanticId)."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates")
	protected boolean allowDuplicates;


	/**
	* "ordered"
	* "If ordered=false then the elements in the property collection are not ordered. If ordered=true then the elements in the collection are ordered. Default = false"@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered")
	protected boolean ordered;


	/**
	* "has value"
	* "Submodel element contained in the collection."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value")
	protected List<SubmodelElement> values;


	// no manual construction
	protected DefaultSubmodelElementCollection() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this.allowDuplicates,
			this.ordered,
			this.values,
			this.category,
			this.description,
			this.displayName,
			this.idShort,
			this.qualifiers,
			this.dataSpecifications,
			this.kind,
			this.semanticId});
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
			DefaultSubmodelElementCollection other = (DefaultSubmodelElementCollection) obj;
			return Objects.equals(this.allowDuplicates, other.allowDuplicates) &&
				Objects.equals(this.ordered, other.ordered) &&
				Objects.equals(this.values, other.values) &&
				Objects.equals(this.category, other.category) &&
				Objects.equals(this.description, other.description) &&
				Objects.equals(this.displayName, other.displayName) &&
				Objects.equals(this.idShort, other.idShort) &&
				Objects.equals(this.qualifiers, other.qualifiers) &&
				Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
				Objects.equals(this.kind, other.kind) &&
				Objects.equals(this.semanticId, other.semanticId);
		}
	}

	@Override
	public Object deepCopy() {
		DefaultSubmodelElementCollection other = new DefaultSubmodelElementCollection();
		other.allowDuplicates = (boolean) Util.clone(this.allowDuplicates);
		other.ordered = (boolean) Util.clone(this.ordered);
		other.values = (List<SubmodelElement>) Util.clone(this.values);
		other.category = (String) Util.clone(this.category);
		other.description = (TypedLiteral) Util.clone(this.description);
		other.displayName = (TypedLiteral) Util.clone(this.displayName);
		other.idShort = (String) Util.clone(this.idShort);
		other.qualifiers = (List<Constraint>) Util.clone(this.qualifiers);
		other.dataSpecifications = (List<Reference>) Util.clone(this.dataSpecifications);
		other.kind = (ModelingKind) Util.clone(this.kind);
		other.semanticId = (Reference) Util.clone(this.semanticId);
		return other;
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates")
	final public boolean getAllowDuplicates() {
		return allowDuplicates;
	}
	
	final public void setAllowDuplicates (boolean allowDuplicates) {
		this.allowDuplicates = allowDuplicates;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered")
	final public boolean getOrdered() {
		return ordered;
	}
	
	final public void setOrdered (boolean ordered) {
		this.ordered = ordered;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value")
	final public List<SubmodelElement> getValues() {
		return values;
	}
	
	final public void setValues (List<SubmodelElement> values) {
		this.values = values;
	}


	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
	final public String getCategory() {
		return category;
	}
	
	final public void setCategory (String category) {
		this.category = category;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	final public TypedLiteral getDescription() {
		return description;
	}
	
	final public void setDescription (TypedLiteral description) {
		this.description = description;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	final public TypedLiteral getDisplayName() {
		return displayName;
	}
	
	final public void setDisplayName (TypedLiteral displayName) {
		this.displayName = displayName;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	final public String getIdShort() {
		return idShort;
	}
	
	final public void setIdShort (String idShort) {
		this.idShort = idShort;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
	final public List<Constraint> getQualifiers() {
		return qualifiers;
	}
	
	final public void setQualifiers (List<Constraint> qualifiers) {
		this.qualifiers = qualifiers;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	final public List<Reference> getDataSpecifications() {
		return dataSpecifications;
	}
	
	final public void setDataSpecifications (List<Reference> dataSpecifications) {
		this.dataSpecifications = dataSpecifications;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
	final public ModelingKind getKind() {
		return kind;
	}
	
	final public void setKind (ModelingKind kind) {
		this.kind = kind;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	final public Reference getSemanticId() {
		return semanticId;
	}
	
	final public void setSemanticId (Reference semanticId) {
		this.semanticId = semanticId;
	}
}
