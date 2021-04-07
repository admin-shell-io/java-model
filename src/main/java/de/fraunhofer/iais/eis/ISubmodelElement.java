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

/**
	"Submodel Element"

	"A submodel element is an element suitable for the description and differentiation of assets."@en

	"The concept of type and instance applies to submodel elements. Properties are special submodel elements. The property types are defined in dictionaries (like the IEC Common Data Dictionary or eCl@ss), they do not have a value. The property type (kind=Type) is also called data element type in some standards. The property instances (kind=Instance) typically have a value. A property instance is also called property-value pair in certain standards."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = SubmodelElementImpl.class),
@JsonSubTypes.Type(value = ICapability.class),

@JsonSubTypes.Type(value = IDataElement.class),

@JsonSubTypes.Type(value = IEntity.class),

@JsonSubTypes.Type(value = IEvent.class),

@JsonSubTypes.Type(value = IEventElement.class),

@JsonSubTypes.Type(value = IEventMessage.class),

@JsonSubTypes.Type(value = IFile.class),

@JsonSubTypes.Type(value = IOperation.class),

@JsonSubTypes.Type(value = IRelationshipElement.class),

@JsonSubTypes.Type(value = ISubmodelElementCollection.class),})
public interface ISubmodelElement extends IReferable
, IQualifiable
, IHasDataSpecification
, IHasKind
, IHasSemantics {

	// standard methods

	@JsonProperty("@id")
	public URI getId();
	public List<TypedLiteral> getLabel();
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


}
