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

public class AssetInformationBuilder {

	private AssetInformationImpl assetInformationImpl;

	public AssetInformationBuilder() {
		assetInformationImpl = new AssetInformationImpl();
	}

	public AssetInformationBuilder(@javax.validation.constraints.NotNull URI id) {
		this();
		assetInformationImpl.id = id;
	}

	final public AssetInformationBuilder _assetInformationAssetKind_(java.util.ArrayList<? extends AssetKind> _assetInformationAssetKind_) {
		this.assetInformationImpl._assetInformationAssetKind = _assetInformationAssetKind_;
		return this;
	}


	final public AssetInformationBuilder _assetInformationGlobalAssetId_(Reference _assetInformationGlobalAssetId_) {
		this.assetInformationImpl._assetInformationGlobalAssetId = _assetInformationGlobalAssetId_;
		return this;
	}


	final public AssetInformationBuilder _assetInformationExternalAssetId_(java.util.ArrayList<? extends IdentifierKeyValuePair> _assetInformationExternalAssetId_) {
		this.assetInformationImpl._assetInformationExternalAssetId = _assetInformationExternalAssetId_;
		return this;
	}


	final public AssetInformationBuilder _assetInformationBillOfMaterial_(java.util.ArrayList<? extends Submodel> _assetInformationBillOfMaterial_) {
		this.assetInformationImpl._assetInformationBillOfMaterial = _assetInformationBillOfMaterial_;
		return this;
	}


	final public AssetInformationBuilder _assetInformationThumbnail_(File _assetInformationThumbnail_) {
		this.assetInformationImpl._assetInformationThumbnail = _assetInformationThumbnail_;
		return this;
	}

	public final AssetInformation build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(assetInformationImpl);
		return assetInformationImpl;
	}
}
