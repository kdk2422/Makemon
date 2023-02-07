package com.example.makemon.ui.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.example.makemon.R
import com.example.makemon.databinding.FragmentTestThreeBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


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
                        val anim = AnimationUtils.loadAnimation(requireActivity(), R.anim.expaned_animation)
                        binding.expandedView.startAnimation(anim)
                        binding.expandedView.animate().withLayer()
                        lifecycleScope.launch {
                            binding.expandedView.isClickable = false
                            delay(500)
                            binding.expandedView.isClickable = true
                            binding.expandTitle.text = "expanded"
                        }
                        isChangeView = true
                    } else {
                        val animTwo = AnimationUtils.loadAnimation(requireActivity(), R.anim.unexpaned_animation)
                        binding.expandedView.startAnimation(animTwo)
                        lifecycleScope.launch {
                            binding.expandedView.isClickable = false
                            delay(500)
                            binding.expandedView.isClickable = true
                            binding.expandTitle.text = "unexpanded"
                        }
                        isChangeView = false
                    }
                }
            }
        }
    }
}