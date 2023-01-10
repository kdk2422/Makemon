package com.example.makemon.ui

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.makemon.R
import com.example.makemon.databinding.ActivityMainBinding
import com.example.makemon.ui.base.BaseActivity
import com.example.makemon.ui.character_list.CharacterListFourFragment
import com.example.makemon.ui.character_list.CharacterListOneFragment
import com.example.makemon.ui.character_list.CharacterListThreeFragment
import com.example.makemon.ui.character_list.CharacterListTwoFragment
import com.example.makemon.ui.settings.SettingsActivity
import com.example.makemon.utils.CloseBackPressed

class MainActivity : BaseActivity<ActivityMainBinding>() {

    companion object{
        const val TAG = "MainActivity"
    }

    private lateinit var navController: NavController

    lateinit var navHostFragment: NavHostFragment

    private lateinit var closeBackPressed: CloseBackPressed

    private val backPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            Log.w(TAG, "backPressedCallback: call")
            val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            val fragment = navHostFragment.childFragmentManager.fragments[0]
            when (fragment) {
                is CharacterListOneFragment -> {
                    fragment.findNavController().navigate(R.id.action_characterListOneFragment_to_characterListMainFragment)
                }
                is CharacterListTwoFragment -> {
                    fragment.findNavController().navigate(R.id.action_characterListTwoFragment_to_characterListMainFragment)
                }
                is CharacterListThreeFragment -> {
                    fragment.findNavController().navigate(R.id.action_characterListThreeFragment_to_characterListMainFragment)
                }
                is CharacterListFourFragment -> {
                    fragment.findNavController().navigate(R.id.action_characterListFourFragment_to_characterListMainFragment)
                }
                else -> {
                    closeBackPressed.onBackPressed()
                }
            }
        }
    }

    override fun initBinding(inflater: LayoutInflater) = ActivityMainBinding.inflate(inflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")

        closeBackPressed = CloseBackPressed(this)
        setNav()

    }

    private fun setNav() {
        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        NavigationUI.setupWithNavController(binding.bottomNavigation, navHostFragment.navController)

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.mainFragment -> {
                    NavigationUI.onNavDestinationSelected(item, navController)
                }
                R.id.characterListMainFragment -> {
                    NavigationUI.onNavDestinationSelected(item, navController)
                }
                R.id.settingsActivity -> {
                    val intent = Intent(this@MainActivity, SettingsActivity::class.java)
                    startActivity(intent)
                }
                else -> {}
            }
            false
        }
    }

    fun bottomNavigationVisibility(boolean: Boolean) {
        if (boolean) {
            binding.bottomNavigation.visibility = View.VISIBLE
        } else {
            binding.bottomNavigation.visibility = View.GONE
        }
    }

    fun setTitleText(text: String) {
        binding.toolbar.title.text = text
    }

    @Deprecated("Deprecated in Android SDK Version 33")
    override fun onBackPressed() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            Log.w(TAG, "ANDROID VERSION >= 33")
            this.onBackPressedDispatcher.addCallback(this, backPressedCallback)
        } else {
            Log.w(TAG, "ANDROID VERSION < 33")
            val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            val fragment = navHostFragment.childFragmentManager.fragments[0]
            when (fragment) {
                is CharacterListOneFragment -> {
                    fragment.findNavController().navigate(R.id.action_characterListOneFragment_to_characterListMainFragment)
                }
                is CharacterListTwoFragment -> {
                    fragment.findNavController().navigate(R.id.action_characterListTwoFragment_to_characterListMainFragment)
                }
                is CharacterListThreeFragment -> {
                    fragment.findNavController().navigate(R.id.action_characterListThreeFragment_to_characterListMainFragment)
                }
                is CharacterListFourFragment -> {
                    fragment.findNavController().navigate(R.id.action_characterListFourFragment_to_characterListMainFragment)
                }
                else -> {
                    closeBackPressed.onBackPressed()
                }
            }
        }
    }
}