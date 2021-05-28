package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Submodel")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface SubmodelMixin {
    @JsonProperty("submodelElement")
    public List<SubmodelElement> getSubmodelElements();

    @JsonProperty("submodelElement")
    public void setSubmodelElements(List<SubmodelElement> submodelElements);
}
