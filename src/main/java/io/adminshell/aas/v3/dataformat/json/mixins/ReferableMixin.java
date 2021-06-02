package io.adminshell.aas.v3.dataformat.json.mixins;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

@JsonTypeName("Referable")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AccessPermissionRule.class),
    @JsonSubTypes.Type(value = Identifiable.class),
    @JsonSubTypes.Type(value = View.class),
    @JsonSubTypes.Type(value = SubmodelElement.class)
})
public interface ReferableMixin {

    @JsonProperty("description")
    public List<LangString> getDescriptions();

    @JsonProperty("description")
    public void setDescriptions(List<LangString> descriptions);

    @JsonProperty("displayName")
    public List<LangString> getDisplayNames();

    @JsonProperty("displayName")
    public void setDisplayNames(List<LangString> displayNames);

}
