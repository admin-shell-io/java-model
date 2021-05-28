package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Property")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface PropertyMixin {
    @JsonProperty("valueType")
    public List<String> getValueTypes();

    @JsonProperty("valueType")
    public void setValueTypes(List<String> valueTypes);

    @JsonProperty("value")
    public List<String> getValues();

    @JsonProperty("value")
    public void setValues(List<String> values);

    @JsonProperty("valueId")
    public List<Reference> getValueIds();

    @JsonProperty("valueId")
    public void setValueIds(List<Reference> valueIds);
}
