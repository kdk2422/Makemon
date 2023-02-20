package com.example.makemon.ui.settings.test

import android.content.res.Resources
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.makemon.R
import com.example.makemon.databinding.FragmentTestBinding


class TestFragment : Fragment() {

    lateinit var binding: FragmentTestBinding

    private lateinit var bitmap: BitmapDrawable

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val res: Resources = resources
        bitmap = res.getDrawable(R.drawable.image_one) as BitmapDrawable
        val bitWidth = bitmap.intrinsicWidth
        val bitHeight = bitmap.intrinsicHeight

        binding.imageView.setImageDrawable(bitmap)
        binding.imageView.layoutParams.width = bitWidth
        binding.imageView.layoutParams.height = bitHeight
    }

    override fun onResume() {
        super.onResume()

    }

}