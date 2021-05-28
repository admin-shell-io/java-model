package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Identifiable")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface IdentifiableMixin {

}
