package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("SubmodelElement")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
@JsonSubTypes({
    @JsonSubTypes.Type(value = File.class),
    @JsonSubTypes.Type(value = SubmodelElementCollection.class)
})
public interface SubmodelElementMixin {

}
