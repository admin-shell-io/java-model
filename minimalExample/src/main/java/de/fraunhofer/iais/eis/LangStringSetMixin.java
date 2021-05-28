package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("LangStringSet")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface LangStringSetMixin {
    @JsonProperty("langString")
    public List<LangString> getLangStrings();

    @JsonProperty("langString")
    public void setLangStrings(List<LangString> langStrings);
}
