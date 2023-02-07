package com.example.makemon.ui.splash

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.view.animation.AccelerateInterpolator
import android.view.animation.AnticipateInterpolator
import android.view.animation.BounceInterpolator
import android.view.animation.OvershootInterpolator
import android.widget.ImageView
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.core.animation.doOnEnd
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.makemon.R
import com.example.makemon.databinding.ActivitySplashBinding
import com.example.makemon.ui.MainActivity
import com.example.makemon.ui.character_list.CharacterListFiveFragment
import com.example.makemon.ui.character_list.CharacterListFourFragment
import com.example.makemon.ui.character_list.CharacterListOneFragment
import com.example.makemon.ui.character_list.CharacterListSixFragment
import com.example.makemon.ui.character_list.CharacterListThreeFragment
import com.example.makemon.ui.character_list.CharacterListTwoFragment
import com.example.makemon.utils.CloseBackPressed
import kotlinx.coroutines.NonCancellable.start
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private lateinit var splashScreen: SplashScreen

    lateinit var binding: ActivitySplashBinding

    private lateinit var closeBackPressed: CloseBackPressed

    override fun onCreate(savedInstanceState: Bundle?) {
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
        splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        closeBackPressed = CloseBackPressed(this)

        binding.icon.animate().scaleX(1f)
        binding.icon.animate().scaleY(1f)
        binding.icon.animate().interpolator = BounceInterpolator()
        binding.icon.animate().duration = 2000

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            splashScreen.setOnExitAnimationListener { splashScreenView ->

                val xScale = PropertyValuesHolder.ofFloat(View.SCALE_X, 1f, 10f)
                val yScale = PropertyValuesHolder.ofFloat(View.SCALE_Y, 1f, 10f)

                ObjectAnimator.ofPropertyValuesHolder(
                    splashScreenView.iconView,
                    xScale,
                    yScale
                ).run {
                    interpolator = AnticipateInterpolator()
                    duration = 500L
                    doOnEnd { splashScreenView.remove() }
                    start()
                }
            }
        }

        // Handler 가 deprecated 되어 Handler() -> Handler(Looper.getMainLooper()) 로 수정
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000)

    }

    private val backPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            Log.w("SplashActivity", "backPressedCallback: call")
        }
    }

    @Deprecated("Deprecated in Android SDK Version 33")
    override fun onBackPressed() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            Log.w("SplashActivity", "ANDROID VERSION >= 33")
            this.onBackPressedDispatcher.addCallback(this, backPressedCallback)
        } else {
            Log.w("SplashActivity", "ANDROID VERSION < 33")
        }
    }
}