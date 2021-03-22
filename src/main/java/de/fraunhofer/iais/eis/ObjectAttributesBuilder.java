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

public class ObjectAttributesBuilder {

	private ObjectAttributesImpl objectAttributesImpl;

	public ObjectAttributesBuilder() {
		objectAttributesImpl = new ObjectAttributesImpl();
	}

	public ObjectAttributesBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		objectAttributesImpl.id = id;
	}

	final public ObjectAttributesBuilder _objectAttributesObjectAttribute_(java.util.ArrayList<? extends DataElement> _objectAttributesObjectAttribute_) {
		this.objectAttributesImpl._objectAttributesObjectAttribute = _objectAttributesObjectAttribute_;
		return this;
	}

	public final ObjectAttributes build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(objectAttributesImpl);
		return objectAttributesImpl;
	}
}
