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

public class FileBuilder {

	private FileImpl fileImpl;

	public FileBuilder() {
		fileImpl = new FileImpl();
	}

	public FileBuilder(@javax.validation.constraints.NotNull URI id) {
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



	final public FileBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.fileImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public FileBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.fileImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public FileBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
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


	final public FileBuilder _qualifiableQualifier_(java.util.ArrayList<? extends Constraint> _qualifiableQualifier_) {
		this.fileImpl._qualifiableQualifier = _qualifiableQualifier_;
		return this;
	}


	final public FileBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.fileImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public FileBuilder _hasKindKind_(ModelingKind _hasKindKind_) {
		this.fileImpl._hasKindKind = _hasKindKind_;
		return this;
	}


	final public FileBuilder _hasSemanticsSemanticId_(Reference _hasSemanticsSemanticId_) {
		this.fileImpl._hasSemanticsSemanticId = _hasSemanticsSemanticId_;
		return this;
	}

	public final File build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(fileImpl);
		return fileImpl;
	}
}
