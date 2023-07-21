package com.example.makemon.ui.settings.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.makemon.R
import com.example.makemon.databinding.FragmentTestFourBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class TestFourFragment : Fragment() {

    lateinit var binding: FragmentTestFourBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestFourBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val animRotation = AnimationUtils.loadAnimation(requireActivity(), R.anim.rotate_animation)
        binding.rotationImage.startAnimation(animRotation)

        val scrollingImage = binding.scrollImage
        scrollingImage.start()
    }

    override fun onResume() {
        super.onResume()

        lifecycleScope.launch {
            delay(1000)
            binding.scrollTextTwo.startScroll()
        }
    }
}