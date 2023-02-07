package com.example.makemon.utils

import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment


fun Activity.themeLight() {}

fun Activity.themeDark() {}

fun Fragment.themeLight() {}

fun Fragment.themeDark() {}

fun Activity.hideKeyboard() {
    currentFocus?.run {
        (getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).also {
            it.hideSoftInputFromWindow(windowToken, InputMethodManager.RESULT_UNCHANGED_HIDDEN)
        }
    }
}