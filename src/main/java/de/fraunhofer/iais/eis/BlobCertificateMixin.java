package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("BlobCertificate")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface BlobCertificateMixin {

    @JsonProperty("containedExtension")
    public List<Reference> getContainedExtensions();

    @JsonProperty("containedExtension")
    public void setContainedExtensions(List<Reference> containedExtensions);

}
