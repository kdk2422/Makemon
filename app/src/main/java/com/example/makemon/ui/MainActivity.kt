package com.example.makemon.ui

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.makemon.R
import com.example.makemon.databinding.ActivityMainBinding
import com.example.makemon.di.Injectable
import com.example.makemon.ui.base.BaseActivity
import com.example.makemon.ui.character_list.CharacterListFiveFragment
import com.example.makemon.ui.character_list.CharacterListFourFragment
import com.example.makemon.ui.character_list.CharacterListOneFragment
import com.example.makemon.ui.character_list.CharacterListSixFragment
import com.example.makemon.ui.character_list.CharacterListThreeFragment
import com.example.makemon.ui.character_list.CharacterListTwoFragment
import com.example.makemon.ui.settings.SettingsActivity
import com.example.makemon.utils.CloseBackPressed
import com.google.firebase.messaging.FirebaseMessaging
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine


class MainActivity : BaseActivity<ActivityMainBinding>(), Injectable, HasSupportFragmentInjector {

    companion object {
        const val TAG = "MainActivity"
    }

    private lateinit var navController: NavController

    lateinit var navHostFragment: NavHostFragment

    private lateinit var closeBackPressed: CloseBackPressed

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Fragment>

    override fun initBinding(inflater: LayoutInflater) = ActivityMainBinding.inflate(inflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        closeBackPressed = CloseBackPressed(this)

        lifecycleScope.launch(Dispatchers.IO) {
            getTokenResult()
        }

        setNav()
        setToolbarBack()
    }

    override fun onResume() {
        super.onResume()

//        permission()

//        val audioManager: AudioManager = this.getSystemService(Context.AUDIO_SERVICE) as AudioManager
//        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, ((audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC) * 0.5).toInt()), AudioManager.FLAG_PLAY_SOUND)
    }

    /*override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when(keyCode) {
            KeyEvent.KEYCODE_VOLUME_UP -> {
                Log.w("test", "test")
                return true
            }
            KeyEvent.KEYCODE_VOLUME_DOWN -> {
                Log.w("test", "test")
                return true
            }
        }
        return false
    }*/

    private fun setNav() {
        navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        NavigationUI.setupWithNavController(binding.bottomNavigation, navHostFragment.navController)

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.mainFragment -> {
                    NavigationUI.onNavDestinationSelected(item, navController)
                }

                R.id.characterListMainFragment -> {
                    NavigationUI.onNavDestinationSelected(item, navController)
                }

                R.id.settingsActivity -> {
//                    Toast.makeText(this, "업데이트 예정입니다.", Toast.LENGTH_LONG).show()
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

    fun setTitleText(text: Int) {
        binding.toolbar.title.setText(text)
    }

    fun setToolbarBackVisibility(boolean: Boolean) {
        if (boolean) {
            binding.toolbar.back.visibility = View.VISIBLE
        } else {
            binding.toolbar.back.visibility = View.GONE
        }
    }

    private fun setToolbarBack() {
        binding.toolbar.back.setOnClickListener {
            onBackPressed()
        }
    }

    private val backPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            Log.w(TAG, "backPressedCallback: call")
            val navHostFragment =
                supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            when (val fragment = navHostFragment.childFragmentManager.fragments[0]) {
                is CharacterListOneFragment -> {
                    fragment.findNavController()
                        .navigate(R.id.action_characterListOneFragment_to_characterListMainFragment)
                }

                is CharacterListTwoFragment -> {
                    fragment.findNavController()
                        .navigate(R.id.action_characterListTwoFragment_to_characterListMainFragment)
                }

                is CharacterListThreeFragment -> {
                    fragment.findNavController()
                        .navigate(R.id.action_characterListThreeFragment_to_characterListMainFragment)
                }

                is CharacterListFourFragment -> {

                    fragment.findNavController()
                        .navigate(R.id.action_characterListFourFragment_to_characterListMainFragment)
                }

                is CharacterListFiveFragment -> {
                    fragment.findNavController()
                        .navigate(R.id.action_characterListFiveFragment_to_characterListMainFragment)
                }

                is CharacterListSixFragment -> {
                    fragment.findNavController()
                        .navigate(R.id.action_characterListSixFragment_to_characterListMainFragment)
                }

                else -> {
                    closeBackPressed.onBackPressed()
                }
            }
        }
    }

