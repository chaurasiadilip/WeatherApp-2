package com.dkc.applaunchh.weatherapp.utils

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.dkc.applaunchh.weatherapp.utils.Constants.KEY_USER_LOGGED_IN
import com.dkc.applaunchh.weatherapp.utils.Constants.PREFS_NAME

object PreferenceHelper {

    fun defaultPreference(context: Context): SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)

    fun customPreference(context: Context): SharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    inline fun SharedPreferences.editMe(operation: (SharedPreferences.Editor) -> Unit) {
        val editMe = edit()
        operation(editMe)
        editMe.apply()
    }

    var SharedPreferences.userLoggedIn
        get() = getBoolean(KEY_USER_LOGGED_IN, false)
        set(value) {
            editMe {
                it.putBoolean(KEY_USER_LOGGED_IN, value)
            }
        }

    var SharedPreferences.clearValues
        get() = { }
        set(value) {
            editMe {
                it.clear()
            }
        }
}