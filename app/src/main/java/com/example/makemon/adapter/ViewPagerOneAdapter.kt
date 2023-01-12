package com.example.makemon.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.makemon.databinding.RecycleItemBinding
import com.example.makemon.model.Data
import com.example.makemon.model.listDataOne


class ViewPagerOneAdapter : RecyclerView.Adapter<ViewPagerOneAdapter.ViewHolder>() {
    val data = listDataOne

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val binding = RecycleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position % listDataOne.size], position)
    }

    override fun getItemCount(): Int = Int.MAX_VALUE

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    inner class ViewHolder(private val binding: RecycleItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(data: Data, index: Int){
            binding.itemText.apply {
                this.text = data.title
            }
        }
    }
}