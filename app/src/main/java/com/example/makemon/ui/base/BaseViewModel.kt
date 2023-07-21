package com.example.makemon.ui.base

import androidx.lifecycle.ViewModel
import com.example.makemon.utils.SingleLiveEvent

abstract class BaseViewModel : ViewModel() {

    val stateStart = SingleLiveEvent<Void>()
    val stateComplete = SingleLiveEvent<Void>()
    val stateSuccess = SingleLiveEvent<Void>()
    val stateFailure = SingleLiveEvent<Void>()

    open fun init() {}

    protected fun start() { stateStart.callAsync() }
    private fun complete() { stateComplete.callAsync() }
    protected fun success() { stateSuccess.callAsync() }
    private fun failure() { stateFailure.callAsync() }
}