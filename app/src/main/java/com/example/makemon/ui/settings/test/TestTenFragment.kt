package com.example.makemon.ui.settings.test

import android.annotation.SuppressLint
import android.graphics.Matrix
import android.graphics.PointF
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.makemon.R
import com.example.makemon.databinding.FragmentTestTenBinding
import kotlin.math.atan2
import kotlin.math.sqrt


class TestTenFragment : Fragment(), View.OnTouchListener, View.OnClickListener {

    lateinit var binding: FragmentTestTenBinding

    enum class TouchMode {
        NONE,
        SINGLE,
        MULTI
    }

    private var imageView: ImageView? = null
    private var touchMode: TouchMode? = null

    private var matrix: Matrix? = null          // 기존 매트릭스
    private var savedMatrix: Matrix? = null     // 작업 후 이미지에 매핑할 매트릭스

    private var startPoint: PointF? = null      // 한손가락 터치 이동 포인트
    private var midPoint: PointF? = null        // 두손가락 터치 시 중신 포인트
    private var oldDistance = 0f                // 터치 시 두손가락 사이의 거리

    private var oldDegree = 0.0                 // 두손가락의 각도

    private var initMatrix: Matrix? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestTenBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        matrix = Matrix()
        savedMatrix = Matrix()
        initMatrix = Matrix()

        initMatrix!!.set(matrix)

        imageView = binding.zoomInImage
        imageView!!.setOnTouchListener(this)
        imageView!!.scaleType = ImageView.ScaleType.MATRIX

        binding.btReset.setOnClickListener(this)
    }

    override fun onResume() {
        super.onResume()

        if (startPoint == null) {
            binding.btReset.isClickable = false
        }

        val width = binding.zoomInImage.layoutParams.width
        val height = binding.zoomInImage.layoutParams.height
        Log.w("TestTenFragment", "init image view width: $width")
        Log.w("TestTenFragment", "init image view height: $height")

        Log.w("TestTenFragment", "init image view x: ${binding.zoomInImage.x}")
        Log.w("TestTenFragment", "init image view y: ${binding.zoomInImage.y}")
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.btReset -> {
                    matrix!!.set(initMatrix)
                    matrix!!.postTranslate(0f, 0f)
                    imageView!!.imageMatrix = matrix
                }
            }
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        if (v!! == imageView) {
            val action = event!!.action
            when (action and MotionEvent.ACTION_MASK) {
                MotionEvent.ACTION_DOWN -> {
                    touchMode = TouchMode.SINGLE
                    downSingleEvent(event)
                }
                MotionEvent.ACTION_POINTER_DOWN -> if (event.pointerCount == 2) { // 두손가락 터치를 했을 때
                    touchMode = TouchMode.MULTI
                    downMultiEvent(event)
                }
                MotionEvent.ACTION_MOVE -> if (touchMode === TouchMode.SINGLE) {
                    moveSingleEvent(event)
                } else if (touchMode === TouchMode.MULTI) {
                    moveMultiEvent(event)
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_POINTER_UP -> touchMode = TouchMode.NONE
            }
        }
        return true
    }

    // 두 손가락 사이의 중심을 구하는 함수
    private fun getMidPoint(e: MotionEvent): PointF {
        val x = (e.getX(0) + e.getX(1)) / 2
        val y = (e.getY(0) + e.getY(1)) / 2
        return PointF(x, y)
    }

    // 두 손가락 사이의 거리를 구하는 함수
    private fun getDistance(e: MotionEvent): Float {
        val x = e.getX(0) - e.getX(1)
        val y = e.getY(0) - e.getY(1)
        return sqrt((x * x + y * y).toDouble()).toFloat()
    }

    // 한손가락으로 눌렀을 때 시작지점을 저장
    private fun downSingleEvent(event: MotionEvent) {
        savedMatrix!!.set(matrix)
        startPoint = PointF(event.x, event.y)
        binding.btReset.isClickable = true
    }

    // 두손가락으로 눌렀을 때 두손가락의 중심점과 각도를 구하는 함수
    private fun downMultiEvent(event: MotionEvent) {
        oldDistance = getDistance(event)
        if (oldDistance > 5f) {
            savedMatrix!!.set(matrix)
            midPoint = getMidPoint(event)
            val radian =
                atan2((event.y - midPoint!!.y).toDouble(), (event.x - midPoint!!.x).toDouble())
            oldDegree = radian * 180 / Math.PI
        }
    }

    // 한손가락으로 움직일시 이미지가 이동
    private fun moveSingleEvent(event: MotionEvent) {
        matrix!!.set(savedMatrix)
        matrix!!.postTranslate(event.x - startPoint!!.x, event.y - startPoint!!.y)
        imageView!!.imageMatrix = matrix
    }

    private fun moveMultiEvent(event: MotionEvent) {
        val newDistance = getDistance(event)
        if (newDistance > 5f) {
            matrix!!.set(savedMatrix)
            val scale = newDistance / oldDistance
            matrix!!.postScale(scale, scale, midPoint!!.x, midPoint!!.y)
            val nowRadian =
                atan2((event.y - midPoint!!.y).toDouble(), (event.x - midPoint!!.x).toDouble())
            val nowDegress = nowRadian * 180 / Math.PI
            val degree = (nowDegress - oldDegree).toFloat()
            matrix!!.postRotate(degree, midPoint!!.x, midPoint!!.y)
            imageView!!.imageMatrix = matrix
        }
    }
}