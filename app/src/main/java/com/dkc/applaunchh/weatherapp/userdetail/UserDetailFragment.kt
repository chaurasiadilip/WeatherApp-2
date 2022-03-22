package com.dkc.applaunchh.weatherapp.userdetail


import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.dkc.applaunchh.weatherapp.R
import com.dkc.applaunchh.weatherapp.base.BaseFragment
import com.dkc.applaunchh.weatherapp.databinding.UserDetailFragmentBinding


import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserDetailFragment : BaseFragment<UserDetailFragmentBinding,UserDetailViewModel>() {

    override val layoutId: Int
        get() = R.layout.user_detail_fragment

    override val viewModel: UserDetailViewModel by viewModels()


    override fun onReady(view: View, savedInstanceState: Bundle?) {}

}