package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Multi Language Property" "A property is a data element that has a multi language value."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultMultiLanguageProperty.class)
})
public interface MultiLanguageProperty extends ModelClass, DataElement {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "The value of the property instance."@en "Constraint AASd-052b: If the semanticId of a
     * MultiLanguageProperty references a ConceptDescription then the ConceptDescription/category shall
     * be one of following values: PROPERTY."@en "Constraint AASd-012: If both, the
     * MultiLanguageProperty/value and the MultiLanguageProperty/valueId are present then for each
     * string in a specific language the meaning must be the same as specified in
     * MultiLanguageProperty/valueId."@en "Constraint AASd-067: If the semanticId of a
     * MultiLanguageProperty references a ConceptDescription then DataSpecificationIEC61360/dataType
     * shall be STRING_TRANSLATABLE."@en
     * 
     * @return Returns the List of LangStrings for the property values. More information under
     *         https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/value
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/value")
    public List<LangString> getValues();

    /**
     * "The value of the property instance."@en "Constraint AASd-052b: If the semanticId of a
     * MultiLanguageProperty references a ConceptDescription then the ConceptDescription/category shall
     * be one of following values: PROPERTY."@en "Constraint AASd-012: If both, the
     * MultiLanguageProperty/value and the MultiLanguageProperty/valueId are present then for each
     * string in a specific language the meaning must be the same as specified in
     * MultiLanguageProperty/valueId."@en "Constraint AASd-067: If the semanticId of a
     * MultiLanguageProperty references a ConceptDescription then DataSpecificationIEC61360/dataType
     * shall be STRING_TRANSLATABLE."@en
     * 
     * @param values desired value for the property values. More information under
     *        https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/value
     */
    public void setValues(List<LangString> values);

    /**
     * "Reference to the global unqiue id of a coded value."@en
     * 
     * @return Returns the List of References for the property valueIds. More information under
     *         https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/valueId
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/valueId")
    public List<Reference> getValueIds();

    /**
     * "Reference to the global unqiue id of a coded value."@en
     * 
     * @param valueIds desired value for the property valueIds. More information under
     *        https://admin-shell.io/aas/3/0/RC01/MultiLanguageProperty/valueId
     */
    public void setValueIds(List<Reference> valueIds);

}
