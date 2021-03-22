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

public class AssetBuilder {

	private AssetImpl assetImpl;

	public AssetBuilder() {
		assetImpl = new AssetImpl();
	}

	public AssetBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		assetImpl.id = id;
	}


	final public AssetBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.assetImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public AssetBuilder _identifiableAdministration_(AdministrativeInformation _identifiableAdministration_) {
		this.assetImpl._identifiableAdministration = _identifiableAdministration_;
		return this;
	}


	final public AssetBuilder _identifiableIdentification_(Identifier _identifiableIdentification_) {
		this.assetImpl._identifiableIdentification = _identifiableIdentification_;
		return this;
	}


	final public AssetBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.assetImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public AssetBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.assetImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public AssetBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this.assetImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public AssetBuilder _referableIdShort_(String _referableIdShort_) {
		this.assetImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public AssetBuilder _referableParent_(URI _referableParent_) {
		this.assetImpl._referableParent = _referableParent_;
		return this;
	}

	public final Asset build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(assetImpl);
		return assetImpl;
	}
}
