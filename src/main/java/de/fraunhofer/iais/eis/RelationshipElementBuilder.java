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

public class RelationshipElementBuilder {

	private RelationshipElementImpl relationshipElementImpl;

	public RelationshipElementBuilder() {
		relationshipElementImpl = new RelationshipElementImpl();
	}

	public RelationshipElementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		relationshipElementImpl.id = id;
	}

	final public RelationshipElementBuilder _relationshipElementFirst_(Referable _relationshipElementFirst_) {
		this.relationshipElementImpl._relationshipElementFirst = _relationshipElementFirst_;
		return this;
	}


	final public RelationshipElementBuilder _relationshipElementSecond_(Referable _relationshipElementSecond_) {
		this.relationshipElementImpl._relationshipElementSecond = _relationshipElementSecond_;
		return this;
	}



	final public RelationshipElementBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.relationshipElementImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public RelationshipElementBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.relationshipElementImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public RelationshipElementBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
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


	final public RelationshipElementBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.relationshipElementImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public RelationshipElementBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.relationshipElementImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public RelationshipElementBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.relationshipElementImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public RelationshipElementBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.relationshipElementImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final RelationshipElement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(relationshipElementImpl);
		return relationshipElementImpl;
	}
}
