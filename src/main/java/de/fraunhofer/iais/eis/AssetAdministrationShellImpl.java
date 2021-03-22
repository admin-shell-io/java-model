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

/** 
	"Asset Administration Shell"

	"Describes the Administration Shell for Assets, Products, Components, e.g. Machines"@en */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:AssetAdministrationShell")
public class AssetAdministrationShellImpl implements Serializable, AssetAdministrationShell {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	@javax.validation.constraints.NotNull URI id;

	//List of all labels of this class
	@JsonIgnore
	java.util.List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Asset Administration Shell", ""));
	//List of all comments of this class
	@JsonIgnore
	java.util.List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Describes the Administration Shell for Assets, Products, Components, e.g. Machines", "en"));

	// all classes have a generic property array
	@JsonIgnore
	java.util.Map<String,Object> properties;

	// instance fields as derived from information model

	/**
	"has assetInformation"

	"Meta information about the asset the AAS is representing."@en
	*/
	@NotNull@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation", "assetAdministrationShellAssetInformation"})
	 AssetInformation _assetAdministrationShellAssetInformation;


	/**
	"was derived from"

	"This relation connects instances of AAS with their respective types. Refer to Asset Kind for further information of instance and type kinds."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom", "assetAdministrationShellDerivedFrom"})
	 Reference _assetAdministrationShellDerivedFrom;


	/**
	"has security"

	"Definition of the security relevant aspects of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security", "assetAdministrationShellSecurity"})
	 Security _assetAdministrationShellSecurity;


	/**
	"has Submodel"

	"Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset"@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel", "assetAdministrationShellSubmodel"})
	 java.util.ArrayList<? extends Submodel> _assetAdministrationShellSubmodel;


	/**
	"has View"

	"Points to the differents views associated to the Administration Shell via the Submodels."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view", "assetAdministrationShellView"})
	 java.util.ArrayList<? extends View> _assetAdministrationShellView;


	/**
	"has Data Specification"

	"Global reference to the data specification template used by the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification", "hasDataSpecificationDataSpecification"})
	 java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification;


	/**
	"has administration"

	"Administrative information of an identifiable element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Identifiable/administration", "identifiableAdministration"})
	 AdministrativeInformation _identifiableAdministration;


	/**
	"has identification"

	"The globally unique identification of the element."@en
	*/
	@NotNull@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Identifiable/identification", "identifiableIdentification"})
	 Identifier _identifiableIdentification;


	/**
	"has description"

	"Description or comments on the element. The description can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/description", "referableDescription"})
	 java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription;


	/**
	"has display name"

	"Display name. Can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/displayName", "referableDisplayName"})
	 de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName;


	/**
	"has short id"

	"Identifying string of the element within its name space."@en
	*/
	@NotNull@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/idShort", "referableIdShort"})
	 String _referableIdShort;


