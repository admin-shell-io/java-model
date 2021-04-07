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

public class PropertyBuilder {

	private PropertyImpl propertyImpl;

	public PropertyBuilder() {
		propertyImpl = new PropertyImpl();
	}

	public PropertyBuilder(URI id) {
		this();
		propertyImpl.id = id;
	}

	final public PropertyBuilder _propertyPropertyCategory_(ArrayList<? extends Category> _propertyPropertyCategory_) {
		this.propertyImpl._propertyPropertyCategory = _propertyPropertyCategory_;
		return this;
	}


	final public PropertyBuilder _propertyValue_(TypedLiteral _propertyValue_) {
		this.propertyImpl._propertyValue = _propertyValue_;
		return this;
	}


	final public PropertyBuilder _propertyValueId_(IReference _propertyValueId_) {
		this.propertyImpl._propertyValueId = _propertyValueId_;
		return this;
	}




	final public PropertyBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.propertyImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public PropertyBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.propertyImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public PropertyBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
		this.propertyImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public PropertyBuilder _referableIdShort_(String _referableIdShort_) {
		this.propertyImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public PropertyBuilder _referableParent_(URI _referableParent_) {
		this.propertyImpl._referableParent = _referableParent_;
		return this;
	}


	final public PropertyBuilder _qualifiableQualifier_(ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this.propertyImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public PropertyBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.propertyImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public PropertyBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.propertyImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public PropertyBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.propertyImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	final public IProperty build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(propertyImpl);
		return propertyImpl;
	}
}
