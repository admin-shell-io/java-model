package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Operation" "An operation is a submodel element with input and output variables."@en "Constraint
 * AASd-060: The semanticId of a Operation submodel element shall only reference a
 * ConceptDescription with the category FUNCTION."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultOperation.class)
})
public interface Operation extends ModelClass, SubmodelElement {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Input parameter of the operation."@en
     * 
     * @return Returns the List of OperationVariables for the property inputVariables. More information
     *         under https://admin-shell.io/aas/3/0/RC01/Operation/inputVariable
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Operation/inputVariable")
    public List<OperationVariable> getInputVariables();

    /**
     * "Input parameter of the operation."@en
     * 
     * @param inputVariables desired value for the property inputVariables. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Operation/inputVariable
     */
    public void setInputVariables(List<OperationVariable> inputVariables);

    /**
     * "Parameter that is input and output of the operation."@en
     * 
     * @return Returns the List of OperationVariables for the property inoutputVariables. More
     *         information under https://admin-shell.io/aas/3/0/RC01/Operation/inoutputVariable
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Operation/inoutputVariable")
    public List<OperationVariable> getInoutputVariables();

    /**
     * "Parameter that is input and output of the operation."@en
     * 
     * @param inoutputVariables desired value for the property inoutputVariables. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Operation/inoutputVariable
     */
    public void setInoutputVariables(List<OperationVariable> inoutputVariables);

    /**
     * "Output parameter of the operation."@en
     * 
     * @return Returns the List of OperationVariables for the property outputVariables. More information
     *         under https://admin-shell.io/aas/3/0/RC01/Operation/outputVariable
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Operation/outputVariable")
    public List<OperationVariable> getOutputVariables();

    /**
     * "Output parameter of the operation."@en
     * 
     * @param outputVariables desired value for the property outputVariables. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Operation/outputVariable
     */
    public void setOutputVariables(List<OperationVariable> outputVariables);

}
