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

public class MultiLanguagePropertyBuilder {

	private MultiLanguagePropertyImpl multiLanguagePropertyImpl;

	public MultiLanguagePropertyBuilder() {
		multiLanguagePropertyImpl = new MultiLanguagePropertyImpl();
	}

	public MultiLanguagePropertyBuilder(URI id) {
		this();
		multiLanguagePropertyImpl.id = id;
	}

	final public MultiLanguagePropertyBuilder _multiLanguagePropertyValue_(ArrayList<? extends TypedLiteral> _multiLanguagePropertyValue_) {
		this.multiLanguagePropertyImpl._multiLanguagePropertyValue = _multiLanguagePropertyValue_;
		return this;
	}


	final public MultiLanguagePropertyBuilder _multiLanguagePropertyValueId_(ArrayList<? extends IReference> _multiLanguagePropertyValueId_) {
		this.multiLanguagePropertyImpl._multiLanguagePropertyValueId = _multiLanguagePropertyValueId_;
		return this;
	}




	final public MultiLanguagePropertyBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.multiLanguagePropertyImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public MultiLanguagePropertyBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.multiLanguagePropertyImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public MultiLanguagePropertyBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
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


	final public MultiLanguagePropertyBuilder _qualifiableQualifier_(ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this.multiLanguagePropertyImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public MultiLanguagePropertyBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.multiLanguagePropertyImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public MultiLanguagePropertyBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.multiLanguagePropertyImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public MultiLanguagePropertyBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.multiLanguagePropertyImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	final public IMultiLanguageProperty build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(multiLanguagePropertyImpl);
		return multiLanguagePropertyImpl;
	}
}
