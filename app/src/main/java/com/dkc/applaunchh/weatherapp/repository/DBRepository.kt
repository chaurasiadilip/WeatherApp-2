package com.dkc.applaunchh.weatherapp.repository

import androidx.lifecycle.LiveData
import com.dkc.applaunchh.weatherapp.db.AppDatabase
import com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity
import javax.inject.Inject

class DBRepository @Inject constructor(val database: AppDatabase) {

    suspend fun  insertUserDetails(userDetailEntity: UserDetailEntity):Long{
         return database.userDetailsDao().insert(userDetailEntity)
    }

    suspend fun deleteUserDetail(userDetailEntity: UserDetailEntity) {
        database.userDetailsDao().delete(userDetailEntity);
    }

    fun getAllUserDetails():LiveData<MutableList<UserDetailEntity>>{
        return database.userDetailsDao().getAllUserDetails()
    }
}