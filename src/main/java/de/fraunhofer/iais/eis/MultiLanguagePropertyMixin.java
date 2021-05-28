package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("MultiLanguageProperty")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface MultiLanguagePropertyMixin {
    @JsonProperty("value")
    public List<LangString> getValues();

    @JsonProperty("value")
    public void setValues(List<LangString> values);

}
