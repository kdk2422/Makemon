package com.example.makemon.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.makemon.databinding.CharacterListItemBinding
import com.example.makemon.ui.character_list.callback.CharacterCallback

class CharacterListAdapter(val data: List<Int>, val icon: List<Int>, private val beforeIndex: Int) : RecyclerView.Adapter<CharacterListAdapter.ViewHolder>() {

    private var characterCallback: CharacterCallback? = null
    fun setCharacterCallbackListener(listener: CharacterCallback) { this.characterCallback = listener }

    override fun getItemCount(): Int = data.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = CharacterListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position], icon[position], position)
    }

    inner class ViewHolder(private val binding: CharacterListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Int, icon: Int, position: Int) {
            binding.textName.setText(data)
            binding.icon.background = ContextCompat.getDrawable(binding.root.context, icon)
            binding.indexLayout.setOnClickListener {
                characterCallback?.selectedItem(position)
            }
        }
    }
}