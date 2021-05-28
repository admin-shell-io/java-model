package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("AssetInformation")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface AssetInformationMixin {

    @JsonProperty("specificAssetId")
    public List<IdentifierKeyValuePair> getSpecificAssetIds();

    @JsonProperty("specificAssetId")
    public void setSpecificAssetIds(List<IdentifierKeyValuePair> specificAssetIds);

    @JsonProperty("billOfMaterial")
    public List<Submodel> getBillOfMaterials();

    @JsonProperty("billOfMaterial")
    public void setBillOfMaterials(List<Submodel> billOfMaterials);

}
