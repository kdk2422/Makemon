package com.example.makemon.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.media.Image
import android.util.Log
import android.view.DragEvent
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.View.OnDragListener
import android.view.View.OnTouchListener
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.makemon.R


class ImageAdapter internal constructor(context: Context) : PagerAdapter() {
    var mContext: Context

    var initX = 0f
    var moveX = 0f

    private var layoutInflater: LayoutInflater? = null

    val sliderImageId = arrayOf(
        R.drawable.image_one,
        R.drawable.image_one,
        R.drawable.image_one,
        R.drawable.image_one,
        R.drawable.image_one
    )

    init {
        mContext = context
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun getCount(): Int {
        return sliderImageId.size
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater = mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.recycle_item_two, null)
        val image = v.findViewById<View>(R.id.itemImage) as ImageView

        image.setImageResource(sliderImageId[position])
        val vp = container as ViewPager
        vp.addView(v, 0)

        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }
}