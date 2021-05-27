package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Extensions" "Single extension of an element."@en "Constraint AASd-077: The name of an extension
 * within HasExtensions needs to be unique."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultExtension.class)
})
public interface Extension extends ModelClass, HasSemantics {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "An extension of the element."@en
     * 
     * @return Returns the List of Strings for the property names. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Extension/name
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/name")
    public List<String> getNames();

    /**
     * "An extension of the element."@en
     * 
     * @param names desired value for the property names. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Extension/name
     */
    public void setNames(List<String> names);

    /**
     * "Type of the value of the extension."@en
     * 
     * @return Returns the List of Strings for the property valueTypes. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Extension/valueType
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/valueType")
    public List<String> getValueTypes();

    /**
     * "Type of the value of the extension."@en
     * 
     * @param valueTypes desired value for the property valueTypes. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Extension/valueType
     */
    public void setValueTypes(List<String> valueTypes);

    /**
     * "Value of the extension."@en
     * 
     * @return Returns the List of Strings for the property values. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Extension/value
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/value")
    public List<String> getValues();

    /**
     * "Value of the extension."@en
     * 
     * @param values desired value for the property values. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Extension/value
     */
    public void setValues(List<String> values);

    /**
     * "Reference to an element the extension refers to."@en
     * 
     * @return Returns the List of References for the property refersTos. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Extension/refersTo
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/refersTo")
    public List<Reference> getRefersTos();

    /**
     * "Reference to an element the extension refers to."@en
     * 
     * @param refersTos desired value for the property refersTos. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Extension/refersTo
     */
    public void setRefersTos(List<Reference> refersTos);

}
