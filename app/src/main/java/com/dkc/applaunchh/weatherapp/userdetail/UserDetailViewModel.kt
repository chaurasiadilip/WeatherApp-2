package com.dkc.applaunchh.weatherapp.userdetail

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.viewModelScope
import com.dkc.applaunchh.weatherapp.base.BaseViewModel
import com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity
import com.dkc.applaunchh.weatherapp.repository.DBRepository
import com.dkc.applaunchh.weatherapp.utils.Constants.SUCCESS
import com.dkc.applaunchh.weatherapp.utils.DataHandler

import com.dkc.applaunchh.weatherapp.utils.TextUtils
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserDetailViewModel @Inject constructor( val dbRepository: DBRepository) : BaseViewModel() {
    var emailLiveData = MutableLiveData<String>()
    var firstNameLiveData  = MutableLiveData<String>()
    var error = MutableLiveData<String>()
    var laslnameLiveData = MutableLiveData<String>()






    fun onSaveUserAccount(view:View){
        var message = TextUtils.checkUserDetail(firstNameLiveData.value,laslnameLiveData.value, emailLiveData.value)
        if(message != SUCCESS) {
            error.value = message
          }
        else{
            viewModelScope.launch {
                var long= dbRepository.insertUserDetails(UserDetailEntity(firstNameLiveData.value,laslnameLiveData.value, emailLiveData.value,""))
                navigate(UserDetailFragmentDirections.actionUserDetailFragmentUserListFragment())
            }
        }
    }

    fun onCancel(view: View){
        navigate(UserDetailFragmentDirections.actionUserDetailFragmentUserListFragment())
    }
}