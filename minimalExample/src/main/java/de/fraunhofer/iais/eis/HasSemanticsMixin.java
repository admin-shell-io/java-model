package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("HasSemantics")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
@JsonSubTypes({
    @JsonSubTypes.Type(value = IdentifierKeyValuePair.class)
})
public interface HasSemanticsMixin {

}
