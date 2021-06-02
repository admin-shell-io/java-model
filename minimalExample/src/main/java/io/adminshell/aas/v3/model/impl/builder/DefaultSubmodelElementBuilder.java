package io.adminshell.aas.v3.model.impl.builder;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public class DefaultSubmodelElementBuilder extends AbstractBuilder<DefaultSubmodelElement> {

    public DefaultSubmodelElementBuilder() {
        super();
    }

    public DefaultSubmodelElementBuilder(Builder<? extends ModelClass> builder) {
        super(builder);
    }

    /**
     * This function takes the values that were set previously via the other functions of this class and
     * turns them into a Java bean.
     * 
     * @return Bean with specified values
     */
    final public DefaultSubmodelElement build() {
        DefaultSubmodelElement defaultSubmodelElement = Util.fillInstanceFromMap(new DefaultSubmodelElement(), this.map);
        return defaultSubmodelElement;
    }
}
