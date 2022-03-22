package com.dkc.applaunchh.weatherapp.weatherdetail

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.dkc.applaunchh.weatherapp.R
import com.dkc.applaunchh.weatherapp.base.BaseFragment
import com.dkc.applaunchh.weatherapp.databinding.WeatherFragmentBinding
import com.dkc.applaunchh.weatherapp.utils.DataHandler
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class WeatherFragment : BaseFragment<WeatherFragmentBinding, WeatherViewModel>() {
    lateinit var navController: NavController
    override val layoutId: Int
        get() = R.layout.weather_fragment

    override val viewModel: WeatherViewModel by viewModels()

    override fun onReady(view: View, savedInstanceState: Bundle?) {
        val navHostFragment =
            activity?.supportFragmentManager?.findFragmentById(R.id.demo_nav_host_fragment) as NavHostFragment
        navController = navHostFragment.findNavController()

        val appBarConfiguration = AppBarConfiguration(navController.graph)
        val toolbar = view.findViewById<Toolbar>(R.id.top_app_bar)
        var logout = toolbar.findViewById<ImageView>(R.id.loginText)
        logout.setOnClickListener {
            viewModel.logout()
        }
        view.findViewById<Toolbar>(R.id.top_app_bar)
            .setupWithNavController(navController, appBarConfiguration)
        init();

    }

    fun init() {
        viewModel.weathermap.observe(this, Observer { dataHandler ->
            when (dataHandler) {
                is DataHandler.SUCCESS -> {
                    binding.temp.text = dataHandler.data?.current?.temp.toString()
                    binding.weathertype.text = dataHandler.data?.current?.weather?.get(0)?.main
                    binding.humidity.text = dataHandler?.data?.current?.humidity.toString()
                    binding.windspeed.text = dataHandler?.data?.current?.wind_speed.toString()
                }
                is DataHandler.ERROR -> {}
                is DataHandler.LOADING -> {}
            }
        })
    }
}