package com.example.makemon.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.makemon.data.CharacterSix
import com.example.makemon.data.listDataSix
import com.example.makemon.databinding.RecycleItemBinding

class ViewPagerSixAdapter : RecyclerView.Adapter<ViewPagerSixAdapter.ViewHolder>() {
    val data = listDataSix

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val binding = RecycleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position % listDataSix.size])
        Log.w("ViewPagerSixAdapter", "listDataSix: ${listDataSix.size}")
    }

    override fun getItemCount(): Int = listDataSix.size

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    inner class ViewHolder(private val binding: RecycleItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(data: CharacterSix){
            binding.title.setText(data.title)
            binding.itemImage.setImageResource(data.image)
            binding.textName.setText(data.information[0].name)
            binding.textTribe.text = data.information[0].tribe
            binding.textGender.text = data.information[0].gender
            binding.textRank.text = data.information[0].rank
            binding.textWord.text = data.information[0].word
            binding.textInfo.text = data.information[0].info
        }
    }
}