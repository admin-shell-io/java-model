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

public class AnnotatedRelationshipElementBuilder {

	private AnnotatedRelationshipElementImpl annotatedRelationshipElementImpl;

	public AnnotatedRelationshipElementBuilder() {
		annotatedRelationshipElementImpl = new AnnotatedRelationshipElementImpl();
	}

	public AnnotatedRelationshipElementBuilder(URI id) {
		this();
		annotatedRelationshipElementImpl.id = id;
	}

	/**
	* This function allows setting a value for annotatedRelationshipElementAnnotation
	* @param _annotatedRelationshipElementAnnotation_ desired value to be set
	* @return Builder object with new value for annotatedRelationshipElementAnnotation
	*/
	final public AnnotatedRelationshipElementBuilder _annotatedRelationshipElementAnnotation_(ArrayList<? extends IDataElement> _annotatedRelationshipElementAnnotation_) {
		this.annotatedRelationshipElementImpl._annotatedRelationshipElementAnnotation = _annotatedRelationshipElementAnnotation_;
		return this;
	}


	/**
	* This function allows setting a value for relationshipElementFirst
	* @param _relationshipElementFirst_ desired value to be set
	* @return Builder object with new value for relationshipElementFirst
	*/
	final public AnnotatedRelationshipElementBuilder _relationshipElementFirst_(IReferable _relationshipElementFirst_) {
		this.annotatedRelationshipElementImpl._relationshipElementFirst = _relationshipElementFirst_;
		return this;
	}


	/**
	* This function allows setting a value for relationshipElementSecond
	* @param _relationshipElementSecond_ desired value to be set
	* @return Builder object with new value for relationshipElementSecond
	*/
	final public AnnotatedRelationshipElementBuilder _relationshipElementSecond_(IReferable _relationshipElementSecond_) {
		this.annotatedRelationshipElementImpl._relationshipElementSecond = _relationshipElementSecond_;
		return this;
	}



	/**
	* This function allows setting a value for referableReferableCategory
	* @param _referableReferableCategory_ desired value to be set
	* @return Builder object with new value for referableReferableCategory
	*/
	final public AnnotatedRelationshipElementBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.annotatedRelationshipElementImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	/**
	* This function allows setting a value for referableDescription
	* @param _referableDescription_ desired value to be set
	* @return Builder object with new value for referableDescription
	*/
	final public AnnotatedRelationshipElementBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.annotatedRelationshipElementImpl._referableDescription = _referableDescription_;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param _referableDisplayName_ desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public AnnotatedRelationshipElementBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
		this.annotatedRelationshipElementImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param _referableIdShort_ desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public AnnotatedRelationshipElementBuilder _referableIdShort_(String _referableIdShort_) {
		this.annotatedRelationshipElementImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param _referableParent_ desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public AnnotatedRelationshipElementBuilder _referableParent_(URI _referableParent_) {
		this.annotatedRelationshipElementImpl._referableParent = _referableParent_;
		return this;
	}


	/**
	* This function allows setting a value for qualifiableQualifier
	* @param _qualifiableQualifier_ desired value to be set
	* @return Builder object with new value for qualifiableQualifier
	*/
	final public AnnotatedRelationshipElementBuilder _qualifiableQualifier_(ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this.annotatedRelationshipElementImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecification
	* @param _hasDataSpecificationDataSpecification_ desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecification
	*/
	final public AnnotatedRelationshipElementBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.annotatedRelationshipElementImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	/**
	* This function allows setting a value for hasKindKind
	* @param _hasKindKind_ desired value to be set
	* @return Builder object with new value for hasKindKind
	*/
	final public AnnotatedRelationshipElementBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.annotatedRelationshipElementImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	/**
	* This function allows setting a value for hasSemanticsSemanticId
	* @param _hasSemanticsSemanticId_ desired value to be set
	* @return Builder object with new value for hasSemanticsSemanticId
	*/
	final public AnnotatedRelationshipElementBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.annotatedRelationshipElementImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public IAnnotatedRelationshipElement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(annotatedRelationshipElementImpl);
		return annotatedRelationshipElementImpl;
	}
}
