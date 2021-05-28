package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("AssetAdministrationShell")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface AssetAdministrationShellMixin {
    @JsonProperty("assetInformation")
    public List<AssetInformation> getAssetInformations();

    @JsonProperty("assetInformation")
    public void setAssetInformations(List<AssetInformation> assetInformations);

    @JsonProperty("submodel")
    public List<Submodel> getSubmodels();

    @JsonProperty("submodel")
    public void setSubmodels(List<Submodel> submodels);
}
