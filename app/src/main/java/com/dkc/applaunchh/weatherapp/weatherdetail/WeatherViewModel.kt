package com.dkc.applaunchh.weatherapp.weatherdetail

import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope

import com.dkc.applaunchh.weatherapp.base.BaseViewModel
import com.dkc.applaunchh.weatherapp.model.WeatherMap
import com.dkc.applaunchh.weatherapp.network.WeatherApi
import com.dkc.applaunchh.weatherapp.utils.Constants.APP_KEY
import com.dkc.applaunchh.weatherapp.utils.Constants.LAT
import com.dkc.applaunchh.weatherapp.utils.Constants.LOT
import com.dkc.applaunchh.weatherapp.utils.Constants.UNITS
import com.dkc.applaunchh.weatherapp.utils.DataHandler
import com.dkc.applaunchh.weatherapp.utils.PreferenceHelper.userLoggedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(val weatherApi: WeatherApi,val sharedPreferences: SharedPreferences)  : BaseViewModel() {
    private val _weathermap = MutableLiveData<DataHandler<WeatherMap>>()
    val weathermap: LiveData<DataHandler<WeatherMap>> = _weathermap
    init {
        getWeatherMap()
    }

     fun getWeatherMap(){
         viewModelScope.launch {
             val response =  weatherApi.getCurrentWeather(LAT, LOT, UNITS, APP_KEY)
             _weathermap.postValue(handleResponse(response))
         }

     }
    private fun handleResponse(response: Response<WeatherMap>): DataHandler<WeatherMap> {
        if (response.isSuccessful) {
            response.body()?.let { it ->
                return DataHandler.SUCCESS(it)
            }
        }
        return DataHandler.ERROR(message = response.errorBody().toString())
    }

    fun logout(){
        sharedPreferences.userLoggedIn = false
        navigate(WeatherFragmentDirections.actionWeatherFragmentToHomeFragment())
    }
}