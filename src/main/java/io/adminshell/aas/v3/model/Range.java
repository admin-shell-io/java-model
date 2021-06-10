package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

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
public interface Range extends DataElement {

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
     * "Data type of the min and max."@en
     * 
     * @param valueType desired value for the property valueType. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Range/valueType
     */
    public void setValueType(String valueType);

    /**
     * "The maximum value of the range."@en
     * 
     * @return Returns the String for the property max. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Range/max
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/max")
    public String getMax();

    /**
     * "The maximum value of the range."@en
     * 
     * @param max desired value for the property max. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Range/max
     */
    public void setMax(String max);

    /**
     * "The minimum value of the range."@en
     * 
     * @return Returns the String for the property min. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Range/min
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Range/min")
    public String getMin();

    /**
     * "The minimum value of the range."@en
     * 
     * @param min desired value for the property min. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Range/min
     */
    public void setMin(String min);

}
