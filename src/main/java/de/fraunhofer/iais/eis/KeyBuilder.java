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

public class KeyBuilder {

	private KeyImpl keyImpl;

	public KeyBuilder() {
		keyImpl = new KeyImpl();
	}

	public KeyBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		keyImpl.id = id;
	}

	final public KeyBuilder _keyIdType_(KeyType _keyIdType_) {
		this.keyImpl._keyIdType = _keyIdType_;
		return this;
	}


	final public KeyBuilder _keyType_(KeyElements _keyType_) {
		this.keyImpl._keyType = _keyType_;
		return this;
	}


	final public KeyBuilder _keyValue_(String _keyValue_) {
		this.keyImpl._keyValue = _keyValue_;
		return this;
	}

	public final Key build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(keyImpl);
		return keyImpl;
	}
}
