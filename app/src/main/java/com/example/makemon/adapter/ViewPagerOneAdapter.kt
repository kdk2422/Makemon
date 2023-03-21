package com.example.makemon.adapter

import android.graphics.Paint
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.makemon.R
import com.example.makemon.data.CharacterOne
import com.example.makemon.data.listDataOne
import com.example.makemon.databinding.RecycleItemBinding
import com.skydoves.balloon.ArrowPositionRules
import com.skydoves.balloon.Balloon
import com.skydoves.balloon.BalloonAnimation
import com.skydoves.balloon.BalloonSizeSpec


class ViewPagerOneAdapter : RecyclerView.Adapter<ViewPagerOneAdapter.ViewHolder>() {
    val data = listDataOne

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val binding = RecycleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position % listDataOne.size])
        Log.w("ViewPagerOneAdapter", "listDataOne: ${listDataOne.size}")
    }

    override fun getItemCount(): Int = listDataOne.size

    override fun getItemId(position: Int): Long {
        return super.getItemId(position)
    }

    inner class ViewHolder(private val binding: RecycleItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(data: CharacterOne){

            val balloon = Balloon.Builder(binding.root.context)
                .setWidthRatio(0.5f)
                .setHeight(BalloonSizeSpec.WRAP)
                .setWidth(BalloonSizeSpec.WRAP)
                .setText(data.information[0].tribeInfo)
                .setTextColorResource(R.color.black)
                .setTextSize(15f)
                .setArrowPositionRules(ArrowPositionRules.ALIGN_ANCHOR)
                .setArrowSize(10)
                .setArrowPosition(0.5f)
                .setPadding(10)
                .setBackgroundDrawableResource(R.drawable.tooltip_layout)
                .setBalloonAnimation(BalloonAnimation.ELASTIC)
//                .setIconDrawableResource(R.drawable.ic_edit)
//                .setLifecycleOwner(lifecycle)
//                .setCornerRadius(8f)
//                .setBackgroundColorResource(R.color.tooltip_bg_color)
                .build()

            binding.title.setText(data.title)
            binding.itemImage.setImageResource(data.image)
            binding.textName.setText(data.information[0].name)
            binding.textTribe.apply {
                this.text = data.information[0].tribe
//                this.paintFlags = Paint.UNDERLINE_TEXT_FLAG
//                this.setOnClickListener {
//                    balloon.showAlignTop(binding.textName)
//                }
            }
            binding.textGender.text = data.information[0].gender
            binding.textRank.text = data.information[0].rank
            binding.textWord.text = data.information[0].word
            binding.textInfo.text = data.information[0].info
        }
    }
}