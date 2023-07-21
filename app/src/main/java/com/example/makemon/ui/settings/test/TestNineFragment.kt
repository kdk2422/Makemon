package com.example.makemon.ui.settings.test

import android.annotation.SuppressLint
import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.media.Image
import android.os.Build
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.ViewManager
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.makemon.R
import com.example.makemon.data.ImageData
import com.example.makemon.databinding.FragmentTestNineBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import java.util.Map.entry
import kotlin.random.Random


class TestNineFragment : Fragment(), SensorEventListener, View.OnClickListener {

    companion object {
        private const val VIEW_SIZE = 100
    }

    lateinit var binding: FragmentTestNineBinding

    private lateinit var sensorManager: SensorManager
    private var accelerometerSensor: Sensor? = null

    private val fallingModels: MutableList<ImageData> = mutableListOf()
    private val randomImageRes = listOf(
        R.drawable.ic_head,
        R.drawable.ic_home,
        R.drawable.ic_list,
    )

    private lateinit var image : ImageView

    private var ing = false
    private var toastShowing: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestNineBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btDeleteView.setOnClickListener(this)

        initSensorManager()
        initTouchListener()
    }

    override fun onResume() {
        super.onResume()
        // 리스너 등록
        sensorManager.registerListener(this, accelerometerSensor, SensorManager.SENSOR_DELAY_UI)
    }

    override fun onPause() {
        // 리스너 해제
        sensorManager.unregisterListener(this)
        super.onPause()
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.btDeleteView -> {
                    binding.root.removeAllViewsInLayout()
                }
            }
        }
    }

    private fun initSensorManager() {
        sensorManager = requireContext().applicationContext.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        accelerometerSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun initTouchListener() {
        binding.clickText.setOnTouchListener { _, event ->
            when (event.actionMasked) {
                MotionEvent.ACTION_DOWN -> {
                    if (!ing) {
                        autoAddView()
                    } else {
                        lifecycleScope.launch {
                            if (toastShowing) return@launch
                            if (!toastShowing) {
                                Toast.makeText(requireContext(), "현재 작업이 진행중입니다. 재시작을 원하시면 나갔다 돌아와주세요.", Toast.LENGTH_LONG).show().apply {
                                    toastShowing = true
                                }
                            }
                            delay(3000)
                            toastShowing = false
                        }
                    }
                    true
                }
                else -> true
            }
        }
    }

    private fun autoAddView() {
        lifecycleScope.launch(Dispatchers.Main) {
            ing = true
            for(i in 0 .. 100) {
                binding.clickText.text = i.toString()
                delay(500)
                val random = Random.nextInt(0, requireActivity().window.decorView.width)
                addImageView(random.toFloat(), 0f)
            }
            ing = false
        }
    }

    private fun addImageView(touchedX: Float, touchedY: Float) {
        image = ImageView(requireContext()).apply {
            setBackgroundResource(randomImageRes.random())
            // 2131165348, 2131165349, 2131165353
            layoutParams = LinearLayout.LayoutParams(VIEW_SIZE, VIEW_SIZE)
            /**
             * 좌표는 뷰의 왼쪽 상단이 기준점
             */
            x = touchedX - VIEW_SIZE / 2
            y = touchedY - VIEW_SIZE / 2
        }
        binding.root.addView(image)
        fallingModels.add(ImageData(image))
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (event?.sensor == accelerometerSensor) {
            fallingModels.map {
                val exX = event!!.values[0] * it.speed
                val exY = event.values[1] * it.speed

                /**
                 * x 좌표: 오른쪽은 -, 왼쪽은 + 좌표
                 * y 좌표: 위는 -, 아래는 + 좌표
                 */
                with(it.image) {
                    x -= exX
                    y += exY

                    if (x > getRealRootViewWidth()) {
                        x = getRealRootViewWidth().toFloat()
                    }
                    if (x < 0) {
                        x = 0f
                    }

                    if (y > getRealRootViewHeight()) {
                        y = getRealRootViewHeight().toFloat()
                    }
                    if (y < 0) {
                        y = 0f
                    }
                }
            }
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) = Unit

    // 화면 전체 가로 - 뷰 가로 -> 리턴
    private fun getRealRootViewWidth(): Int {
        return requireActivity().window.decorView.width - VIEW_SIZE
    }

    // 화면 전체 세로 - 뷰 세로 -> 리턴
    private fun getRealRootViewHeight(): Int {
        return requireActivity().window.decorView.height - VIEW_SIZE
    }

    private fun vibrator() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            val vibratorManager = requireContext().applicationContext.getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as VibratorManager
            val vibrator = vibratorManager.defaultVibrator

            // 1초 진동
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                vibrator.vibrate(VibrationEffect.createOneShot(10, VibrationEffect.DEFAULT_AMPLITUDE))
            } else {
                vibrator.vibrate(10)
            }

        } else {
            val vibrator = requireContext().applicationContext.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator?

            // 1초 진동
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                vibrator!!.vibrate(VibrationEffect.createOneShot(10, VibrationEffect.DEFAULT_AMPLITUDE))
            } else {
                vibrator!!.vibrate(10)
            }

        }
    }
}