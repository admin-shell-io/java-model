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

public class AdministrativeInformationBuilder {

	private AdministrativeInformationImpl administrativeInformationImpl;

	public AdministrativeInformationBuilder() {
		administrativeInformationImpl = new AdministrativeInformationImpl();
	}

	public AdministrativeInformationBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		administrativeInformationImpl.id = id;
	}

	final public AdministrativeInformationBuilder _administrativeInformationVersion_(String _administrativeInformationVersion_) {
		this.administrativeInformationImpl._administrativeInformationVersion = _administrativeInformationVersion_;
		return this;
	}


	final public AdministrativeInformationBuilder _administrativeInformationRevision_(String _administrativeInformationRevision_) {
		this.administrativeInformationImpl._administrativeInformationRevision = _administrativeInformationRevision_;
		return this;
	}


	final public AdministrativeInformationBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.administrativeInformationImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}

	public final AdministrativeInformation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(administrativeInformationImpl);
		return administrativeInformationImpl;
	}
}
