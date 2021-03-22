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
	"Level Type"

	"Enumeration of different level types within a DataSpecificationIEC61360. Contains Min, Max, Nom, and Typ."@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("aas:LevelType")
public enum LevelType {
	/** 
	"MAX"

	"MAX according to IEC 61360 as an Identifier scheme for maximal levels."@en */
	MAX("https://admin-shell.io/aas/3/0/RC01/LevelType/MAX", Arrays.asList(new TypedLiteral("MAX", "")), Arrays.asList(new TypedLiteral("MAX according to IEC 61360 as an Identifier scheme for maximal levels.", "en"))),
	/** 
	"MIN"

	"MIN according to IEC 61360 as an Identifier scheme for minimal levels."@en */
	MIN("https://admin-shell.io/aas/3/0/RC01/LevelType/MIN", Arrays.asList(new TypedLiteral("MIN", "")), Arrays.asList(new TypedLiteral("MIN according to IEC 61360 as an Identifier scheme for minimal levels.", "en"))),
	/** 
	"NOM"

	"NOM according to IEC 61360 as an Identifier scheme for nominal levels."@en */
	NOM("https://admin-shell.io/aas/3/0/RC01/LevelType/NOM", Arrays.asList(new TypedLiteral("NOM", "")), Arrays.asList(new TypedLiteral("NOM according to IEC 61360 as an Identifier scheme for nominal levels.", "en")));

	private static final Map<String,LevelType> uriInstanceMapping;
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

	LevelType(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
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
	public static LevelType deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}

}
