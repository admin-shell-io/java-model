package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

public class ReferenceElementBuilder {

	private ReferenceElementImpl referenceElementImpl;

	public ReferenceElementBuilder() {
		referenceElementImpl = new ReferenceElementImpl();
	}

	public ReferenceElementBuilder(URI id) {
		this();
		referenceElementImpl.id = id;
	}

	final public ReferenceElementBuilder _referenceElementValue_(IReference _referenceElementValue_) {
		this.referenceElementImpl._referenceElementValue = _referenceElementValue_;
		return this;
	}




	final public ReferenceElementBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.referenceElementImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public ReferenceElementBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.referenceElementImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public ReferenceElementBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
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


	final public ReferenceElementBuilder _qualifiableQualifier_(ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this.referenceElementImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public ReferenceElementBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.referenceElementImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public ReferenceElementBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.referenceElementImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public ReferenceElementBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.referenceElementImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	final public IReferenceElement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(referenceElementImpl);
		return referenceElementImpl;
	}
}
