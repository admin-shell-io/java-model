package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("PolicyInformationPoints")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface PolicyInformationPointsMixin {

    @JsonProperty("internalInformationPoint")
    public List<Submodel> getInternalInformationPoints();

    @JsonProperty("internalInformationPoint")
    public void setInternalInformationPoints(List<Submodel> internalInformationPoints);
}
