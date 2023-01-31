package com.example.makemon.ui.test

import android.app.ActionBar.LayoutParams
import android.graphics.Bitmap
import android.graphics.Canvas
import android.media.MediaScannerConnection
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.view.animation.ScaleAnimation
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.window.layout.WindowMetricsCalculator
import com.example.makemon.R
import com.example.makemon.databinding.FragmentTestThreeBinding
import com.example.makemon.databinding.FragmentTestTwoBinding
import com.example.makemon.ui.settings.SettingsActivity
import com.example.makemon.utils.getFormattedDateFromString
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.Date


class TestThreeFragment : Fragment(), View.OnClickListener {

    lateinit var binding: FragmentTestThreeBinding

    private var isChangeView = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestThreeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.expandedView.setOnClickListener(this)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.expandedView -> {
                    if (!isChangeView) {
                        val anim = AnimationUtils.loadAnimation(requireActivity(), R.anim.expaned)
                        binding.expandedView.startAnimation(anim)
                        binding.expandedView.animate().withLayer()
                        lifecycleScope.launch {
                            binding.expandedView.isClickable = false
                            delay(500)
                            binding.expandedView.isClickable = true
                        }
                        isChangeView = true
                    } else {
                        val animTwo = AnimationUtils.loadAnimation(requireActivity(), R.anim.unexpaned)
                        binding.expandedView.startAnimation(animTwo)
                        lifecycleScope.launch {
                            binding.expandedView.isClickable = false
                            delay(500)
                            binding.expandedView.isClickable = true
                        }
                        isChangeView = false
                    }
                }
            }
        }
    }
}