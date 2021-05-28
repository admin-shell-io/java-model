package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("ValueList")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface ValueListMixin {
    @JsonProperty("valueReferencePairTypes")
    public List<ValueReferencePair> getValueReferencePairTypes();

    @JsonProperty("valueReferencePairTypes")
    public void setValueReferencePairTypes(List<ValueReferencePair> valueReferencePairTypes);
}
