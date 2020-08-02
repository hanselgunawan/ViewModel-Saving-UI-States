package com.hanseltritama.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var myInt = MutableLiveData<Int>()

    init {
        myInt.value = 0
    }

    fun plusOrMinusNumber(string: String) {
        if (string == "plus") {
            myInt.postValue(myInt.value?.plus(1))
        } else {
            myInt.postValue(myInt.value?.minus(1))
        }
    }
}