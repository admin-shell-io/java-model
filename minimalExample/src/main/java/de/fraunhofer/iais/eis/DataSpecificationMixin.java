package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("DataSpecification")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface DataSpecificationMixin {
    @JsonProperty("dataSpecificationContent")
    public List<DataSpecificationContent> getDataSpecificationContents();

    @JsonProperty("dataSpecificationContent")
    public void setDataSpecificationContents(List<DataSpecificationContent> dataSpecificationContents);
}
