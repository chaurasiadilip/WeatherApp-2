package com.dkc.applaunchh.weatherapp.userlist;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000bJ\u0006\u0010\u0017\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006RD\u0010\u0007\u001a,\u0012(\u0012&\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u000b0\n \f*\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lcom/dkc/applaunchh/weatherapp/userlist/UserListViewModel;", "Lcom/dkc/applaunchh/weatherapp/base/BaseViewModel;", "dbRepository", "Lcom/dkc/applaunchh/weatherapp/repository/DBRepository;", "(Lcom/dkc/applaunchh/weatherapp/repository/DBRepository;)V", "getDbRepository", "()Lcom/dkc/applaunchh/weatherapp/repository/DBRepository;", "userdetail", "Landroidx/lifecycle/LiveData;", "Lcom/dkc/applaunchh/weatherapp/utils/DataHandler;", "", "Lcom/dkc/applaunchh/weatherapp/db/entity/UserDetailEntity;", "kotlin.jvm.PlatformType", "getUserdetail", "()Landroidx/lifecycle/LiveData;", "setUserdetail", "(Landroidx/lifecycle/LiveData;)V", "onAddUser", "", "view", "Landroid/view/View;", "onDeleteUser", "userDetailEntity", "onUserClick", "app_debug"})
public final class UserListViewModel extends com.dkc.applaunchh.weatherapp.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.dkc.applaunchh.weatherapp.repository.DBRepository dbRepository = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.LiveData<com.dkc.applaunchh.weatherapp.utils.DataHandler<? extends java.util.List<com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity>>> userdetail;
    
    @javax.inject.Inject
    public UserListViewModel(@org.jetbrains.annotations.NotNull
    com.dkc.applaunchh.weatherapp.repository.DBRepository dbRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dkc.applaunchh.weatherapp.repository.DBRepository getDbRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.dkc.applaunchh.weatherapp.utils.DataHandler<? extends java.util.List<com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity>>> getUserdetail() {
        return null;
    }
    
    public final void setUserdetail(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<com.dkc.applaunchh.weatherapp.utils.DataHandler<? extends java.util.List<com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity>>> p0) {
    }
    
    public final void onAddUser(@org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    public final void onUserClick() {
    }
    
    public final void onDeleteUser(@org.jetbrains.annotations.NotNull
    com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity userDetailEntity) {
    }
}