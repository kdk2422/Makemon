package com.example.makemon.ui.settings

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.makemon.R
import com.example.makemon.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {

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
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")

    }
}