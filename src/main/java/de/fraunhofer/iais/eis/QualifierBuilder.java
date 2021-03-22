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

public class QualifierBuilder {

	private QualifierImpl qualifierImpl;

	public QualifierBuilder() {
		qualifierImpl = new QualifierImpl();
	}

	public QualifierBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		qualifierImpl.id = id;
	}

	final public QualifierBuilder _qualifierType_(String _qualifierType_) {
		this.qualifierImpl._qualifierType = _qualifierType_;
		return this;
	}


	final public QualifierBuilder _qualifierValue_(de.fraunhofer.iais.eis.util.TypedLiteral _qualifierValue_) {
		this.qualifierImpl._qualifierValue = _qualifierValue_;
		return this;
	}


	final public QualifierBuilder _qualifierValueId_(Reference _qualifierValueId_) {
		this.qualifierImpl._qualifierValueId = _qualifierValueId_;
		return this;
	}



	final public QualifierBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.qualifierImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final Qualifier build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(qualifierImpl);
		return qualifierImpl;
	}
}
