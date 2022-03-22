package com.dkc.applaunchh.weatherapp.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u00a3\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\t\u00a2\u0006\u0002\u0010\u001bJ\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\tH\u00c6\u0003J\t\u00107\u001a\u00020\tH\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\tH\u00c6\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\tH\u00c6\u0003J\t\u0010=\u001a\u00020\tH\u00c6\u0003J\t\u0010>\u001a\u00020\tH\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\tH\u00c6\u0003J\t\u0010D\u001a\u00020\u000bH\u00c6\u0003J\t\u0010E\u001a\u00020\rH\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\u00cd\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\t2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\tH\u00c6\u0001J\u0013\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010K\u001a\u00020\u0003H\u00d6\u0001J\t\u0010L\u001a\u00020MH\u00d6\u0001R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0016\u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0016\u0010\u0019\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u001a\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0016\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001fR\u0016\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001f\u00a8\u0006N"}, d2 = {"Lcom/dkc/applaunchh/weatherapp/model/Daily;", "", "dt", "", "sunrise", "sunset", "moonrise", "moonset", "moon_phase", "", "temp", "Lcom/dkc/applaunchh/weatherapp/model/Temp;", "feels_like", "Lcom/dkc/applaunchh/weatherapp/model/Feels_like;", "pressure", "humidity", "dew_point", "wind_speed", "wind_deg", "wind_gust", "weather", "", "Lcom/dkc/applaunchh/weatherapp/model/Weather;", "clouds", "pop", "rain", "uvi", "(IIIIIDLcom/dkc/applaunchh/weatherapp/model/Temp;Lcom/dkc/applaunchh/weatherapp/model/Feels_like;IIDDIDLjava/util/List;IDDD)V", "getClouds", "()I", "getDew_point", "()D", "getDt", "getFeels_like", "()Lcom/dkc/applaunchh/weatherapp/model/Feels_like;", "getHumidity", "getMoon_phase", "getMoonrise", "getMoonset", "getPop", "getPressure", "getRain", "getSunrise", "getSunset", "getTemp", "()Lcom/dkc/applaunchh/weatherapp/model/Temp;", "getUvi", "getWeather", "()Ljava/util/List;", "getWind_deg", "getWind_gust", "getWind_speed", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class Daily {
    @com.google.gson.annotations.SerializedName(value = "dt")
    private final int dt = 0;
    @com.google.gson.annotations.SerializedName(value = "sunrise")
    private final int sunrise = 0;
    @com.google.gson.annotations.SerializedName(value = "sunset")
    private final int sunset = 0;
    @com.google.gson.annotations.SerializedName(value = "moonrise")
    private final int moonrise = 0;
    @com.google.gson.annotations.SerializedName(value = "moonset")
    private final int moonset = 0;
    @com.google.gson.annotations.SerializedName(value = "moon_phase")
    private final double moon_phase = 0.0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "temp")
    private final com.dkc.applaunchh.weatherapp.model.Temp temp = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "feels_like")
    private final com.dkc.applaunchh.weatherapp.model.Feels_like feels_like = null;
    @com.google.gson.annotations.SerializedName(value = "pressure")
    private final int pressure = 0;
    @com.google.gson.annotations.SerializedName(value = "humidity")
    private final int humidity = 0;
    @com.google.gson.annotations.SerializedName(value = "dew_point")
    private final double dew_point = 0.0;
    @com.google.gson.annotations.SerializedName(value = "wind_speed")
    private final double wind_speed = 0.0;
    @com.google.gson.annotations.SerializedName(value = "wind_deg")
    private final int wind_deg = 0;
    @com.google.gson.annotations.SerializedName(value = "wind_gust")
    private final double wind_gust = 0.0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "weather")
    private final java.util.List<com.dkc.applaunchh.weatherapp.model.Weather> weather = null;
    @com.google.gson.annotations.SerializedName(value = "clouds")
    private final int clouds = 0;
    @com.google.gson.annotations.SerializedName(value = "pop")
    private final double pop = 0.0;
    @com.google.gson.annotations.SerializedName(value = "rain")
    private final double rain = 0.0;
    @com.google.gson.annotations.SerializedName(value = "uvi")
    private final double uvi = 0.0;
    
    @org.jetbrains.annotations.NotNull
    public final com.dkc.applaunchh.weatherapp.model.Daily copy(int dt, int sunrise, int sunset, int moonrise, int moonset, double moon_phase, @org.jetbrains.annotations.NotNull
    com.dkc.applaunchh.weatherapp.model.Temp temp, @org.jetbrains.annotations.NotNull
    com.dkc.applaunchh.weatherapp.model.Feels_like feels_like, int pressure, int humidity, double dew_point, double wind_speed, int wind_deg, double wind_gust, @org.jetbrains.annotations.NotNull
    java.util.List<com.dkc.applaunchh.weatherapp.model.Weather> weather, int clouds, double pop, double rain, double uvi) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public Daily(int dt, int sunrise, int sunset, int moonrise, int moonset, double moon_phase, @org.jetbrains.annotations.NotNull
    com.dkc.applaunchh.weatherapp.model.Temp temp, @org.jetbrains.annotations.NotNull
    com.dkc.applaunchh.weatherapp.model.Feels_like feels_like, int pressure, int humidity, double dew_point, double wind_speed, int wind_deg, double wind_gust, @org.jetbrains.annotations.NotNull
    java.util.List<com.dkc.applaunchh.weatherapp.model.Weather> weather, int clouds, double pop, double rain, double uvi) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getDt() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getSunrise() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getSunset() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getMoonrise() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getMoonset() {
        return 0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double getMoon_phase() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dkc.applaunchh.weatherapp.model.Temp component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dkc.applaunchh.weatherapp.model.Temp getTemp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dkc.applaunchh.weatherapp.model.Feels_like component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dkc.applaunchh.weatherapp.model.Feels_like getFeels_like() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getPressure() {
        return 0;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getHumidity() {
        return 0;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    public final double getDew_point() {
        return 0.0;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double getWind_speed() {
        return 0.0;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getWind_deg() {
        return 0;
    }
    
    public final double component14() {
        return 0.0;
    }
    
    public final double getWind_gust() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.dkc.applaunchh.weatherapp.model.Weather> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.dkc.applaunchh.weatherapp.model.Weather> getWeather() {
        return null;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int getClouds() {
        return 0;
    }
    
    public final double component17() {
        return 0.0;
    }
    
    public final double getPop() {
        return 0.0;
    }
    
    public final double component18() {
        return 0.0;
    }
    
    public final double getRain() {
        return 0.0;
    }
    
    public final double component19() {
        return 0.0;
    }
    
    public final double getUvi() {
        return 0.0;
    }
}