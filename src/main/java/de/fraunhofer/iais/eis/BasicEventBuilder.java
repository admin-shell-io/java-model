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

public class BasicEventBuilder {

	private BasicEventImpl basicEventImpl;

	public BasicEventBuilder() {
		basicEventImpl = new BasicEventImpl();
	}

	public BasicEventBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		basicEventImpl.id = id;
	}

	final public BasicEventBuilder _basicEventObserved_(Reference _basicEventObserved_) {
		this.basicEventImpl._basicEventObserved = _basicEventObserved_;
		return this;
	}




	final public BasicEventBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.basicEventImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public BasicEventBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.basicEventImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public BasicEventBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
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


	final public BasicEventBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.basicEventImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public BasicEventBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.basicEventImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public BasicEventBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.basicEventImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public BasicEventBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.basicEventImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final BasicEvent build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(basicEventImpl);
		return basicEventImpl;
	}
}
