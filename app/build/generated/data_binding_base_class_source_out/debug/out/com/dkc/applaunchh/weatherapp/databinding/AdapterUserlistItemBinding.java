// Generated by data binding compiler. Do not edit!
package com.dkc.applaunchh.weatherapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.dkc.applaunchh.weatherapp.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class AdapterUserlistItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView email;

  @NonNull
  public final TextView fname;

  @NonNull
  public final ImageView ivArticle;

  @NonNull
  public final TextView lname;

  protected AdapterUserlistItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView email, TextView fname, ImageView ivArticle, TextView lname) {
    super(_bindingComponent, _root, _localFieldCount);
    this.email = email;
    this.fname = fname;
    this.ivArticle = ivArticle;
    this.lname = lname;
  }

  @NonNull
  public static AdapterUserlistItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_userlist_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AdapterUserlistItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AdapterUserlistItemBinding>inflateInternal(inflater, R.layout.adapter_userlist_item, root, attachToRoot, component);
  }

  @NonNull
  public static AdapterUserlistItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.adapter_userlist_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AdapterUserlistItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AdapterUserlistItemBinding>inflateInternal(inflater, R.layout.adapter_userlist_item, null, false, component);
  }

  public static AdapterUserlistItemBinding bind(@NonNull View view) {
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
  public static AdapterUserlistItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (AdapterUserlistItemBinding)bind(component, view, R.layout.adapter_userlist_item);
  }
}
