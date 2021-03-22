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

public class ReferableBuilder {

	private ReferableImpl referableImpl;

	public ReferableBuilder() {
		referableImpl = new ReferableImpl();
	}

	public ReferableBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		referableImpl.id = id;
	}

	final public ReferableBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.referableImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public ReferableBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.referableImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public ReferableBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this.referableImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public ReferableBuilder _referableIdShort_(String _referableIdShort_) {
		this.referableImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public ReferableBuilder _referableParent_(URI _referableParent_) {
		this.referableImpl._referableParent = _referableParent_;
		return this;
	}

	public final Referable build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(referableImpl);
		return referableImpl;
	}
}
