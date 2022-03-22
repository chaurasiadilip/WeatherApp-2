package com.dkc.applaunchh.weatherapp.login;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.dkc.applaunchh.weatherapp.R;

public class LoginFragmentDirections {
  private LoginFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeFragmentUserListFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_userListFragment);
  }
}
