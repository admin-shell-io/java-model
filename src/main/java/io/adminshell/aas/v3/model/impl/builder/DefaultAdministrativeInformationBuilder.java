package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DefaultAdministrativeInformationBuilder<T extends AdministrativeInformation, B extends DefaultAdministrativeInformationBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for version
     * 
     * @param version desired value to be set
     * @return Builder object with new value for version
     */
    public B version(String version) {
        getBuildingInstance().setVersion(version);
        return getSelf();
    }

    /**
     * This function allows setting a value for revision
     * 
     * @param revision desired value to be set
     * @return Builder object with new value for revision
     */
    public B revision(String revision) {
        getBuildingInstance().setRevision(revision);
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
}
