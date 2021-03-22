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
	"Key Type"

	"Enumeration of different key value types within a key. Contains IdentifierType and LocalKeyType."@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("aas:KeyType")
public enum KeyType {
	/** 
	"Custom"

	"Custom identifiers like GUIDs (globally unique Identifiers)"@en */
	CUSTOM("https://admin-shell.io/aas/3/0/RC01/IdentifierType/CUSTOM", Arrays.asList(new TypedLiteral("Custom", "")), Arrays.asList(new TypedLiteral("Custom identifiers like GUIDs (globally unique Identifiers)", "en"))),
	/** 
	"IRDI"

	"IRDI according to ISO29002-5 as an Identifier scheme for properties and classifications."@en */
	IRDI("https://admin-shell.io/aas/3/0/RC01/IdentifierType/IRDI", Arrays.asList(new TypedLiteral("IRDI", "")), Arrays.asList(new TypedLiteral("IRDI according to ISO29002-5 as an Identifier scheme for properties and classifications.", "en"))),
	/** 
	"IRI"

	"IRI. Should only be used if unicode symbols are used that are not allowed in URI."@en */
	IRI("https://admin-shell.io/aas/3/0/RC01/IdentifierType/IRI", Arrays.asList(new TypedLiteral("IRI", "")), Arrays.asList(new TypedLiteral("IRI. Should only be used if unicode symbols are used that are not allowed in URI.", "en"))),
	/** 
	"FragementId"

	"Identifier of a fragment within a file"@en */
	FRAGMENT_ID("https://admin-shell.io/aas/3/0/RC01/LocalKeyType/FRAGMENT_ID", Arrays.asList(new TypedLiteral("FragementId", "")), Arrays.asList(new TypedLiteral("Identifier of a fragment within a file", "en"))),
	/** 
	"IdShort"

	"idShort of a referable element"@en */
	IDSHORT("https://admin-shell.io/aas/3/0/RC01/LocalKeyType/IDSHORT", Arrays.asList(new TypedLiteral("IdShort", "")), Arrays.asList(new TypedLiteral("idShort of a referable element", "en")));

	private static final Map<String,KeyType> uriInstanceMapping;
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

	KeyType(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
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
	public static KeyType deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}

}
