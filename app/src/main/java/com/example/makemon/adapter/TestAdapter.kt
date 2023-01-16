package com.example.makemon.adapter

import android.content.Context
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.makemon.R


class ImageAdapter internal constructor(context: Context) : PagerAdapter() {
    var mContext: Context
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as ImageView
    }

    private val sliderImageId = intArrayOf(
        R.drawable.image_one,
        R.drawable.image_one,
        R.drawable.image_one,
        R.drawable.image_one,
        R.drawable.image_one
    )

    init {
        mContext = context
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val imageView = ImageView(mContext)
        imageView.scaleType = ImageView.ScaleType.CENTER_CROP
        imageView.setImageResource(sliderImageId[position])
        val width = imageView.maxHeight
        val height = imageView.maxHeight
        Log.w("TestAdapter", "w: $width, h: $height")
        (container as ViewPager).addView(imageView, 0)
        return imageView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        (container as ViewPager).removeView(`object` as ImageView)
    }

    override fun getCount(): Int {
        return sliderImageId.size
    }
}