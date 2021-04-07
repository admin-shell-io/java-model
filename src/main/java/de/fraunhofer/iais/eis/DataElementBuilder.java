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

public class DataElementBuilder {

	private DataElementImpl dataElementImpl;

	public DataElementBuilder() {
		dataElementImpl = new DataElementImpl();
	}

	public DataElementBuilder(URI id) {
		this();
		dataElementImpl.id = id;
	}



	final public DataElementBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.dataElementImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public DataElementBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.dataElementImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public DataElementBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
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


	final public DataElementBuilder _qualifiableQualifier_(ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this.dataElementImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public DataElementBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.dataElementImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public DataElementBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.dataElementImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public DataElementBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.dataElementImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	final public IDataElement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(dataElementImpl);
		return dataElementImpl;
	}
}
