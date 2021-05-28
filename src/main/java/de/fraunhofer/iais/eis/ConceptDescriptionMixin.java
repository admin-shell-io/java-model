package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ConceptDescription")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface ConceptDescriptionMixin {
    @JsonProperty("isCaseOf")
    public List<Reference> getIsCaseOfs();

    @JsonProperty("isCaseOf")
    public void setIsCaseOfs(List<Reference> isCaseOfs);

    @JsonProperty("embeddedDataSpecification")
    public List<DataSpecification> getEmbeddedDataSpecifications();

    @JsonProperty("embeddedDataSpecification")
    public void setEmbeddedDataSpecifications(List<DataSpecification> embeddedDataSpecifications);
}
