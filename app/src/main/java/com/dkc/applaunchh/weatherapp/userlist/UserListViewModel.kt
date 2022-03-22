package com.dkc.applaunchh.weatherapp.userlist

import android.view.View
import androidx.lifecycle.Transformations
import androidx.lifecycle.viewModelScope
import com.dkc.applaunchh.weatherapp.base.BaseViewModel
import com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity
import com.dkc.applaunchh.weatherapp.repository.DBRepository
import com.dkc.applaunchh.weatherapp.utils.DataHandler
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserListViewModel @Inject constructor(val dbRepository: DBRepository): BaseViewModel() {

    var userdetail = Transformations.map(dbRepository.getAllUserDetails()){ it ->
        if(it.isNullOrEmpty()){
            DataHandler.ERROR(null, "LIST IS EMPTY OR NULL")
        }else{
            DataHandler.SUCCESS(it)
        }
    }

    fun onAddUser(view:View){
       navigate(UserListFragmentDirections.actionUserListFragmentUserDetailfragmment())
    }

    fun onUserClick(){
        navigate(UserListFragmentDirections.actionUserListFragmentWeatherFragment())
    }

    fun onDeleteUser(userDetailEntity: UserDetailEntity){
        viewModelScope.launch {
            dbRepository.deleteUserDetail(userDetailEntity)
        }
    }

}