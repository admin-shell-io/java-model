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

public class RangeBuilder {

	private RangeImpl rangeImpl;

	public RangeBuilder() {
		rangeImpl = new RangeImpl();
	}

	public RangeBuilder(URI id) {
		this();
		rangeImpl.id = id;
	}

	/**
	* This function allows setting a value for rangeMax
	* @param _rangeMax_ desired value to be set
	* @return Builder object with new value for rangeMax
	*/
	final public RangeBuilder _rangeMax_(ArrayList<? extends TypedLiteral> _rangeMax_) {
		this.rangeImpl._rangeMax = _rangeMax_;
		return this;
	}


	/**
	* This function allows setting a value for rangeMin
	* @param _rangeMin_ desired value to be set
	* @return Builder object with new value for rangeMin
	*/
	final public RangeBuilder _rangeMin_(ArrayList<? extends TypedLiteral> _rangeMin_) {
		this.rangeImpl._rangeMin = _rangeMin_;
		return this;
	}




	/**
	* This function allows setting a value for referableReferableCategory
	* @param _referableReferableCategory_ desired value to be set
	* @return Builder object with new value for referableReferableCategory
	*/
	final public RangeBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.rangeImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	/**
	* This function allows setting a value for referableDescription
	* @param _referableDescription_ desired value to be set
	* @return Builder object with new value for referableDescription
	*/
	final public RangeBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.rangeImpl._referableDescription = _referableDescription_;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param _referableDisplayName_ desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public RangeBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
		this.rangeImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param _referableIdShort_ desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public RangeBuilder _referableIdShort_(String _referableIdShort_) {
		this.rangeImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param _referableParent_ desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public RangeBuilder _referableParent_(URI _referableParent_) {
		this.rangeImpl._referableParent = _referableParent_;
		return this;
	}


	/**
	* This function allows setting a value for qualifiableQualifier
	* @param _qualifiableQualifier_ desired value to be set
	* @return Builder object with new value for qualifiableQualifier
	*/
	final public RangeBuilder _qualifiableQualifier_(ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this.rangeImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecification
	* @param _hasDataSpecificationDataSpecification_ desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecification
	*/
	final public RangeBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.rangeImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	/**
	* This function allows setting a value for hasKindKind
	* @param _hasKindKind_ desired value to be set
	* @return Builder object with new value for hasKindKind
	*/
	final public RangeBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.rangeImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	/**
	* This function allows setting a value for hasSemanticsSemanticId
	* @param _hasSemanticsSemanticId_ desired value to be set
	* @return Builder object with new value for hasSemanticsSemanticId
	*/
	final public RangeBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.rangeImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public IRange build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(rangeImpl);
		return rangeImpl;
	}
}
