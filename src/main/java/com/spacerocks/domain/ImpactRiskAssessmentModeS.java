package com.spacerocks.domain;

import java.io.Serializable;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
public class ImpactRiskAssessmentModeS implements Serializable {

    private static final long serialVersionUID = -4672923188794201290L;

    @JsonProperty("count")
    private String count;

    @JsonProperty("signature")
    private ApiSignature signature;

    @JsonProperty("data")
    private ArrayList<AssessmentData> data;
}
