package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Key")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface KeyMixin {
    @JsonProperty("idType")
    public List<KeyType> getIdTypes();

    @JsonProperty("idType")
    public void setIdTypes(List<KeyType> idTypes);

    @JsonProperty("type")
    public List<KeyElements> getTypes();

    @JsonProperty("type")
    public void setTypes(List<KeyElements> types);

    @JsonProperty("value")
    public List<String> getValues();

    @JsonProperty("value")
    public void setValues(List<String> values);
}
