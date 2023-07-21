package com.example.makemon.di.module

import com.example.makemon.ui.MainFragment
import com.example.makemon.ui.character_list.CharacterListFiveFragment
import com.example.makemon.ui.character_list.CharacterListFourFragment
import com.example.makemon.ui.character_list.CharacterListMainFragment
import com.example.makemon.ui.character_list.CharacterListDialog
import com.example.makemon.ui.character_list.CharacterListOneFragment
import com.example.makemon.ui.character_list.CharacterListSixFragment
import com.example.makemon.ui.character_list.CharacterListThreeFragment
import com.example.makemon.ui.character_list.CharacterListTwoFragment
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

    @ContributesAndroidInjector(modules = [])
    abstract fun provideCharacterListFiveFragment() : CharacterListFiveFragment

    @ContributesAndroidInjector(modules = [])
    abstract fun provideCharacterListSixFragment() : CharacterListSixFragment

    @ContributesAndroidInjector(modules = [])
    abstract fun provideCharacterListOneDialog() : CharacterListDialog
}