package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DefaultIdentifiableBuilder<T extends Identifiable, B extends DefaultIdentifiableBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for administrations
     * 
     * @param administrations desired value to be set
     * @return Builder object with new value for administrations
     */
    public B administrations(List<AdministrativeInformation> administrations) {
        getBuildingInstance().setAdministrations(administrations);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List administrations
     * 
     * @param administration desired value to be added
     * @return Builder object with new value for administrations
     */
    public B administration(AdministrativeInformation administration) {
        getBuildingInstance().getAdministrations().add(administration);
        return getSelf();
    }

    /**
     * This function allows setting a value for identifications
     * 
     * @param identifications desired value to be set
     * @return Builder object with new value for identifications
     */
    public B identifications(List<Identifier> identifications) {
        getBuildingInstance().setIdentifications(identifications);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List identifications
     * 
     * @param identification desired value to be added
     * @return Builder object with new value for identifications
     */
    public B identification(Identifier identification) {
        getBuildingInstance().getIdentifications().add(identification);
        return getSelf();
    }
}
