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

public class IdentifierKeyValuePairBuilder {

	private IdentifierKeyValuePairImpl identifierKeyValuePairImpl;

	public IdentifierKeyValuePairBuilder() {
		identifierKeyValuePairImpl = new IdentifierKeyValuePairImpl();
	}

	public IdentifierKeyValuePairBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		identifierKeyValuePairImpl.id = id;
	}

	final public IdentifierKeyValuePairBuilder _identifierKeyValuePairKey_(String _identifierKeyValuePairKey_) {
		this.identifierKeyValuePairImpl._identifierKeyValuePairKey = _identifierKeyValuePairKey_;
		return this;
	}


	final public IdentifierKeyValuePairBuilder _identifierKeyValuePairValue_(String _identifierKeyValuePairValue_) {
		this.identifierKeyValuePairImpl._identifierKeyValuePairValue = _identifierKeyValuePairValue_;
		return this;
	}


	final public IdentifierKeyValuePairBuilder _identifierKeyValuePairExternalSubjectId_(Reference _identifierKeyValuePairExternalSubjectId_) {
		this.identifierKeyValuePairImpl._identifierKeyValuePairExternalSubjectId = _identifierKeyValuePairExternalSubjectId_;
		return this;
	}


	final public IdentifierKeyValuePairBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.identifierKeyValuePairImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final IdentifierKeyValuePair build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(identifierKeyValuePairImpl);
		return identifierKeyValuePairImpl;
	}
}
