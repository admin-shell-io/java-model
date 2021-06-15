package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of AssetAdministrationShell
 * 
 * Describes the Administration Shell for Assets, Products, Components, e.g. Machines
 */

public class DefaultAssetAdministrationShell implements AssetAdministrationShell {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * Meta information about the asset the AAS is representing.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation")
    protected AssetInformation assetInformation;

    /**
     * This relation connects instances of AAS with their respective types. Refer to Asset Kind for
     * further information of instance and type kinds.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom")
    protected Reference derivedFrom;

    /**
     * Definition of the security relevant aspects of the AAS.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security")
    protected Security security;

    /**
     * Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
    protected List<Reference> submodels = new ArrayList<>();

    /**
     * Points to the differents views associated to the Administration Shell via the Submodels.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view")
    protected List<View> views = new ArrayList<>();

    /**
     * Global reference to the data specification template used by the element.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
    protected List<Reference> dataSpecifications = new ArrayList<>();

    /**
     * Administrative information of an identifiable element. Some of the administrative information
     * like the version number might need to be part of the identification.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
    protected AdministrativeInformation administration;

    /**
     * The globally unique identification of the element.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
    protected Identifier identification;

    /**
     * The category is a value that gives further meta information w.r.t. to the class of the element.
     * It affects the expected existence of attributes and the applicability of constraints.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    protected String category;

    /**
     * Description or comments on the element. The description can be provided in several languages.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    protected List<LangString> descriptions = new ArrayList<>();

    /**
     * Display name. Can be provided in several languages.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    protected List<LangString> displayNames = new ArrayList<>();

    /**
     * Identifying string of the element within its name space. Constraint AASd-002: idShort shall only
     * feature letters, digits, underscore ('_'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+.
     * Constraint AASd-003: idShort shall be matched case-insensitive. Constraint AASd-022: idShort of
     * non-identifiable referables shall be unqiue in its namespace. Note: In case the element is a
     * property and the property has a semantic definition (HasSemantics) the idShort is typically
     * identical to the short name in English. Note: In case of an identifiable element idShort is
     * optional but recommended to be defined. It can be used for unique reference in its name space and
     * thus allows better usability and a more performant implementation. In this case it is similar to
     * the 'BrowserPath' in OPC UA.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    protected String idShort;

    public DefaultAssetAdministrationShell() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.assetInformation,
            this.derivedFrom,
            this.security,
            this.submodels,
            this.views,
            this.dataSpecifications,
            this.administration,
            this.identification,
            this.category,
            this.descriptions,
            this.displayNames,
            this.idShort});
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultAssetAdministrationShell other = (DefaultAssetAdministrationShell) obj;
            return Objects.equals(this.assetInformation, other.assetInformation) &&
                Objects.equals(this.derivedFrom, other.derivedFrom) &&
                Objects.equals(this.security, other.security) &&
                Objects.equals(this.submodels, other.submodels) &&
                Objects.equals(this.views, other.views) &&
                Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
                Objects.equals(this.administration, other.administration) &&
                Objects.equals(this.identification, other.identification) &&
                Objects.equals(this.category, other.category) &&
                Objects.equals(this.descriptions, other.descriptions) &&
                Objects.equals(this.displayNames, other.displayNames) &&
                Objects.equals(this.idShort, other.idShort);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation")
    final public AssetInformation getAssetInformation() {
        return assetInformation;
    }

    final public void setAssetInformation(AssetInformation assetInformation) {
        this.assetInformation = assetInformation;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom")
    final public Reference getDerivedFrom() {
        return derivedFrom;
    }

    final public void setDerivedFrom(Reference derivedFrom) {
        this.derivedFrom = derivedFrom;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security")
    final public Security getSecurity() {
        return security;
    }

    final public void setSecurity(Security security) {
        this.security = security;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
    final public List<Reference> getSubmodels() {
        return submodels;
    }

    final public void setSubmodels(List<Reference> submodels) {
        this.submodels = submodels;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view")
    final public List<View> getViews() {
        return views;
    }

    final public void setViews(List<View> views) {
        this.views = views;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
    final public List<Reference> getDataSpecifications() {
        return dataSpecifications;
    }

    final public void setDataSpecifications(List<Reference> dataSpecifications) {
        this.dataSpecifications = dataSpecifications;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/administration")
    final public AdministrativeInformation getAdministration() {
        return administration;
    }

    final public void setAdministration(AdministrativeInformation administration) {
        this.administration = administration;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifiable/identification")
    final public Identifier getIdentification() {
        return identification;
    }

    final public void setIdentification(Identifier identification) {
        this.identification = identification;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    final public String getCategory() {
        return category;
    }

    final public void setCategory(String category) {
        this.category = category;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    final public List<LangString> getDescriptions() {
        return descriptions;
    }

    final public void setDescriptions(List<LangString> descriptions) {
        this.descriptions = descriptions;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    final public List<LangString> getDisplayNames() {
        return displayNames;
    }

    final public void setDisplayNames(List<LangString> displayNames) {
        this.displayNames = displayNames;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    final public String getIdShort() {
        return idShort;
    }

    final public void setIdShort(String idShort) {
        this.idShort = idShort;
    }

    public static class Builder extends AssetAdministrationShellBuilder<DefaultAssetAdministrationShell, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultAssetAdministrationShell newBuildingInstance() {
            return new DefaultAssetAdministrationShell();
        }
    }
}
