package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DefaultAssetAdministrationShellBuilder<T extends AssetAdministrationShell, B extends DefaultAssetAdministrationShellBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for assetInformation
     * 
     * @param assetInformation desired value to be set
     * @return Builder object with new value for assetInformation
     */
    public B assetInformation(AssetInformation assetInformation) {
        getBuildingInstance().setAssetInformation(assetInformation);
        return getSelf();
    }

    /**
     * This function allows setting a value for derivedFrom
     * 
     * @param derivedFrom desired value to be set
     * @return Builder object with new value for derivedFrom
     */
    public B derivedFrom(Reference derivedFrom) {
        getBuildingInstance().setDerivedFrom(derivedFrom);
        return getSelf();
    }

    /**
     * This function allows setting a value for security
     * 
     * @param security desired value to be set
     * @return Builder object with new value for security
     */
    public B security(Security security) {
        getBuildingInstance().setSecurity(security);
        return getSelf();
    }

    /**
     * This function allows setting a value for submodels
     * 
     * @param submodels desired value to be set
     * @return Builder object with new value for submodels
     */
    public B submodels(List<Reference> submodels) {
        getBuildingInstance().setSubmodels(submodels);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List submodels
     * 
     * @param submodel desired value to be added
     * @return Builder object with new value for submodels
     */
    public B submodel(Reference submodel) {
        getBuildingInstance().getSubmodels().add(submodel);
        return getSelf();
    }

    /**
     * This function allows setting a value for views
     * 
     * @param views desired value to be set
     * @return Builder object with new value for views
     */
    public B views(List<View> views) {
        getBuildingInstance().setViews(views);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List views
     * 
     * @param view desired value to be added
     * @return Builder object with new value for views
     */
    public B view(View view) {
        getBuildingInstance().getViews().add(view);
        return getSelf();
    }

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public B dataSpecifications(List<Reference> dataSpecifications) {
        getBuildingInstance().setDataSpecifications(dataSpecifications);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List dataSpecifications
     * 
     * @param dataSpecification desired value to be added
     * @return Builder object with new value for dataSpecifications
     */
    public B dataSpecification(Reference dataSpecification) {
        getBuildingInstance().getDataSpecifications().add(dataSpecification);
        return getSelf();
    }

    /**
     * This function allows setting a value for administration
     * 
     * @param administration desired value to be set
     * @return Builder object with new value for administration
     */
    public B administration(AdministrativeInformation administration) {
        getBuildingInstance().setAdministration(administration);
        return getSelf();
    }

    /**
     * This function allows setting a value for identification
     * 
     * @param identification desired value to be set
     * @return Builder object with new value for identification
     */
    public B identification(Identifier identification) {
        getBuildingInstance().setIdentification(identification);
        return getSelf();
    }

    /**
     * This function allows setting a value for category
     * 
     * @param category desired value to be set
     * @return Builder object with new value for category
     */
    public B category(String category) {
        getBuildingInstance().setCategory(category);
        return getSelf();
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public B descriptions(List<LangString> descriptions) {
        getBuildingInstance().setDescriptions(descriptions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List descriptions
     * 
     * @param description desired value to be added
     * @return Builder object with new value for descriptions
     */
    public B description(LangString description) {
        getBuildingInstance().getDescriptions().add(description);
        return getSelf();
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public B displayNames(List<LangString> displayNames) {
        getBuildingInstance().setDisplayNames(displayNames);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List displayNames
     * 
     * @param displayName desired value to be added
     * @return Builder object with new value for displayNames
     */
    public B displayName(LangString displayName) {
        getBuildingInstance().getDisplayNames().add(displayName);
        return getSelf();
    }

    /**
     * This function allows setting a value for idShort
     * 
     * @param idShort desired value to be set
     * @return Builder object with new value for idShort
     */
    public B idShort(String idShort) {
        getBuildingInstance().setIdShort(idShort);
        return getSelf();
    }
}
