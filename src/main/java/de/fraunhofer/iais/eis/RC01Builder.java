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

public class RC01Builder {

	private RC01Impl rC01Impl;

	public RC01Builder() {
		rC01Impl = new RC01Impl();
	}

	public RC01Builder(@javax.validation.constraints.NotNull URI id) {
		this();
		rC01Impl.id = id;
	}

	final public RC01Builder _rC01ConversionFactor_(java.util.ArrayList<? extends String> _rC01ConversionFactor_) {
		this.rC01Impl._rC01ConversionFactor = _rC01ConversionFactor_;
		return this;
	}


	final public RC01Builder _rC01Definition_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _rC01Definition_) {
		this.rC01Impl._rC01Definition = _rC01Definition_;
		return this;
	}


	final public RC01Builder _rC01DinNotation_(java.util.ArrayList<? extends String> _rC01DinNotation_) {
		this.rC01Impl._rC01DinNotation = _rC01DinNotation_;
		return this;
	}


	final public RC01Builder _rC01EceCode_(java.util.ArrayList<? extends String> _rC01EceCode_) {
		this.rC01Impl._rC01EceCode = _rC01EceCode_;
		return this;
	}


	final public RC01Builder _rC01EceName_(java.util.ArrayList<? extends String> _rC01EceName_) {
		this.rC01Impl._rC01EceName = _rC01EceName_;
		return this;
	}


	final public RC01Builder _rC01NistName_(java.util.ArrayList<? extends String> _rC01NistName_) {
		this.rC01Impl._rC01NistName = _rC01NistName_;
		return this;
	}


	final public RC01Builder _rC01SiName_(java.util.ArrayList<? extends String> _rC01SiName_) {
		this.rC01Impl._rC01SiName = _rC01SiName_;
		return this;
	}


	final public RC01Builder _rC01SiNotation_(java.util.ArrayList<? extends String> _rC01SiNotation_) {
		this.rC01Impl._rC01SiNotation = _rC01SiNotation_;
		return this;
	}


	final public RC01Builder _rC01RegistrationAuthorityId_(java.util.ArrayList<? extends String> _rC01RegistrationAuthorityId_) {
		this.rC01Impl._rC01RegistrationAuthorityId = _rC01RegistrationAuthorityId_;
		return this;
	}


	final public RC01Builder _rC01Supplier_(java.util.ArrayList<? extends String> _rC01Supplier_) {
		this.rC01Impl._rC01Supplier = _rC01Supplier_;
		return this;
	}


	final public RC01Builder _rC01UnitName_(java.util.ArrayList<? extends String> _rC01UnitName_) {
		this.rC01Impl._rC01UnitName = _rC01UnitName_;
		return this;
	}


	final public RC01Builder _rC01UnitSymbol_(java.util.ArrayList<? extends String> _rC01UnitSymbol_) {
		this.rC01Impl._rC01UnitSymbol = _rC01UnitSymbol_;
		return this;
	}


	public final RC01 build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(rC01Impl);
		return rC01Impl;
	}
}
