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
	"Category"

	"A enumeration for data elements except for files and blobs."@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("aas:Category")
public enum Category {
	/** 
	"Constant"

	"A constant property is a property with a value that does not change over time. In eCl@ss this kind of category has the category \'Coded Value\'."@en */
	CONSTANT("https://admin-shell.io/aas/3/0/RC01/Category/CONSTANT", Arrays.asList(new TypedLiteral("Constant", "")), Arrays.asList(new TypedLiteral("A constant property is a property with a value that does not change over time. In eCl@ss this kind of category has the category 'Coded Value'.", "en"))),
	/** 
	"Parameter"

	"A parameter property is a property that is once set and then typically does not change over time. This is for example the case for configuration parameters."@en */
	PARAMETER("https://admin-shell.io/aas/3/0/RC01/Category/PARAMETER", Arrays.asList(new TypedLiteral("Parameter", "")), Arrays.asList(new TypedLiteral("A parameter property is a property that is once set and then typically does not change over time. This is for example the case for configuration parameters.", "en"))),
	/** 
	"Variable"

	"A variable property is a property that is calculated during runtime, i.e. its value is a runtime value."@en */
	VARIABLE("https://admin-shell.io/aas/3/0/RC01/Category/VARIABLE", Arrays.asList(new TypedLiteral("Variable", "")), Arrays.asList(new TypedLiteral("A variable property is a property that is calculated during runtime, i.e. its value is a runtime value.", "en")));

	private static final Map<String,Category> uriInstanceMapping;
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

	Category(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
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
	public static Category deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}

}
