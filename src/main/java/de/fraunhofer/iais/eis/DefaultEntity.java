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
* "Entity"
* "An entity is a submodel element that is used to model entities."@en
* "Constraint AASd-056: The semanticId of a Entity submodel element shall only reference a ConceptDescription with the category ENTITY. The ConceptDescription describes the elements assigned to the entity via Entity/statement."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:Entity")
public class DefaultEntity implements Serializable, Entity {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> labels = Arrays.asList(new TypedLiteral("Entity", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comments = Arrays.asList(new TypedLiteral("An entity is a submodel element that is used to model entities.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has entity type"
	* "Describes whether the entity is a co-managed entity or a self-managed entity."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Entity/entityType", "entityType"})
	protected EntityType entityType;


	/**
	* "has external asset id"
	* "Reference to an identifier key value pair representing an external identifier of the asset represented by the asset administration shell. "@en
	* "The asset attribute must be set if entityType is set to \'SelfManagedEntity\'. It is empty otherwise."@en
	* "Constraint AASd-014: Either the attribute globalAssetId or externalAssetId of an Entity must be set if Entity/entityType is set to \'SelfManagedEntity\'. They are not existing otherwise."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId", "externalAssetId"})
	protected IdentifierKeyValuePair externalAssetId;


	/**
	* "has global asset id"
	* "Reference to the asset the entity is representing."@en
	* "The asset attribute must be set if entityType is set to \'SelfManagedEntity\'. It is empty otherwise."@en
	* "Constraint AASd-014: Either the attribute globalAssetId or externalAssetId of an Entity must be set if Entity/entityType is set to \'SelfManagedEntity\'. They are not existing otherwise."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId", "globalAssetId"})
	protected Reference globalAssetId;


	/**
	* "has statement"
	* "Describes statements applicable to the entity by a set of submodel elements, typically with a qualified value."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Entity/statement", "statement"})
	protected List<SubmodelElement> statements;


	/**
	* "has Data Specification"
	* "Global reference to the data specification template used by the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification", "dataSpecification"})
	protected List<Reference> dataSpecifications;


	/**
	* "has kind"
	* "ModelingKind of the element: either type or instance."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasKind/kind", "kind"})
	protected ModelingKind kind;


	/**
	* "has semantic ID"
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId", "semanticId"})
	protected Reference semanticId;


	/**
	* "has qualifier"
	* "Additional qualification of a qualifiable element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier", "qualifier"})
	protected List<Constraint> qualifiers;


	/**
	* "has description"
	* "Description or comments on the element. The description can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/description", "description"})
	protected List<TypedLiteral> descriptions;


	/**
	* "has display name"
	* "Display name. Can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/displayName", "displayName"})
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
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/idShort", "idShort"})
	protected String idShort;


	/**
	* "has category"
	* "The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory", "referableCategory"})
	protected List<String> referableCategories;


	// no manual construction
	protected DefaultEntity() {
		id = VocabUtil.getInstance().createRandomUrl("entity");
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

	public int hashCode() {
		return Objects.hash(new Object[]{this.globalAssetId,
			this.externalAssetId,
			this.entityType,
			this.statements,
			this.referableCategories,
			this.descriptions,
			this.displayName,
			this.idShort,
			this.qualifiers,
			this.dataSpecifications,
			this.kind,
			this.semanticId});
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultEntity other = (DefaultEntity) obj;
			return Objects.equals(this.globalAssetId, other.globalAssetId) &&
				Objects.equals(this.externalAssetId, other.externalAssetId) &&
				Objects.equals(this.entityType, other.entityType) &&
				Objects.equals(this.statements, other.statements) &&
				Objects.equals(this.referableCategories, other.referableCategories) &&
				Objects.equals(this.descriptions, other.descriptions) &&
				Objects.equals(this.displayName, other.displayName) &&
				Objects.equals(this.idShort, other.idShort) &&
				Objects.equals(this.qualifiers, other.qualifiers) &&
				Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
				Objects.equals(this.kind, other.kind) &&
				Objects.equals(this.semanticId, other.semanticId);
		}
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId")
	final public Reference getGlobalAssetId() {
		return globalAssetId;
	}
	
	final public void setGlobalAssetId (Reference globalAssetId) {
		this.globalAssetId = globalAssetId;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId")
	final public IdentifierKeyValuePair getExternalAssetId() {
		return externalAssetId;
	}
	
	final public void setExternalAssetId (IdentifierKeyValuePair externalAssetId) {
		this.externalAssetId = externalAssetId;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/entityType")
	final public EntityType getEntityType() {
		return entityType;
	}
	
	final public void setEntityType (EntityType entityType) {
		this.entityType = entityType;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Entity/statement")
	final public List<SubmodelElement> getStatements() {
		return statements;
	}
	
	final public void setStatements (List<SubmodelElement> statements) {
		this.statements = statements;
	}


	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory")
	final public List<String> getReferableCategories() {
		return referableCategories;
	}
	
	final public void setReferableCategories (List<String> referableCategories) {
		this.referableCategories = referableCategories;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	final public List<TypedLiteral> getDescriptions() {
		return descriptions;
	}
	
	final public void setDescriptions (List<TypedLiteral> descriptions) {
		this.descriptions = descriptions;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	final public TypedLiteral getDisplayName() {
		return displayName;
	}
	
	final public void setDisplayName (TypedLiteral displayName) {
		this.displayName = displayName;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	final public String getIdShort() {
		return idShort;
	}
	
	final public void setIdShort (String idShort) {
		this.idShort = idShort;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
	final public List<Constraint> getQualifiers() {
		return qualifiers;
	}
	
	final public void setQualifiers (List<Constraint> qualifiers) {
		this.qualifiers = qualifiers;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	final public List<Reference> getDataSpecifications() {
		return dataSpecifications;
	}
	
	final public void setDataSpecifications (List<Reference> dataSpecifications) {
		this.dataSpecifications = dataSpecifications;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
	final public ModelingKind getKind() {
		return kind;
	}
	
	final public void setKind (ModelingKind kind) {
		this.kind = kind;
	}

	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	final public Reference getSemanticId() {
		return semanticId;
	}
	
	final public void setSemanticId (Reference semanticId) {
		this.semanticId = semanticId;
	}
}
