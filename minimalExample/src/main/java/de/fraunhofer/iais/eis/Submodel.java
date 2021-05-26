package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Submodel" "A Submodel defines a specific aspect of the asset represented by the AAS. A submodel
 * is used to structure the virtual representation and technical functionality of an Administration
 * Shell into distinguishable parts. Each submodel refers to a well-defined domain or subject
 * matter. Submodels can become standardized and thus become submodels types. Submodels can have
 * different life-cycles."@en "Describe the different types of Data related to the I4.0 Asset"@en
 * "Constraint AASd-062: The semanticId of a Submodel shall only reference a ConceptDescription with
 * the category APPLICATION_CLASS."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSubmodel.class)
})
public interface Submodel extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "A submodel consists of zero or more submodel elements."@en
     * 
     * @return Returns the List of SubmodelElements for the property submodelElements. More information
     *         under https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement")
    public List<SubmodelElement> getSubmodelElements();

    /**
     * "A submodel consists of zero or more submodel elements."@en
     * 
     * @param submodelElements desired value for the property submodelElements. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement
     */
    public void setSubmodelElements(List<SubmodelElement> submodelElements);

}
