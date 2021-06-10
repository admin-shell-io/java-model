package io.adminshell.aas.v3.model;

import java.util.Collection;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Submodel Element Collection" "A submodel element collection is a set or list of submodel
 * elements."@en "Constraint AASd-059: If the semanticId of a SubmodelElementCollection references a
 * ConceptDescription then the category of the ConceptDescription shall be COLLECTION or ENTITY."@en
 * "Constraint AASd-092: If the semanticId of a SubmodelElementCollection with
 * SubmodelElementCollection/allowDuplicates == false references a ConceptDescription then the
 * ConceptDescription/category shall be ENTITY."@en "Constraint AASd-093: If the semanticId of a
 * SubmodelElementCollection with SubmodelElementCollection/allowDuplicates == true references a
 * ConceptDescription then the ConceptDescription/category shall be COLLECTION."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSubmodelElementCollection.class)
})
public interface SubmodelElementCollection extends SubmodelElement {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "If allowDuplicates=true then it is allowed that the collection contains the same element several
     * times. Default = false"@en "Constraint AASd-026: If allowDuplicates==false then it is not allowed
     * that the collection contains several elements with the same semantics (i.e. the same
     * semanticId)."@en
     * 
     * @return Returns the boolean for the property allowDuplicates. More information under
     *         https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates")
    public boolean getAllowDuplicates();

    /**
     * "If allowDuplicates=true then it is allowed that the collection contains the same element several
     * times. Default = false"@en "Constraint AASd-026: If allowDuplicates==false then it is not allowed
     * that the collection contains several elements with the same semantics (i.e. the same
     * semanticId)."@en
     * 
     * @param allowDuplicates desired value for the property allowDuplicates. More information under
     *        https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/allowDuplicates
     */
    public void setAllowDuplicates(boolean allowDuplicates);

    /**
     * "If ordered=false then the elements in the property collection are not ordered. If ordered=true
     * then the elements in the collection are ordered. Default = false"@en
     * 
     * @return Returns the boolean for the property ordered. More information under
     *         https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered")
    public boolean getOrdered();

    /**
     * "If ordered=false then the elements in the property collection are not ordered. If ordered=true
     * then the elements in the collection are ordered. Default = false"@en
     * 
     * @param ordered desired value for the property ordered. More information under
     *        https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/ordered
     */
    public void setOrdered(boolean ordered);

    /**
     * "Submodel element contained in the collection."@en
     * 
     * @return Returns the Collection of SubmodelElements for the property values. More information
     *         under https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value")
    public Collection<SubmodelElement> getValues();

    /**
     * "Submodel element contained in the collection."@en
     * 
     * @param values desired value for the property values. More information under
     *        https://admin-shell.io/aas/3/0/RC01/SubmodelElementCollection/value
     */
    public void setValues(Collection<SubmodelElement> values);

}
