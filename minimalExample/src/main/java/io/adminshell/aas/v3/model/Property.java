package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A property is a data element that has a single value. Constraint AASd-052a: If the semanticId of
 * a Property references a ConceptDescription then the ConceptDescription/category shall be one of
 * following values: VALUE, PROPERTY. Constraint AASd-065: If the semanticId of a Property or
 * MultiLanguageProperty references a ConceptDescription with the category VALUE then the value of
 * the property is identical to DataSpecificationIEC61360/value and the valueId of the property is
 * identical to DataSpecificationIEC61360/valueId. Constraint AASd-066: If the semanticId of a
 * Property or MultiLanguageProperty references a ConceptDescription with the category PROPERTY and
 * DataSpecificationIEC61360/valueList is defined the value and valueId of the property is identical
 * to one of the value reference pair types references in the value list, i.e.
 * ValueReferencePairType/value or ValueReferencePairType/valueId, resp.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultProperty.class)
})
public interface Property {

    /**
     * Data type pf the value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Property/valueType
     *
     * @return Returns the List of Strings for the property valueTypes.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/valueType")
    List<String> getValueTypes();

    /**
     * Data type pf the value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Property/valueType
     *
     * @param valueTypes desired value for the property valueTypes.
     */
    void setValueTypes(List<String> valueTypes);

    /**
     * The value of the property instance.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Property/value
     *
     * @return Returns the List of Strings for the property values.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/value")
    List<String> getValues();

    /**
     * The value of the property instance.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Property/value
     *
     * @param values desired value for the property values.
     */
    void setValues(List<String> values);

    /**
     * Reference to the global unique id of a coded value.
     *
     * Constraint AASd-007: if both, the value and the valueId are present then the value needs to be
     * identical to the value of the referenced coded value in valueId.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Property/valueId
     *
     * @return Returns the List of References for the property valueIds.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Property/valueId")
    List<Reference> getValueIds();

    /**
     * Reference to the global unique id of a coded value.
     *
     * Constraint AASd-007: if both, the value and the valueId are present then the value needs to be
     * identical to the value of the referenced coded value in valueId.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Property/valueId
     *
     * @param valueIds desired value for the property valueIds.
     */
    void setValueIds(List<Reference> valueIds);

}
