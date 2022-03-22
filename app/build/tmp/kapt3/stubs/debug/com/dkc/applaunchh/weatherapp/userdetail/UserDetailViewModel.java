package com.dkc.applaunchh.weatherapp.userdetail;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/dkc/applaunchh/weatherapp/userdetail/UserDetailViewModel;", "Lcom/dkc/applaunchh/weatherapp/base/BaseViewModel;", "dbRepository", "Lcom/dkc/applaunchh/weatherapp/repository/DBRepository;", "(Lcom/dkc/applaunchh/weatherapp/repository/DBRepository;)V", "getDbRepository", "()Lcom/dkc/applaunchh/weatherapp/repository/DBRepository;", "emailLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getEmailLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setEmailLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "error", "getError", "setError", "firstNameLiveData", "getFirstNameLiveData", "setFirstNameLiveData", "laslnameLiveData", "getLaslnameLiveData", "setLaslnameLiveData", "onCancel", "", "view", "Landroid/view/View;", "onSaveUserAccount", "app_debug"})
public final class UserDetailViewModel extends com.dkc.applaunchh.weatherapp.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.dkc.applaunchh.weatherapp.repository.DBRepository dbRepository = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> emailLiveData;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> firstNameLiveData;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> error;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> laslnameLiveData;
    
    @javax.inject.Inject
    public UserDetailViewModel(@org.jetbrains.annotations.NotNull
    com.dkc.applaunchh.weatherapp.repository.DBRepository dbRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dkc.applaunchh.weatherapp.repository.DBRepository getDbRepository() {
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
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFirstNameLiveData() {
        return null;
    }
    
    public final void setFirstNameLiveData(@org.jetbrains.annotations.NotNull
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
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLaslnameLiveData() {
        return null;
    }
    
    public final void setLaslnameLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final void onSaveUserAccount(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    public final void onCancel(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
}