package com.dkc.applaunchh.weatherapp.navigation

import androidx.navigation.NavDirections

sealed class NavigationCommand{
    data class ToDirection(val directions: NavDirections) : NavigationCommand()
    object Back : NavigationCommand()
}
