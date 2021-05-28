package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("HasExtensions")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface HasExtensionsMixin {
    @JsonProperty("extension")
    public List<Extension> getExtensions();

    @JsonProperty("extension")
    public void setExtensions(List<Extension> extensions);
}
