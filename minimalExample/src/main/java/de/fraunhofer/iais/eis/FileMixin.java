package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("File")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface FileMixin {
    @JsonProperty("mimeType")
    public List<String> getMimeTypes();

    @JsonProperty("mimeType")
    public void setMimeTypes(List<String> mimeTypes);

    @JsonProperty("value")
    public List<String> getValues();

    @JsonProperty("value")
    public void setValues(List<String> values);
}
