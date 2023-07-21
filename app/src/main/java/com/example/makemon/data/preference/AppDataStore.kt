package com.example.makemon.data.preference

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import java.io.IOException

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "appDataStore")

class AppDataStore(private val context: Context) {

    companion object {
        const val APP_TESTER_EGG = "app_tester_egg"
    }

    private val appTesterKey = booleanPreferencesKey(APP_TESTER_EGG)

    suspend fun setTesterKey(boolean: Boolean) {
        context.dataStore.edit { preferences -> preferences[appTesterKey] = boolean }
    }

    suspend fun getTesterKey() = context.dataStore.data.catch {exception ->
        if (exception is IOException) emit(emptyPreferences()) else throw exception
    }.map { store -> store[appTesterKey] ?: false }.first()

}