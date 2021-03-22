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

public class ReferenceElementBuilder {

	private ReferenceElementImpl referenceElementImpl;

	public ReferenceElementBuilder() {
		referenceElementImpl = new ReferenceElementImpl();
	}

	public ReferenceElementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		referenceElementImpl.id = id;
	}

	final public ReferenceElementBuilder _referenceElementValue_(Reference _referenceElementValue_) {
		this.referenceElementImpl._referenceElementValue = _referenceElementValue_;
		return this;
	}




	final public ReferenceElementBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.referenceElementImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public ReferenceElementBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.referenceElementImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public ReferenceElementBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this.referenceElementImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public ReferenceElementBuilder _referableIdShort_(String _referableIdShort_) {
		this.referenceElementImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public ReferenceElementBuilder _referableParent_(URI _referableParent_) {
		this.referenceElementImpl._referableParent = _referableParent_;
		return this;
	}


	final public ReferenceElementBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.referenceElementImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public ReferenceElementBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.referenceElementImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public ReferenceElementBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.referenceElementImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public ReferenceElementBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.referenceElementImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final ReferenceElement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(referenceElementImpl);
		return referenceElementImpl;
	}
}
