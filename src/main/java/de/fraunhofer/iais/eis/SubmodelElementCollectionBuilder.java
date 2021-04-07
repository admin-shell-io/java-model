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

public class SubmodelElementCollectionBuilder {

	private SubmodelElementCollectionImpl submodelElementCollectionImpl;

	public SubmodelElementCollectionBuilder() {
		submodelElementCollectionImpl = new SubmodelElementCollectionImpl();
	}

	public SubmodelElementCollectionBuilder(URI id) {
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


	final public SubmodelElementCollectionBuilder _submodelElementCollectionValue_(ArrayList<? extends ISubmodelElement> _submodelElementCollectionValue_) {
		this.submodelElementCollectionImpl._submodelElementCollectionValue = _submodelElementCollectionValue_;
		return this;
	}



	final public SubmodelElementCollectionBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.submodelElementCollectionImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public SubmodelElementCollectionBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.submodelElementCollectionImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public SubmodelElementCollectionBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
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


	final public SubmodelElementCollectionBuilder _qualifiableQualifier_(ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this.submodelElementCollectionImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public SubmodelElementCollectionBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.submodelElementCollectionImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public SubmodelElementCollectionBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.submodelElementCollectionImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public SubmodelElementCollectionBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.submodelElementCollectionImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	final public ISubmodelElementCollection build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(submodelElementCollectionImpl);
		return submodelElementCollectionImpl;
	}
}
