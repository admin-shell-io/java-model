package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * An element that is referable by its idShort. This id is not globally unique. This id is unique
 * within the name space of the element.
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultReferable.class)
})
public interface Referable {

    /**
     * The category is a value that gives further meta information w.r.t. to the class of the element.
     * It affects the expected existence of attributes and the applicability of constraints.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Referable/category
     *
     * @return Returns the List of Strings for the property categories.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    public List<String> getCategories();

    /**
     * The category is a value that gives further meta information w.r.t. to the class of the element.
     * It affects the expected existence of attributes and the applicability of constraints.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Referable/category
     *
     * @param categories desired value for the property categories.
     */
    public void setCategories(List<String> categories);

    /**
     * Description or comments on the element. The description can be provided in several languages.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Referable/description
     *
     * @return Returns the List of LangStringSets for the property descriptions.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    public List<LangStringSet> getDescriptions();

    /**
     * Description or comments on the element. The description can be provided in several languages.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Referable/description
     *
     * @param descriptions desired value for the property descriptions.
     */
    public void setDescriptions(List<LangStringSet> descriptions);

    /**
     * Display name. Can be provided in several languages.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Referable/displayName
     *
     * @return Returns the List of LangStringSets for the property displayNames.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    public List<LangStringSet> getDisplayNames();

    /**
     * Display name. Can be provided in several languages.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Referable/displayName
     *
     * @param displayNames desired value for the property displayNames.
     */
    public void setDisplayNames(List<LangStringSet> displayNames);

    /**
     * Identifying string of the element within its name space. Constraint AASd-002: idShort shall only
     * feature letters, digits, underscore ('_'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+.
     * Constraint AASd-003: idShort shall be matched case-insensitive. Constraint AASd-022: idShort of
     * non-identifiable referables shall be unqiue in its namespace. Note: In case the element is a
     * property and the property has a semantic definition (HasSemantics) the idShort is typically
     * identical to the short name in English. Note: In case of an identifiable element idShort is
     * optional but recommended to be defined. It can be used for unique reference in its name space and
     * thus allows better usability and a more performant implementation. In this case it is similar to
     * the 'BrowserPath' in OPC UA.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Referable/idShort
     *
     * @return Returns the List of Strings for the property idShorts.
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    public List<String> getIdShorts();

    /**
     * Identifying string of the element within its name space. Constraint AASd-002: idShort shall only
     * feature letters, digits, underscore ('_'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+.
     * Constraint AASd-003: idShort shall be matched case-insensitive. Constraint AASd-022: idShort of
     * non-identifiable referables shall be unqiue in its namespace. Note: In case the element is a
     * property and the property has a semantic definition (HasSemantics) the idShort is typically
     * identical to the short name in English. Note: In case of an identifiable element idShort is
     * optional but recommended to be defined. It can be used for unique reference in its name space and
     * thus allows better usability and a more performant implementation. In this case it is similar to
     * the 'BrowserPath' in OPC UA.
     *
     * More information under https://admin-shell.io/aas/3/0/RC01/Referable/idShort
     *
     * @param idShorts desired value for the property idShorts.
     */
    public void setIdShorts(List<String> idShorts);

}
