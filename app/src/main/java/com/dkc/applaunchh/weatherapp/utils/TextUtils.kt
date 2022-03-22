package com.dkc.applaunchh.weatherapp.utils

import android.content.Context
import android.util.Patterns
import com.dkc.applaunchh.weatherapp.R


object TextUtils {

    public fun isEmailValid(emailId: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(emailId).matches()
    }

    private fun isPasswordLengthGreaterThanfive(password: String): Boolean {
        return password.length >= 5
    }

    fun checkUserDetail(firstName: String?, lastName:String?, emailId:String?): String{
        var message: String = ""
        if (firstName == null || lastName == null || emailId == null) {
            message = "Enter valid User details."
        } else if (!isEmailValid(emailId)) {
            message = "Enter valid Email Id"
        } else {
            message = "Success"
        }
        return message
    }


    fun checkLogin(emailId: String?, password: String?): String {
        var message: String = ""
        if (emailId == null || password == null) {
            message = "Enter valid Email Id and Password"
        } else if (!isEmailValid(emailId)) {
            message = "Enter valid Email Id"
        } else if (!isPasswordLengthGreaterThanfive(password)) {
            message = "Enter at least 6 Digit password"
        } else {
            message = "Success"
        }
        return message
    }

    fun validateCredential(contex: Context?, email:String?, password:String?):Boolean{
        return (email.equals(contex?.resources?.getString(R.string.email)) && password.equals(contex?.resources?.getString(R.string.pass)))
    }
}