package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("DataSpecificationIEC61360")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface DataSpecificationIEC61360Mixin {
    @JsonProperty("dataType")
    public List<DataTypeIEC61360> getDataTypes();

    @JsonProperty("dataType")
    public void setDataTypes(List<DataTypeIEC61360> dataTypes);

    @JsonProperty("definition")
    public List<LangStringSet> getDefinitions();

    @JsonProperty("definition")
    public void setDefinitions(List<LangStringSet> definitions);

    @JsonProperty("shortName")
    public List<LangStringSet> getShortNames();

    @JsonProperty("shortName")
    public void setShortNames(List<LangStringSet> shortNames);

    @JsonProperty("preferredName")
    public List<LangStringSet> getPreferredNames();

    @JsonProperty("preferredName")
    public void setPreferredNames(List<LangStringSet> preferredNames);

    @JsonProperty("sourceOfDefinition")
    public List<String> getSourceOfDefinitions();

    @JsonProperty("sourceOfDefinition")
    public void setSourceOfDefinitions(List<String> sourceOfDefinitions);

    @JsonProperty("unit")
    public List<String> getUnits();

    @JsonProperty("unit")
    public void setUnits(List<String> units);

    @JsonProperty("unitId")
    public List<Reference> getUnitIds();

    @JsonProperty("unitId")
    public void setUnitIds(List<Reference> unitIds);
}
