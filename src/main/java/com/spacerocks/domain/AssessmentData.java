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

    @JsonProperty("date")
    private String potentialImpactDate;

    @JsonProperty("dist")
    private String MinimumDistance;

    @JsonProperty("width")
    private String width;

    @JsonProperty("sigma_imp")
    private String lateralDistance;

    @JsonProperty("sigma_lov")
    private String SigmaLineOfVariations;

    @JsonProperty("stretch")
    private String stretch;

    @JsonProperty("sigma_mc")
    private String sigmaMonteCarlo;

    @JsonProperty("ip")
    private String impactProbability;

    @JsonProperty("energy")
    private String energy;

    @JsonProperty("ps")
    private String palermoScaleRating;

    @JsonProperty("ts")
    private String TorinoScaleRating;

    public String getPotentialImpactDate() {
        return potentialImpactDate;
    }

    public void setPotentialImpactDate(String potentialImpactDate) {
        this.potentialImpactDate = potentialImpactDate;
    }

    public String getMinimumDistance() {
        return MinimumDistance;
    }

    public void setMinimumDistance(String minimumDistance) {
        MinimumDistance = minimumDistance;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getLateralDistance() {
        return lateralDistance;
    }

    public void setLateralDistance(String lateralDistance) {
        this.lateralDistance = lateralDistance;
    }

    public String getSigmaLineOfVariations() {
        return SigmaLineOfVariations;
    }

    public void setSigmaLineOfVariations(String sigmaLineOfVariations) {
        SigmaLineOfVariations = sigmaLineOfVariations;
    }

    public String getStretch() {
        return stretch;
    }

    public void setStretch(String stretch) {
        this.stretch = stretch;
    }

    public String getSigmaMonteCarlo() {
        return sigmaMonteCarlo;
    }

    public void setSigmaMonteCarlo(String sigmaMonteCarlo) {
        this.sigmaMonteCarlo = sigmaMonteCarlo;
    }

    public String getImpactProbability() {
        return impactProbability;
    }

    public void setImpactProbability(String impactProbability) {
        this.impactProbability = impactProbability;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    public String getPalermoScaleRating() {
        return palermoScaleRating;
    }

    public void setPalermoScaleRating(String palermoScaleRating) {
        this.palermoScaleRating = palermoScaleRating;
    }

    public String getTorinoScaleRating() {
        return TorinoScaleRating;
    }

    public void setTorinoScaleRating(String torinoScaleRating) {
        TorinoScaleRating = torinoScaleRating;
    }

}
