package com.example.makemon.customView

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager
import android.util.AttributeSet
import android.view.View
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat.getSystemService
import java.util.Random


class BoxAnimationView(context: Context, attrs: AttributeSet) : View(context, attrs) {
    private val boxSize = 100f
    private var boxX = 0f
    private var boxY = 0f
    private var boxVelocityX = 10f
    private var boxVelocityY = 10f

    private val paint = Paint().apply {
        color = Color.BLACK
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.let {
            it.drawColor(Color.WHITE)
            it.drawRect(boxX, boxY, boxX + boxSize, boxY + boxSize, paint)

            boxX += boxVelocityX
            boxY += boxVelocityY

            if (boxX + boxSize > width || boxX < 0) {
                boxVelocityX = -boxVelocityX
                boxX += boxVelocityX

                randomColor()
                vibrator()
            }
            if (boxY + boxSize > height || boxY < 0) {
                boxVelocityY = -boxVelocityY
                boxY += boxVelocityY

                randomColor()
                vibrator()
            }

            invalidate()
        }
    }

    private fun randomColor() {
        val random = Random()
        paint.setARGB(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))
    }

    private fun vibrator() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            val vibratorManager = context.applicationContext.getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as VibratorManager
            val vibrator = vibratorManager.defaultVibrator

            // 1초 진동
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                vibrator.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE))
            } else {
                vibrator.vibrate(50)
            }

        } else {
            val vibrator = context.applicationContext.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator?

            // 1초 진동
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                vibrator!!.vibrate(VibrationEffect.createOneShot(50, VibrationEffect.DEFAULT_AMPLITUDE))
            } else {
                vibrator!!.vibrate(50)
            }

        }
    }
}