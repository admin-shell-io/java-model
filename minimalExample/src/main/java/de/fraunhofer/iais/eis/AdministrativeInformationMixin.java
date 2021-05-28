package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("AdministrativeInformation")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface AdministrativeInformationMixin {
    @JsonProperty("version")
    public List<String> getVersions();

    @JsonProperty("version")
    public void setVersions(List<String> versions);

    @JsonProperty("revision")
    public List<String> getRevisions();

    @JsonProperty("revision")
    public void setRevisions(List<String> revisions);
}
