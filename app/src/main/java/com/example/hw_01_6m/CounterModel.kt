package com.example.hw_01_6m

class CounterModel {

    private var count = 0

    fun getCount(): Int {
        return count
    }

    fun inc(){
        count += 1
    }

    fun dec(){
        count -= 1
    }
}