package io.adminshell.aas.v3.dataformat;

import java.util.Set;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * Validator that can validate a serialized AASEnvironment according to a specific schema.
 */
public interface SchemaValidator {

    /**
     * Validate a serialized AASEnvironment according to a specific Schema. Does not contain any
     * additional validation, but is restricted to schema validation only.
     * 
     * @param serializedAASEnvironment A string-serialized AASEnvironment.
     * @return Set of validation errors. If validation succeeds, the Set is empty.
     */
    public Set<String> validateSchema(String serializedAASEnvironment);

}
