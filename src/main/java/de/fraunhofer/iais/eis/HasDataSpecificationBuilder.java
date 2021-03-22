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

public class HasDataSpecificationBuilder {

	private HasDataSpecificationImpl hasDataSpecificationImpl;

	public HasDataSpecificationBuilder() {
		hasDataSpecificationImpl = new HasDataSpecificationImpl();
	}

	public HasDataSpecificationBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		hasDataSpecificationImpl.id = id;
	}

	final public HasDataSpecificationBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.hasDataSpecificationImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}

	public final HasDataSpecification build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(hasDataSpecificationImpl);
		return hasDataSpecificationImpl;
	}
}
