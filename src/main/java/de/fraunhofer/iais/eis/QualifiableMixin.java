package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Qualifiable")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AccessPermissionRule.class),
    @JsonSubTypes.Type(value = Submodel.class),
    @JsonSubTypes.Type(value = SubmodelElement.class)
})
public interface QualifiableMixin {

}
