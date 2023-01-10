package com.example.makemon.ui.character_list

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.makemon.databinding.FragmentCharacterFourBinding
import com.example.makemon.ui.MainActivity

class CharacterListFourFragment : Fragment() {

    companion object{
        const val TAG = "CharacterListFourFragment"
    }

    lateinit var binding: FragmentCharacterFourBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCharacterFourBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated")

        with(requireActivity() as MainActivity) {
            bottomNavigationVisibility(false)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }
}