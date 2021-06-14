package io.adminshell.aas.v3.model.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class FileBuilder<T extends File, B extends FileBuilder<T, B>> extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for mimeTypes
     * 
     * @param mimeTypes desired value to be set
     * @return Builder object with new value for mimeTypes
     */
    public B mimeTypes(List<String> mimeTypes) {
        getBuildingInstance().setMimeTypes(mimeTypes);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List mimeTypes
     * 
     * @param mimeType desired value to be added
     * @return Builder object with new value for mimeTypes
     */
    public B mimeType(String mimeType) {
        getBuildingInstance().getMimeTypes().add(mimeType);
        return getSelf();
    }

    /**
     * This function allows setting a value for values
     * 
     * @param values desired value to be set
     * @return Builder object with new value for values
     */
    public B values(List<String> values) {
        getBuildingInstance().setValues(values);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List values
     * 
     * @param value desired value to be added
     * @return Builder object with new value for values
     */
    public B value(String value) {
        getBuildingInstance().getValues().add(value);
        return getSelf();
    }

}
