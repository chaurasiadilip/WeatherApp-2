package com.dkc.applaunchh.weatherapp.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0002\u0010\u0014J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0007H\u00c6\u0003J\t\u0010/\u001a\u00020\u0007H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0007H\u00c6\u0003J\t\u00103\u001a\u00020\u0007H\u00c6\u0003J\u009b\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\u0003H\u00d6\u0001J\t\u00109\u001a\u00020:H\u00d6\u0001R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018\u00a8\u0006;"}, d2 = {"Lcom/dkc/applaunchh/weatherapp/model/Current;", "", "dt", "", "sunrise", "sunset", "temp", "", "feels_like", "pressure", "humidity", "dew_point", "uvi", "clouds", "visibility", "wind_speed", "wind_deg", "weather", "", "Lcom/dkc/applaunchh/weatherapp/model/Weather;", "(IIIDDIIDDIIDILjava/util/List;)V", "getClouds", "()I", "getDew_point", "()D", "getDt", "getFeels_like", "getHumidity", "getPressure", "getSunrise", "getSunset", "getTemp", "getUvi", "getVisibility", "getWeather", "()Ljava/util/List;", "getWind_deg", "getWind_speed", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class Current {
    @com.google.gson.annotations.SerializedName(value = "dt")
    private final int dt = 0;
    @com.google.gson.annotations.SerializedName(value = "sunrise")
    private final int sunrise = 0;
    @com.google.gson.annotations.SerializedName(value = "sunset")
    private final int sunset = 0;
    @com.google.gson.annotations.SerializedName(value = "temp")
    private final double temp = 0.0;
    @com.google.gson.annotations.SerializedName(value = "feels_like")
    private final double feels_like = 0.0;
    @com.google.gson.annotations.SerializedName(value = "pressure")
    private final int pressure = 0;
    @com.google.gson.annotations.SerializedName(value = "humidity")
    private final int humidity = 0;
    @com.google.gson.annotations.SerializedName(value = "dew_point")
    private final double dew_point = 0.0;
    @com.google.gson.annotations.SerializedName(value = "uvi")
    private final double uvi = 0.0;
    @com.google.gson.annotations.SerializedName(value = "clouds")
    private final int clouds = 0;
    @com.google.gson.annotations.SerializedName(value = "visibility")
    private final int visibility = 0;
    @com.google.gson.annotations.SerializedName(value = "wind_speed")
    private final double wind_speed = 0.0;
    @com.google.gson.annotations.SerializedName(value = "wind_deg")
    private final int wind_deg = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "weather")
    private final java.util.List<com.dkc.applaunchh.weatherapp.model.Weather> weather = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.dkc.applaunchh.weatherapp.model.Current copy(int dt, int sunrise, int sunset, double temp, double feels_like, int pressure, int humidity, double dew_point, double uvi, int clouds, int visibility, double wind_speed, int wind_deg, @org.jetbrains.annotations.NotNull
    java.util.List<com.dkc.applaunchh.weatherapp.model.Weather> weather) {
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
    
    public Current(int dt, int sunrise, int sunset, double temp, double feels_like, int pressure, int humidity, double dew_point, double uvi, int clouds, int visibility, double wind_speed, int wind_deg, @org.jetbrains.annotations.NotNull
    java.util.List<com.dkc.applaunchh.weatherapp.model.Weather> weather) {
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
    
    public final double component4() {
        return 0.0;
    }
    
    public final double getTemp() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double getFeels_like() {
        return 0.0;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getPressure() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getHumidity() {
        return 0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double getDew_point() {
        return 0.0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final double getUvi() {
        return 0.0;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getClouds() {
        return 0;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getVisibility() {
        return 0;
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
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.dkc.applaunchh.weatherapp.model.Weather> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.dkc.applaunchh.weatherapp.model.Weather> getWeather() {
        return null;
    }
}