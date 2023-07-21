/*
 * Create by kirby on 2023. 1. 12.
 * Copyright (c) 2023. kirby. All rights reserved.
 */

package com.example.makemon.app

import android.app.Activity
import android.app.Application
import android.app.Service
import android.content.BroadcastReceiver
import android.util.Log
import com.example.makemon.di.AppInjector
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class MakemonApp : Application(), HasActivityInjector {

    @Inject
    lateinit var activityDispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    companion object{
        val TAG = "MakemonApp"
    }

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate")

        AppInjector.init(this)

        /*val db = Room.databaseBuilder(
            this,
            AppDatabase::class.java, "test-db"
        ).build()

        val userDao = db.userDao()
        val users: List<User> = userDao.getAll()*/
    }

    override fun activityInjector(): AndroidInjector<Activity> = activityDispatchingAndroidInjector
}