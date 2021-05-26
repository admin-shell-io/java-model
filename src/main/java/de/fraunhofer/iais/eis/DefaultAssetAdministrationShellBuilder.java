package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

public class DefaultAssetAdministrationShellBuilder extends AbstractBuilder<DefaultAssetAdministrationShell> {

    public DefaultAssetAdministrationShellBuilder() {
        super();
    }

    public DefaultAssetAdministrationShellBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for assetInformation
     * 
     * @param assetInformation desired value to be set
     * @return Builder object with new value for assetInformation
     */
    public DefaultAssetAdministrationShellBuilder assetInformation(AssetInformation assetInformation) {
        this.map.put("assetInformation", assetInformation);
        return this;
    }

    /**
     * This function allows setting a value for derivedFrom
     * 
     * @param derivedFrom desired value to be set
     * @return Builder object with new value for derivedFrom
     */
    public DefaultAssetAdministrationShellBuilder derivedFrom(Reference derivedFrom) {
        this.map.put("derivedFrom", derivedFrom);
        return this;
    }

    /**
     * This function allows setting a value for security
     * 
     * @param security desired value to be set
     * @return Builder object with new value for security
     */
    public DefaultAssetAdministrationShellBuilder security(Security security) {
        this.map.put("security", security);
        return this;
    }

    /**
     * This function allows setting a value for submodels
     * 
     * @param submodels desired value to be set
     * @return Builder object with new value for submodels
     */
    public DefaultAssetAdministrationShellBuilder submodels(List<Reference> submodels) {
        this.map.put("submodels", submodels);
        return this;
    }

    /**
     * This function allows setting a value for views
     * 
     * @param views desired value to be set
     * @return Builder object with new value for views
     */
    public DefaultAssetAdministrationShellBuilder views(List<View> views) {
        this.map.put("views", views);
        return this;
    }

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public DefaultAssetAdministrationShellBuilder dataSpecifications(List<Reference> dataSpecifications) {
        this.map.put("dataSpecifications", dataSpecifications);
        return this;
    }

    /**
     * This function allows setting a value for administration
     * 
     * @param administration desired value to be set
     * @return Builder object with new value for administration
     */
    public DefaultAssetAdministrationShellBuilder administration(AdministrativeInformation administration) {
        this.map.put("administration", administration);
        return this;
    }

    /**
     * This function allows setting a value for identification
     * 
     * @param identification desired value to be set
     * @return Builder object with new value for identification
     */
    public DefaultAssetAdministrationShellBuilder identification(Identifier identification) {
        this.map.put("identification", identification);
        return this;
    }

    /**
     * This function allows setting a value for category
     * 
     * @param category desired value to be set
     * @return Builder object with new value for category
     */
    public DefaultAssetAdministrationShellBuilder category(String category) {
        this.map.put("category", category);
        return this;
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public DefaultAssetAdministrationShellBuilder descriptions(List<LangString> descriptions) {
        this.map.put("descriptions", descriptions);
        return this;
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public DefaultAssetAdministrationShellBuilder displayNames(List<LangString> displayNames) {
        this.map.put("displayNames", displayNames);
        return this;
    }

    /**
     * This function allows setting a value for idShort
     * 
     * @param idShort desired value to be set
     * @return Builder object with new value for idShort
     */
    public DefaultAssetAdministrationShellBuilder idShort(String idShort) {
        this.map.put("idShort", idShort);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultAssetAdministrationShell build() {
        DefaultAssetAdministrationShell defaultAssetAdministrationShell =
            Util.fillInstanceFromMap(new DefaultAssetAdministrationShell(), this.map);
        return defaultAssetAdministrationShell;
    }
}
