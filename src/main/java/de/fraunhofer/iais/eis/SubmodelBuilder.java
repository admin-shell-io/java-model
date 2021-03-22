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

public class SubmodelBuilder {

	private SubmodelImpl submodelImpl;

	public SubmodelBuilder() {
		submodelImpl = new SubmodelImpl();
	}

	public SubmodelBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		submodelImpl.id = id;
	}

	final public SubmodelBuilder _submodelSubmodelElement_(java.util.ArrayList<? extends SubmodelElement> _submodelSubmodelElement_) {
		this.submodelImpl._submodelSubmodelElement = _submodelSubmodelElement_;
		return this;
	}


	final public SubmodelBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.submodelImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public SubmodelBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.submodelImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public SubmodelBuilder _identifiableAdministration_(AdministrativeInformation _identifiableAdministration_) {
		this.submodelImpl._identifiableAdministration = _identifiableAdministration_;
		return this;
	}


	final public SubmodelBuilder _identifiableIdentification_(Identifier _identifiableIdentification_) {
		this.submodelImpl._identifiableIdentification = _identifiableIdentification_;
		return this;
	}


	final public SubmodelBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.submodelImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public SubmodelBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.submodelImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public SubmodelBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this.submodelImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public SubmodelBuilder _referableIdShort_(String _referableIdShort_) {
		this.submodelImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public SubmodelBuilder _referableParent_(URI _referableParent_) {
		this.submodelImpl._referableParent = _referableParent_;
		return this;
	}


	final public SubmodelBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.submodelImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public SubmodelBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.submodelImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final Submodel build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(submodelImpl);
		return submodelImpl;
	}
}
