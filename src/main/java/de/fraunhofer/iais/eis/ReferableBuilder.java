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

public class ReferableBuilder {

	private ReferableImpl referableImpl;

	public ReferableBuilder() {
		referableImpl = new ReferableImpl();
	}

	public ReferableBuilder(URI id) {
		this();
		referableImpl.id = id;
	}

	final public ReferableBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.referableImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public ReferableBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.referableImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public ReferableBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
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

	final public IReferable build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(referableImpl);
		return referableImpl;
	}
}
