package de.fraunhofer.iais.eis;

import java.util.Collection;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("SubmodelElementCollection")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface SubmodelElementCollectionMixin {

    @JsonProperty("value")
    public Collection<SubmodelElement> getValues();

    @JsonProperty("value")
    public void setValues(Collection<SubmodelElement> values);
}
