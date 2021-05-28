package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("View")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface ViewMixin {
    @JsonProperty("containedElement")
    public List<Reference> getContainedElements();

    @JsonProperty("containedElement")
    public void setContainedElements(List<Reference> containedElements);
}
