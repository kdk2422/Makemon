package com.example.makemon.ui.settings

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.activity.OnBackPressedCallback
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.makemon.R
import com.example.makemon.databinding.ActivitySettingsBinding
import com.example.makemon.ui.MainActivity
import com.example.makemon.ui.base.BaseActivity
import com.example.makemon.ui.character_list.CharacterListFourFragment
import com.example.makemon.ui.character_list.CharacterListOneFragment
import com.example.makemon.ui.character_list.CharacterListThreeFragment
import com.example.makemon.ui.character_list.CharacterListTwoFragment
import com.example.makemon.ui.test.TestFragment
import com.example.makemon.ui.test.TestThreeFragment
import com.example.makemon.ui.test.TestTwoFragment
import com.example.makemon.utils.CloseBackPressed

class SettingsActivity : BaseActivity<ActivitySettingsBinding>() {

    companion object{
        const val TAG = "SettingsActivity"
    }

    private lateinit var navController: NavController

    override fun initBinding(inflater: LayoutInflater) = ActivitySettingsBinding.inflate(inflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")

        overridePendingTransition(R.anim.settings_in_animation, R.anim.none_animation)

        setNav()
    }

    private fun setNav() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
    }

    fun setTitleText(text: Int) {
        binding.toolbar.title.setText(text)
    }


    private val backPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            Log.w(MainActivity.TAG, "backPressedCallback: call")
            val navHostFragment = supportFragmentManager.primaryNavigationFragment
            when (navHostFragment!!.childFragmentManager.fragments[0]) {
                else -> {
                    finish()
                }
            }
        }
    }

    @Deprecated("Deprecated in Android SDK Version 33")
    override fun onBackPressed() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            Log.w(MainActivity.TAG, "ANDROID VERSION >= 33")
            this.onBackPressedDispatcher.addCallback(this, backPressedCallback)
        } else {
            Log.w(MainActivity.TAG, "ANDROID VERSION < 33")
            val navHostFragment = supportFragmentManager.primaryNavigationFragment
            when (navHostFragment!!.childFragmentManager.fragments[0]) {
                else -> {
                    super.onBackPressed()
                }
            }
        }
    }
}