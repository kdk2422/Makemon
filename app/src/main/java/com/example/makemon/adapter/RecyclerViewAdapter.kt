package com.example.makemon.adapter

import android.content.Intent
import android.graphics.Paint
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.makemon.data.Data
import com.example.makemon.data.Item
import com.example.makemon.databinding.RecycleItemTwoBinding

class RecyclerViewAdapter(val data: Data) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    override fun getItemCount(): Int = data.items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val binding = RecycleItemTwoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data.items[position])
    }

    inner class ViewHolder(private val binding: RecycleItemTwoBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(data: Item){

            binding.textTilte.text = "title: ${data.title}"

            Glide.with(binding.root.context).load(data.image)
                .apply(RequestOptions().override(ConstraintLayout.LayoutParams.WRAP_CONTENT,ConstraintLayout.LayoutParams.WRAP_CONTENT))
                .into(binding.imageView)

            binding.textLink.apply {
                this.text = "link: ${data.link}"
                this.setOnClickListener {
                    val uri = Uri.parse("${data.link}")
                    val i = Intent(Intent.ACTION_VIEW, uri)
                    binding.root.context.startActivity(i)
                }
                this.paintFlags = Paint.UNDERLINE_TEXT_FLAG
            }
        }
    }
}