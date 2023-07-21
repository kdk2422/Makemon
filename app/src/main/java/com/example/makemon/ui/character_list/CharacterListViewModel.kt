package com.example.makemon.ui.character_list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.makemon.ui.base.BaseViewModel
import com.example.makemon.utils.SingleLiveEvent
import dagger.Reusable
import javax.inject.Inject

@Reusable
class CharacterListViewModel @Inject constructor() : BaseViewModel() {

    private val _selectIndex = MutableLiveData<Int>()
    val selectIndex: LiveData<Int> = _selectIndex
    fun updateSelectIndex(index: Int){ _selectIndex.postValue(index) }
}