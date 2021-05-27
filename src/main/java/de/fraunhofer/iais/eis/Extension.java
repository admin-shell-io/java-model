package de.fraunhofer.iais.eis;




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
     * @return Returns the String for the property name. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Extension/name
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/name")
    public String getName();

    /**
     * "An extension of the element."@en
     * 
     * @param name desired value for the property name. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Extension/name
     */
    public void setName(String name);

    /**
     * "Type of the value of the extension."@en
     * 
     * @return Returns the String for the property valueType. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Extension/valueType
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/valueType")
    public String getValueType();

    /**
     * "Type of the value of the extension."@en
     * 
     * @param valueType desired value for the property valueType. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Extension/valueType
     */
    public void setValueType(String valueType);

    /**
     * "Value of the extension."@en
     * 
     * @return Returns the String for the property value. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Extension/value
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/value")
    public String getValue();

    /**
     * "Value of the extension."@en
     * 
     * @param value desired value for the property value. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Extension/value
     */
    public void setValue(String value);

    /**
     * "Reference to an element the extension refers to."@en
     * 
     * @return Returns the Reference for the property refersTo. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Extension/refersTo
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Extension/refersTo")
    public Reference getRefersTo();

    /**
     * "Reference to an element the extension refers to."@en
     * 
     * @param refersTo desired value for the property refersTo. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Extension/refersTo
     */
    public void setRefersTo(Reference refersTo);

}
