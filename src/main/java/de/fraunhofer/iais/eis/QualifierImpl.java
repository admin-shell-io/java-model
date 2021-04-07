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
	"Qualifier"

	"A qualifier is a type-value pair that makes additional statements w.r.t. the value of the element."@en

	"Constraint AASd-063: The semanticId of a Qualifier shall only reference a ConceptDescription with the category QUALIFIER."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:Qualifier")
public class QualifierImpl implements Serializable, IQualifier {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Qualifier", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("A qualifier is a type-value pair that makes additional statements w.r.t. the value of the element.", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	"has semantic ID"

	"Points to the Expression Semantic of the Submodels"@en

	"The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId", "hasSemanticsSemanticId"})
	protected IReference _hasSemanticsSemanticId;


	/**
	"has qualifier type"

	"The qualifier type describes the type of the qualifier that is applied to the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Qualifier/type", "qualifierType"})
	protected String _qualifierType;


	/**
	"The qualifier value is the value of the qualifier."@en

	"Constraint AASd-006: if both, the value and the valueId are present then the value needs to be identical to the short name of the referenced coded value in qualifierValueId."@en

	"Constraint AASd-020: The value of Qualifier/value shall be consistent to the data type as defined in Qualifier/valueType."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Qualifier/value", "qualifierValue"})
	protected TypedLiteral _qualifierValue;


	/**
	"Reference to the global unqiue id of a coded value."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId", "qualifierValueId"})
	protected IReference _qualifierValueId;


	// no manual construction
	protected QualifierImpl() {
		id = VocabUtil.getInstance().createRandomUrl("qualifier");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	public List<TypedLiteral> getComment() {
		return this.comment;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology

	/**
	"The qualifier type describes the type of the qualifier that is applied to the element."@en
	@return the String of qualifierType
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/type")
	final public String getQualifierType() {
		return _qualifierType;
	}

	final public void setQualifierType (String _qualifierType_) {
		this._qualifierType = _qualifierType_;
	}

	/**
	"The qualifier value is the value of the qualifier."@en

	"Constraint AASd-006: if both, the value and the valueId are present then the value needs to be identical to the short name of the referenced coded value in qualifierValueId."@en

	"Constraint AASd-020: The value of Qualifier/value shall be consistent to the data type as defined in Qualifier/valueType."@en
	@return the TypedLiteral of qualifierValue
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/value")
	final public TypedLiteral getQualifierValue() {
		return _qualifierValue;
	}

	final public void setQualifierValue (TypedLiteral _qualifierValue_) {
		this._qualifierValue = _qualifierValue_;
	}

	/**
	"Reference to the global unqiue id of a coded value."@en
	@return the IReference of qualifierValueId
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId")
	final public IReference getQualifierValueId() {
		return _qualifierValueId;
	}

	final public void setQualifierValueId (IReference _qualifierValueId_) {
		this._qualifierValueId = _qualifierValueId_;
	}


	/**
	"Points to the Expression Semantic of the Submodels"@en

	"The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	final public IReference getHasSemanticsSemanticId() {
		return _hasSemanticsSemanticId;
	}

	final public void setHasSemanticsSemanticId (IReference _hasSemanticsSemanticId_) {
		this._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
	}
}
