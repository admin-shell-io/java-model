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
	"Access Permission Rule"

	"Table that defines access permissions per authenticated subject for a set of objects (referable elements)."@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:AccessPermissionRule")
public class AccessPermissionRuleImpl implements Serializable, IAccessPermissionRule {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Access Permission Rule", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Table that defines access permissions per authenticated subject for a set of objects (referable elements).", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	"has permissions per object"

	"Set of object-permission pairs that define the permissions per object within the access permission rule."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/permissionsPerObject", "accessPermissionRulePermissionsPerObject"})
	protected ArrayList<? extends IPermissionsPerObject> _accessPermissionRulePermissionsPerObject;


	/**
	"has target subject attributes"

	"Target subject attributes that need to be fulfilled by the accessing subject to get the permissions defined by this rule."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/targetSubjectAttributes", "accessPermissionRuleTargetSubjectAttributes"})
	protected ISubjectAttributes _accessPermissionRuleTargetSubjectAttributes;


	/**
	"has qualifier"

	"Additional qualification of a qualifiable element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier", "qualifiableQualifier"})
	protected ArrayList<? extends IConstraint> _qualifiableQualifier;


	/**
	"has description"

	"Description or comments on the element. The description can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/description", "referableDescription"})
	protected ArrayList<? extends TypedLiteral> _referableDescription;


	/**
	"has display name"

	"Display name. Can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/displayName", "referableDisplayName"})
	protected TypedLiteral _referableDisplayName;


	/**
	"has short id"

	"Identifying string of the element within its name space."@en

	"Constraint AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+."@en

	"Constraint AASd-003: idShort shall be matched case-insensitive."@en

	"Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace."@en

	"Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. "@en

	"Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/idShort", "referableIdShort"})
	protected String _referableIdShort;


	/**
	"has parent"

	"Reference to the next referable parent element of the element."@en

	"Constraint AASd-004: Add parent in case of non-identifiable elements."@en

	"This element is used to ease navigation in the model and thus it enables more performant"@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/parent", "referableParent"})
	protected URI _referableParent;


	/**
	"has category"

	"The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory", "referableReferableCategory"})
	protected ArrayList<? extends String> _referableReferableCategory;


	// no manual construction
	protected AccessPermissionRuleImpl() {
		id = VocabUtil.getInstance().createRandomUrl("accessPermissionRule");
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
	"Set of object-permission pairs that define the permissions per object within the access permission rule."@en
	@return the List of accessPermissionRulePermissionsPerObject
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/permissionsPerObject")
	final public List<? extends IPermissionsPerObject> getAccessPermissionRulePermissionsPerObject() {
		return _accessPermissionRulePermissionsPerObject;
	}

	final public void setAccessPermissionRulePermissionsPerObject (ArrayList<? extends IPermissionsPerObject> _accessPermissionRulePermissionsPerObject_) {
		this._accessPermissionRulePermissionsPerObject = _accessPermissionRulePermissionsPerObject_;
	}

	/**
	"Target subject attributes that need to be fulfilled by the accessing subject to get the permissions defined by this rule."@en
	@return the ISubjectAttributes of accessPermissionRuleTargetSubjectAttributes
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessPermissionRule/targetSubjectAttributes")
	final public ISubjectAttributes getAccessPermissionRuleTargetSubjectAttributes() {
		return _accessPermissionRuleTargetSubjectAttributes;
	}

	final public void setAccessPermissionRuleTargetSubjectAttributes (ISubjectAttributes _accessPermissionRuleTargetSubjectAttributes_) {
		this._accessPermissionRuleTargetSubjectAttributes = _accessPermissionRuleTargetSubjectAttributes_;
	}

	/**
	"The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory")
	final public List<? extends String> getReferableReferableCategory() {
		return _referableReferableCategory;
	}

	final public void setReferableReferableCategory (ArrayList<? extends String> _referableReferableCategory_) {
		this._referableReferableCategory = _referableReferableCategory_;
	}

	/**
	"Description or comments on the element. The description can be provided in several languages."@en
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	final public List<? extends TypedLiteral> getReferableDescription() {
		return _referableDescription;
	}

	final public void setReferableDescription (ArrayList<? extends TypedLiteral> _referableDescription_) {
		this._referableDescription = _referableDescription_;
	}

	/**
	"Display name. Can be provided in several languages."@en
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	final public TypedLiteral getReferableDisplayName() {
		return _referableDisplayName;
	}

	final public void setReferableDisplayName (TypedLiteral _referableDisplayName_) {
		this._referableDisplayName = _referableDisplayName_;
	}

	/**
	"Identifying string of the element within its name space."@en

	"Constraint AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+."@en

	"Constraint AASd-003: idShort shall be matched case-insensitive."@en

	"Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace."@en

	"Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. "@en

	"Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	final public String getReferableIdShort() {
		return _referableIdShort;
	}

	final public void setReferableIdShort (String _referableIdShort_) {
		this._referableIdShort = _referableIdShort_;
	}

	/**
	"Reference to the next referable parent element of the element."@en

	"Constraint AASd-004: Add parent in case of non-identifiable elements."@en

	"This element is used to ease navigation in the model and thus it enables more performant"@en
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/parent")
	final public URI getReferableParent() {
		return _referableParent;
	}

	final public void setReferableParent (URI _referableParent_) {
		this._referableParent = _referableParent_;
	}

	/**
	"Additional qualification of a qualifiable element."@en
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
	final public List<? extends IConstraint> getQualifiableQualifier() {
		return _qualifiableQualifier;
	}

	final public void setQualifiableQualifier (ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this._qualifiableQualifier = _qualifiableQualifier_;
	}
}
