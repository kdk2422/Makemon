package com.example.makemon.di.module

import com.example.makemon.ui.settings.SettingsFragment
import com.example.makemon.ui.settings.test.TestEightFragment
import com.example.makemon.ui.settings.test.TestFiveFragment
import com.example.makemon.ui.settings.test.TestFourFragment
import com.example.makemon.ui.settings.test.TestFragment
import com.example.makemon.ui.settings.test.TestSevenFragment
import com.example.makemon.ui.settings.test.TestSixFragment
import com.example.makemon.ui.settings.test.TestThreeFragment
import com.example.makemon.ui.settings.test.TestTwoFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SettingsProvider {

    @ContributesAndroidInjector(modules = [])
    abstract fun provideSettingsFragment() : SettingsFragment

    @ContributesAndroidInjector(modules = [])
    abstract fun provideTestFragment() : TestFragment

    @ContributesAndroidInjector(modules = [])
    abstract fun provideTestTwoFragment() : TestTwoFragment

    @ContributesAndroidInjector(modules = [])
    abstract fun provideTestThreeFragment() : TestThreeFragment

    @ContributesAndroidInjector(modules = [])
    abstract fun provideTestFourFragment() : TestFourFragment

    @ContributesAndroidInjector(modules = [])
    abstract fun provideTestFiveFragment() : TestFiveFragment

    @ContributesAndroidInjector(modules = [])
    abstract fun provideTestSixFragment() : TestSixFragment

    @ContributesAndroidInjector(modules = [])
    abstract fun provideTestSevenFragment() : TestSevenFragment

    @ContributesAndroidInjector(modules = [])
    abstract fun provideTestEightFragment() : TestEightFragment
}