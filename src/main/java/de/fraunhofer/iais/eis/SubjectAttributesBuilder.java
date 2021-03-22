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

public class SubjectAttributesBuilder {

	private SubjectAttributesImpl subjectAttributesImpl;

	public SubjectAttributesBuilder() {
		subjectAttributesImpl = new SubjectAttributesImpl();
	}

	public SubjectAttributesBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		subjectAttributesImpl.id = id;
	}

	final public SubjectAttributesBuilder _subjectAttributesSubjectAttribute_(java.util.ArrayList<? extends DataElement> _subjectAttributesSubjectAttribute_) {
		this.subjectAttributesImpl._subjectAttributesSubjectAttribute = _subjectAttributesSubjectAttribute_;
		return this;
	}

	public final SubjectAttributes build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(subjectAttributesImpl);
		return subjectAttributesImpl;
	}
}
