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

public class SecurityBuilder {

	private SecurityImpl securityImpl;

	public SecurityBuilder() {
		securityImpl = new SecurityImpl();
	}

	public SecurityBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		securityImpl.id = id;
	}

	final public SecurityBuilder _securityAccessControlPolicyPoints_(PolicyAdministrationPoint _securityAccessControlPolicyPoints_) {
		this.securityImpl._securityAccessControlPolicyPoints = _securityAccessControlPolicyPoints_;
		return this;
	}


	final public SecurityBuilder _securityCertificate_(java.util.ArrayList<? extends Certificate> _securityCertificate_) {
		this.securityImpl._securityCertificate = _securityCertificate_;
		return this;
	}


	final public SecurityBuilder _securityRequiredCertificateExtension_(java.util.ArrayList<? extends Reference> _securityRequiredCertificateExtension_) {
		this.securityImpl._securityRequiredCertificateExtension = _securityRequiredCertificateExtension_;
		return this;
	}

	public final Security build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(securityImpl);
		return securityImpl;
	}
}
