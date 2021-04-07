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

public class RelationshipElementBuilder {

	private RelationshipElementImpl relationshipElementImpl;

	public RelationshipElementBuilder() {
		relationshipElementImpl = new RelationshipElementImpl();
	}

	public RelationshipElementBuilder(URI id) {
		this();
		relationshipElementImpl.id = id;
	}

	final public RelationshipElementBuilder _relationshipElementFirst_(IReferable _relationshipElementFirst_) {
		this.relationshipElementImpl._relationshipElementFirst = _relationshipElementFirst_;
		return this;
	}


	final public RelationshipElementBuilder _relationshipElementSecond_(IReferable _relationshipElementSecond_) {
		this.relationshipElementImpl._relationshipElementSecond = _relationshipElementSecond_;
		return this;
	}



	final public RelationshipElementBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.relationshipElementImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public RelationshipElementBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.relationshipElementImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public RelationshipElementBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
		this.relationshipElementImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public RelationshipElementBuilder _referableIdShort_(String _referableIdShort_) {
		this.relationshipElementImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public RelationshipElementBuilder _referableParent_(URI _referableParent_) {
		this.relationshipElementImpl._referableParent = _referableParent_;
		return this;
	}


	final public RelationshipElementBuilder _qualifiableQualifier_(ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this.relationshipElementImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public RelationshipElementBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.relationshipElementImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public RelationshipElementBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.relationshipElementImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public RelationshipElementBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.relationshipElementImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	final public IRelationshipElement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(relationshipElementImpl);
		return relationshipElementImpl;
	}
}
