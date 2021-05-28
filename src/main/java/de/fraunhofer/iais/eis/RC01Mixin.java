package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("RC01")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface RC01Mixin {
    @JsonProperty("conversionFactor")
    public List<String> getConversionFactors();

    @JsonProperty("conversionFactor")
    public void setConversionFactors(List<String> conversionFactors);

    @JsonProperty("definition")
    public List<LangString> getDefinitions();

    @JsonProperty("definition")
    public void setDefinitions(List<LangString> definitions);

    @JsonProperty("dinNotation")
    public List<String> getDinNotations();

    @JsonProperty("dinNotation")
    public void setDinNotations(List<String> dinNotations);

    @JsonProperty("eceCode")
    public List<String> getEceCodes();

    @JsonProperty("eceCode")
    public void setEceCodes(List<String> eceCodes);

    @JsonProperty("eceName")
    public List<String> getEceNames();

    @JsonProperty("eceName")
    public void setEceNames(List<String> eceNames);

    @JsonProperty("nistName")
    public List<String> getNistNames();

    @JsonProperty("nistName")
    public void setNistNames(List<String> nistNames);

    @JsonProperty("siName")
    public List<String> getSiNames();

    @JsonProperty("siName")
    public void setSiNames(List<String> siNames);

    @JsonProperty("siNotation")
    public List<String> getSiNotations();

    @JsonProperty("siNotation")
    public void setSiNotations(List<String> siNotations);

    @JsonProperty("registrationAuthorityId")
    public List<String> getRegistrationAuthorityIds();

    @JsonProperty("registrationAuthorityId")
    public void setRegistrationAuthorityIds(List<String> registrationAuthorityIds);

    @JsonProperty("supplier")
    public List<String> getSuppliers();

    @JsonProperty("supplier")
    public void setSuppliers(List<String> suppliers);

    @JsonProperty("unitName")
    public List<String> getUnitNames();

    @JsonProperty("unitName")
    public void setUnitNames(List<String> unitNames);

    @JsonProperty("unitSymbol")
    public List<String> getUnitSymbols();

    @JsonProperty("unitSymbol")
    public void setUnitSymbols(List<String> unitSymbols);
}
