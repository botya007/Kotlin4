package com.example.kotlin1homework4.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FragmentViewModel : ViewModel (){

    var chet = 0
    val chetchik = MutableLiveData<Int>()
    val text = MutableLiveData<String>()

    fun plus() {
        chetchik.value = ++chet
        text.value += "+ \n"
    }

    fun minus() {
        chetchik.value = --chet
        text.value += "- \n"
    }
}