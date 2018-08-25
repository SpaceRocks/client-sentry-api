package com.spacerocks.rest;

import com.spacerocks.domain.ImpactRiskAssessmentModeS;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SentryApi {

    @GET("/sentry.api")
    Call<ImpactRiskAssessmentModeS> retrieveNearEarthObjectAssesmentSummary(
            @Query("removed") boolean removed);

}