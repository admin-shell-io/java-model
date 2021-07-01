package io.adminshell.aas.v3.model;




import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * An operation variable is a submodel element that is used as input or output variable of an
 * operation.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultOperationVariable.class)
})
public interface OperationVariable {

    /**
     * Describes the needed argument for an operation via a submodel element of kind=Template.
     *
     * The submodel element value of an operation variable shall be of kind=Template.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/OperationVariable/value
     *
     * @return Returns the SubmodelElement for the property value.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/OperationVariable/value")
    SubmodelElement getValue();

    /**
     * Describes the needed argument for an operation via a submodel element of kind=Template.
     *
     * The submodel element value of an operation variable shall be of kind=Template.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/OperationVariable/value
     *
     * @param value desired value for the property value.
     */
    void setValue(SubmodelElement value);

}
