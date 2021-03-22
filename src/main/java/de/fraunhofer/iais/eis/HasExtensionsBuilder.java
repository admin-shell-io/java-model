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

public class HasExtensionsBuilder {

	private HasExtensionsImpl hasExtensionsImpl;

	public HasExtensionsBuilder() {
		hasExtensionsImpl = new HasExtensionsImpl();
	}

	public HasExtensionsBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		hasExtensionsImpl.id = id;
	}

	final public HasExtensionsBuilder _hasExtensionsExtension_(java.util.ArrayList<? extends Extension> _hasExtensionsExtension_) {
		this.hasExtensionsImpl._hasExtensionsExtension = _hasExtensionsExtension_;
		return this;
	}

	public final HasExtensions build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(hasExtensionsImpl);
		return hasExtensionsImpl;
	}
}
