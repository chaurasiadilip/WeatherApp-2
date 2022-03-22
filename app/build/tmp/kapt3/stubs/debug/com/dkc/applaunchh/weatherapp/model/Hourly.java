package com.dkc.applaunchh.weatherapp.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0014J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0005H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\u009b\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0005H\u00c6\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\u0003H\u00d6\u0001J\t\u00109\u001a\u00020:H\u00d6\u0001R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018\u00a8\u0006;"}, d2 = {"Lcom/dkc/applaunchh/weatherapp/model/Hourly;", "", "dt", "", "temp", "", "feels_like", "pressure", "humidity", "dew_point", "uvi", "clouds", "visibility", "wind_speed", "wind_deg", "wind_gust", "weather", "", "Lcom/dkc/applaunchh/weatherapp/model/Weather;", "pop", "(IDDIIDDIIDIDLjava/util/List;D)V", "getClouds", "()I", "getDew_point", "()D", "getDt", "getFeels_like", "getHumidity", "getPop", "getPressure", "getTemp", "getUvi", "getVisibility", "getWeather", "()Ljava/util/List;", "getWind_deg", "getWind_gust", "getWind_speed", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class Hourly {
    @com.google.gson.annotations.SerializedName(value = "dt")
    private final int dt = 0;
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
    @com.google.gson.annotations.SerializedName(value = "wind_gust")
    private final double wind_gust = 0.0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "weather")
    private final java.util.List<com.dkc.applaunchh.weatherapp.model.Weather> weather = null;
    @com.google.gson.annotations.SerializedName(value = "pop")
    private final double pop = 0.0;
    
    @org.jetbrains.annotations.NotNull
    public final com.dkc.applaunchh.weatherapp.model.Hourly copy(int dt, double temp, double feels_like, int pressure, int humidity, double dew_point, double uvi, int clouds, int visibility, double wind_speed, int wind_deg, double wind_gust, @org.jetbrains.annotations.NotNull
    java.util.List<com.dkc.applaunchh.weatherapp.model.Weather> weather, double pop) {
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
    
    public Hourly(int dt, double temp, double feels_like, int pressure, int humidity, double dew_point, double uvi, int clouds, int visibility, double wind_speed, int wind_deg, double wind_gust, @org.jetbrains.annotations.NotNull
    java.util.List<com.dkc.applaunchh.weatherapp.model.Weather> weather, double pop) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getDt() {
        return 0;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double getTemp() {
        return 0.0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double getFeels_like() {
        return 0.0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getPressure() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getHumidity() {
        return 0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double getDew_point() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double getUvi() {
        return 0.0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getClouds() {
        return 0;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getVisibility() {
        return 0;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    public final double getWind_speed() {
        return 0.0;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getWind_deg() {
        return 0;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double getWind_gust() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.dkc.applaunchh.weatherapp.model.Weather> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.dkc.applaunchh.weatherapp.model.Weather> getWeather() {
        return null;
    }
    
    public final double component14() {
        return 0.0;
    }
    
    public final double getPop() {
        return 0.0;
    }
}