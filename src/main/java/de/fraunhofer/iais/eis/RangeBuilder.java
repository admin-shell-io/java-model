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

public class RangeBuilder {

	private RangeImpl rangeImpl;

	public RangeBuilder() {
		rangeImpl = new RangeImpl();
	}

	public RangeBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		rangeImpl.id = id;
	}

	final public RangeBuilder _rangeMax_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _rangeMax_) {
		this.rangeImpl._rangeMax = _rangeMax_;
		return this;
	}


	final public RangeBuilder _rangeMin_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _rangeMin_) {
		this.rangeImpl._rangeMin = _rangeMin_;
		return this;
	}




	final public RangeBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.rangeImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public RangeBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.rangeImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public RangeBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this.rangeImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public RangeBuilder _referableIdShort_(String _referableIdShort_) {
		this.rangeImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public RangeBuilder _referableParent_(URI _referableParent_) {
		this.rangeImpl._referableParent = _referableParent_;
		return this;
	}


	final public RangeBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.rangeImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public RangeBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.rangeImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public RangeBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.rangeImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public RangeBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.rangeImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final Range build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(rangeImpl);
		return rangeImpl;
	}
}
