package com.dkc.applaunchh.weatherapp.weatherdetail;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014J\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0017H\u0002J\u0006\u0010\u0018\u001a\u00020\u0014R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0019"}, d2 = {"Lcom/dkc/applaunchh/weatherapp/weatherdetail/WeatherViewModel;", "Lcom/dkc/applaunchh/weatherapp/base/BaseViewModel;", "weatherApi", "Lcom/dkc/applaunchh/weatherapp/network/WeatherApi;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lcom/dkc/applaunchh/weatherapp/network/WeatherApi;Landroid/content/SharedPreferences;)V", "_weathermap", "Landroidx/lifecycle/MutableLiveData;", "Lcom/dkc/applaunchh/weatherapp/utils/DataHandler;", "Lcom/dkc/applaunchh/weatherapp/model/WeatherMap;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "getWeatherApi", "()Lcom/dkc/applaunchh/weatherapp/network/WeatherApi;", "weathermap", "Landroidx/lifecycle/LiveData;", "getWeathermap", "()Landroidx/lifecycle/LiveData;", "getWeatherMap", "", "handleResponse", "response", "Lretrofit2/Response;", "logout", "app_debug"})
public final class WeatherViewModel extends com.dkc.applaunchh.weatherapp.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.dkc.applaunchh.weatherapp.network.WeatherApi weatherApi = null;
    @org.jetbrains.annotations.NotNull
    private final android.content.SharedPreferences sharedPreferences = null;
    private final androidx.lifecycle.MutableLiveData<com.dkc.applaunchh.weatherapp.utils.DataHandler<com.dkc.applaunchh.weatherapp.model.WeatherMap>> _weathermap = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.dkc.applaunchh.weatherapp.utils.DataHandler<com.dkc.applaunchh.weatherapp.model.WeatherMap>> weathermap = null;
    
    @javax.inject.Inject
    public WeatherViewModel(@org.jetbrains.annotations.NotNull
    com.dkc.applaunchh.weatherapp.network.WeatherApi weatherApi, @org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dkc.applaunchh.weatherapp.network.WeatherApi getWeatherApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.dkc.applaunchh.weatherapp.utils.DataHandler<com.dkc.applaunchh.weatherapp.model.WeatherMap>> getWeathermap() {
        return null;
    }
    
    public final void getWeatherMap() {
    }
    
    private final com.dkc.applaunchh.weatherapp.utils.DataHandler<com.dkc.applaunchh.weatherapp.model.WeatherMap> handleResponse(retrofit2.Response<com.dkc.applaunchh.weatherapp.model.WeatherMap> response) {
        return null;
    }
    
    public final void logout() {
    }
}