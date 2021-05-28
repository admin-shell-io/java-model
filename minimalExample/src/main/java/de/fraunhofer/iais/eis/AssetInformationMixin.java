package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("AssetInformation")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface AssetInformationMixin {
    @JsonProperty("assetKind")
    public List<AssetKind> getAssetKinds();

    @JsonProperty("assetKind")
    public void setAssetKinds(List<AssetKind> assetKinds);

    @JsonProperty("globalAssetId")
    public List<Reference> getGlobalAssetIds();

    @JsonProperty("globalAssetId")
    public void setGlobalAssetIds(List<Reference> globalAssetIds);

    @JsonProperty("specificAssetId")
    public List<IdentifierKeyValuePair> getSpecificAssetIds();

    @JsonProperty("specificAssetId")
    public void setSpecificAssetIds(List<IdentifierKeyValuePair> specificAssetIds);

    @JsonProperty("defaultThumbnail")
    public List<File> getDefaultThumbnails();

    @JsonProperty("defaultThumbnail")
    public void setDefaultThumbnails(List<File> defaultThumbnails);
}
