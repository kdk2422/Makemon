package com.example.makemon.di.module

import com.example.makemon.ui.MainFragment
import com.example.makemon.ui.character_list.CharacterListFourFragment
import com.example.makemon.ui.character_list.CharacterListMainFragment
import com.example.makemon.ui.character_list.CharacterListOneFragment
import com.example.makemon.ui.character_list.CharacterListThreeFragment
import com.example.makemon.ui.character_list.CharacterListTwoFragment
import com.example.makemon.ui.settings.SettingsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainProvider {

    @ContributesAndroidInjector(modules = [])
    abstract fun provideMainFragment() : MainFragment

    @ContributesAndroidInjector(modules = [])
    abstract fun provideCharacterListMainFragment() : CharacterListMainFragment

    @ContributesAndroidInjector(modules = [])
    abstract fun provideCharacterListOneFragment() : CharacterListOneFragment

    @ContributesAndroidInjector(modules = [])
    abstract fun provideCharacterListTwoFragment() : CharacterListTwoFragment

    @ContributesAndroidInjector(modules = [])
    abstract fun provideCharacterListThreeFragment() : CharacterListThreeFragment

    @ContributesAndroidInjector(modules = [])
    abstract fun provideCharacterListFourFragment() : CharacterListFourFragment
}