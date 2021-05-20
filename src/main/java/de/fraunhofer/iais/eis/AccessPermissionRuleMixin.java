package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("AccessPermissionRule")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public abstract class AccessPermissionRuleMixin {

}
