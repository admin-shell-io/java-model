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

public class BlobCertificateBuilder {

	private BlobCertificateImpl blobCertificateImpl;

	public BlobCertificateBuilder() {
		blobCertificateImpl = new BlobCertificateImpl();
	}

	public BlobCertificateBuilder(URI id) {
		this();
		blobCertificateImpl.id = id;
	}

	final public BlobCertificateBuilder _blobCertificateBlobCertificate_(byte _blobCertificateBlobCertificate_) {
		this.blobCertificateImpl._blobCertificateBlobCertificate = _blobCertificateBlobCertificate_;
		return this;
	}


	final public BlobCertificateBuilder _blobCertificateContainedExtension_(ArrayList<? extends IReference> _blobCertificateContainedExtension_) {
		this.blobCertificateImpl._blobCertificateContainedExtension = _blobCertificateContainedExtension_;
		return this;
	}


	final public BlobCertificateBuilder _blobCertificateLastCertificate_(boolean _blobCertificateLastCertificate_) {
		this.blobCertificateImpl._blobCertificateLastCertificate = _blobCertificateLastCertificate_;
		return this;
	}


	final public BlobCertificateBuilder _certificatePolicyAdministrationPoint_(IPolicyAdministrationPoint _certificatePolicyAdministrationPoint_) {
		this.blobCertificateImpl._certificatePolicyAdministrationPoint = _certificatePolicyAdministrationPoint_;
		return this;
	}

	final public IBlobCertificate build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(blobCertificateImpl);
		return blobCertificateImpl;
	}
}
