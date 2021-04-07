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

public class EventBuilder {

	private EventImpl eventImpl;

	public EventBuilder() {
		eventImpl = new EventImpl();
	}

	public EventBuilder(URI id) {
		this();
		eventImpl.id = id;
	}



	final public EventBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.eventImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public EventBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.eventImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public EventBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
		this.eventImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public EventBuilder _referableIdShort_(String _referableIdShort_) {
		this.eventImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public EventBuilder _referableParent_(URI _referableParent_) {
		this.eventImpl._referableParent = _referableParent_;
		return this;
	}


	final public EventBuilder _qualifiableQualifier_(ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this.eventImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public EventBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.eventImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public EventBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.eventImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public EventBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.eventImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	final public IEvent build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(eventImpl);
		return eventImpl;
	}
}
