package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
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

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * The value of the property instance. Constraint AASd-052b: If the semanticId of a
     * MultiLanguageProperty references a ConceptDescription then the ConceptDescription/category shall
     * be one of following values: PROPERTY. Constraint AASd-012: If both, the
     * MultiLanguageProperty/value and the MultiLanguageProperty/valueId are present then for each
     * string in a specific language the meaning must be the same as specified in
     * MultiLanguageProperty/valueId. Constraint AASd-067: If the semanticId of a MultiLanguageProperty
     * references a ConceptDescription then DataSpecificationIEC61360/dataType shall be
     * STRING_TRANSLATABLE.
     * 
     * @return Returns the List of LangStrings for the property values. More information under
     *         https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/value
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/value")
    public List<LangString> getValues();

    /**
     * The value of the property instance. Constraint AASd-052b: If the semanticId of a
     * MultiLanguageProperty references a ConceptDescription then the ConceptDescription/category shall
     * be one of following values: PROPERTY. Constraint AASd-012: If both, the
     * MultiLanguageProperty/value and the MultiLanguageProperty/valueId are present then for each
     * string in a specific language the meaning must be the same as specified in
     * MultiLanguageProperty/valueId. Constraint AASd-067: If the semanticId of a MultiLanguageProperty
     * references a ConceptDescription then DataSpecificationIEC61360/dataType shall be
     * STRING_TRANSLATABLE.
     * 
     * @param values desired value for the property values. More information under
     *        https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/value
     */
    public void setValues(List<LangString> values);

    /**
     * Reference to the global unqiue id of a coded value.
     * 
     * @return Returns the Reference for the property valueId. More information under
     *         https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/valueId
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/valueId")
    public Reference getValueId();

    /**
     * Reference to the global unqiue id of a coded value.
     * 
     * @param valueId desired value for the property valueId. More information under
     *        https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/valueId
     */
    public void setValueId(Reference valueId);

}
