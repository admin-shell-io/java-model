package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("DataElement")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
@JsonSubTypes({
    @JsonSubTypes.Type(value = File.class),
    @JsonSubTypes.Type(value = Blob.class),
    @JsonSubTypes.Type(value = MultiLanguageProperty.class),
    @JsonSubTypes.Type(value = Property.class),
    @JsonSubTypes.Type(value = Range.class),
    @JsonSubTypes.Type(value = ReferenceElement.class)
})
public interface DataElementMixin {

}
