package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import com.fasterxml.jackson.databind.JsonNode;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** 
	"Permission Kind"

	"Enumeration of the kind of permissions that is given to the assignment of a permission to a subject."@en 
*/
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("aas:PermissionKind")
public enum PermissionKind {

	/** 
	"allow"

	"Allow the permission given to the subject."@en
	*/
	ALLOW("https://admin-shell.io/aas/3/0/RC01/PermissionKind/ALLOW", Arrays.asList(new TypedLiteral("allow", "")), Arrays.asList(new TypedLiteral("Allow the permission given to the subject.", "en"))),

	/** 
	"deny"

	"Explicitly deny the permission given to the subject."@en
	*/
	DENY("https://admin-shell.io/aas/3/0/RC01/PermissionKind/DENY", Arrays.asList(new TypedLiteral("deny", "")), Arrays.asList(new TypedLiteral("Explicitly deny the permission given to the subject.", "en"))),

	/** 
	"not applicable"

	"The permission is not applicable to the subject."@en
	*/
	NOT_APPLICABLE("https://admin-shell.io/aas/3/0/RC01/PermissionKind/NOT_APPLICABLE", Arrays.asList(new TypedLiteral("not applicable", "")), Arrays.asList(new TypedLiteral("The permission is not applicable to the subject.", "en"))),

	/** 
	"undefined"

	"It is undefined whether the permission is allowed, not applicable or denied to the subject."@en
	*/
	UNDEFINED("https://admin-shell.io/aas/3/0/RC01/PermissionKind/UNDEFINED", Arrays.asList(new TypedLiteral("undefined", "")), Arrays.asList(new TypedLiteral("It is undefined whether the permission is allowed, not applicable or denied to the subject.", "en")));

	private static final Map<String,PermissionKind> uriInstanceMapping;
	static {
		uriInstanceMapping = new HashMap<>();
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
	}

	private URI id;
	private List<TypedLiteral> label;
	private List<TypedLiteral> comment;


	PermissionKind(String id, List<TypedLiteral> label, List<TypedLiteral> comment) {
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
	final public List<TypedLiteral> getLabel() {
		return label;
	}

	@JsonIgnore
	final public List<TypedLiteral> getComment() {
		return comment;
	}


	@JsonProperty("@id")
	final public URI getSerializedId() {
		return id;
	}
	

	@Override
	public String toString() {
		return id.toString();
	}

}
