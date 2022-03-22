package com.dkc.applaunchh.weatherapp.userlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u001a\u0010\u001b\u001a\u00020\u00112\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110\rR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00060\u00060\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR+\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/dkc/applaunchh/weatherapp/userlist/UserListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/dkc/applaunchh/weatherapp/userlist/UserListAdapter$ViewHolder;", "()V", "diffUtil", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/dkc/applaunchh/weatherapp/db/entity/UserDetailEntity;", "differ", "Landroidx/recyclerview/widget/AsyncListDiffer;", "kotlin.jvm.PlatformType", "getDiffer", "()Landroidx/recyclerview/widget/AsyncListDiffer;", "setOnUserClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "userdetail", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onUserClicked", "listener", "ViewHolder", "app_debug"})
public final class UserListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.dkc.applaunchh.weatherapp.userlist.UserListAdapter.ViewHolder> {
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity> diffUtil = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.AsyncListDiffer<com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity> differ = null;
    private kotlin.jvm.functions.Function1<? super com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity, kotlin.Unit> setOnUserClickListener;
    
    @javax.inject.Inject
    public UserListAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.recyclerview.widget.AsyncListDiffer<com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity> getDiffer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.dkc.applaunchh.weatherapp.userlist.UserListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.dkc.applaunchh.weatherapp.userlist.UserListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void onUserClicked(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity, kotlin.Unit> listener) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/dkc/applaunchh/weatherapp/userlist/UserListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/dkc/applaunchh/weatherapp/databinding/AdapterUserlistItemBinding;", "(Lcom/dkc/applaunchh/weatherapp/userlist/UserListAdapter;Lcom/dkc/applaunchh/weatherapp/databinding/AdapterUserlistItemBinding;)V", "getBinding", "()Lcom/dkc/applaunchh/weatherapp/databinding/AdapterUserlistItemBinding;", "bind", "", "item", "Lcom/dkc/applaunchh/weatherapp/db/entity/UserDetailEntity;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.dkc.applaunchh.weatherapp.databinding.AdapterUserlistItemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.dkc.applaunchh.weatherapp.databinding.AdapterUserlistItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.dkc.applaunchh.weatherapp.databinding.AdapterUserlistItemBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity item) {
        }
    }
}