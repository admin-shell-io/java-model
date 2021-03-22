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
	"Identifiable Element"

	"Enumeration of all identifiable elements within an asset administration shell that are not identifiable"@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("aas:IdentifiableElements")
public enum IdentifiableElements {
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
	SUBMODEL("https://admin-shell.io/aas/3/0/RC01/IdentifiableElements/SUBMODEL", Arrays.asList(new TypedLiteral("Submodel", "")), java.util.Collections.emptyList());

	private static final Map<String,IdentifiableElements> uriInstanceMapping;
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

	IdentifiableElements(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
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
	public static IdentifiableElements deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}



}
