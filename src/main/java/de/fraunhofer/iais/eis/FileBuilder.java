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

public class FileBuilder {

	private FileImpl fileImpl;

	public FileBuilder() {
		fileImpl = new FileImpl();
	}

	public FileBuilder(URI id) {
		this();
		fileImpl.id = id;
	}

	final public FileBuilder _fileMimeType_(String _fileMimeType_) {
		this.fileImpl._fileMimeType = _fileMimeType_;
		return this;
	}


	final public FileBuilder _fileValue_(String _fileValue_) {
		this.fileImpl._fileValue = _fileValue_;
		return this;
	}



	final public FileBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.fileImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public FileBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.fileImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public FileBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
		this.fileImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public FileBuilder _referableIdShort_(String _referableIdShort_) {
		this.fileImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public FileBuilder _referableParent_(URI _referableParent_) {
		this.fileImpl._referableParent = _referableParent_;
		return this;
	}


	final public FileBuilder _qualifiableQualifier_(ArrayList<? extends IConstraint> _qualifiableQualifier_) {
		this.fileImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public FileBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.fileImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public FileBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.fileImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public FileBuilder _hasSemanticsSemanticId_(IReference _hasSemanticsSemanticId_) {
		this.fileImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	final public IFile build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(fileImpl);
		return fileImpl;
	}
}