	/**
	"has parent"

	"Reference to the next referable parent element of the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/parent", "referableParent"})
	 URI _referableParent;


	/**
	"has category"

	"The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory", "referableReferableCategory"})
	 java.util.ArrayList<? extends String> _referableReferableCategory;


	// no manual construction
	AssetAdministrationShellImpl() {
		id = VocabUtil.getInstance().createRandomUrl("assetAdministrationShell");
	}

	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	public String toRdf() {
		return VocabUtil.getInstance().toRdf(this);
	}

	public java.util.List<TypedLiteral> getLabel() {
		return this.label;
	}

	public java.util.List<TypedLiteral> getComment() {
		return this.comment;
	}

	// getter and setter for generic property map
	@JsonAnyGetter
	public java.util.Map<String,Object> getProperties() {
		if (this.properties == null) return null;
		Iterator<String> iter = this.properties.keySet().iterator();
		java.util.Map<String,Object> resultset = new HashMap<String, Object>();
		while (iter.hasNext()) {
			String key = iter.next();
			resultset.put(key,urifyObjects(this.properties.get(key)));
		}
		return resultset ;
	}

	public Object urifyObjects(Object value) {
		if (value instanceof String && value.toString().startsWith("http")) {
			try {
				value = new URI(value.toString());
			} catch (Exception e) { /* do nothing */ }
		} else if (value instanceof ArrayList) {
			ArrayList<Object> result_array = new ArrayList<Object>();
			((ArrayList) value).forEach(x -> result_array.add(urifyObjects(x)));
			return result_array;
		} else if (value instanceof java.util.Map) {
			java.util.Map<String, Object> result_map = new HashMap<String, Object>();
			((java.util.Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}

	@JsonAnySetter
	public void setProperty(String property, Object value) {
	if (this.properties == null) this.properties = new java.util.HashMap<String,Object>();
	if (property.startsWith("@")) {return ;};
	this.properties.put(property, value) ;
	}
	// accessor method implementations as derived from information model

	final public 
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation")
	AssetInformation getAssetAdministrationShellAssetInformation() {
		return _assetAdministrationShellAssetInformation;
	}

	final public void setAssetAdministrationShellAssetInformation (AssetInformation _assetAdministrationShellAssetInformation_) {
		this._assetAdministrationShellAssetInformation = _assetAdministrationShellAssetInformation_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom")
	Reference getAssetAdministrationShellDerivedFrom() {
		return _assetAdministrationShellDerivedFrom;
	}

	final public void setAssetAdministrationShellDerivedFrom (Reference _assetAdministrationShellDerivedFrom_) {
		this._assetAdministrationShellDerivedFrom = _assetAdministrationShellDerivedFrom_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security")
	Security getAssetAdministrationShellSecurity() {
		return _assetAdministrationShellSecurity;
	}

	final public void setAssetAdministrationShellSecurity (Security _assetAdministrationShellSecurity_) {
		this._assetAdministrationShellSecurity = _assetAdministrationShellSecurity_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
	java.util.ArrayList<? extends Submodel> getAssetAdministrationShellSubmodel() {
		return _assetAdministrationShellSubmodel;
	}

	final public void setAssetAdministrationShellSubmodel (java.util.ArrayList<? extends Submodel> _assetAdministrationShellSubmodel_) {
		this._assetAdministrationShellSubmodel = _assetAdministrationShellSubmodel_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view")
	java.util.ArrayList<? extends View> getAssetAdministrationShellView() {
		return _assetAdministrationShellView;
	}

	final public void setAssetAdministrationShellView (java.util.ArrayList<? extends View> _assetAdministrationShellView_) {
		this._assetAdministrationShellView = _assetAdministrationShellView_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	java.util.ArrayList<? extends Reference> getHasDataSpecificationDataSpecification() {
		return _hasDataSpecificationDataSpecification;
	}

	final public void setHasDataSpecificationDataSpecification (java.util.ArrayList<? extends Reference> _hasDataSpecificationDataSpecification_) {
		this._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
	AdministrativeInformation getIdentifiableAdministration() {
		return _identifiableAdministration;
	}

	final public void setIdentifiableAdministration (AdministrativeInformation _identifiableAdministration_) {
		this._identifiableAdministration = _identifiableAdministration_;
	}

	final public 
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
	Identifier getIdentifiableIdentification() {
		return _identifiableIdentification;
	}

	final public void setIdentifiableIdentification (Identifier _identifiableIdentification_) {
		this._identifiableIdentification = _identifiableIdentification_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory")
	java.util.ArrayList<? extends String> getReferableReferableCategory() {
		return _referableReferableCategory;
	}

	final public void setReferableReferableCategory (java.util.ArrayList<? extends String> _referableReferableCategory_) {
		this._referableReferableCategory = _referableReferableCategory_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> getReferableDescription() {
		return _referableDescription;
	}

	final public void setReferableDescription (java.util.ArrayList<? extends de.fraunhofer.iais.eis.util.TypedLiteral> _referableDescription_) {
		this._referableDescription = _referableDescription_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	de.fraunhofer.iais.eis.util.TypedLiteral getReferableDisplayName() {
		return _referableDisplayName;
	}

	final public void setReferableDisplayName (de.fraunhofer.iais.eis.util.TypedLiteral _referableDisplayName_) {
		this._referableDisplayName = _referableDisplayName_;
	}

	final public 
	
	@NotNull
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	String getReferableIdShort() {
		return _referableIdShort;
	}

	final public void setReferableIdShort (String _referableIdShort_) {
		this._referableIdShort = _referableIdShort_;
	}

	final public 
	
	
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/parent")
	URI getReferableParent() {
		return _referableParent;
	}

	final public void setReferableParent (URI _referableParent_) {
		this._referableParent = _referableParent_;
	}
}
