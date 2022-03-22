package com.dkc.applaunchh.weatherapp.userlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u001a\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014R\u0014\u0010\u0005\u001a\u00020\u00068TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00038TX\u0094\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\""}, d2 = {"Lcom/dkc/applaunchh/weatherapp/userlist/UserListFragment;", "Lcom/dkc/applaunchh/weatherapp/base/BaseFragment;", "Lcom/dkc/applaunchh/weatherapp/databinding/UserListFragmentBinding;", "Lcom/dkc/applaunchh/weatherapp/userlist/UserListViewModel;", "()V", "layoutId", "", "getLayoutId", "()I", "userList", "", "Lcom/dkc/applaunchh/weatherapp/db/entity/UserDetailEntity;", "getUserList", "()Ljava/util/List;", "setUserList", "(Ljava/util/List;)V", "userListAdapter", "Lcom/dkc/applaunchh/weatherapp/userlist/UserListAdapter;", "getUserListAdapter", "()Lcom/dkc/applaunchh/weatherapp/userlist/UserListAdapter;", "setUserListAdapter", "(Lcom/dkc/applaunchh/weatherapp/userlist/UserListAdapter;)V", "viewModel", "getViewModel", "()Lcom/dkc/applaunchh/weatherapp/userlist/UserListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "init", "", "onReady", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class UserListFragment extends com.dkc.applaunchh.weatherapp.base.BaseFragment<com.dkc.applaunchh.weatherapp.databinding.UserListFragmentBinding, com.dkc.applaunchh.weatherapp.userlist.UserListViewModel> {
    public java.util.List<com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity> userList;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject
    public com.dkc.applaunchh.weatherapp.userlist.UserListAdapter userListAdapter;
    
    public UserListFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity> getUserList() {
        return null;
    }
    
    public final void setUserList(@org.jetbrains.annotations.NotNull
    java.util.List<com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity> p0) {
    }
    
    @java.lang.Override
    protected int getLayoutId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected com.dkc.applaunchh.weatherapp.userlist.UserListViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.dkc.applaunchh.weatherapp.userlist.UserListAdapter getUserListAdapter() {
        return null;
    }
    
    public final void setUserListAdapter(@org.jetbrains.annotations.NotNull
    com.dkc.applaunchh.weatherapp.userlist.UserListAdapter p0) {
    }
    
    @java.lang.Override
    protected void onReady(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
}