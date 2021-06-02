package io.adminshell.aas.v3.model;




import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.dataformat.json.mixins.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

/**
 * "Property" "A property is a data element that has a single value."@en "Constraint AASd-052a: If
 * the semanticId of a Property references a ConceptDescription then the ConceptDescription/category
 * shall be one of following values: VALUE, PROPERTY."@en "Constraint AASd-065: If the semanticId of
 * a Property or MultiLanguageProperty references a ConceptDescription with the category VALUE then
 * the value of the property is identical to DataSpecificationIEC61360/value and the valueId of the
 * property is identical to DataSpecificationIEC61360/valueId."@en "Constraint AASd-066: If the
 * semanticId of a Property or MultiLanguageProperty references a ConceptDescription with the
 * category PROPERTY and DataSpecificationIEC61360/valueList is defined the value and valueId of the
 * property is identical to one of the value reference pair types references in the value list, i.e.
 * ValueReferencePairType/value or ValueReferencePairType/valueId, resp."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultProperty.class)
})
public interface Property extends ModelClass, DataElement {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Data type pf the value."@en
     * 
     * @return Returns the String for the property valueType. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Property/valueType
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/valueType")
    public String getValueType();

    /**
     * "Data type pf the value."@en
     * 
     * @param valueType desired value for the property valueType. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Property/valueType
     */
    public void setValueType(String valueType);

    /**
     * "The value of the property instance."@en
     * 
     * @return Returns the String for the property value. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Property/value
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/value")
    public String getValue();

    /**
     * "The value of the property instance."@en
     * 
     * @param value desired value for the property value. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Property/value
     */
    public void setValue(String value);

    /**
     * "Reference to the global unique id of a coded value."@en "Constraint AASd-007: if both, the value
     * and the valueId are present then the value needs to be identical to the value of the referenced
     * coded value in valueId."@en
     * 
     * @return Returns the Reference for the property valueId. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Property/valueId
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/valueId")
    public Reference getValueId();

    /**
     * "Reference to the global unique id of a coded value."@en "Constraint AASd-007: if both, the value
     * and the valueId are present then the value needs to be identical to the value of the referenced
     * coded value in valueId."@en
     * 
     * @param valueId desired value for the property valueId. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Property/valueId
     */
    public void setValueId(Reference valueId);

}
