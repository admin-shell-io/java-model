package io.adminshell.aas.v3.dataformat.json.mixins;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

@JsonTypeName("Security")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface SecurityMixin {

    @JsonProperty("certificate")
    public List<Certificate> getCertificates();

    @JsonProperty("certificate")
    public void setCertificates(List<Certificate> certificates);

    @JsonProperty("requiredCertificateExtension")
    public List<Reference> getRequiredCertificateExtensions();

    @JsonProperty("requiredCertificateExtension")
    public void setRequiredCertificateExtensions(List<Reference> requiredCertificateExtensions);
}
