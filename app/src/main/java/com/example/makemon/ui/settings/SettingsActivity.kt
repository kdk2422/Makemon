package com.example.makemon.ui.settings

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.example.makemon.databinding.ActivitySettingsBinding
import com.example.makemon.ui.base.BaseActivity

class SettingsActivity : BaseActivity<ActivitySettingsBinding>() {

    companion object{
        const val TAG = "SettingsActivity"
    }

    override fun initBinding(inflater: LayoutInflater) = ActivitySettingsBinding.inflate(inflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")

    }
}