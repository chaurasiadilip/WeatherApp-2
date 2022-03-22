package com.dkc.applaunchh.weatherapp.login;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e\u00a8\u0006 "}, d2 = {"Lcom/dkc/applaunchh/weatherapp/login/LoginViewModel;", "Lcom/dkc/applaunchh/weatherapp/base/BaseViewModel;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "SUCCESS", "", "getSUCCESS", "()Ljava/lang/String;", "emailLiveData", "Landroidx/lifecycle/MutableLiveData;", "getEmailLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setEmailLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "error", "getError", "setError", "passwordLiveData", "getPasswordLiveData", "setPasswordLiveData", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "userMutableLiveData", "Lcom/dkc/applaunchh/weatherapp/model/User;", "getUserMutableLiveData", "setUserMutableLiveData", "launchUserList", "", "onSubmit", "view", "Landroid/view/View;", "app_debug"})
public final class LoginViewModel extends com.dkc.applaunchh.weatherapp.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String SUCCESS = "Success";
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> emailLiveData;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> passwordLiveData;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> error;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.dkc.applaunchh.weatherapp.model.User> userMutableLiveData;
    
    @javax.inject.Inject
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSUCCESS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEmailLiveData() {
        return null;
    }
    
    public final void setEmailLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPasswordLiveData() {
        return null;
    }
    
    public final void setPasswordLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getError() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.dkc.applaunchh.weatherapp.model.User> getUserMutableLiveData() {
        return null;
    }
    
    public final void setUserMutableLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.dkc.applaunchh.weatherapp.model.User> p0) {
    }
    
    public final void onSubmit(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    public final void launchUserList() {
    }
}