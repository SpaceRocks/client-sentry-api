package com.spacerocks.domain;

import java.io.Serializable;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
public class ImpactRiskAssessmentModeO implements Serializable {

    private static final long serialVersionUID = -7490835355409431160L;

    @JsonProperty("signature")
    private ApiSignature signature;

    @JsonProperty("data")
    private ArrayList<AssessmentData> data;

    @JsonProperty("error")
    private String error;

    @JsonProperty("removed")
    private String dateRemoved;

    @JsonProperty("Summary")
    private AssessmentSummary Summary;
}
