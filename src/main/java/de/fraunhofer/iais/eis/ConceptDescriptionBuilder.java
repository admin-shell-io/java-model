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

public class ConceptDescriptionBuilder {

	private ConceptDescriptionImpl conceptDescriptionImpl;

	public ConceptDescriptionBuilder() {
		conceptDescriptionImpl = new ConceptDescriptionImpl();
	}

	public ConceptDescriptionBuilder(URI id) {
		this();
		conceptDescriptionImpl.id = id;
	}

	final public ConceptDescriptionBuilder _conceptDescriptionContent_(ArrayList<? extends IDataSpecificationContent> _conceptDescriptionContent_) {
		this.conceptDescriptionImpl._conceptDescriptionContent = _conceptDescriptionContent_;
		return this;
	}


	final public ConceptDescriptionBuilder _conceptDescriptionIsCaseOf_(ArrayList<? extends IReference> _conceptDescriptionIsCaseOf_) {
		this.conceptDescriptionImpl._conceptDescriptionIsCaseOf = _conceptDescriptionIsCaseOf_;
		return this;
	}


	final public ConceptDescriptionBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.conceptDescriptionImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public ConceptDescriptionBuilder _identifiableAdministration_(IAdministrativeInformation _identifiableAdministration_) {
		this.conceptDescriptionImpl._identifiableAdministration = _identifiableAdministration_;
		return this;
	}


	final public ConceptDescriptionBuilder _identifiableIdentification_(IIdentifier _identifiableIdentification_) {
		this.conceptDescriptionImpl._identifiableIdentification = _identifiableIdentification_;
		return this;
	}


	final public ConceptDescriptionBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.conceptDescriptionImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public ConceptDescriptionBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.conceptDescriptionImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public ConceptDescriptionBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
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

	final public IConceptDescription build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(conceptDescriptionImpl);
		return conceptDescriptionImpl;
	}
}
