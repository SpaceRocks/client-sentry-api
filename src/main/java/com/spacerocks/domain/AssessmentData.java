package com.spacerocks.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
public class AssessmentData implements Serializable {

    private static final long serialVersionUID = 7024132870870594146L;

    @JsonProperty("des")
    private String designation;

    // Overloaded domain with S and R mode data sets.

    // Below is summary mode
    @JsonProperty("ip")
    private String impactProbability;

    @JsonProperty("range")
    private String yearRange;

    @JsonProperty("ps_cum")
    private String palermoScaleCumulative;

    @JsonProperty("ps_max")
    private String palermoScaleMax;

    @JsonProperty("diameter")
    private String estimatedDiameter;

    @JsonProperty("h")
    private String absoluteMagnitude;

    @JsonProperty("last_obs")
    private String lastObservationDate;

    @JsonProperty("v_inf")
    private String relativeVelocity;

    @JsonProperty("fullname")
    private String fullName;

    @JsonProperty("n_imp")
    private String potentialImpacts;

    @JsonProperty("last_obs_jd")
    private String lastObservationDateJulianDate;

    @JsonProperty("ts_max")
    private String torinoScaleMax;

    @JsonProperty("id")
    private String sentryId;

 // Below is removed mode
    @JsonProperty("removed")
    private String removedDate;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getImpactProbability() {
        return impactProbability;
    }

    public void setImpactProbability(String impactProbability) {
        this.impactProbability = impactProbability;
    }

    public String getYearRange() {
        return yearRange;
    }

    public void setYearRange(String yearRange) {
        this.yearRange = yearRange;
    }

    public String getPalermoScaleCumulative() {
        return palermoScaleCumulative;
    }

    public void setPalermoScaleCumulative(String palermoScaleCumulative) {
        this.palermoScaleCumulative = palermoScaleCumulative;
    }

    public String getPalermoScaleMax() {
        return palermoScaleMax;
    }

    public void setPalermoScaleMax(String palermoScaleMax) {
        this.palermoScaleMax = palermoScaleMax;
    }

    public String getEstimatedDiameter() {
        return estimatedDiameter;
    }

    public void setEstimatedDiameter(String estimatedDiameter) {
        this.estimatedDiameter = estimatedDiameter;
    }

    public String getAbsoluteMagnitude() {
        return absoluteMagnitude;
    }

    public void setAbsoluteMagnitude(String absoluteMagnitude) {
        this.absoluteMagnitude = absoluteMagnitude;
    }

    public String getLastObservationDate() {
        return lastObservationDate;
    }

    public void setLastObservationDate(String lastObservationDate) {
        this.lastObservationDate = lastObservationDate;
    }

    public String getRelativeVelocity() {
        return relativeVelocity;
    }

    public void setRelativeVelocity(String relativeVelocity) {
        this.relativeVelocity = relativeVelocity;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPotentialImpacts() {
        return potentialImpacts;
    }

    public void setPotentialImpacts(String potentialImpacts) {
        this.potentialImpacts = potentialImpacts;
    }

    public String getLastObservationDateJulianDate() {
        return lastObservationDateJulianDate;
    }

    public void setLastObservationDateJulianDate(String lastObservationDateJulianDate) {
        this.lastObservationDateJulianDate = lastObservationDateJulianDate;
    }

    public String getTorinoScaleMax() {
        return torinoScaleMax;
    }

    public void setTorinoScaleMax(String torinoScaleMax) {
        this.torinoScaleMax = torinoScaleMax;
    }

    public String getSentryId() {
        return sentryId;
    }

    public void setSentryId(String sentryId) {
        this.sentryId = sentryId;
    }

    public String getRemovedDate() {
        return removedDate;
    }

    public void setRemovedDate(String removedDate) {
        this.removedDate = removedDate;
    }

}
