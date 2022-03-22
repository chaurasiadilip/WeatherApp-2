package com.dkc.applaunchh.weatherapp.userdetail;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.dkc.applaunchh.weatherapp.R;

public class UserDetailFragmentDirections {
  private UserDetailFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionUserDetailFragmentUserListFragment() {
    return new ActionOnlyNavDirections(R.id.action_UserDetailFragment_userListFragment);
  }
}
