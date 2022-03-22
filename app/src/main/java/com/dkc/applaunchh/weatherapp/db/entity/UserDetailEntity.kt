package com.dkc.applaunchh.weatherapp.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "UserDetails")
data class UserDetailEntity(

    var firstname: String?,
    var lastname: String?,
    var email: String?,
    var profilepic: String?,
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
)
