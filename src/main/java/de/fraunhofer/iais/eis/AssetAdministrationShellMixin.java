package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("AssetAdministrationShell")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface AssetAdministrationShellMixin {

    @JsonProperty("submodel")
    public List<Reference> getSubmodels();

    @JsonProperty("submodel")
    public void setSubmodels(List<Reference> submodels);

    @JsonProperty("view")
    public List<View> getViews();

    @JsonProperty("view")
    public void setViews(List<View> views);
}
