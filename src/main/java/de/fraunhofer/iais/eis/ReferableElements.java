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
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

	/** 
	"Referable Elements"

	"Enumeration of all referable elements within an asset administration shell. Contains IdentifiableElements"@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("aas:ReferableElements")
public enum ReferableElements {
	/** 
	"Asset" */
	ASSET("https://admin-shell.io/aas/3/0/RC01/IdentifiableElements/ASSET", Arrays.asList(new TypedLiteral("Asset", "")), java.util.Collections.emptyList()),
	/** 
	"Asset Administration Shell" */
	ASSET_ADMINISTRATION_SHELL("https://admin-shell.io/aas/3/0/RC01/IdentifiableElements/ASSET_ADMINISTRATION_SHELL", Arrays.asList(new TypedLiteral("Asset Administration Shell", "")), java.util.Collections.emptyList()),
	/** 
	"Concept Description" */
	CONCEPT_DESCRIPTION("https://admin-shell.io/aas/3/0/RC01/IdentifiableElements/CONCEPT_DESCRIPTION", Arrays.asList(new TypedLiteral("Concept Description", "")), java.util.Collections.emptyList()),
	/** 
	"Submodel" */
	SUBMODEL("https://admin-shell.io/aas/3/0/RC01/IdentifiableElements/SUBMODEL", Arrays.asList(new TypedLiteral("Submodel", "")), java.util.Collections.emptyList()),
	/** 
	"Access Permission Rule" */
	ACCESS_PERMISSION_RULE("https://admin-shell.io/aas/3/0/RC01/ReferableElements/ACCESS_PERMISSION_RULE", Arrays.asList(new TypedLiteral("Access Permission Rule", "")), java.util.Collections.emptyList()),
	/** 
	"Annotated relationship element" */
	ANNOTATED_RELATIONSHIP_ELEMENT("https://admin-shell.io/aas/3/0/RC01/ReferableElements/ANNOTATED_RELATIONSHIP_ELEMENT", Arrays.asList(new TypedLiteral("Annotated relationship element", "")), java.util.Collections.emptyList()),
	/** 
	"Basic Event" */
	BASIC_EVENT("https://admin-shell.io/aas/3/0/RC01/ReferableElements/BASIC_EVENT", Arrays.asList(new TypedLiteral("Basic Event", "")), java.util.Collections.emptyList()),
	/** 
	"Blob" */
	BLOB("https://admin-shell.io/aas/3/0/RC01/ReferableElements/BLOB", Arrays.asList(new TypedLiteral("Blob", "")), java.util.Collections.emptyList()),
	/** 
	"Capability" */
	CAPABILITY("https://admin-shell.io/aas/3/0/RC01/ReferableElements/CAPABILITY", Arrays.asList(new TypedLiteral("Capability", "")), java.util.Collections.emptyList()),
	/** 
	"Concept Dictionary" */
	CONCEPT_DICTIONARY("https://admin-shell.io/aas/3/0/RC01/ReferableElements/CONCEPT_DICTIONARY", Arrays.asList(new TypedLiteral("Concept Dictionary", "")), java.util.Collections.emptyList()),
	/** 
	"Data Element" */
	DATA_ELEMENT("https://admin-shell.io/aas/3/0/RC01/ReferableElements/DATA_ELEMENT", Arrays.asList(new TypedLiteral("Data Element", "")), java.util.Collections.emptyList()),
	/** 
	"Entity" */
	ENTITY("https://admin-shell.io/aas/3/0/RC01/ReferableElements/ENTITY", Arrays.asList(new TypedLiteral("Entity", "")), java.util.Collections.emptyList()),
	/** 
	"Event" */
	EVENT("https://admin-shell.io/aas/3/0/RC01/ReferableElements/EVENT", Arrays.asList(new TypedLiteral("Event", "")), java.util.Collections.emptyList()),
	/** 
	"Multi-language Property"

	"Property with a value that can be provided in multiple languages."@en */
	MULTI_LANGUAGE_PROPERTY("https://admin-shell.io/aas/3/0/RC01/ReferableElements/MULTI_LANGUAGE_PROPERTY", Arrays.asList(new TypedLiteral("Multi-language Property", "")), Arrays.asList(new TypedLiteral("Property with a value that can be provided in multiple languages.", "en"))),
	/** 
	"Operation" */
	OPERATION("https://admin-shell.io/aas/3/0/RC01/ReferableElements/OPERATION", Arrays.asList(new TypedLiteral("Operation", "")), java.util.Collections.emptyList()),
	/** 
	"Property" */
	PROPERTY("https://admin-shell.io/aas/3/0/RC01/ReferableElements/PROPERTY", Arrays.asList(new TypedLiteral("Property", "")), java.util.Collections.emptyList()),
	/** 
	"Range" */
	RANGE("https://admin-shell.io/aas/3/0/RC01/ReferableElements/RANGE", Arrays.asList(new TypedLiteral("Range", "")), java.util.Collections.emptyList()),
	/** 
	"Reference Element" */
	REFERENCE_ELEMENT("https://admin-shell.io/aas/3/0/RC01/ReferableElements/REFERENCE_ELEMENT", Arrays.asList(new TypedLiteral("Reference Element", "")), java.util.Collections.emptyList()),
	/** 
	"Relationship Element" */
	RELATIONSHIPT_ELEMENT("https://admin-shell.io/aas/3/0/RC01/ReferableElements/RELATIONSHIPT_ELEMENT", Arrays.asList(new TypedLiteral("Relationship Element", "")), java.util.Collections.emptyList()),
	/** 
	"Submodel Element" */
	SUBMODEL_ELEMENT("https://admin-shell.io/aas/3/0/RC01/ReferableElements/SUBMODEL_ELEMENT", Arrays.asList(new TypedLiteral("Submodel Element", "")), java.util.Collections.emptyList()),
	/** 
	"Submodel Element Collection"

	"Collection of Submodel Elements"@en */
	SUBMODEL_ELEMENT_COLLECTION("https://admin-shell.io/aas/3/0/RC01/ReferableElements/SUBMODEL_ELEMENT_COLLECTION", Arrays.asList(new TypedLiteral("Submodel Element Collection", "")), Arrays.asList(new TypedLiteral("Collection of Submodel Elements", "en"))),
	/** 
	"View" */
	VIEW("https://admin-shell.io/aas/3/0/RC01/ReferableElements/VIEW", Arrays.asList(new TypedLiteral("View", "")), java.util.Collections.emptyList());

	private static final Map<String,ReferableElements> uriInstanceMapping;
	static {
		uriInstanceMapping = new HashMap<>();
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
	}

	private URI id;
	private java.util.List<TypedLiteral> label;
	private java.util.List<TypedLiteral> comment;

	//TODO dummy method for generic properties, should be deleted in future versions
	public java.util.Map<String,Object> getProperties() {
		return null ;
	}
	public void setProperty(String property, Object value) {
		//do nothing
	}

	ReferableElements(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
		try {
			this.id = new URI(id);
			this.label = label;
			this.comment = comment;
		}
		catch (java.net.URISyntaxException e) {
			throw new IllegalArgumentException(e);
		}
	}

	@JsonIgnore
	final public URI getId() {
		return id;
	}

	@JsonIgnore
	final public java.util.List<TypedLiteral> getLabel() {
		return label;
	}

	@JsonIgnore
	final public java.util.List<TypedLiteral> getComment() {
		return comment;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	@JsonProperty("@id")
	final public URI getSerializedId() {
		return id;
	}
	

	@JsonCreator
	public static ReferableElements deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}


}
