package io.adminshell.aas.v3.model.impl.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public class DefaultPermissionsPerObjectBuilder extends AbstractBuilder<DefaultPermissionsPerObject> {

    public DefaultPermissionsPerObjectBuilder() {
        super();
    }

    public DefaultPermissionsPerObjectBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function allows setting a value for object
     * 
     * @param object desired value to be set
     * @return Builder object with new value for object
     */
    public DefaultPermissionsPerObjectBuilder object(Referable object) {
        this.map.put("object", object);
        return this;
    }

    /**
     * This function allows setting a value for permissions
     * 
     * @param permissions desired value to be set
     * @return Builder object with new value for permissions
     */
    public DefaultPermissionsPerObjectBuilder permissions(List<Permission> permissions) {
        this.map.put("permissions", permissions);
        return this;
    }

    /**
     * This function allows setting a value for targetObjectAttributes
     * 
     * @param targetObjectAttributes desired value to be set
     * @return Builder object with new value for targetObjectAttributes
     */
    public DefaultPermissionsPerObjectBuilder targetObjectAttributes(ObjectAttributes targetObjectAttributes) {
        this.map.put("targetObjectAttributes", targetObjectAttributes);
        return this;
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultPermissionsPerObject build() {
        DefaultPermissionsPerObject defaultPermissionsPerObject = Util.fillInstanceFromMap(new DefaultPermissionsPerObject(), this.map);
        return defaultPermissionsPerObject;
    }
}
