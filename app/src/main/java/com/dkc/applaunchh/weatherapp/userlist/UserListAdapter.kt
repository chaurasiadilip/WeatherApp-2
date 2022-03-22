package com.dkc.applaunchh.weatherapp.userlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.dkc.applaunchh.weatherapp.databinding.AdapterUserlistItemBinding
import com.dkc.applaunchh.weatherapp.db.entity.UserDetailEntity
import javax.inject.Inject

class UserListAdapter @Inject constructor() : RecyclerView.Adapter<UserListAdapter.ViewHolder>() {


    private val diffUtil = object : DiffUtil.ItemCallback<UserDetailEntity>() {
        override fun areItemsTheSame(
            oldItem: UserDetailEntity,
            newItem: UserDetailEntity
        ): Boolean {
            return oldItem.firstname == newItem.firstname
        }

        override fun areContentsTheSame(
            oldItem: UserDetailEntity,
            newItem: UserDetailEntity
        ): Boolean {
            return oldItem == newItem
        }

    }
    val differ = AsyncListDiffer(this, diffUtil)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserListAdapter.ViewHolder {
        val binding =
            AdapterUserlistItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserListAdapter.ViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    inner class ViewHolder(val binding: AdapterUserlistItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: UserDetailEntity) {
            with(binding) {
                fname.text = item.firstname
                lname.text = item.lastname
                email.text = item.email
            }
            itemView.setOnClickListener {
                setOnUserClickListener?.let {
                    it(item)
                }
            }
        }

    }

    private var setOnUserClickListener: ((userdetail: UserDetailEntity) -> Unit)? = null

    fun onUserClicked(listener: (UserDetailEntity) -> Unit) {
        setOnUserClickListener = listener
    }

}