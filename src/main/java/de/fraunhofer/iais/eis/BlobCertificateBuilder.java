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

public class BlobCertificateBuilder {

	private BlobCertificateImpl blobCertificateImpl;

	public BlobCertificateBuilder() {
		blobCertificateImpl = new BlobCertificateImpl();
	}

	public BlobCertificateBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		blobCertificateImpl.id = id;
	}

	final public BlobCertificateBuilder _blobCertificateBlobCertificate_(byte _blobCertificateBlobCertificate_) {
		this.blobCertificateImpl._blobCertificateBlobCertificate = _blobCertificateBlobCertificate_;
		return this;
	}


	final public BlobCertificateBuilder _blobCertificateContainedExtension_(java.util.ArrayList<? extends Reference> _blobCertificateContainedExtension_) {
		this.blobCertificateImpl._blobCertificateContainedExtension = _blobCertificateContainedExtension_;
		return this;
	}


	final public BlobCertificateBuilder _blobCertificateLastCertificate_(boolean _blobCertificateLastCertificate_) {
		this.blobCertificateImpl._blobCertificateLastCertificate = _blobCertificateLastCertificate_;
		return this;
	}


	final public BlobCertificateBuilder _certificatePolicyAdministrationPoint_(PolicyAdministrationPoint _certificatePolicyAdministrationPoint_) {
		this.blobCertificateImpl._certificatePolicyAdministrationPoint = _certificatePolicyAdministrationPoint_;
		return this;
	}

	public final BlobCertificate build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(blobCertificateImpl);
		return blobCertificateImpl;
	}
}
