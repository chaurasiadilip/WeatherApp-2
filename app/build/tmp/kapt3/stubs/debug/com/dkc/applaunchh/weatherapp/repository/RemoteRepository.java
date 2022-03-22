package com.dkc.applaunchh.weatherapp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/dkc/applaunchh/weatherapp/repository/RemoteRepository;", "", "weatherApi", "Lcom/dkc/applaunchh/weatherapp/network/WeatherApi;", "(Lcom/dkc/applaunchh/weatherapp/network/WeatherApi;)V", "getWeatherApi", "()Lcom/dkc/applaunchh/weatherapp/network/WeatherApi;", "getCurrentWeather", "Lretrofit2/Response;", "Lcom/dkc/applaunchh/weatherapp/model/WeatherMap;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RemoteRepository {
    @org.jetbrains.annotations.NotNull
    private final com.dkc.applaunchh.weatherapp.network.WeatherApi weatherApi = null;
    
    @javax.inject.Inject
    public RemoteRepository(@org.jetbrains.annotations.NotNull
    com.dkc.applaunchh.weatherapp.network.WeatherApi weatherApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dkc.applaunchh.weatherapp.network.WeatherApi getWeatherApi() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getCurrentWeather(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.dkc.applaunchh.weatherapp.model.WeatherMap>> continuation) {
        return null;
    }
}