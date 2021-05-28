package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("DataSpecificationIEC61360")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface DataSpecificationIEC61360Mixin {

    @JsonProperty("definition")
    public List<LangString> getDefinitions();

    @JsonProperty("definition")
    public void setDefinitions(List<LangString> definitions);

    @JsonProperty("levelType")
    public List<LevelType> getLevelTypes();

    @JsonProperty("levelType")
    public void setLevelTypes(List<LevelType> levelTypes);

    @JsonProperty("preferredName")
    public List<LangString> getPreferredNames();

    @JsonProperty("preferredName")
    public void setPreferredNames(List<LangString> preferredNames);

    @JsonProperty("shortName")
    public List<LangString> getShortNames();

    @JsonProperty("shortName")
    public void setShortNames(List<LangString> shortNames);

}
