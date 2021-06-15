package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A Submodel defines a specific aspect of the asset represented by the AAS. A submodel is used to
 * structure the virtual representation and technical functionality of an Administration Shell into
 * distinguishable parts. Each submodel refers to a well-defined domain or subject matter. Submodels
 * can become standardized and thus become submodels types. Submodels can have different
 * life-cycles. Describe the different types of Data related to the I4.0 Asset Constraint AASd-062:
 * The semanticId of a Submodel shall only reference a ConceptDescription with the category
 * APPLICATION_CLASS.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSubmodel.class)
})
public interface Submodel extends Qualifiable, HasDataSpecification, Identifiable, HasKind, HasSemantics {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * A submodel consists of zero or more submodel elements.
     * 
     * @return Returns the List of SubmodelElements for the property submodelElements. More information
     *         under https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement")
    public List<SubmodelElement> getSubmodelElements();

    /**
     * A submodel consists of zero or more submodel elements.
     * 
     * @param submodelElements desired value for the property submodelElements. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Submodel/submodelElement
     */
    public void setSubmodelElements(List<SubmodelElement> submodelElements);

}