    @Deprecated("Deprecated in Android SDK Version 33")
    override fun onBackPressed() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        when (val fragment = navHostFragment.childFragmentManager.fragments[0]) {
            is CharacterListOneFragment -> {
                fragment.findNavController()
                    .navigate(R.id.action_characterListOneFragment_to_characterListMainFragment)
            }

            is CharacterListTwoFragment -> {
                fragment.findNavController()
                    .navigate(R.id.action_characterListTwoFragment_to_characterListMainFragment)
            }

            is CharacterListThreeFragment -> {
                fragment.findNavController()
                    .navigate(R.id.action_characterListThreeFragment_to_characterListMainFragment)
            }

            is CharacterListFourFragment -> {
                fragment.findNavController()
                    .navigate(R.id.action_characterListFourFragment_to_characterListMainFragment)
            }

            is CharacterListFiveFragment -> {
                fragment.findNavController()
                    .navigate(R.id.action_characterListFiveFragment_to_characterListMainFragment)
            }

            is CharacterListSixFragment -> {
                fragment.findNavController()
                    .navigate(R.id.action_characterListSixFragment_to_characterListMainFragment)
            }

            else -> {
                closeBackPressed.onBackPressed()
            }
        }
        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            Log.w(TAG, "ANDROID VERSION >= 33")
            this.onBackPressedDispatcher.addCallback(this, backPressedCallback)
        } else {
            Log.w(TAG, "ANDROID VERSION < 33")
            val navHostFragment =
                supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            when (val fragment = navHostFragment.childFragmentManager.fragments[0]) {
                is CharacterListOneFragment -> {
                    fragment.findNavController()
                        .navigate(R.id.action_characterListOneFragment_to_characterListMainFragment)
                }

                is CharacterListTwoFragment -> {
                    fragment.findNavController()
                        .navigate(R.id.action_characterListTwoFragment_to_characterListMainFragment)
                }

                is CharacterListThreeFragment -> {
                    fragment.findNavController()
                        .navigate(R.id.action_characterListThreeFragment_to_characterListMainFragment)
                }

                is CharacterListFourFragment -> {
                    fragment.findNavController()
                        .navigate(R.id.action_characterListFourFragment_to_characterListMainFragment)
                }

                is CharacterListFiveFragment -> {
                    fragment.findNavController()
                        .navigate(R.id.action_characterListFiveFragment_to_characterListMainFragment)
                }

                is CharacterListSixFragment -> {
                    fragment.findNavController()
                        .navigate(R.id.action_characterListSixFragment_to_characterListMainFragment)
                }

                else -> {
                    closeBackPressed.onBackPressed()
                }
            }
        }*/
    }

    private suspend fun getTokenResult() = suspendCoroutine<String?> { continuation ->

        FirebaseMessaging.getInstance().token.addOnCompleteListener { task ->
            if (task.isSuccessful) {
                Log.w("MainActivity", "getTokenResult:: Task Success")
                continuation.resume(task.result)
                Log.w("MainActivity", "FCM Token:: ${task.result}")
            } else {
                Log.w("MainActivity", "getTokenResult:: Task Failed: Null")
                continuation.resume(null)
            }
        }
    }

    override fun supportFragmentInjector(): AndroidInjector<Fragment> = dispatchingAndroidInjector

    /*private fun permission() {
        //Note: 다중 퍼미션 권한 체크 로직
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            requestPermission.launch(
                arrayOf(
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.READ_MEDIA_IMAGES,
                    Manifest.permission.POST_NOTIFICATIONS,
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                )
            )
        } else {
            requestPermission.launch(
                arrayOf(
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                )
            )
        }
    }*/

    /*private val requestPermission = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) {
        for (entry in it.entries) {
            Log.w("MainFragment", "onActivityResult:: ${entry.key} = ${entry.value}")
        }
    }*/
}