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

public class ExtensionBuilder {

	private ExtensionImpl extensionImpl;

	public ExtensionBuilder() {
		extensionImpl = new ExtensionImpl();
	}

	public ExtensionBuilder(@javax.validation.constraints.NotNull URI id) {
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


	final public ExtensionBuilder _extensionRefersTo_(Reference _extensionRefersTo_) {
		this.extensionImpl._extensionRefersTo = _extensionRefersTo_;
		return this;
	}


	final public ExtensionBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.extensionImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final Extension build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(extensionImpl);
		return extensionImpl;
	}
}
