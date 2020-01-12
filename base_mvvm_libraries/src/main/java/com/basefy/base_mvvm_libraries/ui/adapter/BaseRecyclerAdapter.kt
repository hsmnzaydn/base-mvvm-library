package com.basefy.base_mvvm_libraries.ui.adapter

import android.annotation.SuppressLint
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

abstract class BaseRecyclerAdapter<M : RecyclerItem, VH : BaseViewHolder<M, ViewDataBinding>> :
    ListAdapter<M, VH>(DiffCallback<M>()) {


    override fun getItemViewType(position: Int) = getItem(position).layoutId
    override fun onBindViewHolder(holder: VH, position: Int) = holder.bindItem(getItem(position))
    abstract override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH
    override fun getItemId(position: Int) = getItem(position).hashCode().toLong()


    public open class DiffCallback<M : RecyclerItem> : DiffUtil.ItemCallback<M>() {
        override fun areItemsTheSame(oldItem: M, newItem: M):Boolean {

           return oldItem.hashCode() == newItem.hashCode()
        }

        @SuppressLint("DiffUtilEquals")
        override fun areContentsTheSame(oldItem: M, newItem: M) = oldItem == newItem
    }
}
