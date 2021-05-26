package de.fraunhofer.iais.eis;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;

/**
 * "Subject Attributes" "A set of data elements that further classifies a specific subject."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultSubjectAttributes.class)
})
public interface SubjectAttributes extends ModelClass {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "A data element that further classifies a specific subject. "@en "Constraint AASs-015: The data
     * element SubjectAttributes/subjectAttribute shall be part of the submodel that is referenced
     * within the \'selectableSubjectAttributes\' attribute of \'AccessControl\'."@en
     * 
     * @return Returns the List of DataElements for the property subjectAttributes. More information
     *         under https://admin-shell.io/aas/3/0/RC01/SubjectAttributes/subjectAttribute
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/SubjectAttributes/subjectAttribute")
    public List<DataElement> getSubjectAttributes();

    /**
     * "A data element that further classifies a specific subject. "@en "Constraint AASs-015: The data
     * element SubjectAttributes/subjectAttribute shall be part of the submodel that is referenced
     * within the \'selectableSubjectAttributes\' attribute of \'AccessControl\'."@en
     * 
     * @param subjectAttributes desired value for the property subjectAttributes. More information under
     *        https://admin-shell.io/aas/3/0/RC01/SubjectAttributes/subjectAttribute
     */
    public void setSubjectAttributes(List<DataElement> subjectAttributes);

}
