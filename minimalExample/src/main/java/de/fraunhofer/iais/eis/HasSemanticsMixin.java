package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("semanticId")
    public List<Reference> getSemanticIds();

    @JsonProperty("semanticId")
    public void setSemanticIds(List<Reference> semanticIds);
}
