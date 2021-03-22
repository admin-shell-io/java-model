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

public class QualifiableBuilder {

	private QualifiableImpl qualifiableImpl;

	public QualifiableBuilder() {
		qualifiableImpl = new QualifiableImpl();
	}

	public QualifiableBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		qualifiableImpl.id = id;
	}

	final public QualifiableBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.qualifiableImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}

	public final Qualifiable build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(qualifiableImpl);
		return qualifiableImpl;
	}
}
