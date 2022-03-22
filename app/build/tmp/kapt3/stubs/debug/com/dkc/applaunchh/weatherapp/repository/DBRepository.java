package com.dkc.applaunchh.weatherapp.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/dkc/applaunchh/weatherapp/repository/DBRepository;", "", "database", "Lcom/dkc/applaunchh/weatherapp/db/AppDatabase;", "(Lcom/dkc/applaunchh/weatherapp/db/AppDatabase;)V", "getDatabase", "()Lcom/dkc/applaunchh/weatherapp/db/AppDatabase;", "deleteUserDetail", "", "userDetailEntity", "Lcom/dkc/applaunchh/weatherapp/db/entity/UserDetailEntity;", "(Lcom/dkc/applaunchh/weatherapp/db/entity/UserDetailEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllUserDetails", "Landroidx/lifecycle/LiveData;", "", "insertUserDetails", "", "app_debug"})
public final class DBRepository {
    @org.jetbrains.annotations.NotNull
    private final com.dkc.applaunchh.weatherapp.db.AppDatabase database = null;
    
    @javax.inject.Inject
    public DBRepository(@org.jetbrains.annotations.NotNull
    com.dkc.applaunchh.weatherapp.db.AppDatabase database) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dkc.applaunchh.weatherapp.db.AppDatabase getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object insertUserDetails(@org.jetbrains.annotations.NotNull
    com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity userDetailEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object deleteUserDetail(@org.jetbrains.annotations.NotNull
    com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity userDetailEntity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity>> getAllUserDetails() {
        return null;
    }
}