// Generated by data binding compiler. Do not edit!
package com.dkc.applaunchh.weatherapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dkc.applaunchh.weatherapp.R;
import com.dkc.applaunchh.weatherapp.userlist.UserListViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class UserListFragmentBinding extends ViewDataBinding {
  @NonNull
  public final FloatingActionButton add;

  @NonNull
  public final TextView errorMessage;

  @NonNull
  public final RecyclerView recyclervview;

  @Bindable
  protected UserListViewModel mViewModel;

  protected UserListFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FloatingActionButton add, TextView errorMessage, RecyclerView recyclervview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.add = add;
    this.errorMessage = errorMessage;
    this.recyclervview = recyclervview;
  }

  public abstract void setViewModel(@Nullable UserListViewModel viewModel);

  @Nullable
  public UserListViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static UserListFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.user_list_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static UserListFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<UserListFragmentBinding>inflateInternal(inflater, R.layout.user_list_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static UserListFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.user_list_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static UserListFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<UserListFragmentBinding>inflateInternal(inflater, R.layout.user_list_fragment, null, false, component);
  }

  public static UserListFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static UserListFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (UserListFragmentBinding)bind(component, view, R.layout.user_list_fragment);
  }
}
