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

public class PropertyBuilder {

	private PropertyImpl propertyImpl;

	public PropertyBuilder() {
		propertyImpl = new PropertyImpl();
	}

	public PropertyBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		propertyImpl.id = id;
	}

	final public PropertyBuilder _propertyPropertyCategory_(java.util.ArrayList<? extends Category> _propertyPropertyCategory_) {
		this.propertyImpl._propertyPropertyCategory = _propertyPropertyCategory_;
		return this;
	}


	final public PropertyBuilder _propertyValue_(de.fraunhofer.iais.eis.util.TypedLiteral _propertyValue_) {
		this.propertyImpl._propertyValue = _propertyValue_;
		return this;
	}


	final public PropertyBuilder _propertyValueId_(Reference _propertyValueId_) {
		this.propertyImpl._propertyValueId = _propertyValueId_;
		return this;
	}




	final public PropertyBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.propertyImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public PropertyBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.propertyImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public PropertyBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this.propertyImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public PropertyBuilder _referableIdShort_(String _referableIdShort_) {
		this.propertyImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public PropertyBuilder _referableParent_(URI _referableParent_) {
		this.propertyImpl._referableParent = _referableParent_;
		return this;
	}


	final public PropertyBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.propertyImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public PropertyBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.propertyImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public PropertyBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.propertyImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public PropertyBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.propertyImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final Property build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(propertyImpl);
		return propertyImpl;
	}
}
