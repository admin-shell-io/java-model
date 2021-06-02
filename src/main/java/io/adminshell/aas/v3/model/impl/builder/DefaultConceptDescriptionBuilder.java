package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public class DefaultConceptDescriptionBuilder extends AbstractBuilder<DefaultConceptDescription> {

    public DefaultConceptDescriptionBuilder() {
        super();
    }

    public DefaultConceptDescriptionBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for isCaseOfs
     * 
     * @param isCaseOfs desired value to be set
     * @return Builder object with new value for isCaseOfs
     */
    public DefaultConceptDescriptionBuilder isCaseOfs(List<Reference> isCaseOfs) {
        this.map.put("isCaseOfs", isCaseOfs);
        return this;
    }

    /**
     * This function allows setting a value for embeddedDataSpecifications
     * 
     * @param embeddedDataSpecifications desired value to be set
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public DefaultConceptDescriptionBuilder embeddedDataSpecifications(List<DataSpecification> embeddedDataSpecifications) {
        this.map.put("embeddedDataSpecifications", embeddedDataSpecifications);
        return this;
    }

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public DefaultConceptDescriptionBuilder dataSpecifications(List<Reference> dataSpecifications) {
        this.map.put("dataSpecifications", dataSpecifications);
        return this;
    }

    /**
     * This function allows setting a value for administration
     * 
     * @param administration desired value to be set
     * @return Builder object with new value for administration
     */
    public DefaultConceptDescriptionBuilder administration(AdministrativeInformation administration) {
        this.map.put("administration", administration);
        return this;
    }

    /**
     * This function allows setting a value for identification
     * 
     * @param identification desired value to be set
     * @return Builder object with new value for identification
     */
    public DefaultConceptDescriptionBuilder identification(Identifier identification) {
        this.map.put("identification", identification);
        return this;
    }

    /**
     * This function allows setting a value for category
     * 
     * @param category desired value to be set
     * @return Builder object with new value for category
     */
    public DefaultConceptDescriptionBuilder category(String category) {
        this.map.put("category", category);
        return this;
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public DefaultConceptDescriptionBuilder descriptions(List<LangString> descriptions) {
        this.map.put("descriptions", descriptions);
        return this;
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public DefaultConceptDescriptionBuilder displayNames(List<LangString> displayNames) {
        this.map.put("displayNames", displayNames);
        return this;
    }

    /**
     * This function allows setting a value for idShort
     * 
     * @param idShort desired value to be set
     * @return Builder object with new value for idShort
     */
    public DefaultConceptDescriptionBuilder idShort(String idShort) {
        this.map.put("idShort", idShort);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultConceptDescription build() {
        DefaultConceptDescription defaultConceptDescription = Util.fillInstanceFromMap(new DefaultConceptDescription(), this.map);
        return defaultConceptDescription;
    }
}
