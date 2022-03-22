package com.dkc.applaunchh.weatherapp.splash

import android.os.Bundle
import android.view.View

import androidx.fragment.app.viewModels
import com.dkc.applaunchh.weatherapp.R
import com.dkc.applaunchh.weatherapp.base.BaseFragment
import com.dkc.applaunchh.weatherapp.databinding.LayoutSplashBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashFragment : BaseFragment<LayoutSplashBinding, SplashViewModel>() {
    override val layoutId: Int
        get() = R.layout.layout_splash

    override val viewModel: SplashViewModel by viewModels()

    override fun onReady(view: View, savedInstanceState: Bundle?) { }

}