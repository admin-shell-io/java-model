package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Formula")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface FormulaMixin {
    @JsonProperty("dependsOn")
    public List<Reference> getDependsOns();

    @JsonProperty("dependsOn")
    public void setDependsOns(List<Reference> dependsOns);
}
