package com.spacerocks;

import com.spacerocks.domain.ImpactRiskAssessmentModeO;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SentryApi {

    @GET("/")
    Call<ImpactRiskAssessmentModeO> retrieveNearEarthObjectAssesmentSummary();

}