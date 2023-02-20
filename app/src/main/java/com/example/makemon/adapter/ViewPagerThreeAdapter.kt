package com.example.makemon.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.makemon.data.Character
import com.example.makemon.data.listDataThree
import com.example.makemon.databinding.RecycleItemBinding

class ViewPagerThreeAdapter : RecyclerView.Adapter<ViewPagerThreeAdapter.ViewHolder>() {
    val data = listDataThree

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val binding = RecycleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position % listDataThree.size], position)
        Log.w("ViewPagerFiveAdapter", "listDataThree: ${listDataThree.size}")
    }

    override fun getItemCount(): Int = listDataThree.size

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    inner class ViewHolder(private val binding: RecycleItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(data: Character, index: Int){
            binding.itemImage.setImageResource(data.image)
            binding.textKind.text = data.information[0].kind
            binding.textTribe.text = data.information[0].tribe
            binding.textGender.text = data.information[0].gender
            binding.textRank.text = data.information[0].rank
            binding.textWord.text = data.information[0].word
            binding.textInfo.text = data.information[0].info
        }
    }
}