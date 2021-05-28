package de.fraunhofer.iais.eis;

import java.util.Collection;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("SubmodelElementCollection")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface SubmodelElementCollectionMixin {
    @JsonProperty("allowDuplicates")
    public List<Boolean> getAllowDuplicates();

    @JsonProperty("allowDuplicates")
    public void setAllowDuplicates(List<Boolean> allowDuplicates);

    @JsonProperty("ordered")
    public List<Boolean> getOrdereds();

    @JsonProperty("ordered")
    public void setOrdereds(List<Boolean> ordereds);

    @JsonProperty("value")
    public Collection<SubmodelElement> getValues();

    @JsonProperty("value")
    public void setValues(Collection<SubmodelElement> values);
}
