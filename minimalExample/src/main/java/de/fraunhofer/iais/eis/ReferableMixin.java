package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Referable")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface ReferableMixin {
    @JsonProperty("category")
    public List<String> getCategories();

    @JsonProperty("category")
    public void setCategories(List<String> categories);

    @JsonProperty("description")
    public List<LangStringSet> getDescriptions();

    @JsonProperty("description")
    public void setDescriptions(List<LangStringSet> descriptions);

    @JsonProperty("displayName")
    public List<LangStringSet> getDisplayNames();

    @JsonProperty("displayName")
    public void setDisplayNames(List<LangStringSet> displayNames);

    @JsonProperty("idShort")
    public List<String> getIdShorts();

    @JsonProperty("idShort")
    public void setIdShorts(List<String> idShorts);
}
