package de.fraunhofer.iais.eis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import de.fraunhofer.iais.eis.util.*;

public class AssetAdministrationShellBuilder {

    private Map<String, Object> map;

    public AssetAdministrationShellBuilder() {
        this.map = new HashMap<>();
    }

    public AssetAdministrationShellBuilder(Map<String, Object> map) {
        this();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            this.map.put(entry.getKey(), Util.clone(entry.getValue()));
        }
    }

    /**
     * This function allows setting a value for assetInformation
     * 
     * @param assetInformation desired value to be set
     * @return Builder object with new value for assetInformation
     */
    public AssetAdministrationShellBuilder assetInformation(AssetInformation assetInformation) {
        this.map.put("assetInformation", assetInformation);
        return this;
    }

    /**
     * This function allows setting a value for derivedFrom
     * 
     * @param derivedFrom desired value to be set
     * @return Builder object with new value for derivedFrom
     */
    public AssetAdministrationShellBuilder derivedFrom(Reference derivedFrom) {
        this.map.put("derivedFrom", derivedFrom);
        return this;
    }

    /**
     * This function allows setting a value for security
     * 
     * @param security desired value to be set
     * @return Builder object with new value for security
     */
    public AssetAdministrationShellBuilder security(Security security) {
        this.map.put("security", security);
        return this;
    }

    /**
     * This function allows setting a value for submodels
     * 
     * @param submodels desired value to be set
     * @return Builder object with new value for submodels
     */
    public AssetAdministrationShellBuilder submodels(List<Reference> submodels) {
        this.map.put("submodels", submodels);
        return this;
    }

    /**
     * This function allows setting a value for views
     * 
     * @param views desired value to be set
     * @return Builder object with new value for views
     */
    public AssetAdministrationShellBuilder views(List<View> views) {
        this.map.put("views", views);
        return this;
    }

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public AssetAdministrationShellBuilder dataSpecifications(List<Reference> dataSpecifications) {
        this.map.put("dataSpecifications", dataSpecifications);
        return this;
    }

    /**
     * This function allows setting a value for administration
     * 
     * @param administration desired value to be set
     * @return Builder object with new value for administration
     */
    public AssetAdministrationShellBuilder administration(AdministrativeInformation administration) {
        this.map.put("administration", administration);
        return this;
    }

    /**
     * This function allows setting a value for identification
     * 
     * @param identification desired value to be set
     * @return Builder object with new value for identification
     */
    public AssetAdministrationShellBuilder identification(Identifier identification) {
        this.map.put("identification", identification);
        return this;
    }

    /**
     * This function allows setting a value for category
     * 
     * @param category desired value to be set
     * @return Builder object with new value for category
     */
    public AssetAdministrationShellBuilder category(String category) {
        this.map.put("category", category);
        return this;
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public AssetAdministrationShellBuilder descriptions(List<LangString> descriptions) {
        this.map.put("descriptions", descriptions);
        return this;
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public AssetAdministrationShellBuilder displayNames(List<LangString> displayNames) {
        this.map.put("displayNames", displayNames);
        return this;
    }

    /**
     * This function allows setting a value for idShort
     * 
     * @param idShort desired value to be set
     * @return Builder object with new value for idShort
     */
    public AssetAdministrationShellBuilder idShort(String idShort) {
        this.map.put("idShort", idShort);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     * @throws ConstraintViolationException This exception is thrown, if a validator is used and a
     *         violation is found.
     */
    final public AssetAdministrationShell build() throws ConstraintViolationException {
        DefaultAssetAdministrationShell defaultAssetAdministrationShell =
            Util.fillInstanceFromMap(new DefaultAssetAdministrationShell(), this.map);
        return defaultAssetAdministrationShell;
    }
}
