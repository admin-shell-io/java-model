package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Formula"
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultFormula.class)
})
public interface Formula extends ModelClass, Constraint {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "A formula may depend on referable or even external global elements - assumed that can be
     * referenced and their value may be evaluated - that are used in the logical expression."@en
     * 
     * @return Returns the List of References for the property dependsOns. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Formula/dependsOn
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Formula/dependsOn")
    public List<Reference> getDependsOns();

    /**
     * "A formula may depend on referable or even external global elements - assumed that can be
     * referenced and their value may be evaluated - that are used in the logical expression."@en
     * 
     * @param dependsOns desired value for the property dependsOns. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Formula/dependsOn
     */
    public void setDependsOns(List<Reference> dependsOns);

}
