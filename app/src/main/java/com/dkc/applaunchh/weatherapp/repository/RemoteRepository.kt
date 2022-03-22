package com.dkc.applaunchh.weatherapp.repository

import com.dkc.applaunchh.weatherapp.model.WeatherMap
import com.dkc.applaunchh.weatherapp.network.WeatherApi
import com.dkc.applaunchh.weatherapp.utils.Constants.APP_KEY
import com.dkc.applaunchh.weatherapp.utils.Constants.LAT
import com.dkc.applaunchh.weatherapp.utils.Constants.LOT
import com.dkc.applaunchh.weatherapp.utils.Constants.UNITS
import retrofit2.Response
import javax.inject.Inject

class RemoteRepository @Inject constructor(val weatherApi: WeatherApi) {

    suspend fun getCurrentWeather(): Response<WeatherMap>{
        return weatherApi.getCurrentWeather(LAT, LOT, UNITS, APP_KEY)
    }
}