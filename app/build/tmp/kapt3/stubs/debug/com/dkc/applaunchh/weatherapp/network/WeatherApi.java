package com.dkc.applaunchh.weatherapp.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J?\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/dkc/applaunchh/weatherapp/network/WeatherApi;", "", "getCurrentWeather", "Lretrofit2/Response;", "Lcom/dkc/applaunchh/weatherapp/model/WeatherMap;", "lat", "", "lon", "units", "appId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface WeatherApi {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "data/2.5/onecall")
    public abstract java.lang.Object getCurrentWeather(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "lat")
    java.lang.String lat, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "lon")
    java.lang.String lon, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "units")
    java.lang.String units, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "appid")
    java.lang.String appId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.dkc.applaunchh.weatherapp.model.WeatherMap>> continuation);
}