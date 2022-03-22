package com.dkc.applaunchh.weatherapp.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.dkc.applaunchh.weatherapp.R
import com.dkc.applaunchh.weatherapp.base.BaseFragment
import com.dkc.applaunchh.weatherapp.databinding.HomeFragmentBinding
import com.dkc.applaunchh.weatherapp.utils.TextUtils
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : BaseFragment<HomeFragmentBinding, LoginViewModel>() {
    override val layoutId: Int
        get() = R.layout.home_fragment

    override val viewModel: LoginViewModel by viewModels()

    override fun onReady(view: View,savedInstanceState: Bundle?) {
        viewModel.userMutableLiveData.observe(this, Observer { it ->
            binding.texterror.visibility = View.GONE
            if (TextUtils.validateCredential(context, it.emailId, it.pass)) {
                viewModel.launchUserList()
            } else {
                binding.texterror.visibility = View.VISIBLE
                binding.texterror.text = "Please Enter valid Email & Pass"
            }
        })
    }

}