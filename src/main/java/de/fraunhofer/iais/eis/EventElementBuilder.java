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

public class EventElementBuilder {

	private EventElementImpl eventElementImpl;

	public EventElementBuilder() {
		eventElementImpl = new EventElementImpl();
	}

	public EventElementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		eventElementImpl.id = id;
	}



	final public EventElementBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.eventElementImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public EventElementBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.eventElementImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public EventElementBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this.eventElementImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public EventElementBuilder _referableIdShort_(String _referableIdShort_) {
		this.eventElementImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public EventElementBuilder _referableParent_(URI _referableParent_) {
		this.eventElementImpl._referableParent = _referableParent_;
		return this;
	}


	final public EventElementBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.eventElementImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public EventElementBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.eventElementImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public EventElementBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.eventElementImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public EventElementBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.eventElementImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final EventElement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(eventElementImpl);
		return eventElementImpl;
	}
}
