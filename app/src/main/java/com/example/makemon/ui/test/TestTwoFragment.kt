package com.example.makemon.ui.test

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.makemon.R
import com.example.makemon.adapter.ImageAdapter
import com.example.makemon.databinding.FragmentTestTwoBinding


class TestTwoFragment : Fragment() {

    lateinit var binding: FragmentTestTwoBinding

    lateinit var viewPager: ViewPager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewPager = binding.viewPager
        val a = ImageAdapter(requireActivity())
        viewPager.adapter = a
    }

    override fun onResume() {
        super.onResume()

    }

}