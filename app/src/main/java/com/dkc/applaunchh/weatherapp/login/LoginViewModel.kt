package com.dkc.applaunchh.weatherapp.login


import android.content.SharedPreferences
import android.view.View
import androidx.lifecycle.MutableLiveData
import com.dkc.applaunchh.weatherapp.base.BaseViewModel
import com.dkc.applaunchh.weatherapp.model.User
import com.dkc.applaunchh.weatherapp.utils.PreferenceHelper.userLoggedIn
import com.dkc.applaunchh.weatherapp.utils.TextUtils
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(val sharedPreferences: SharedPreferences) : BaseViewModel() {
    val SUCCESS ="Success"
    var emailLiveData = MutableLiveData<String>()
    var passwordLiveData  = MutableLiveData<String>()
    var error =  MutableLiveData<String>()
    var userMutableLiveData = MutableLiveData<User>()


    fun onSubmit(view:View ){
        var message = TextUtils.checkLogin(emailLiveData.value,passwordLiveData.value )
       if(message == SUCCESS){
           userMutableLiveData.value = User(emailLiveData.value ,passwordLiveData.value )
       } else{
           error.value =message
       }
    }

    fun launchUserList(){
        sharedPreferences.userLoggedIn = true
        navigate(LoginFragmentDirections.actionHomeFragmentUserListFragment())
    }

}
