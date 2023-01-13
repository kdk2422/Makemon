package com.example.makemon.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.makemon.data.Data
import com.example.makemon.data.listDataFour
import com.example.makemon.databinding.RecycleItemBinding

class ViewPagerFourAdapter : RecyclerView.Adapter<ViewPagerFourAdapter.ViewHolder>() {
    val data = listDataFour

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val binding = RecycleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position % listDataFour.size], position)
    }

    override fun getItemCount(): Int = Int.MAX_VALUE

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    inner class ViewHolder(private val binding: RecycleItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(data: Data, index: Int){
//            binding.itemImage.setImageResource(data.image)
            binding.itemText.apply {
                this.text = data.title
            }
        }
    }
}