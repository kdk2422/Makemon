package com.example.makemon.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.makemon.R
import com.example.makemon.data.preference.AppDataStore
import com.example.makemon.databinding.FragmentMainBinding
import com.example.makemon.di.Injectable
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class MainFragment : Fragment(), View.OnClickListener, Injectable {

    lateinit var binding: FragmentMainBinding

    private var touchCount = 0

    private lateinit var appDataStore: AppDataStore

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(requireActivity() as MainActivity) {
            setTitleText(R.string.appbar_title_home)
            setToolbarBackVisibility(false)
        }

        appDataStore = AppDataStore(requireContext())

        binding.mainLogo.setOnClickListener(this)

        val anim = AnimationUtils.loadAnimation(requireActivity(), R.anim.main_logo_animation)
        binding.mainLogo.startAnimation(anim)
    }

    override fun onResume() {
        super.onResume()

        lifecycleScope.launch {
            Log.w("MainFragment", "Tester: ${appDataStore.getTesterKey()}")
            delay(2000)
            autoScroll()
        }
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.mainLogo -> {
                    touchCount++

                    if (touchCount == 5) {
                        lifecycleScope.launch(Dispatchers.Main) {
                            Toast.makeText(requireContext(), "You're a Tester now!!\nGO TO SETTING!!", Toast.LENGTH_SHORT).show()
                            withContext(Dispatchers.IO) {
                                appDataStore.setTesterKey(true)
                                Log.w("MainFragment", "Tester: ${appDataStore.getTesterKey()}")
                            }
                        }
                    }
                }
            }
        }
    }

    private fun autoScroll() {
        val handler = Handler(Looper.getMainLooper())

        val SCROLL_DELAY: Long = 20 // 스크롤 딜레이(ms)
        val SCROLL_AMOUNT: Int = 5 // 스크롤 양(px)

        val runnable = object : Runnable {
            override fun run() {
                binding.scrollView.scrollBy(0, SCROLL_AMOUNT)
                handler.postDelayed(this, SCROLL_DELAY)

                if (!binding.scrollView.canScrollVertically(1)) {
                    handler.removeCallbacks(this)
                    handler.postDelayed({ binding.scrollView.scrollTo(0, 0) }, 2000) // 스크롤이 끝나면 2초 후에 자동으로 처음으로 스크롤
                }
            }
        }

        handler.postDelayed(runnable, SCROLL_DELAY)
    }
}