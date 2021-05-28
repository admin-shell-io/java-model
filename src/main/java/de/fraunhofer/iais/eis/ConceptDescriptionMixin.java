package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ConceptDescription")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface ConceptDescriptionMixin {

}
