package com.dkc.applaunchh.weatherapp.userlist

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dkc.applaunchh.weatherapp.R
import com.dkc.applaunchh.weatherapp.base.BaseFragment
import com.dkc.applaunchh.weatherapp.databinding.UserListFragmentBinding
import com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity
import com.dkc.applaunchh.weatherapp.utils.DataHandler
import com.dkc.applaunchh.weatherapp.widget.SwipeToDeleteCallback
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class UserListFragment : BaseFragment<UserListFragmentBinding, UserListViewModel>() {
    lateinit var userList:MutableList<UserDetailEntity>
    override val layoutId: Int
        get() = R.layout.user_list_fragment

    override val viewModel: UserListViewModel by viewModels()

    @Inject
    lateinit var userListAdapter: UserListAdapter

    override fun onReady(view: View, savedInstanceState: Bundle?) {
        init()
        viewModel.userdetail.observe(this, Observer { dataHandler ->
            when (dataHandler) {
                is DataHandler.SUCCESS -> {
                    binding.recyclervview.visibility = View.VISIBLE
                    binding.errorMessage.visibility = View.GONE
                    userList = dataHandler.data!!
                    userListAdapter.differ.submitList(dataHandler.data)
                }
                is DataHandler.ERROR -> {
                    binding.recyclervview.visibility = View.GONE
                    binding.errorMessage.visibility = View.VISIBLE
                }
                is DataHandler.LOADING -> {

                }
            }
        })
    }

    private fun init() {
        val swipeHandler = object : SwipeToDeleteCallback(context) {
            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val adapter =  binding.recyclervview.adapter as UserListAdapter
                viewModel.onDeleteUser(userList.get(viewHolder.adapterPosition))
                userList.removeAt(viewHolder.adapterPosition)

                if(userList.isEmpty()){
                    binding.recyclervview.visibility = View.GONE
                    binding.errorMessage.visibility = View.VISIBLE
                }
                adapter.notifyDataSetChanged()
            }
        }
        val itemTouchHelper = ItemTouchHelper(swipeHandler)
        itemTouchHelper.attachToRecyclerView( binding.recyclervview)

        userListAdapter.onUserClicked {
            viewModel.onUserClick()
        }
        binding.recyclervview.apply {
            adapter = userListAdapter
            layoutManager = LinearLayoutManager(activity)
            addItemDecoration(
                DividerItemDecoration(
                    activity,
                    DividerItemDecoration.VERTICAL
                )
            )

        }

    }
}