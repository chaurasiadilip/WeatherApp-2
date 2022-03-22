package com.dkc.applaunchh.weatherapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.dkc.applaunchh.weatherapp.databinding.AdapterUserlistItemBindingImpl;
import com.dkc.applaunchh.weatherapp.databinding.HomeFragmentBindingImpl;
import com.dkc.applaunchh.weatherapp.databinding.LayoutSplashBindingImpl;
import com.dkc.applaunchh.weatherapp.databinding.UserDetailFragmentBindingImpl;
import com.dkc.applaunchh.weatherapp.databinding.UserListFragmentBindingImpl;
import com.dkc.applaunchh.weatherapp.databinding.WeatherFragmentBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ADAPTERUSERLISTITEM = 1;

  private static final int LAYOUT_HOMEFRAGMENT = 2;

  private static final int LAYOUT_LAYOUTSPLASH = 3;

  private static final int LAYOUT_USERDETAILFRAGMENT = 4;

  private static final int LAYOUT_USERLISTFRAGMENT = 5;

  private static final int LAYOUT_WEATHERFRAGMENT = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dkc.applaunchh.weatherapp.R.layout.adapter_userlist_item, LAYOUT_ADAPTERUSERLISTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dkc.applaunchh.weatherapp.R.layout.home_fragment, LAYOUT_HOMEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dkc.applaunchh.weatherapp.R.layout.layout_splash, LAYOUT_LAYOUTSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dkc.applaunchh.weatherapp.R.layout.user_detail_fragment, LAYOUT_USERDETAILFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dkc.applaunchh.weatherapp.R.layout.user_list_fragment, LAYOUT_USERLISTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.dkc.applaunchh.weatherapp.R.layout.weather_fragment, LAYOUT_WEATHERFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ADAPTERUSERLISTITEM: {
          if ("layout/adapter_userlist_item_0".equals(tag)) {
            return new AdapterUserlistItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for adapter_userlist_item is invalid. Received: " + tag);
        }
        case  LAYOUT_HOMEFRAGMENT: {
          if ("layout/home_fragment_0".equals(tag)) {
            return new HomeFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSPLASH: {
          if ("layout/layout_splash_0".equals(tag)) {
            return new LayoutSplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_USERDETAILFRAGMENT: {
          if ("layout/user_detail_fragment_0".equals(tag)) {
            return new UserDetailFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for user_detail_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_USERLISTFRAGMENT: {
          if ("layout/user_list_fragment_0".equals(tag)) {
            return new UserListFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for user_list_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_WEATHERFRAGMENT: {
          if ("layout/weather_fragment_0".equals(tag)) {
            return new WeatherFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for weather_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/adapter_userlist_item_0", com.dkc.applaunchh.weatherapp.R.layout.adapter_userlist_item);
      sKeys.put("layout/home_fragment_0", com.dkc.applaunchh.weatherapp.R.layout.home_fragment);
      sKeys.put("layout/layout_splash_0", com.dkc.applaunchh.weatherapp.R.layout.layout_splash);
      sKeys.put("layout/user_detail_fragment_0", com.dkc.applaunchh.weatherapp.R.layout.user_detail_fragment);
      sKeys.put("layout/user_list_fragment_0", com.dkc.applaunchh.weatherapp.R.layout.user_list_fragment);
      sKeys.put("layout/weather_fragment_0", com.dkc.applaunchh.weatherapp.R.layout.weather_fragment);
    }
  }
}
