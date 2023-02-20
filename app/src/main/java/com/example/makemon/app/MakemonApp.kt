/*
 * Create by kirby on 2023. 1. 12.
 * Copyright (c) 2023. kirby. All rights reserved.
 */

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

        /*val db = Room.databaseBuilder(
            this,
            AppDatabase::class.java, "test-db"
        ).build()

        val userDao = db.userDao()
        val users: List<User> = userDao.getAll()*/
    }
}