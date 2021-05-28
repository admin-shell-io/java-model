package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("DataSpecificationIEC61360")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface DataSpecificationIEC61360Mixin {

}
