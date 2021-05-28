package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("PermissionsPerObject")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface PermissionsPerObjectMixin {

    @JsonProperty("permission")
    public List<Permission> getPermissions();

    @JsonProperty("permission")
    public void setPermissions(List<Permission> permissions);

}
