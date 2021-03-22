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

public class ViewBuilder {

	private ViewImpl viewImpl;

	public ViewBuilder() {
		viewImpl = new ViewImpl();
	}

	public ViewBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		viewImpl.id = id;
	}

	final public ViewBuilder _viewContainedElement_(java.util.ArrayList<? extends Referable> _viewContainedElement_) {
		this.viewImpl._viewContainedElement = _viewContainedElement_;
		return this;
	}


	final public ViewBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.viewImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public ViewBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.viewImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public ViewBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this.viewImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public ViewBuilder _referableIdShort_(String _referableIdShort_) {
		this.viewImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public ViewBuilder _referableParent_(URI _referableParent_) {
		this.viewImpl._referableParent = _referableParent_;
		return this;
	}


	final public ViewBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.viewImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public ViewBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.viewImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final View build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(viewImpl);
		return viewImpl;
	}
}
