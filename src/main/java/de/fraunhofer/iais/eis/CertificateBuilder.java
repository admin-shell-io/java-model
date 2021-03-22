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

public class CertificateBuilder {

	private CertificateImpl certificateImpl;

	public CertificateBuilder() {
		certificateImpl = new CertificateImpl();
	}

	public CertificateBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		certificateImpl.id = id;
	}

	final public CertificateBuilder _certificatePolicyAdministrationPoint_(PolicyAdministrationPoint _certificatePolicyAdministrationPoint_) {
		this.certificateImpl._certificatePolicyAdministrationPoint = _certificatePolicyAdministrationPoint_;
		return this;
	}

	public final Certificate build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(certificateImpl);
		return certificateImpl;
	}
}
