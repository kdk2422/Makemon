package com.example.makemon.ui.character_list

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.NavHostFragment
import androidx.window.layout.WindowMetricsCalculator
import com.example.makemon.R
import com.example.makemon.databinding.FragmentCharacterMainBinding
import com.example.makemon.ui.MainActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay

class CharacterListMainFragment : Fragment(), View.OnClickListener {

    companion object{
        const val TAG = "CharacterListMainFragment"
    }

    lateinit var binding: FragmentCharacterMainBinding

    private var menuActive: Boolean = false
    private var displayWidth: Float = 0f
    private var displayHeight: Float = 0f
    private var minusDisplayWidth: Float = 0f
    private var minusDisplayHeight: Float = 0f

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
            setTitleText(R.string.appbar_title_list)
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

        binding.centerView.bringToFront()

        val metrics = WindowMetricsCalculator.getOrCreate().computeCurrentWindowMetrics(requireActivity())

        val widthDp = metrics.bounds.width() / resources.displayMetrics.density
        val heightDp = metrics.bounds.height() / resources.displayMetrics.density

        displayWidth = (widthDp / 1.5).toFloat()
        displayHeight = (heightDp / 2.5).toFloat()

        minusDisplayWidth = widthDp - displayWidth
        minusDisplayHeight = heightDp - displayHeight

        Log.w(TAG, "widthDp: $widthDp")
        Log.w(TAG, "displayWidth: $displayWidth")
        Log.w(TAG, "minusDisplayWidth: $minusDisplayWidth")

        Log.w(TAG, "displayHeight: $displayHeight")
        Log.w(TAG, "heightDp: $heightDp")
        Log.w(TAG, "minusDisplayHeight: $minusDisplayHeight")

    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.centerView -> {
                    Log.w(TAG, "menuActive:: $menuActive")

                    binding.menuOne.visibility = View.VISIBLE
                    binding.menuTwo.visibility = View.VISIBLE
                    binding.menuThree.visibility = View.VISIBLE
                    binding.menuFour.visibility = View.VISIBLE

                    if (!menuActive) {
                        binding.menuOne.animate().translationX(displayWidth).withLayer()
                        binding.menuOne.animate().translationY(-displayHeight).withLayer()
                        val animOne = AnimationUtils.loadAnimation(requireActivity(), R.anim.menu_one_animation)
                        binding.menuOne.startAnimation(animOne)

                        binding.menuTwo.animate().translationX(displayWidth).withLayer()
                        binding.menuTwo.animate().translationY(displayHeight).withLayer()
                        val animTwo = AnimationUtils.loadAnimation(requireActivity(), R.anim.menu_one_animation)
                        binding.menuTwo.startAnimation(animTwo)

                        binding.menuThree.animate().translationX(-displayWidth).withLayer()
                        binding.menuThree.animate().translationY(displayHeight).withLayer()
                        val animThree = AnimationUtils.loadAnimation(requireActivity(), R.anim.menu_one_animation)
                        binding.menuThree.startAnimation(animThree)

                        binding.menuFour.animate().translationX(-displayWidth).withLayer()
                        binding.menuFour.animate().translationY(-displayHeight).withLayer()
                        val animFour = AnimationUtils.loadAnimation(requireActivity(), R.anim.menu_one_animation)
                        binding.menuFour.startAnimation(animFour)

                        setMenuActive(true)
                    } else {
                        binding.menuOne.animate().translationX(0f).withLayer()
                        binding.menuOne.animate().translationY(0f).withLayer()
                        val animOne = AnimationUtils.loadAnimation(requireActivity(), R.anim.menu_one_animation_close)
                        binding.menuOne.startAnimation(animOne)

                        binding.menuTwo.animate().translationX(0f).withLayer()
                        binding.menuTwo.animate().translationY(0f).withLayer()
                        val animTwo = AnimationUtils.loadAnimation(requireActivity(), R.anim.menu_one_animation_close)
                        binding.menuTwo.startAnimation(animTwo)

                        binding.menuThree.animate().translationX(0f).withLayer()
                        binding.menuThree.animate().translationY(0f).withLayer()
                        val animThree = AnimationUtils.loadAnimation(requireActivity(), R.anim.menu_one_animation_close)
                        binding.menuThree.startAnimation(animThree)

                        binding.menuFour.animate().translationX(0f).withLayer()
                        binding.menuFour.animate().translationY(0f).withLayer()
                        val animFour = AnimationUtils.loadAnimation(requireActivity(), R.anim.menu_one_animation_close)
                        binding.menuFour.startAnimation(animFour)

                        setMenuActive(false)
                    }

                }
                R.id.menuOne -> {
                    if (!menuActive) return
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_characterListMainFragment_to_characterListOneFragment)
                }
                R.id.menuTwo -> {
                    if (!menuActive) return
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_characterListMainFragment_to_characterListTwoFragment)
                }
                R.id.menuThree -> {
                    if (!menuActive) return
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_characterListMainFragment_to_characterListThreeFragment)
                }
                R.id.menuFour -> {
                    if (!menuActive) return
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_characterListMainFragment_to_characterListFourFragment)
                }
            }
        }
    }

    private fun setMenuActive(boolean: Boolean) {
        if (boolean) {
            binding.menuOne.isClickable = true
            binding.menuTwo.isClickable = true
            binding.menuThree.isClickable = true
            binding.menuFour.isClickable = true
            menuActive = true
        } else {
            binding.menuOne.isClickable = false
            binding.menuTwo.isClickable = false
            binding.menuThree.isClickable = false
            binding.menuFour.isClickable = false
            menuActive = false
        }
    }
}