package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Reference")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface ReferenceMixin {
    @JsonProperty("key")
    public List<Key> getKeys();

    @JsonProperty("key")
    public void setKeys(List<Key> keys);
}
