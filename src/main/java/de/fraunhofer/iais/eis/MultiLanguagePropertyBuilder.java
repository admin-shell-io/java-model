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

public class MultiLanguagePropertyBuilder {

	private MultiLanguagePropertyImpl multiLanguagePropertyImpl;

	public MultiLanguagePropertyBuilder() {
		multiLanguagePropertyImpl = new MultiLanguagePropertyImpl();
	}

	public MultiLanguagePropertyBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		multiLanguagePropertyImpl.id = id;
	}

	final public MultiLanguagePropertyBuilder _multiLanguagePropertyValue_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _multiLanguagePropertyValue_) {
		this.multiLanguagePropertyImpl._multiLanguagePropertyValue = _multiLanguagePropertyValue_;
		return this;
	}


	final public MultiLanguagePropertyBuilder _multiLanguagePropertyValueId_(java.util.ArrayList<? extends Reference> _multiLanguagePropertyValueId_) {
		this.multiLanguagePropertyImpl._multiLanguagePropertyValueId = _multiLanguagePropertyValueId_;
		return this;
	}




	final public MultiLanguagePropertyBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.multiLanguagePropertyImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public MultiLanguagePropertyBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.multiLanguagePropertyImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public MultiLanguagePropertyBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this.multiLanguagePropertyImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public MultiLanguagePropertyBuilder _referableIdShort_(String _referableIdShort_) {
		this.multiLanguagePropertyImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public MultiLanguagePropertyBuilder _referableParent_(URI _referableParent_) {
		this.multiLanguagePropertyImpl._referableParent = _referableParent_;
		return this;
	}


	final public MultiLanguagePropertyBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.multiLanguagePropertyImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public MultiLanguagePropertyBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.multiLanguagePropertyImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public MultiLanguagePropertyBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.multiLanguagePropertyImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public MultiLanguagePropertyBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.multiLanguagePropertyImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final MultiLanguageProperty build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(multiLanguagePropertyImpl);
		return multiLanguagePropertyImpl;
	}
}
