package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ObjectAttributes")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface ObjectAttributesMixin {
    @JsonProperty("objectAttribute")
    public List<Reference> getObjectAttributes();

    @JsonProperty("objectAttribute")
    public void setObjectAttributes(List<Reference> objectAttributes);
}
