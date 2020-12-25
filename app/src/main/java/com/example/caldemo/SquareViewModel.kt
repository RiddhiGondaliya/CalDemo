package com.example.caldemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SquareViewModel : ViewModel() {


    private var _squareLivedata = MutableLiveData<Int>()
    val squareLvedata: LiveData<Int>
        get() = _squareLivedata


    private var _textLivedata = MutableLiveData<String>()
    val textlivedata: LiveData<String>
        get() = _textLivedata


    fun squareNumbers(inputputnumber: Int) {
        var result = (inputputnumber * inputputnumber)
        _squareLivedata.value = result
    }

    fun textdiplay(inputext: String) {
        var datatext = "hey " + inputext
        _textLivedata.value = datatext


    }

}