package com.dkc.applaunchh.weatherapp.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f\u00a2\u0006\u0002\u0010\u0012J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0006H\u00c6\u0003J\t\u0010#\u001a\u00020\bH\u00c6\u0003J\t\u0010$\u001a\u00020\nH\u00c6\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00c6\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000f0\fH\u00c6\u0003J\u000f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00110\fH\u00c6\u0003Jk\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fH\u00c6\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\bH\u00d6\u0001J\t\u0010-\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006."}, d2 = {"Lcom/dkc/applaunchh/weatherapp/model/WeatherMap;", "", "lat", "", "lon", "timezone", "", "timezone_offset", "", "current", "Lcom/dkc/applaunchh/weatherapp/model/Current;", "minutely", "", "Lcom/dkc/applaunchh/weatherapp/model/Minutely;", "hourly", "Lcom/dkc/applaunchh/weatherapp/model/Hourly;", "daily", "Lcom/dkc/applaunchh/weatherapp/model/Daily;", "(DDLjava/lang/String;ILcom/dkc/applaunchh/weatherapp/model/Current;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCurrent", "()Lcom/dkc/applaunchh/weatherapp/model/Current;", "getDaily", "()Ljava/util/List;", "getHourly", "getLat", "()D", "getLon", "getMinutely", "getTimezone", "()Ljava/lang/String;", "getTimezone_offset", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class WeatherMap {
    @com.google.gson.annotations.SerializedName(value = "lat")
    private final double lat = 0.0;
    @com.google.gson.annotations.SerializedName(value = "lon")
    private final double lon = 0.0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "timezone")
    private final java.lang.String timezone = null;
    @com.google.gson.annotations.SerializedName(value = "timezone_offset")
    private final int timezone_offset = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "current")
    private final com.dkc.applaunchh.weatherapp.model.Current current = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "minutely")
    private final java.util.List<com.dkc.applaunchh.weatherapp.model.Minutely> minutely = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "hourly")
    private final java.util.List<com.dkc.applaunchh.weatherapp.model.Hourly> hourly = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "daily")
    private final java.util.List<com.dkc.applaunchh.weatherapp.model.Daily> daily = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.dkc.applaunchh.weatherapp.model.WeatherMap copy(double lat, double lon, @org.jetbrains.annotations.NotNull
    java.lang.String timezone, int timezone_offset, @org.jetbrains.annotations.NotNull
    com.dkc.applaunchh.weatherapp.model.Current current, @org.jetbrains.annotations.NotNull
    java.util.List<com.dkc.applaunchh.weatherapp.model.Minutely> minutely, @org.jetbrains.annotations.NotNull
    java.util.List<com.dkc.applaunchh.weatherapp.model.Hourly> hourly, @org.jetbrains.annotations.NotNull
    java.util.List<com.dkc.applaunchh.weatherapp.model.Daily> daily) {
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
    
    public WeatherMap(double lat, double lon, @org.jetbrains.annotations.NotNull
    java.lang.String timezone, int timezone_offset, @org.jetbrains.annotations.NotNull
    com.dkc.applaunchh.weatherapp.model.Current current, @org.jetbrains.annotations.NotNull
    java.util.List<com.dkc.applaunchh.weatherapp.model.Minutely> minutely, @org.jetbrains.annotations.NotNull
    java.util.List<com.dkc.applaunchh.weatherapp.model.Hourly> hourly, @org.jetbrains.annotations.NotNull
    java.util.List<com.dkc.applaunchh.weatherapp.model.Daily> daily) {
        super();
    }
    
    public final double component1() {
        return 0.0;
    }
    
    public final double getLat() {
        return 0.0;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double getLon() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTimezone() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getTimezone_offset() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dkc.applaunchh.weatherapp.model.Current component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dkc.applaunchh.weatherapp.model.Current getCurrent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.dkc.applaunchh.weatherapp.model.Minutely> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.dkc.applaunchh.weatherapp.model.Minutely> getMinutely() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.dkc.applaunchh.weatherapp.model.Hourly> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.dkc.applaunchh.weatherapp.model.Hourly> getHourly() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.dkc.applaunchh.weatherapp.model.Daily> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.dkc.applaunchh.weatherapp.model.Daily> getDaily() {
        return null;
    }
}