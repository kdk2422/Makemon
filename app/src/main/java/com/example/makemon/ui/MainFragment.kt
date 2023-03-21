package com.example.makemon.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.makemon.R
import com.example.makemon.databinding.FragmentMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


open class MainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding

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

        val anim = AnimationUtils.loadAnimation(requireActivity(), R.anim.main_logo_animation)
        binding.mainLogo.startAnimation(anim)
    }

    override fun onResume() {
        super.onResume()

        lifecycleScope.launch {
            delay(2000)
            autoScroll()
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