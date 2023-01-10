package com.example.makemon.app

import android.app.Application
import android.util.Log

class MakemonApp : Application() {

    companion object{
        val TAG = "MakemonApp"
    }

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate")
    }
}