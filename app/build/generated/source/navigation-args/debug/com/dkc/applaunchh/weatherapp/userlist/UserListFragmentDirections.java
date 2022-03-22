package com.dkc.applaunchh.weatherapp.userlist;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.dkc.applaunchh.weatherapp.R;

public class UserListFragmentDirections {
  private UserListFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionUserListFragmentUserDetailfragmment() {
    return new ActionOnlyNavDirections(R.id.action_userListFragment_userDetailfragmment);
  }

  @NonNull
  public static NavDirections actionUserListFragmentWeatherFragment() {
    return new ActionOnlyNavDirections(R.id.action_userListFragment_weatherFragment);
  }
}
