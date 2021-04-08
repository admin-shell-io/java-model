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

	/**
	* This function allows setting a value for multiLanguagePropertyValue
	* @param _multiLanguagePropertyValue_ desired value to be set
	* @return Builder object with new value for multiLanguagePropertyValue
	*/
	final public MultiLanguagePropertyBuilder _multiLanguagePropertyValue_(ArrayList<? extends TypedLiteral> _multiLanguagePropertyValue_) {
		this.multiLanguagePropertyImpl._multiLanguagePropertyValue = _multiLanguagePropertyValue_;
		return this;
	}


	/**
	* This function allows setting a value for multiLanguagePropertyValueId
	* @param _multiLanguagePropertyValueId_ desired value to be set
	* @return Builder object with new value for multiLanguagePropertyValueId
	*/
	final public MultiLanguagePropertyBuilder _multiLanguagePropertyValueId_(ArrayList<? extends IReference> _multiLanguagePropertyValueId_) {
		this.multiLanguagePropertyImpl._multiLanguagePropertyValueId = _multiLanguagePropertyValueId_;
		return this;
	}




	/**
	* This function allows setting a value for referableReferableCategory
	* @param _referableReferableCategory_ desired value to be set
	* @return Builder object with new value for referableReferableCategory
	*/
	final public MultiLanguagePropertyBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.multiLanguagePropertyImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	/**
	* This function allows setting a value for referableDescription
	* @param _referableDescription_ desired value to be set
	* @return Builder object with new value for referableDescription
	*/
	final public MultiLanguagePropertyBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.multiLanguagePropertyImpl._referableDescription = _referableDescription_;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param _referableDisplayName_ desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public MultiLanguagePropertyBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
		this.multiLanguagePropertyImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param _referableIdShort_ desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public MultiLanguagePropertyBuilder _referableIdShort_(String _referableIdShort_) {
		this.multiLanguagePropertyImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param _referableParent_ desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public MultiLanguagePropertyBuilder _referableParent_(URI _referableParent_) {
		this.multiLanguagePropertyImpl._referableParent = _referableParent_;
		return this;
	}


	/**
	* This function allows setting a value for qualifiableQualifier
	* @param _qualifiableQualifier_ desired value to be set
	* @return Builder object with new value for qualifiableQualifier
	*/
	final public MultiLanguagePropertyBuilder _qualifiableQualifier_(ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this.multiLanguagePropertyImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecification
	* @param _hasDataSpecificationDataSpecification_ desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecification
	*/
	final public MultiLanguagePropertyBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.multiLanguagePropertyImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	/**
	* This function allows setting a value for hasKindKind
	* @param _hasKindKind_ desired value to be set
	* @return Builder object with new value for hasKindKind
	*/
	final public MultiLanguagePropertyBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.multiLanguagePropertyImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	/**
	* This function allows setting a value for hasSemanticsSemanticId
	* @param _hasSemanticsSemanticId_ desired value to be set
	* @return Builder object with new value for hasSemanticsSemanticId
	*/
	final public MultiLanguagePropertyBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.multiLanguagePropertyImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public IMultiLanguageProperty build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(multiLanguagePropertyImpl);
		return multiLanguagePropertyImpl;
	}
}
