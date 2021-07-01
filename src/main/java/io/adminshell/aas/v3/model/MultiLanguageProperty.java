package io.adminshell.aas.v3.model;

import java.util.List;



import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * A property is a data element that has a multi language value.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultMultiLanguageProperty.class)
})
public interface MultiLanguageProperty extends DataElement {

    /**
     * The value of the property instance.
     *
     * Constraint AASd-052b: If the semanticId of a MultiLanguageProperty references a
     * ConceptDescription then the ConceptDescription/category shall be one of following values:
     * PROPERTY.
     *
     * Constraint AASd-012: If both, the MultiLanguageProperty/value and the
     * MultiLanguageProperty/valueId are present then for each string in a specific language the meaning
     * must be the same as specified in MultiLanguageProperty/valueId.
     *
     * Constraint AASd-067: If the semanticId of a MultiLanguageProperty references a ConceptDescription
     * then DataSpecificationIEC61360/dataType shall be STRING_TRANSLATABLE.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/value
     *
     * @return Returns the List of LangStrings for the property values.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/value")
    List<LangString> getValues();

    /**
     * The value of the property instance.
     *
     * Constraint AASd-052b: If the semanticId of a MultiLanguageProperty references a
     * ConceptDescription then the ConceptDescription/category shall be one of following values:
     * PROPERTY.
     *
     * Constraint AASd-012: If both, the MultiLanguageProperty/value and the
     * MultiLanguageProperty/valueId are present then for each string in a specific language the meaning
     * must be the same as specified in MultiLanguageProperty/valueId.
     *
     * Constraint AASd-067: If the semanticId of a MultiLanguageProperty references a ConceptDescription
     * then DataSpecificationIEC61360/dataType shall be STRING_TRANSLATABLE.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/value
     *
     * @param values desired value for the property values.
     */
    void setValues(List<LangString> values);

    /**
     * Reference to the global unqiue id of a coded value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/valueId
     *
     * @return Returns the Reference for the property valueId.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/valueId")
    Reference getValueId();

    /**
     * Reference to the global unqiue id of a coded value.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/valueId
     *
     * @param valueId desired value for the property valueId.
     */
    void setValueId(Reference valueId);

}
