package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public class DefaultAdministrativeInformationBuilder extends AbstractBuilder<DefaultAdministrativeInformation> {

    public DefaultAdministrativeInformationBuilder() {
        super();
    }

    public DefaultAdministrativeInformationBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for versions
     * 
     * @param versions desired value to be set
     * @return Builder object with new value for versions
     */
    public DefaultAdministrativeInformationBuilder versions(List<String> versions) {
        this.map.put("versions", versions);
        return this;
    }

    /**
     * This function allows setting a value for revisions
     * 
     * @param revisions desired value to be set
     * @return Builder object with new value for revisions
     */
    public DefaultAdministrativeInformationBuilder revisions(List<String> revisions) {
        this.map.put("revisions", revisions);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultAdministrativeInformation build() {
        DefaultAdministrativeInformation defaultAdministrativeInformation =
            Util.fillInstanceFromMap(new DefaultAdministrativeInformation(), this.map);
        return defaultAdministrativeInformation;
    }
}
