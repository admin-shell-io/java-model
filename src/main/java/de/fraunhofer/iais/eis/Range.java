package de.fraunhofer.iais.eis;




import de.fraunhofer.iais.eis.util.*;

/**
 * "Range" "An element that is referable by its idShort. This id is not globally unique. This id is
 * unique within the name space of the element."@en "Constraint AASd-053: The semanticId of a Range
 * submodel element shall only reference a ConceptDescription with the category PROPERTY."@en
 * "Constraint AASd-068: If the semanticId of a Range references a ConceptDescription then
 * DataSpecificationIEC61360/dataType shall be a numerical one, i.e. REAL_* or RATIONAL_*."@en
 * "Constraint AASd-069: If the semanticId of a Range references a ConceptDescription then
 * DataSpecificationIEC61360/levelType shall be identical to the set {Min,Max}."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultRange.class)
})
public interface Range extends ModelClass, DataElement {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Data type of the min and max."@en
     * 
     * @return Returns the String for the property valueType. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Range/valueType
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/valueType")
    public String getValueType();

    /**
     * "The maximum value of the range."@en
     * 
     * @return Returns the String for the property max. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Range/max
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/max")
    public String getMax();

    /**
     * "The minimum value of the range."@en
     * 
     * @return Returns the String for the property min. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Range/min
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/min")
    public String getMin();

}
