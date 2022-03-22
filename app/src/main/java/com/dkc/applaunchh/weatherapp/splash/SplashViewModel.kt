package com.dkc.applaunchh.weatherapp.splash

import android.content.SharedPreferences
import androidx.lifecycle.viewModelScope
import com.dkc.applaunchh.weatherapp.base.BaseViewModel
import com.dkc.applaunchh.weatherapp.utils.PreferenceHelper.userLoggedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(val sharedPreferences: SharedPreferences) :BaseViewModel(){
    init {
        viewModelScope.launch {
            delay(3000)
            if(!sharedPreferences.userLoggedIn) {
                navigate(SplashFragmentDirections.actionSplashFragmentToHomeFragment())
            }else{
                navigate(SplashFragmentDirections.actionSplashFragmentToUserListFragment())
            }
        }
    }
}

