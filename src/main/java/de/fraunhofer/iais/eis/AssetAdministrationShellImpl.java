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

/** 
* "Asset Administration Shell"
* "Describes the Administration Shell for Assets, Products, Components, e.g. Machines"@en 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonTypeName("aas:AssetAdministrationShell")
public class AssetAdministrationShellImpl implements Serializable, IAssetAdministrationShell {

	@JsonProperty("@id")
	@JsonAlias({"@id", "id"})
	protected URI id;

	//List of all labels of this class
	@JsonIgnore
	protected List<TypedLiteral> label = Arrays.asList(new TypedLiteral("Asset Administration Shell", ""));

	//List of all comments of this class
	@JsonIgnore
	protected List<TypedLiteral> comment = Arrays.asList(new TypedLiteral("Describes the Administration Shell for Assets, Products, Components, e.g. Machines", "en"));

	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has assetInformation"
	* "Meta information about the asset the AAS is representing."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation", "assetAdministrationShellAssetInformation"})
	protected IAssetInformation _assetAdministrationShellAssetInformation;


	/**
	* "was derived from"
	* "This relation connects instances of AAS with their respective types. Refer to Asset Kind for further information of instance and type kinds."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom", "assetAdministrationShellDerivedFrom"})
	protected IReference _assetAdministrationShellDerivedFrom;


	/**
	* "has security"
	* "Definition of the security relevant aspects of the AAS."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security", "assetAdministrationShellSecurity"})
	protected ISecurity _assetAdministrationShellSecurity;


	/**
	* "has Submodel"
	* "Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset"@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel", "assetAdministrationShellSubmodel"})
	protected ArrayList<? extends ISubmodel> _assetAdministrationShellSubmodel;


	/**
	* "has View"
	* "Points to the differents views associated to the Administration Shell via the Submodels."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view", "assetAdministrationShellView"})
	protected ArrayList<? extends IView> _assetAdministrationShellView;


	/**
	* "has Data Specification"
	* "Global reference to the data specification template used by the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification", "hasDataSpecificationDataSpecification"})
	protected ArrayList<? extends IReference> _hasDataSpecificationDataSpecification;


	/**
	* "has administration"
	* "Administrative information of an identifiable element."@en
	* "Some of the administrative information like the version number might need to be part of the identification."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Identifiable/administration", "identifiableAdministration"})
	protected IAdministrativeInformation _identifiableAdministration;


	/**
	* "has identification"
	* "The globally unique identification of the element."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Identifiable/identification", "identifiableIdentification"})
	protected IIdentifier _identifiableIdentification;


	/**
	* "has description"
	* "Description or comments on the element. The description can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/description", "referableDescription"})
	protected ArrayList<? extends TypedLiteral> _referableDescription;


	/**
	* "has display name"
	* "Display name. Can be provided in several languages."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/displayName", "referableDisplayName"})
	protected TypedLiteral _referableDisplayName;


	/**
	* "has short id"
	* "Identifying string of the element within its name space."@en
	* "Constraint AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+."@en
	* "Constraint AASd-003: idShort shall be matched case-insensitive."@en
	* "Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace."@en
	* "Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. "@en
	* "Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/idShort", "referableIdShort"})
	protected String _referableIdShort;


	/**
	* "has parent"
	* "Reference to the next referable parent element of the element."@en
	* "Constraint AASd-004: Add parent in case of non-identifiable elements."@en
	* "This element is used to ease navigation in the model and thus it enables more performant"@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/parent", "referableParent"})
	protected URI _referableParent;


	/**
	* "has category"
	* "The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	*/
	@JsonAlias({"https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory", "referableReferableCategory"})
	protected ArrayList<? extends String> _referableReferableCategory;


	// no manual construction
	protected AssetAdministrationShellImpl() {
		id = VocabUtil.getInstance().createRandomUrl("assetAdministrationShell");
	}

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	final public URI getId() {
		return id;
	}

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel() {
		return this.label;
	}

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment() {
		return this.comment;
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
		} else if (value instanceof Map) {
			Map<String, Object> result_map = new HashMap<String, Object>();
			((Map) value).forEach((k,v) -> result_map.put(k.toString(), urifyObjects(v)));
			return result_map;
		}
		return value;
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	/**
	* "Meta information about the asset the AAS is representing."@en
	* @return Returns the IAssetInformation for the property assetAdministrationShellAssetInformation.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation")
	final public IAssetInformation getAssetAdministrationShellAssetInformation() {
		return _assetAdministrationShellAssetInformation;
	}

	
	/**
	* "Meta information about the asset the AAS is representing."@en
	* @param _assetAdministrationShellAssetInformation_ desired value for the property assetAdministrationShellAssetInformation.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation
	*/
	final public void setAssetAdministrationShellAssetInformation (IAssetInformation _assetAdministrationShellAssetInformation_) {
		this._assetAdministrationShellAssetInformation = _assetAdministrationShellAssetInformation_;
	}

	/**
	* "This relation connects instances of AAS with their respective types. Refer to Asset Kind for further information of instance and type kinds."@en
	* @return Returns the IReference for the property assetAdministrationShellDerivedFrom.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom")
	final public IReference getAssetAdministrationShellDerivedFrom() {
		return _assetAdministrationShellDerivedFrom;
	}

	
	/**
	* "This relation connects instances of AAS with their respective types. Refer to Asset Kind for further information of instance and type kinds."@en
	* @param _assetAdministrationShellDerivedFrom_ desired value for the property assetAdministrationShellDerivedFrom.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom
	*/
	final public void setAssetAdministrationShellDerivedFrom (IReference _assetAdministrationShellDerivedFrom_) {
		this._assetAdministrationShellDerivedFrom = _assetAdministrationShellDerivedFrom_;
	}

	/**
	* "Definition of the security relevant aspects of the AAS."@en
	* @return Returns the ISecurity for the property assetAdministrationShellSecurity.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security")
	final public ISecurity getAssetAdministrationShellSecurity() {
		return _assetAdministrationShellSecurity;
	}

	
	/**
	* "Definition of the security relevant aspects of the AAS."@en
	* @param _assetAdministrationShellSecurity_ desired value for the property assetAdministrationShellSecurity.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security
	*/
	final public void setAssetAdministrationShellSecurity (ISecurity _assetAdministrationShellSecurity_) {
		this._assetAdministrationShellSecurity = _assetAdministrationShellSecurity_;
	}

	/**
	* "Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset"@en
	* @return Returns the List of ISubmodel for the property assetAdministrationShellSubmodel.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
	final public List<? extends ISubmodel> getAssetAdministrationShellSubmodel() {
		return _assetAdministrationShellSubmodel;
	}

	
	/**
	* "Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset"@en
	* @param _assetAdministrationShellSubmodel_ desired value for the property assetAdministrationShellSubmodel.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel
	*/
	final public void setAssetAdministrationShellSubmodel (ArrayList<? extends ISubmodel> _assetAdministrationShellSubmodel_) {
		this._assetAdministrationShellSubmodel = _assetAdministrationShellSubmodel_;
	}

	/**
	* "Points to the differents views associated to the Administration Shell via the Submodels."@en
	* @return Returns the List of IView for the property assetAdministrationShellView.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view")
	final public List<? extends IView> getAssetAdministrationShellView() {
		return _assetAdministrationShellView;
	}

	
	/**
	* "Points to the differents views associated to the Administration Shell via the Submodels."@en
	* @param _assetAdministrationShellView_ desired value for the property assetAdministrationShellView.
	* More information under https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view
	*/
	final public void setAssetAdministrationShellView (ArrayList<? extends IView> _assetAdministrationShellView_) {
		this._assetAdministrationShellView = _assetAdministrationShellView_;
	}

	/**
	* "Global reference to the data specification template used by the element."@en
	* @return Returns the List of IReference for the property hasDataSpecificationDataSpecification.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	final public List<? extends IReference> getHasDataSpecificationDataSpecification() {
		return _hasDataSpecificationDataSpecification;
	}

	
	/**
	* "Global reference to the data specification template used by the element."@en
	* @param _hasDataSpecificationDataSpecification_ desired value for the property hasDataSpecificationDataSpecification.
	* More information under https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification
	*/
	final public void setHasDataSpecificationDataSpecification (ArrayList<? extends IReference> _hasDataSpecificationDataSpecification_) {
		this._hasDataSpecificationDataSpecification = _hasDataSpecificationDataSpecification_;
	}

	/**
	* "Administrative information of an identifiable element."@en
	* "Some of the administrative information like the version number might need to be part of the identification."@en
	* @return Returns the IAdministrativeInformation for the property identifiableAdministration.
	* More information under https://admin-shell.io/aas/3/0/RC01/Identifiable/administration
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
	final public IAdministrativeInformation getIdentifiableAdministration() {
		return _identifiableAdministration;
	}

	
	/**
	* "Administrative information of an identifiable element."@en
	* "Some of the administrative information like the version number might need to be part of the identification."@en
	* @param _identifiableAdministration_ desired value for the property identifiableAdministration.
	* More information under https://admin-shell.io/aas/3/0/RC01/Identifiable/administration
	*/
	final public void setIdentifiableAdministration (IAdministrativeInformation _identifiableAdministration_) {
		this._identifiableAdministration = _identifiableAdministration_;
	}

	/**
	* "The globally unique identification of the element."@en
	* @return Returns the IIdentifier for the property identifiableIdentification.
	* More information under https://admin-shell.io/aas/3/0/RC01/Identifiable/identification
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
	final public IIdentifier getIdentifiableIdentification() {
		return _identifiableIdentification;
	}

	
	/**
	* "The globally unique identification of the element."@en
	* @param _identifiableIdentification_ desired value for the property identifiableIdentification.
	* More information under https://admin-shell.io/aas/3/0/RC01/Identifiable/identification
	*/
	final public void setIdentifiableIdentification (IIdentifier _identifiableIdentification_) {
		this._identifiableIdentification = _identifiableIdentification_;
	}

	/**
	* "The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	* @return Returns the List of String for the property referableReferableCategory.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory")
	final public List<? extends String> getReferableReferableCategory() {
		return _referableReferableCategory;
	}

	
	/**
	* "The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	* @param _referableReferableCategory_ desired value for the property referableReferableCategory.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory
	*/
	final public void setReferableReferableCategory (ArrayList<? extends String> _referableReferableCategory_) {
		this._referableReferableCategory = _referableReferableCategory_;
	}

	/**
	* "Description or comments on the element. The description can be provided in several languages."@en
	* @return Returns the List of TypedLiteral for the property referableDescription.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/description
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	final public List<? extends TypedLiteral> getReferableDescription() {
		return _referableDescription;
	}

	
	/**
	* "Description or comments on the element. The description can be provided in several languages."@en
	* @param _referableDescription_ desired value for the property referableDescription.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/description
	*/
	final public void setReferableDescription (ArrayList<? extends TypedLiteral> _referableDescription_) {
		this._referableDescription = _referableDescription_;
	}

	/**
	* "Display name. Can be provided in several languages."@en
	* @return Returns the TypedLiteral for the property referableDisplayName.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/displayName
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	final public TypedLiteral getReferableDisplayName() {
		return _referableDisplayName;
	}

	
	/**
	* "Display name. Can be provided in several languages."@en
	* @param _referableDisplayName_ desired value for the property referableDisplayName.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/displayName
	*/
	final public void setReferableDisplayName (TypedLiteral _referableDisplayName_) {
		this._referableDisplayName = _referableDisplayName_;
	}

	/**
	* "Identifying string of the element within its name space."@en
	* "Constraint AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+."@en
	* "Constraint AASd-003: idShort shall be matched case-insensitive."@en
	* "Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace."@en
	* "Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. "@en
	* "Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
	* @return Returns the String for the property referableIdShort.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/idShort
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	final public String getReferableIdShort() {
		return _referableIdShort;
	}

	
	/**
	* "Identifying string of the element within its name space."@en
	* "Constraint AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+."@en
	* "Constraint AASd-003: idShort shall be matched case-insensitive."@en
	* "Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace."@en
	* "Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. "@en
	* "Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
	* @param _referableIdShort_ desired value for the property referableIdShort.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/idShort
	*/
	final public void setReferableIdShort (String _referableIdShort_) {
		this._referableIdShort = _referableIdShort_;
	}

	/**
	* "Reference to the next referable parent element of the element."@en
	* "Constraint AASd-004: Add parent in case of non-identifiable elements."@en
	* "This element is used to ease navigation in the model and thus it enables more performant"@en
	* @return Returns the URI for the property referableParent.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/parent
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Referable/parent")
	final public URI getReferableParent() {
		return _referableParent;
	}

	
	/**
	* "Reference to the next referable parent element of the element."@en
	* "Constraint AASd-004: Add parent in case of non-identifiable elements."@en
	* "This element is used to ease navigation in the model and thus it enables more performant"@en
	* @param _referableParent_ desired value for the property referableParent.
	* More information under https://admin-shell.io/aas/3/0/RC01/Referable/parent
	*/
	final public void setReferableParent (URI _referableParent_) {
		this._referableParent = _referableParent_;
	}
}
