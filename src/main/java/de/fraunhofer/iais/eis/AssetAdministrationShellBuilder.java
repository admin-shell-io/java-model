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

public class AssetAdministrationShellBuilder {

	private AssetAdministrationShellImpl assetAdministrationShellImpl;

	public AssetAdministrationShellBuilder() {
		assetAdministrationShellImpl = new AssetAdministrationShellImpl();
	}

	public AssetAdministrationShellBuilder(URI id) {
		this();
		assetAdministrationShellImpl.id = id;
	}

	final public AssetAdministrationShellBuilder _assetAdministrationShellAssetInformation_(IAssetInformation _assetAdministrationShellAssetInformation_) {
		this.assetAdministrationShellImpl._assetAdministrationShellAssetInformation = _assetAdministrationShellAssetInformation_;
		return this;
	}


	final public AssetAdministrationShellBuilder _assetAdministrationShellDerivedFrom_(IReference _assetAdministrationShellDerivedFrom_) {
		this.assetAdministrationShellImpl._assetAdministrationShellDerivedFrom = _assetAdministrationShellDerivedFrom_;
		return this;
	}


	final public AssetAdministrationShellBuilder _assetAdministrationShellSecurity_(ISecurity _assetAdministrationShellSecurity_) {
		this.assetAdministrationShellImpl._assetAdministrationShellSecurity = _assetAdministrationShellSecurity_;
		return this;
	}


	final public AssetAdministrationShellBuilder _assetAdministrationShellSubmodel_(ArrayList<? extends ISubmodel> _assetAdministrationShellSubmodel_) {
		this.assetAdministrationShellImpl._assetAdministrationShellSubmodel = _assetAdministrationShellSubmodel_;
		return this;
	}


	final public AssetAdministrationShellBuilder _assetAdministrationShellView_(ArrayList<? extends IView> _assetAdministrationShellView_) {
		this.assetAdministrationShellImpl._assetAdministrationShellView = _assetAdministrationShellView_;
		return this;
	}


	final public AssetAdministrationShellBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.assetAdministrationShellImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public AssetAdministrationShellBuilder _identifiableAdministration_(IAdministrativeInformation _identifiableAdministration_) {
		this.assetAdministrationShellImpl._identifiableAdministration = _identifiableAdministration_;
		return this;
	}


	final public AssetAdministrationShellBuilder _identifiableIdentification_(IIdentifier _identifiableIdentification_) {
		this.assetAdministrationShellImpl._identifiableIdentification = _identifiableIdentification_;
		return this;
	}


	final public AssetAdministrationShellBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.assetAdministrationShellImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public AssetAdministrationShellBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.assetAdministrationShellImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public AssetAdministrationShellBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
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

	final public IAssetAdministrationShell build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(assetAdministrationShellImpl);
		return assetAdministrationShellImpl;
	}
}
