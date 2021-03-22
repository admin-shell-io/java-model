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

public class AnnotatedRelationshipElementBuilder {

	private AnnotatedRelationshipElementImpl annotatedRelationshipElementImpl;

	public AnnotatedRelationshipElementBuilder() {
		annotatedRelationshipElementImpl = new AnnotatedRelationshipElementImpl();
	}

	public AnnotatedRelationshipElementBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		annotatedRelationshipElementImpl.id = id;
	}

	final public AnnotatedRelationshipElementBuilder _annotatedRelationshipElementAnnotation_(java.util.ArrayList<? extends DataElement> _annotatedRelationshipElementAnnotation_) {
		this.annotatedRelationshipElementImpl._annotatedRelationshipElementAnnotation = _annotatedRelationshipElementAnnotation_;
		return this;
	}


	final public AnnotatedRelationshipElementBuilder _relationshipElementFirst_(Referable _relationshipElementFirst_) {
		this.annotatedRelationshipElementImpl._relationshipElementFirst = _relationshipElementFirst_;
		return this;
	}


	final public AnnotatedRelationshipElementBuilder _relationshipElementSecond_(Referable _relationshipElementSecond_) {
		this.annotatedRelationshipElementImpl._relationshipElementSecond = _relationshipElementSecond_;
		return this;
	}



	final public AnnotatedRelationshipElementBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.annotatedRelationshipElementImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public AnnotatedRelationshipElementBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.annotatedRelationshipElementImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public AnnotatedRelationshipElementBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this.annotatedRelationshipElementImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public AnnotatedRelationshipElementBuilder _referableIdShort_(String _referableIdShort_) {
		this.annotatedRelationshipElementImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public AnnotatedRelationshipElementBuilder _referableParent_(URI _referableParent_) {
		this.annotatedRelationshipElementImpl._referableParent = _referableParent_;
		return this;
	}


	final public AnnotatedRelationshipElementBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.annotatedRelationshipElementImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public AnnotatedRelationshipElementBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.annotatedRelationshipElementImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public AnnotatedRelationshipElementBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.annotatedRelationshipElementImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public AnnotatedRelationshipElementBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.annotatedRelationshipElementImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final AnnotatedRelationshipElement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(annotatedRelationshipElementImpl);
		return annotatedRelationshipElementImpl;
	}
}
