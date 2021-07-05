package io.adminshell.aas.v3.model;

import io.adminshell.aas.v3.model.annotations.KnownSubtypes;
import io.adminshell.aas.v3.model.annotations.IRI;
import java.util.List;

import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultFormula.class)
})
public interface Formula extends Constraint {

    /**
     * A formula may depend on referable or even external global elements -
     * assumed that can be referenced and their value may be evaluated - that
     * are used in the logical expression.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/Formula/dependsOn
     *
     * @return Returns the List of References for the property dependsOns.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Formula/dependsOn")
    List<Reference> getDependsOns();

    /**
     * A formula may depend on referable or even external global elements -
     * assumed that can be referenced and their value may be evaluated - that
     * are used in the logical expression.
     *
     * More information under
     * https://admin-shell.io/aas/3/0/RC01/Formula/dependsOn
     *
     * @param dependsOns desired value for the property dependsOns.
     */
    void setDependsOns(List<Reference> dependsOns);

}
