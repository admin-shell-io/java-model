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

public class ExtensionBuilder {

	private ExtensionImpl extensionImpl;

	public ExtensionBuilder() {
		extensionImpl = new ExtensionImpl();
	}

	public ExtensionBuilder(URI id) {
		this();
		extensionImpl.id = id;
	}

	final public ExtensionBuilder _extensionName_(String _extensionName_) {
		this.extensionImpl._extensionName = _extensionName_;
		return this;
	}


	final public ExtensionBuilder _extensionValueType_(String _extensionValueType_) {
		this.extensionImpl._extensionValueType = _extensionValueType_;
		return this;
	}


	final public ExtensionBuilder _extensionValue_(String _extensionValue_) {
		this.extensionImpl._extensionValue = _extensionValue_;
		return this;
	}


	final public ExtensionBuilder _extensionRefersTo_(IReference _extensionRefersTo_) {
		this.extensionImpl._extensionRefersTo = _extensionRefersTo_;
		return this;
	}


	final public ExtensionBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.extensionImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	final public IExtension build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(extensionImpl);
		return extensionImpl;
	}
}
