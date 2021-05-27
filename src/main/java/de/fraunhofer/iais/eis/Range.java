package de.fraunhofer.iais.eis;

import java.util.List;



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
     * @return Returns the List of Strings for the property valueTypes. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Range/valueType
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/valueType")
    public List<String> getValueTypes();

    /**
     * "Data type of the min and max."@en
     * 
     * @param valueTypes desired value for the property valueTypes. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Range/valueType
     */
    public void setValueTypes(List<String> valueTypes);

    /**
     * "The maximum value of the range."@en
     * 
     * @return Returns the List of Strings for the property maxs. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Range/max
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/max")
    public List<String> getMaxs();

    /**
     * "The maximum value of the range."@en
     * 
     * @param maxs desired value for the property maxs. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Range/max
     */
    public void setMaxs(List<String> maxs);

    /**
     * "The minimum value of the range."@en
     * 
     * @return Returns the List of Strings for the property mins. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Range/min
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/min")
    public List<String> getMins();

    /**
     * "The minimum value of the range."@en
     * 
     * @param mins desired value for the property mins. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Range/min
     */
    public void setMins(List<String> mins);

}
