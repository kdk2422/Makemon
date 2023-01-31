package com.example.makemon.ui.settings

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.example.makemon.R
import com.example.makemon.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment(), View.OnClickListener {

    companion object{
        const val TAG = "SettingsFragment"
    }

    lateinit var binding: FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated")

        with(requireActivity() as SettingsActivity) {
            setTitleText(R.string.appbar_title_settings)
        }

        binding.testLayer.setOnClickListener(this)
        binding.testLayerTwo.setOnClickListener(this)
        binding.testLayerThree.setOnClickListener(this)
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")

    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.testLayer -> {
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_settingsFragment_to_testFragment)
                }
                R.id.testLayerTwo -> {
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_settingsFragment_to_testTwoFragment)
                }
                R.id.testLayerThree -> {
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_settingsFragment_to_testThreeFragment)
                }
            }
        }

    }
}