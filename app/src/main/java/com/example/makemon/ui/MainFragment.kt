package com.example.makemon.ui

import android.Manifest
import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.activity.result.contract.ActivityResultContracts
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
            delay(1000)
            binding.scrollTextTwo.startScroll()
        }
    }
}