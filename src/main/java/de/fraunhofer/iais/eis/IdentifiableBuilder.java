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

public class IdentifiableBuilder {

	private IdentifiableImpl identifiableImpl;

	public IdentifiableBuilder() {
		identifiableImpl = new IdentifiableImpl();
	}

	public IdentifiableBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		identifiableImpl.id = id;
	}

	final public IdentifiableBuilder _identifiableAdministration_(AdministrativeInformation _identifiableAdministration_) {
		this.identifiableImpl._identifiableAdministration = _identifiableAdministration_;
		return this;
	}


	final public IdentifiableBuilder _identifiableIdentification_(Identifier _identifiableIdentification_) {
		this.identifiableImpl._identifiableIdentification = _identifiableIdentification_;
		return this;
	}


	final public IdentifiableBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.identifiableImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public IdentifiableBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.identifiableImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public IdentifiableBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this.identifiableImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public IdentifiableBuilder _referableIdShort_(String _referableIdShort_) {
		this.identifiableImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public IdentifiableBuilder _referableParent_(URI _referableParent_) {
		this.identifiableImpl._referableParent = _referableParent_;
		return this;
	}

	public final Identifiable build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(identifiableImpl);
		return identifiableImpl;
	}
}
