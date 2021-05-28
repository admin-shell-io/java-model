package de.fraunhofer.iais.eis;



import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("HasDataSpecification")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
@JsonSubTypes({
    @JsonSubTypes.Type(value = Submodel.class),
    @JsonSubTypes.Type(value = AdministrativeInformation.class),
    @JsonSubTypes.Type(value = Asset.class),
    @JsonSubTypes.Type(value = AssetAdministrationShell.class),
    @JsonSubTypes.Type(value = View.class),
    @JsonSubTypes.Type(value = ConceptDescription.class),
    @JsonSubTypes.Type(value = SubmodelElement.class)
})
public interface HasDataSpecificationMixin {

}
