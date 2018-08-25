package com.spacerocks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.spacerocks.rest.SentryApi;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class SentryApp {

    final Logger log = LoggerFactory.getLogger(SentryApp.class);

    private String sentryAppDomain;

    public SentryApp(String sentryAppDomain) {
        this.sentryAppDomain = sentryAppDomain;
    }

    public SentryApi getSentryApi() {
        return retrofit().create(SentryApi.class);
    }

    private Retrofit retrofit() {
        Retrofit retro = new Retrofit.Builder()
                .baseUrl(sentryAppDomain)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        log.info("SentryApp retrofit init");
        return retro;
    }

}
