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

public class IdentifierKeyValuePairBuilder {

	private IdentifierKeyValuePairImpl identifierKeyValuePairImpl;

	public IdentifierKeyValuePairBuilder() {
		identifierKeyValuePairImpl = new IdentifierKeyValuePairImpl();
	}

	public IdentifierKeyValuePairBuilder(URI id) {
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


	final public IdentifierKeyValuePairBuilder _identifierKeyValuePairExternalSubjectId_(IReference _identifierKeyValuePairExternalSubjectId_) {
		this.identifierKeyValuePairImpl._identifierKeyValuePairExternalSubjectId = _identifierKeyValuePairExternalSubjectId_;
		return this;
	}


	final public IdentifierKeyValuePairBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.identifierKeyValuePairImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	final public IIdentifierKeyValuePair build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(identifierKeyValuePairImpl);
		return identifierKeyValuePairImpl;
	}
}
