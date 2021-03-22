package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;
import javax.validation.constraints.*;
import java.util.Arrays;
import java.io.Serializable;

import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.*;

public class EntityBuilder {

	private EntityImpl entityImpl;

	public EntityBuilder() {
		entityImpl = new EntityImpl();
	}

	public EntityBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		entityImpl.id = id;
	}

	final public EntityBuilder _entityGlobalAssetId_(Reference _entityGlobalAssetId_) {
		this.entityImpl._entityGlobalAssetId = _entityGlobalAssetId_;
		return this;
	}


	final public EntityBuilder _entityExternalAssetId_(IdentifierKeyValuePair _entityExternalAssetId_) {
		this.entityImpl._entityExternalAssetId = _entityExternalAssetId_;
		return this;
	}


	final public EntityBuilder _entityEntityType_(EntityType _entityEntityType_) {
		this.entityImpl._entityEntityType = _entityEntityType_;
		return this;
	}


	final public EntityBuilder _entityStatement_(java.util.ArrayList<? extends SubmodelElement> _entityStatement_) {
		this.entityImpl._entityStatement = _entityStatement_;
		return this;
	}



	final public EntityBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.entityImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public EntityBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.entityImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public EntityBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
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


	final public EntityBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.entityImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public EntityBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.entityImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public EntityBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.entityImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public EntityBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.entityImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final Entity build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(entityImpl);
		return entityImpl;
	}
}
