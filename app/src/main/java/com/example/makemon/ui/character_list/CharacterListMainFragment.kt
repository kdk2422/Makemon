package com.example.makemon.ui.character_list

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.example.makemon.R
import com.example.makemon.databinding.FragmentCharacterMainBinding
import com.example.makemon.ui.MainActivity

class CharacterListMainFragment : Fragment(), View.OnClickListener {

    companion object{
        const val TAG = "CharacterListMainFragment"
    }

    lateinit var binding: FragmentCharacterMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCharacterMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated")

        with(requireActivity() as MainActivity) {
            bottomNavigationVisibility(true)
            setTitleText("도감")
        }

        binding.centerView.setOnClickListener(this)
        binding.menuOne.setOnClickListener(this)
        binding.menuTwo.setOnClickListener(this)
        binding.menuThree.setOnClickListener(this)
        binding.menuFour.setOnClickListener(this)
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.centerView -> {
                    val anim = AnimationUtils.loadAnimation(requireActivity(), R.anim.menu_one_animation)
                    binding.menuOne.startAnimation(anim)
                }
                R.id.menuOne -> {
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_characterListMainFragment_to_characterListOneFragment)
                }
                R.id.menuTwo -> {
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_characterListMainFragment_to_characterListTwoFragment)
                }
                R.id.menuThree -> {
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_characterListMainFragment_to_characterListThreeFragment)
                }
                R.id.menuFour -> {
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_characterListMainFragment_to_characterListFourFragment)
                }
            }
        }
    }
}