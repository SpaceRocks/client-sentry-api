/*
 * NASA document reference -- https://ssd-api.jpl.nasa.gov/doc/sentry.html
 */
package com.spacerocks.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
public class AssessmentSummary implements Serializable {

    private static final long serialVersionUID = 6775993244485228617L;

    @JsonProperty("des")
    private String designation;

    @JsonProperty("method")
    private String method;

    @JsonProperty("fullname")
    private String fullname;

    @JsonProperty("ps_cum")
    private String palermoCumulative;

    @JsonProperty("ps_max")
    private String palermoMax;

    @JsonProperty("ts_max")
    private String torinoMax;

    @JsonProperty("ip")
    private String impactProbability;

    @JsonProperty("n_imp")
    private int potentialImpacts;

    @JsonProperty("energy")
    private String impactEnergy;

    @JsonProperty("h")
    private String absoluteMagnitude;

    @JsonProperty("diameter")
    private String estimatedDiameter;

    @JsonProperty("mass")
    private String estimatedMass;

    @JsonProperty("v_inf")
    private String hyperbolicVelocity;

    @JsonProperty("v_imp")
    private String relativeVelocity;

    @JsonProperty("pdate")
    private String palermoComputationPacificDate;

    @JsonProperty("cdate")
    private String impactAnalysisComputationPacificDate;

    @JsonProperty("first_obs")
    private String firstObservationDate;

    @JsonProperty("last_obs")
    private String lastObservationDate;

    @JsonProperty("darc")
    private String observationsDays;

    @JsonProperty("nobs")
    private String numberOfObservations;

    @JsonProperty("ndel")
    private String numberOfRadarDelayObservations;

    @JsonProperty("ndop")
    private String numberOfRadarDopplerObservations;

    @JsonProperty("nsat")
    private String numberOfOpticalSatelliteObservations;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPalermoCumulative() {
        return palermoCumulative;
    }

    public void setPalermoCumulative(String palermoCumulative) {
        this.palermoCumulative = palermoCumulative;
    }

    public String getPalermoMax() {
        return palermoMax;
    }

    public void setPalermoMax(String palermoMax) {
        this.palermoMax = palermoMax;
    }

    public String getTorinoMax() {
        return torinoMax;
    }

    public void setTorinoMax(String torinoMax) {
        this.torinoMax = torinoMax;
    }

    public String getImpactProbability() {
        return impactProbability;
    }

    public void setImpactProbability(String impactProbability) {
        this.impactProbability = impactProbability;
    }

    public int getPotentialImpacts() {
        return potentialImpacts;
    }

    public void setPotentialImpacts(int potentialImpacts) {
        this.potentialImpacts = potentialImpacts;
    }

    public String getImpactEnergy() {
        return impactEnergy;
    }

    public void setImpactEnergy(String impactEnergy) {
        this.impactEnergy = impactEnergy;
    }

    public String getAbsoluteMagnitude() {
        return absoluteMagnitude;
    }

    public void setAbsoluteMagnitude(String absoluteMagnitude) {
        this.absoluteMagnitude = absoluteMagnitude;
    }

    public String getEstimatedDiameter() {
        return estimatedDiameter;
    }

    public void setEstimatedDiameter(String estimatedDiameter) {
        this.estimatedDiameter = estimatedDiameter;
    }

    public String getEstimatedMass() {
        return estimatedMass;
    }

    public void setEstimatedMass(String estimatedMass) {
        this.estimatedMass = estimatedMass;
    }

    public String getHyperbolicVelocity() {
        return hyperbolicVelocity;
    }

    public void setHyperbolicVelocity(String hyperbolicVelocity) {
        this.hyperbolicVelocity = hyperbolicVelocity;
    }

    public String getRelativeVelocity() {
        return relativeVelocity;
    }

    public void setRelativeVelocity(String relativeVelocity) {
        this.relativeVelocity = relativeVelocity;
    }

    public String getPalermoComputationPacificDate() {
        return palermoComputationPacificDate;
    }

    public void setPalermoComputationPacificDate(String palermoComputationPacificDate) {
        this.palermoComputationPacificDate = palermoComputationPacificDate;
    }

    public String getImpactAnalysisComputationPacificDate() {
        return impactAnalysisComputationPacificDate;
    }

    public void setImpactAnalysisComputationPacificDate(String impactAnalysisComputationPacificDate) {
        this.impactAnalysisComputationPacificDate = impactAnalysisComputationPacificDate;
    }

    public String getFirstObservationDate() {
        return firstObservationDate;
    }

    public void setFirstObservationDate(String firstObservationDate) {
        this.firstObservationDate = firstObservationDate;
    }

    public String getLastObservationDate() {
        return lastObservationDate;
    }

    public void setLastObservationDate(String lastObservationDate) {
        this.lastObservationDate = lastObservationDate;
    }

    public String getObservationsDays() {
        return observationsDays;
    }

    public void setObservationsDays(String observationsDays) {
        this.observationsDays = observationsDays;
    }

    public String getNumberOfObservations() {
        return numberOfObservations;
    }

    public void setNumberOfObservations(String numberOfObservations) {
        this.numberOfObservations = numberOfObservations;
    }

    public String getNumberOfRadarDelayObservations() {
        return numberOfRadarDelayObservations;
    }

    public void setNumberOfRadarDelayObservations(String numberOfRadarDelayObservations) {
        this.numberOfRadarDelayObservations = numberOfRadarDelayObservations;
    }

    public String getNumberOfRadarDopplerObservations() {
        return numberOfRadarDopplerObservations;
    }

    public void setNumberOfRadarDopplerObservations(String numberOfRadarDopplerObservations) {
        this.numberOfRadarDopplerObservations = numberOfRadarDopplerObservations;
    }

    public String getNumberOfOpticalSatelliteObservations() {
        return numberOfOpticalSatelliteObservations;
    }

    public void setNumberOfOpticalSatelliteObservations(String numberOfOpticalSatelliteObservations) {
        this.numberOfOpticalSatelliteObservations = numberOfOpticalSatelliteObservations;
    }

}
