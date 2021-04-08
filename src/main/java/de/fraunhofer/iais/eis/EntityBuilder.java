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

public class EntityBuilder {

	private EntityImpl entityImpl;

	public EntityBuilder() {
		entityImpl = new EntityImpl();
	}

	public EntityBuilder(URI id) {
		this();
		entityImpl.id = id;
	}

	/**
	* This function allows setting a value for entityGlobalAssetId
	* @param _entityGlobalAssetId_ desired value to be set
	* @return Builder object with new value for entityGlobalAssetId
	*/
	final public EntityBuilder _entityGlobalAssetId_(IReference _entityGlobalAssetId_) {
		this.entityImpl._entityGlobalAssetId = _entityGlobalAssetId_;
		return this;
	}


	/**
	* This function allows setting a value for entityExternalAssetId
	* @param _entityExternalAssetId_ desired value to be set
	* @return Builder object with new value for entityExternalAssetId
	*/
	final public EntityBuilder _entityExternalAssetId_(IIdentifierKeyValuePair _entityExternalAssetId_) {
		this.entityImpl._entityExternalAssetId = _entityExternalAssetId_;
		return this;
	}


	/**
	* This function allows setting a value for entityEntityType
	* @param _entityEntityType_ desired value to be set
	* @return Builder object with new value for entityEntityType
	*/
	final public EntityBuilder _entityEntityType_(EntityType _entityEntityType_) {
		this.entityImpl._entityEntityType = _entityEntityType_;
		return this;
	}


	/**
	* This function allows setting a value for entityStatement
	* @param _entityStatement_ desired value to be set
	* @return Builder object with new value for entityStatement
	*/
	final public EntityBuilder _entityStatement_(ArrayList<? extends ISubmodelElement> _entityStatement_) {
		this.entityImpl._entityStatement = _entityStatement_;
		return this;
	}



	/**
	* This function allows setting a value for referableReferableCategory
	* @param _referableReferableCategory_ desired value to be set
	* @return Builder object with new value for referableReferableCategory
	*/
	final public EntityBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.entityImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	/**
	* This function allows setting a value for referableDescription
	* @param _referableDescription_ desired value to be set
	* @return Builder object with new value for referableDescription
	*/
	final public EntityBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.entityImpl._referableDescription = _referableDescription_;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param _referableDisplayName_ desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public EntityBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
		this.entityImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param _referableIdShort_ desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public EntityBuilder _referableIdShort_(String _referableIdShort_) {
		this.entityImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param _referableParent_ desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public EntityBuilder _referableParent_(URI _referableParent_) {
		this.entityImpl._referableParent = _referableParent_;
		return this;
	}


	/**
	* This function allows setting a value for qualifiableQualifier
	* @param _qualifiableQualifier_ desired value to be set
	* @return Builder object with new value for qualifiableQualifier
	*/
	final public EntityBuilder _qualifiableQualifier_(ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this.entityImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecification
	* @param _hasDataSpecificationDataSpecification_ desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecification
	*/
	final public EntityBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.entityImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	/**
	* This function allows setting a value for hasKindKind
	* @param _hasKindKind_ desired value to be set
	* @return Builder object with new value for hasKindKind
	*/
	final public EntityBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.entityImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	/**
	* This function allows setting a value for hasSemanticsSemanticId
	* @param _hasSemanticsSemanticId_ desired value to be set
	* @return Builder object with new value for hasSemanticsSemanticId
	*/
	final public EntityBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.entityImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public IEntity build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(entityImpl);
		return entityImpl;
	}
}
