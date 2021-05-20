package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "Qualifier" "A qualifier is a type-value pair that makes additional statements w.r.t. the value
 * of the element."@en "Constraint AASd-063: The semanticId of a Qualifier shall only reference a
 * ConceptDescription with the category QUALIFIER."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultQualifier.class)
})
public interface Qualifier extends ModelClass, Constraint, HasSemantics {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "The qualifier type describes the type of the qualifier that is applied to the element."@en
     * 
     * @return Returns the String for the property type. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Qualifier/type
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/type")
    public String getType();

    /**
     * "Data type of the qualifier value."@en
     * 
     * @return Returns the String for the property valueType. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Qualifier/valueType
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueType")
    public String getValueType();

    /**
     * "The qualifier value is the value of the qualifier."@en "Constraint AASd-006: if both, the value
     * and the valueId are present then the value needs to be identical to the short name of the
     * referenced coded value in qualifierValueId."@en "Constraint AASd-020: The value of
     * Qualifier/value shall be consistent to the data type as defined in Qualifier/valueType."@en
     * 
     * @return Returns the String for the property value. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Qualifier/value
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/value")
    public String getValue();

    /**
     * "Reference to the global unqiue id of a coded value."@en
     * 
     * @return Returns the Reference for the property valueId. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifier/valueId")
    public Reference getValueId();

}
