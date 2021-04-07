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

public class BlobBuilder {

	private BlobImpl blobImpl;

	public BlobBuilder() {
		blobImpl = new BlobImpl();
	}

	public BlobBuilder(URI id) {
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




	final public BlobBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.blobImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public BlobBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.blobImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public BlobBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
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


	final public BlobBuilder _qualifiableQualifier_(ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this.blobImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public BlobBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.blobImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public BlobBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.blobImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public BlobBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.blobImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	final public IBlob build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(blobImpl);
		return blobImpl;
	}
}
