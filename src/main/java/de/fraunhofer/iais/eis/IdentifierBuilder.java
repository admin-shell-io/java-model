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

public class IdentifierBuilder {

	private IdentifierImpl identifierImpl;

	public IdentifierBuilder() {
		identifierImpl = new IdentifierImpl();
	}

	public IdentifierBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		identifierImpl.id = id;
	}

	final public IdentifierBuilder _identifierIdentifier_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _identifierIdentifier_) {
		this.identifierImpl._identifierIdentifier = _identifierIdentifier_;
		return this;
	}


	final public IdentifierBuilder _identifierIdType_(IdentifierType _identifierIdType_) {
		this.identifierImpl._identifierIdType = _identifierIdType_;
		return this;
	}

	public final Identifier build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(identifierImpl);
		return identifierImpl;
	}
}
