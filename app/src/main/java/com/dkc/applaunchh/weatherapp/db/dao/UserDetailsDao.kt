package com.dkc.applaunchh.weatherapp.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity

@Dao
interface UserDetailsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(userEntityEntity: UserDetailEntity): Long

    // NOTE - Since we are already using LIVE-DATA no need to use suspend function
    @Query("SELECT * FROM UserDetails")
    fun getAllUserDetails(): LiveData<MutableList<UserDetailEntity>>

    @Delete
    suspend fun delete(userDetailEntity: UserDetailEntity)
}