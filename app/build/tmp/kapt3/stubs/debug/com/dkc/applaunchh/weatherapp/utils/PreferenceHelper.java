package com.dkc.applaunchh.weatherapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014J$\u0010\u0016\u001a\u00020\u0005*\u00020\u00072\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u0018H\u0086\b\u00f8\u0001\u0000R4\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u001a"}, d2 = {"Lcom/dkc/applaunchh/weatherapp/utils/PreferenceHelper;", "", "()V", "value", "Lkotlin/Function0;", "", "clearValues", "Landroid/content/SharedPreferences;", "getClearValues", "(Landroid/content/SharedPreferences;)Lkotlin/jvm/functions/Function0;", "setClearValues", "(Landroid/content/SharedPreferences;Lkotlin/jvm/functions/Function0;)V", "", "userLoggedIn", "getUserLoggedIn", "(Landroid/content/SharedPreferences;)Z", "setUserLoggedIn", "(Landroid/content/SharedPreferences;Z)V", "customPreference", "context", "Landroid/content/Context;", "defaultPreference", "editMe", "operation", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "app_debug"})
public final class PreferenceHelper {
    @org.jetbrains.annotations.NotNull
    public static final com.dkc.applaunchh.weatherapp.utils.PreferenceHelper INSTANCE = null;
    
    private PreferenceHelper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences defaultPreference(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences customPreference(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    public final void editMe(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences $this$editMe, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.content.SharedPreferences.Editor, kotlin.Unit> operation) {
    }
    
    public final boolean getUserLoggedIn(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences $this$userLoggedIn) {
        return false;
    }
    
    public final void setUserLoggedIn(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences $this$userLoggedIn, boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getClearValues(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences $this$clearValues) {
        return null;
    }
    
    public final void setClearValues(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences $this$clearValues, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> value) {
    }
}