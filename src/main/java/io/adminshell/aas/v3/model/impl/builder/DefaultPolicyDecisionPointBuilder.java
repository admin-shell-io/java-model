package io.adminshell.aas.v3.model.impl.builder;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class DefaultPolicyDecisionPointBuilder<T extends PolicyDecisionPoint, B extends DefaultPolicyDecisionPointBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for externalPolicyDecisionPoints
     * 
     * @param externalPolicyDecisionPoints desired value to be set
     * @return Builder object with new value for externalPolicyDecisionPoints
     */
    public B externalPolicyDecisionPoints(boolean externalPolicyDecisionPoints) {
        getBuildingInstance().setExternalPolicyDecisionPoints(externalPolicyDecisionPoints);
        return getSelf();
    }
}
