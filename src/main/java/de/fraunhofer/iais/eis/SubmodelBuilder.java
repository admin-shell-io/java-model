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

public class SubmodelBuilder {

	private SubmodelImpl submodelImpl;

	public SubmodelBuilder() {
		submodelImpl = new SubmodelImpl();
	}

	public SubmodelBuilder(URI id) {
		this();
		submodelImpl.id = id;
	}

	/**
	* This function allows setting a value for submodelSubmodelElement
	* @param _submodelSubmodelElement_ desired value to be set
	* @return Builder object with new value for submodelSubmodelElement
	*/
	final public SubmodelBuilder _submodelSubmodelElement_(ArrayList<? extends ISubmodelElement> _submodelSubmodelElement_) {
		this.submodelImpl._submodelSubmodelElement = _submodelSubmodelElement_;
		return this;
	}


	/**
	* This function allows setting a value for qualifiableQualifier
	* @param _qualifiableQualifier_ desired value to be set
	* @return Builder object with new value for qualifiableQualifier
	*/
	final public SubmodelBuilder _qualifiableQualifier_(ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this.submodelImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecification
	* @param _hasDataSpecificationDataSpecification_ desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecification
	*/
	final public SubmodelBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.submodelImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	/**
	* This function allows setting a value for identifiableAdministration
	* @param _identifiableAdministration_ desired value to be set
	* @return Builder object with new value for identifiableAdministration
	*/
	final public SubmodelBuilder _identifiableAdministration_(IAdministrativeInformation _identifiableAdministration_) {
		this.submodelImpl._identifiableAdministration = _identifiableAdministration_;
		return this;
	}


	/**
	* This function allows setting a value for identifiableIdentification
	* @param _identifiableIdentification_ desired value to be set
	* @return Builder object with new value for identifiableIdentification
	*/
	final public SubmodelBuilder _identifiableIdentification_(IIdentifier _identifiableIdentification_) {
		this.submodelImpl._identifiableIdentification = _identifiableIdentification_;
		return this;
	}


	/**
	* This function allows setting a value for referableReferableCategory
	* @param _referableReferableCategory_ desired value to be set
	* @return Builder object with new value for referableReferableCategory
	*/
	final public SubmodelBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.submodelImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	/**
	* This function allows setting a value for referableDescription
	* @param _referableDescription_ desired value to be set
	* @return Builder object with new value for referableDescription
	*/
	final public SubmodelBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.submodelImpl._referableDescription = _referableDescription_;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param _referableDisplayName_ desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public SubmodelBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
		this.submodelImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param _referableIdShort_ desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public SubmodelBuilder _referableIdShort_(String _referableIdShort_) {
		this.submodelImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param _referableParent_ desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public SubmodelBuilder _referableParent_(URI _referableParent_) {
		this.submodelImpl._referableParent = _referableParent_;
		return this;
	}


	/**
	* This function allows setting a value for hasKindKind
	* @param _hasKindKind_ desired value to be set
	* @return Builder object with new value for hasKindKind
	*/
	final public SubmodelBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.submodelImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	/**
	* This function allows setting a value for hasSemanticsSemanticId
	* @param _hasSemanticsSemanticId_ desired value to be set
	* @return Builder object with new value for hasSemanticsSemanticId
	*/
	final public SubmodelBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.submodelImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public ISubmodel build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(submodelImpl);
		return submodelImpl;
	}
}
