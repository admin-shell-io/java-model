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

public class SubmodelElementCollectionBuilder {

	private SubmodelElementCollectionImpl submodelElementCollectionImpl;

	public SubmodelElementCollectionBuilder() {
		submodelElementCollectionImpl = new SubmodelElementCollectionImpl();
	}

	public SubmodelElementCollectionBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		submodelElementCollectionImpl.id = id;
	}

	final public SubmodelElementCollectionBuilder _submodelElementCollectionAllowDuplicates_(boolean _submodelElementCollectionAllowDuplicates_) {
		this.submodelElementCollectionImpl._submodelElementCollectionAllowDuplicates = _submodelElementCollectionAllowDuplicates_;
		return this;
	}


	final public SubmodelElementCollectionBuilder _submodelElementCollectionOrdered_(boolean _submodelElementCollectionOrdered_) {
		this.submodelElementCollectionImpl._submodelElementCollectionOrdered = _submodelElementCollectionOrdered_;
		return this;
	}


	final public SubmodelElementCollectionBuilder _submodelElementCollectionValue_(java.util.ArrayList<? extends SubmodelElement> _submodelElementCollectionValue_) {
		this.submodelElementCollectionImpl._submodelElementCollectionValue = _submodelElementCollectionValue_;
		return this;
	}



	final public SubmodelElementCollectionBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.submodelElementCollectionImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public SubmodelElementCollectionBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.submodelElementCollectionImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public SubmodelElementCollectionBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this.submodelElementCollectionImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public SubmodelElementCollectionBuilder _referableIdShort_(String _referableIdShort_) {
		this.submodelElementCollectionImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public SubmodelElementCollectionBuilder _referableParent_(URI _referableParent_) {
		this.submodelElementCollectionImpl._referableParent = _referableParent_;
		return this;
	}


	final public SubmodelElementCollectionBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.submodelElementCollectionImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public SubmodelElementCollectionBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.submodelElementCollectionImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public SubmodelElementCollectionBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.submodelElementCollectionImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public SubmodelElementCollectionBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.submodelElementCollectionImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final SubmodelElementCollection build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(submodelElementCollectionImpl);
		return submodelElementCollectionImpl;
	}
}
