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

public class BlobBuilder {

	private BlobImpl blobImpl;

	public BlobBuilder() {
		blobImpl = new BlobImpl();
	}

	public BlobBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		blobImpl.id = id;
	}

	final public BlobBuilder _blobMimeType_(String _blobMimeType_) {
		this.blobImpl._blobMimeType = _blobMimeType_;
		return this;
	}


	final public BlobBuilder _blobValue_(byte _blobValue_) {
		this.blobImpl._blobValue = _blobValue_;
		return this;
	}




	final public BlobBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.blobImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public BlobBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.blobImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public BlobBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this.blobImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public BlobBuilder _referableIdShort_(String _referableIdShort_) {
		this.blobImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public BlobBuilder _referableParent_(URI _referableParent_) {
		this.blobImpl._referableParent = _referableParent_;
		return this;
	}


	final public BlobBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.blobImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public BlobBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.blobImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public BlobBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.blobImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public BlobBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.blobImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final Blob build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(blobImpl);
		return blobImpl;
	}
}
