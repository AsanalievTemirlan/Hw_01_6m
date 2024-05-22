package com.example.hw_01_6m

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    private var counter = CounterModel()
    private val updCount = MutableLiveData<Int>()
    val getCount = updCount

    fun getCounter(click: Boolean) {
        if (click) counter.inc() else counter.dec()
        updCount.value = (counter.getCount())
    }
}