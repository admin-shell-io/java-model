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

public class EventBuilder {

	private EventImpl eventImpl;

	public EventBuilder() {
		eventImpl = new EventImpl();
	}

	public EventBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		eventImpl.id = id;
	}



	final public EventBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.eventImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public EventBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.eventImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public EventBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
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


	final public EventBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.eventImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public EventBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.eventImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public EventBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.eventImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public EventBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.eventImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final Event build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(eventImpl);
		return eventImpl;
	}
}
