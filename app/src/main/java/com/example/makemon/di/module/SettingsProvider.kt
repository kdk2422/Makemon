package com.example.makemon.di.module

import com.example.makemon.ui.settings.SettingsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SettingsProvider {

    @ContributesAndroidInjector(modules = [])
    abstract fun provideSettingsFragment() : SettingsFragment
}