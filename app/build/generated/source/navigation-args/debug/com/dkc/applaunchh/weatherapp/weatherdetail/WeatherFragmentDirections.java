package com.dkc.applaunchh.weatherapp.weatherdetail;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.dkc.applaunchh.weatherapp.R;

public class WeatherFragmentDirections {
  private WeatherFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionWeatherFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_weatherFragment_to_homeFragment);
  }
}
