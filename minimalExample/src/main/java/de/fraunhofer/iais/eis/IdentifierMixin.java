package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Identifier")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface IdentifierMixin {
    @JsonProperty("identifier")
    public List<String> getIdentifiers();

    @JsonProperty("identifier")
    public void setIdentifiers(List<String> identifiers);

    @JsonProperty("idType")
    public List<IdentifierType> getIdTypes();

    @JsonProperty("idType")
    public void setIdTypes(List<IdentifierType> idTypes);
}
