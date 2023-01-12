package com.example.makemon.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import com.example.makemon.R
import com.example.makemon.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    companion object{
        const val TAG = "MainFragment"
    }

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
        Log.d(TAG, "onViewCreated")

        with(requireActivity() as MainActivity) {
            setTitleText(R.string.appbar_title_home)
        }

        val anim = AnimationUtils.loadAnimation(requireActivity(), R.anim.main_logo_animation)
        binding.mainLogo.startAnimation(anim)

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }
}