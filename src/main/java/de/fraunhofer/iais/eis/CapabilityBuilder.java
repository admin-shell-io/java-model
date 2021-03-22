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

public class CapabilityBuilder {

	private CapabilityImpl capabilityImpl;

	public CapabilityBuilder() {
		capabilityImpl = new CapabilityImpl();
	}

	public CapabilityBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		capabilityImpl.id = id;
	}



	final public CapabilityBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.capabilityImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public CapabilityBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.capabilityImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public CapabilityBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this.capabilityImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public CapabilityBuilder _referableIdShort_(String _referableIdShort_) {
		this.capabilityImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public CapabilityBuilder _referableParent_(URI _referableParent_) {
		this.capabilityImpl._referableParent = _referableParent_;
		return this;
	}


	final public CapabilityBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.capabilityImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public CapabilityBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.capabilityImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public CapabilityBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.capabilityImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public CapabilityBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.capabilityImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final Capability build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(capabilityImpl);
		return capabilityImpl;
	}
}
