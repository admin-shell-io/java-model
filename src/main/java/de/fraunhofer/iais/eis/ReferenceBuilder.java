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

public class ReferenceBuilder {

	private ReferenceImpl referenceImpl;

	public ReferenceBuilder() {
		referenceImpl = new ReferenceImpl();
	}

	public ReferenceBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		referenceImpl.id = id;
	}

	final public ReferenceBuilder _referenceKey_(java.util.ArrayList<? extends Key> _referenceKey_) {
		this.referenceImpl._referenceKey = _referenceKey_;
		return this;
	}

	public final Reference build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(referenceImpl);
		return referenceImpl;
	}
}
