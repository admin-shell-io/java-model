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

public class BasicEventBuilder {

	private BasicEventImpl basicEventImpl;

	public BasicEventBuilder() {
		basicEventImpl = new BasicEventImpl();
	}

	public BasicEventBuilder(URI id) {
		this();
		basicEventImpl.id = id;
	}

	final public BasicEventBuilder _basicEventObserved_(IReference _basicEventObserved_) {
		this.basicEventImpl._basicEventObserved = _basicEventObserved_;
		return this;
	}




	final public BasicEventBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.basicEventImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public BasicEventBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.basicEventImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public BasicEventBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
		this.basicEventImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public BasicEventBuilder _referableIdShort_(String _referableIdShort_) {
		this.basicEventImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public BasicEventBuilder _referableParent_(URI _referableParent_) {
		this.basicEventImpl._referableParent = _referableParent_;
		return this;
	}


	final public BasicEventBuilder _qualifiableQualifier_(ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this.basicEventImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public BasicEventBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.basicEventImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public BasicEventBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.basicEventImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public BasicEventBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.basicEventImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	final public IBasicEvent build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(basicEventImpl);
		return basicEventImpl;
	}
}
