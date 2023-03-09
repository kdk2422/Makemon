package com.example.makemon.data

import android.widget.ImageView

data class ImageData(
    val image: ImageView,
    val speed: Float = kotlin.random.Random.nextInt(1, 10).toFloat()
)