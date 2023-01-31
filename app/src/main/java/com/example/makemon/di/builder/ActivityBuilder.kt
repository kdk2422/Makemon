package com.example.makemon.di.builder

import com.example.makemon.di.module.MainModule
import com.example.makemon.di.module.MainProvider
import com.example.makemon.di.module.SettingsModule
import com.example.makemon.di.module.SettingsProvider
import com.example.makemon.ui.MainActivity
import com.example.makemon.ui.settings.SettingsActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(
        modules = [
            MainModule::class,
            MainProvider::class
        ]
    )
    abstract fun bindMainActivity() : MainActivity

    @ContributesAndroidInjector(
        modules = [
            SettingsModule::class,
            SettingsProvider::class
        ]
    )
    abstract fun bindSettingsActivity() : SettingsActivity
}