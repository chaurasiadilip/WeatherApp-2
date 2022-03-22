package com.dkc.applaunchh.weatherapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dkc.applaunchh.weatherapp.db.dao.UserDetailsDao
import com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity

@Database(entities = [UserDetailEntity::class],version=1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun userDetailsDao(): UserDetailsDao
}