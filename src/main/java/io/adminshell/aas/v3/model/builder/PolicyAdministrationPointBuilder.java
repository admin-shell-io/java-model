package io.adminshell.aas.v3.model.builder;




import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class PolicyAdministrationPointBuilder<T extends PolicyAdministrationPoint, B extends PolicyAdministrationPointBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for localAccessControl
     * 
     * @param localAccessControl desired value to be set
     * @return Builder object with new value for localAccessControl
     */
    public B localAccessControl(AccessControl localAccessControl) {
        getBuildingInstance().setLocalAccessControl(localAccessControl);
        return getSelf();
    }

    /**
     * This function allows setting a value for externalAccessControl
     * 
     * @param externalAccessControl desired value to be set
     * @return Builder object with new value for externalAccessControl
     */
    public B externalAccessControl(boolean externalAccessControl) {
        getBuildingInstance().setExternalAccessControl(externalAccessControl);
        return getSelf();
    }
}
