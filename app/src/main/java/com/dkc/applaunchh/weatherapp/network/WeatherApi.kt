package com.dkc.applaunchh.weatherapp.network

import com.dkc.applaunchh.weatherapp.model.WeatherMap
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

    @GET("data/2.5/onecall")
    suspend fun getCurrentWeather(
        @Query("lat") lat: String,
        @Query("lon") lon: String,
        @Query("units") units: String,
        @Query("appid") appId: String
    ):Response<WeatherMap>
}