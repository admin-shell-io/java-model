package io.adminshell.aas.v3.model.impl.builder;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public class DefaultPolicyAdministrationPointBuilder extends AbstractBuilder<DefaultPolicyAdministrationPoint> {

    public DefaultPolicyAdministrationPointBuilder() {
        super();
    }

    public DefaultPolicyAdministrationPointBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for localAccessControl
     * 
     * @param localAccessControl desired value to be set
     * @return Builder object with new value for localAccessControl
     */
    public DefaultPolicyAdministrationPointBuilder localAccessControl(AccessControl localAccessControl) {
        this.map.put("localAccessControl", localAccessControl);
        return this;
    }

    /**
     * This function allows setting a value for externalAccessControl
     * 
     * @param externalAccessControl desired value to be set
     * @return Builder object with new value for externalAccessControl
     */
    public DefaultPolicyAdministrationPointBuilder externalAccessControl(boolean externalAccessControl) {
        this.map.put("externalAccessControl", externalAccessControl);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultPolicyAdministrationPoint build() {
        DefaultPolicyAdministrationPoint defaultPolicyAdministrationPoint =
            Util.fillInstanceFromMap(new DefaultPolicyAdministrationPoint(), this.map);
        return defaultPolicyAdministrationPoint;
    }
}
