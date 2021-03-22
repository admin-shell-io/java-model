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

public class SubmodelElementBuilder {

	private SubmodelElementImpl submodelElementImpl;

	public SubmodelElementBuilder() {
		submodelElementImpl = new SubmodelElementImpl();
	}

	public SubmodelElementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		submodelElementImpl.id = id;
	}


	final public SubmodelElementBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.submodelElementImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public SubmodelElementBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.submodelElementImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public SubmodelElementBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this.submodelElementImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public SubmodelElementBuilder _referableIdShort_(String _referableIdShort_) {
		this.submodelElementImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public SubmodelElementBuilder _referableParent_(URI _referableParent_) {
		this.submodelElementImpl._referableParent = _referableParent_;
		return this;
	}


	final public SubmodelElementBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.submodelElementImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public SubmodelElementBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.submodelElementImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public SubmodelElementBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.submodelElementImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public SubmodelElementBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.submodelElementImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final SubmodelElement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(submodelElementImpl);
		return submodelElementImpl;
	}
}
