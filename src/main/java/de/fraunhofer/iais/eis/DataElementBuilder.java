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

public class DataElementBuilder {

	private DataElementImpl dataElementImpl;

	public DataElementBuilder() {
		dataElementImpl = new DataElementImpl();
	}

	public DataElementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		dataElementImpl.id = id;
	}



	final public DataElementBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.dataElementImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public DataElementBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.dataElementImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public DataElementBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this.dataElementImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public DataElementBuilder _referableIdShort_(String _referableIdShort_) {
		this.dataElementImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public DataElementBuilder _referableParent_(URI _referableParent_) {
		this.dataElementImpl._referableParent = _referableParent_;
		return this;
	}


	final public DataElementBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.dataElementImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public DataElementBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.dataElementImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public DataElementBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.dataElementImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public DataElementBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.dataElementImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final DataElement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(dataElementImpl);
		return dataElementImpl;
	}
}
