package com.example.makemon.ui.character_list

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.window.layout.WindowMetricsCalculator
import com.example.makemon.R
import com.example.makemon.databinding.FragmentCharacterMainBinding
import com.example.makemon.ui.MainActivity
import kotlin.math.sqrt


class CharacterListMainFragment : Fragment(), View.OnClickListener {

    companion object{
        const val TAG = "CharacterListMainFragment"
    }

    lateinit var binding: FragmentCharacterMainBinding

    private var menuActive: Boolean = false
    private var displayWidth: Float = 0f
    private var displayHeight: Float = 0f
    private var testFour: Float = 0f

    private var testDisplay: Float = 0f
    private var testDisplayTwo: Float = 0f

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

        with(requireActivity() as MainActivity) {
            bottomNavigationVisibility(true)
            setTitleText(R.string.appbar_title_list)
            setToolbarBackVisibility(false)
        }

        binding.centerView.setOnClickListener(this)
        binding.menuOne.setOnClickListener(this)
        binding.menuTwo.setOnClickListener(this)
        binding.menuThree.setOnClickListener(this)
        binding.menuFour.setOnClickListener(this)
        binding.menuFive.setOnClickListener(this)
        binding.menuSix.setOnClickListener(this)
    }

    override fun onResume() {
        super.onResume()

        val metrics = WindowMetricsCalculator.getOrCreate().computeCurrentWindowMetrics(requireActivity())

        val widthDp = metrics.bounds.width() / resources.displayMetrics.density
        val heightDp = metrics.bounds.height() / resources.displayMetrics.density

        displayWidth = (widthDp / 1.5).toFloat()
        displayHeight = (heightDp / 2.5).toFloat()

        testDisplay = (widthDp / 1.2).toFloat()
        testDisplayTwo = widthDp / 2

        Log.w(TAG, "widthDp: $widthDp")
        Log.w(TAG, "displayWidth: $displayWidth")

        Log.w(TAG, "heightDp: $heightDp")
        Log.w(TAG, "displayHeight: $displayHeight")

        Log.w(TAG, "testDisplay: $testDisplay")
        Log.w(TAG, "testDisplayTwo: $testDisplayTwo")

        val sqrtDisplayWidth = sqrt(displayWidth)
        val sqrtDisplayHeight = sqrt(displayHeight)
        val testThree = sqrtDisplayWidth + sqrtDisplayHeight
        testFour = sqrt(testThree)
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
                    binding.menuFive.visibility = View.VISIBLE
                    binding.menuSix.visibility = View.VISIBLE

                    if (!menuActive) {
                        binding.menuOne.animate().translationX(-testDisplayTwo).withLayer()
                        binding.menuOne.animate().translationY(-displayHeight).withLayer()
                        val animOne = AnimationUtils.loadAnimation(requireActivity(), R.anim.menu_one_animation)
                        binding.menuOne.startAnimation(animOne)

                        binding.menuTwo.animate().translationX(testDisplayTwo).withLayer()
                        binding.menuTwo.animate().translationY(-displayHeight).withLayer()
                        val animTwo = AnimationUtils.loadAnimation(requireActivity(), R.anim.menu_one_animation)
                        binding.menuTwo.startAnimation(animTwo)

                        binding.menuThree.animate().translationX(-testDisplay).withLayer()
                        binding.menuThree.animate().translationY(0f).withLayer()
                        val animThree = AnimationUtils.loadAnimation(requireActivity(), R.anim.menu_one_animation)
                        binding.menuThree.startAnimation(animThree)

                        binding.menuFour.animate().translationX(testDisplay).withLayer()
                        binding.menuFour.animate().translationY(0f).withLayer()
                        val animFour = AnimationUtils.loadAnimation(requireActivity(), R.anim.menu_one_animation)
                        binding.menuFour.startAnimation(animFour)

                        binding.menuFive.animate().translationX(-testDisplayTwo).withLayer()
                        binding.menuFive.animate().translationY(displayHeight).withLayer()
                        val animFive = AnimationUtils.loadAnimation(requireActivity(), R.anim.menu_one_animation)
                        binding.menuFive.startAnimation(animFive)

                        binding.menuSix.animate().translationX(testDisplayTwo).withLayer()
                        binding.menuSix.animate().translationY(displayHeight).withLayer()
                        val animSix = AnimationUtils.loadAnimation(requireActivity(), R.anim.menu_one_animation)
                        binding.menuSix.startAnimation(animSix)

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

                        binding.menuFive.animate().translationX(0f).withLayer()
                        binding.menuFive.animate().translationY(0f).withLayer()
                        val animFive = AnimationUtils.loadAnimation(requireActivity(), R.anim.menu_one_animation_close)
                        binding.menuFive.startAnimation(animFive)

                        binding.menuSix.animate().translationX(0f).withLayer()
                        binding.menuSix.animate().translationY(0f).withLayer()
                        val animSix = AnimationUtils.loadAnimation(requireActivity(), R.anim.menu_one_animation_close)
                        binding.menuSix.startAnimation(animSix)

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
                R.id.menuFive -> {
                    if (!menuActive) return
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_characterListMainFragment_to_characterListFiveFragment)
                }
                R.id.menuSix -> {
                    if (!menuActive) return
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_characterListMainFragment_to_characterListSixFragment)
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
            binding.menuFive.isClickable = true
            binding.menuSix.isClickable = true
            menuActive = true
        } else {
            binding.menuOne.isClickable = false
            binding.menuTwo.isClickable = false
            binding.menuThree.isClickable = false
            binding.menuFour.isClickable = false
            binding.menuFive.isClickable = false
            binding.menuSix.isClickable = false
            menuActive = false
        }
    }
}