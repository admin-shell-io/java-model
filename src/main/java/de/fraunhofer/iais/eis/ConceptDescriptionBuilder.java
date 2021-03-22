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

public class ConceptDescriptionBuilder {

	private ConceptDescriptionImpl conceptDescriptionImpl;

	public ConceptDescriptionBuilder() {
		conceptDescriptionImpl = new ConceptDescriptionImpl();
	}

	public ConceptDescriptionBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		conceptDescriptionImpl.id = id;
	}

	final public ConceptDescriptionBuilder _conceptDescriptionContent_(java.util.ArrayList<? extends DataSpecificationContent> _conceptDescriptionContent_) {
		this.conceptDescriptionImpl._conceptDescriptionContent = _conceptDescriptionContent_;
		return this;
	}


	final public ConceptDescriptionBuilder _conceptDescriptionIsCaseOf_(java.util.ArrayList<? extends Reference> _conceptDescriptionIsCaseOf_) {
		this.conceptDescriptionImpl._conceptDescriptionIsCaseOf = _conceptDescriptionIsCaseOf_;
		return this;
	}


	final public ConceptDescriptionBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.conceptDescriptionImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public ConceptDescriptionBuilder _identifiableAdministration_(AdministrativeInformation _identifiableAdministration_) {
		this.conceptDescriptionImpl._identifiableAdministration = _identifiableAdministration_;
		return this;
	}


	final public ConceptDescriptionBuilder _identifiableIdentification_(Identifier _identifiableIdentification_) {
		this.conceptDescriptionImpl._identifiableIdentification = _identifiableIdentification_;
		return this;
	}


	final public ConceptDescriptionBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.conceptDescriptionImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public ConceptDescriptionBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.conceptDescriptionImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public ConceptDescriptionBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this.conceptDescriptionImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public ConceptDescriptionBuilder _referableIdShort_(String _referableIdShort_) {
		this.conceptDescriptionImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public ConceptDescriptionBuilder _referableParent_(URI _referableParent_) {
		this.conceptDescriptionImpl._referableParent = _referableParent_;
		return this;
	}

	public final ConceptDescription build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(conceptDescriptionImpl);
		return conceptDescriptionImpl;
	}
}
