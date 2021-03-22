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

public class EventMessageBuilder {

	private EventMessageImpl eventMessageImpl;

	public EventMessageBuilder() {
		eventMessageImpl = new EventMessageImpl();
	}

	public EventMessageBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		eventMessageImpl.id = id;
	}



	final public EventMessageBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.eventMessageImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public EventMessageBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.eventMessageImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public EventMessageBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this.eventMessageImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public EventMessageBuilder _referableIdShort_(String _referableIdShort_) {
		this.eventMessageImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public EventMessageBuilder _referableParent_(URI _referableParent_) {
		this.eventMessageImpl._referableParent = _referableParent_;
		return this;
	}


	final public EventMessageBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.eventMessageImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public EventMessageBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.eventMessageImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public EventMessageBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.eventMessageImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public EventMessageBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.eventMessageImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final EventMessage build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(eventMessageImpl);
		return eventMessageImpl;
	}
}
