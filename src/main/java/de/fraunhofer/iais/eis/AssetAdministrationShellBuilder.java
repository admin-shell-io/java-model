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

public class AssetAdministrationShellBuilder {

	private AssetAdministrationShellImpl assetAdministrationShellImpl;

	public AssetAdministrationShellBuilder() {
		assetAdministrationShellImpl = new AssetAdministrationShellImpl();
	}

	public AssetAdministrationShellBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		assetAdministrationShellImpl.id = id;
	}

	final public AssetAdministrationShellBuilder _assetAdministrationShellAssetInformation_(AssetInformation _assetAdministrationShellAssetInformation_) {
		this.assetAdministrationShellImpl._assetAdministrationShellAssetInformation = _assetAdministrationShellAssetInformation_;
		return this;
	}


	final public AssetAdministrationShellBuilder _assetAdministrationShellDerivedFrom_(Reference _assetAdministrationShellDerivedFrom_) {
		this.assetAdministrationShellImpl._assetAdministrationShellDerivedFrom = _assetAdministrationShellDerivedFrom_;
		return this;
	}


	final public AssetAdministrationShellBuilder _assetAdministrationShellSecurity_(Security _assetAdministrationShellSecurity_) {
		this.assetAdministrationShellImpl._assetAdministrationShellSecurity = _assetAdministrationShellSecurity_;
		return this;
	}


	final public AssetAdministrationShellBuilder _assetAdministrationShellSubmodel_(java.util.ArrayList<? extends Submodel> _assetAdministrationShellSubmodel_) {
		this.assetAdministrationShellImpl._assetAdministrationShellSubmodel = _assetAdministrationShellSubmodel_;
		return this;
	}


	final public AssetAdministrationShellBuilder _assetAdministrationShellView_(java.util.ArrayList<? extends View> _assetAdministrationShellView_) {
		this.assetAdministrationShellImpl._assetAdministrationShellView = _assetAdministrationShellView_;
		return this;
	}


	final public AssetAdministrationShellBuilder _hasDataSpecificationDataSpecification_(java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this.assetAdministrationShellImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public AssetAdministrationShellBuilder _identifiableAdministration_(AdministrativeInformation _identifiableAdministration_) {
		this.assetAdministrationShellImpl._identifiableAdministration = _identifiableAdministration_;
		return this;
	}


	final public AssetAdministrationShellBuilder _identifiableIdentification_(Identifier _identifiableIdentification_) {
		this.assetAdministrationShellImpl._identifiableIdentification = _identifiableIdentification_;
		return this;
	}


	final public AssetAdministrationShellBuilder _referableReferableCategory_(java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this.assetAdministrationShellImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public AssetAdministrationShellBuilder _referableDescription_(java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this.assetAdministrationShellImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public AssetAdministrationShellBuilder _referableDisplayName_(de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this.assetAdministrationShellImpl._referableDisplayName = _referableDisplayName_;
		return this;
	}


	final public AssetAdministrationShellBuilder _referableIdShort_(String _referableIdShort_) {
		this.assetAdministrationShellImpl._referableIdShort = _referableIdShort_;
		return this;
	}


	final public AssetAdministrationShellBuilder _referableParent_(URI _referableParent_) {
		this.assetAdministrationShellImpl._referableParent = _referableParent_;
		return this;
	}

	public final AssetAdministrationShell build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(assetAdministrationShellImpl);
		return assetAdministrationShellImpl;
	}
}
