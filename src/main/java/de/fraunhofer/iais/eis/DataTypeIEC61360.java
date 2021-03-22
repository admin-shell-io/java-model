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
	"Data Type IEC61360"

	"Enumeration of all IEC 61360 defined data types."@en */

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataTypeIEC61360")
public enum DataTypeIEC61360 {
	/** 
	"boolean according to IEC61360" */
	BOOLEAN("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/BOOLEAN", Arrays.asList(new TypedLiteral("boolean according to IEC61360", "")), java.util.Collections.emptyList()),
	/** 
	"date according to IEC61360" */
	DATE("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DATE", Arrays.asList(new TypedLiteral("date according to IEC61360", "")), java.util.Collections.emptyList()),
	/** 
	"integer count according to IEC61360" */
	INTEGER_COUNT("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/INTEGER_COUNT", Arrays.asList(new TypedLiteral("integer count according to IEC61360", "")), java.util.Collections.emptyList()),
	/** 
	"integer currency according to IEC61360"

	"real currency according to IEC61360" */
	INTEGER_CURRENCY("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/INTEGER_CURRENCY", Arrays.asList(new TypedLiteral("integer currency according to IEC61360", ""),
new TypedLiteral("real currency according to IEC61360", "")), java.util.Collections.emptyList()),
	/** 
	"integer measure according to IEC61360" */
	INTEGER_MEASURE("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/INTEGER_MEASURE", Arrays.asList(new TypedLiteral("integer measure according to IEC61360", "")), java.util.Collections.emptyList()),
	/** 
	"retional according to IEC61360" */
	RATIONAL("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/RATIONAL", Arrays.asList(new TypedLiteral("retional according to IEC61360", "")), java.util.Collections.emptyList()),
	/** 
	"retional measure according to IEC61360" */
	RATIONAL_MEASURE("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/RATIONAL_MEASURE", Arrays.asList(new TypedLiteral("retional measure according to IEC61360", "")), java.util.Collections.emptyList()),
	/** 
	"real count according to IEC61360" */
	REAL_COUNT("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/REAL_COUNT", Arrays.asList(new TypedLiteral("real count according to IEC61360", "")), java.util.Collections.emptyList()),
	/** 
	"real measure according to IEC61360" */
	REAL_MEASURE("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/REAL_MEASURE", Arrays.asList(new TypedLiteral("real measure according to IEC61360", "")), java.util.Collections.emptyList()),
	/** 
	"string according to IEC61360" */
	STRING("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/STRING", Arrays.asList(new TypedLiteral("string according to IEC61360", "")), java.util.Collections.emptyList()),
	/** 
	"translatable string according to IEC61360" */
	STRING_TRANSLATABLE("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/STRING_TRANSLATABLE", Arrays.asList(new TypedLiteral("translatable string according to IEC61360", "")), java.util.Collections.emptyList()),
	/** 
	"time according to IEC61360" */
	TIME("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/TIME", Arrays.asList(new TypedLiteral("time according to IEC61360", "")), java.util.Collections.emptyList()),
	/** 
	"time stamp according to IEC61360" */
	TIMESTAMP("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/TIMESTAMP", Arrays.asList(new TypedLiteral("time stamp according to IEC61360", "")), java.util.Collections.emptyList()),
	/** 
	"url according to IEC61360" */
	URL("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/URL", Arrays.asList(new TypedLiteral("url according to IEC61360", "")), java.util.Collections.emptyList());

	private static final Map<String,DataTypeIEC61360> uriInstanceMapping;
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

	DataTypeIEC61360(String id, java.util.List<TypedLiteral> label, java.util.List<TypedLiteral> comment) {
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
	public static DataTypeIEC61360 deserialize(JsonNode node) {
		return uriInstanceMapping.get(node.has("@id") ? node.get("@id").textValue() : node.textValue());
	}

	@Override
	public String toString() {
		return id.toString();
	}

}
