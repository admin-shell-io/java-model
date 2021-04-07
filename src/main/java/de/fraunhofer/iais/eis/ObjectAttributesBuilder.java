package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

public class ObjectAttributesBuilder {

	private ObjectAttributesImpl objectAttributesImpl;

	public ObjectAttributesBuilder() {
		objectAttributesImpl = new ObjectAttributesImpl();
	}

	public ObjectAttributesBuilder(URI id) {
		this();
		objectAttributesImpl.id = id;
	}

	final public ObjectAttributesBuilder _objectAttributesObjectAttribute_(ArrayList<? extends IDataElement> _objectAttributesObjectAttribute_) {
		this.objectAttributesImpl._objectAttributesObjectAttribute = _objectAttributesObjectAttribute_;
		return this;
	}

	final public IObjectAttributes build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(objectAttributesImpl);
		return objectAttributesImpl;
	}
}
