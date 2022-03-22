package com.dkc.applaunchh.weatherapp.splash;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.dkc.applaunchh.weatherapp.R;

public class SplashFragmentDirections {
  private SplashFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionSplashFragmentToHomeFragment() {
    return new ActionOnlyNavDirections(R.id.action_splashFragment_to_homeFragment);
  }

  @NonNull
  public static NavDirections actionSplashFragmentToUserListFragment() {
    return new ActionOnlyNavDirections(R.id.action_splashFragment_to_userListFragment);
  }
}
