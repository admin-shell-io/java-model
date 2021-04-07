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

	final public EntityBuilder _entityGlobalAssetId_(IReference _entityGlobalAssetId_) {
		this.entityImpl._entityGlobalAssetId = _entityGlobalAssetId_;
		return this;
	}


	final public EntityBuilder _entityExternalAssetId_(IIdentifierKeyValuePair _entityExternalAssetId_) {
		this.entityImpl._entityExternalAssetId = _entityExternalAssetId_;
		return this;
	}


	final public EntityBuilder _entityEntityType_(EntityType _entityEntityType_) {
		this.entityImpl._entityEntityType = _entityEntityType_;
		return this;
	}


	final public EntityBuilder _entityStatement_(ArrayList<? extends ISubmodelElement> _entityStatement_) {
		this.entityImpl._entityStatement = _entityStatement_;
		return this;
	}



	final public EntityBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.entityImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public EntityBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.entityImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public EntityBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
		this.entityImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public EntityBuilder _referableIdShort_(String _referableIdShort_) {
		this.entityImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public EntityBuilder _referableParent_(URI _referableParent_) {
		this.entityImpl._referableParent = _referableParent_;
		return this;
	}


	final public EntityBuilder _qualifiableQualifier_(ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this.entityImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public EntityBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.entityImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public EntityBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.entityImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public EntityBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.entityImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	final public IEntity build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(entityImpl);
		return entityImpl;
	}
}
