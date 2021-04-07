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

public class AssetBuilder {

	private AssetImpl assetImpl;

	public AssetBuilder() {
		assetImpl = new AssetImpl();
	}

	public AssetBuilder(URI id) {
		this();
		assetImpl.id = id;
	}


	final public AssetBuilder _hasDataSpecificationDataSpecification_(ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this.assetImpl._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
		return this;
	}


	final public AssetBuilder _identifiableAdministration_(IAdministrativeInformation _identifiableAdministration_) {
		this.assetImpl._identifiableAdministration = _identifiableAdministration_;
		return this;
	}


	final public AssetBuilder _identifiableIdentification_(IIdentifier _identifiableIdentification_) {
		this.assetImpl._identifiableIdentification = _identifiableIdentification_;
		return this;
	}


	final public AssetBuilder _referableReferableCategory_(ArrayList<? extends String> _referableReferableCategory_) {
		this.assetImpl._referableReferableCategory = _referableReferableCategory_;
		return this;
	}


	final public AssetBuilder _referableDescription_(ArrayList<? extends TypedLiteral> _referableDescription_) {
		this.assetImpl._referableDescription = _referableDescription_;
		return this;
	}


	final public AssetBuilder _referableDisplayName_(TypedLiteral _referableDisplayName_) {
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

	final public IAsset build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(assetImpl);
		return assetImpl;
	}
}
