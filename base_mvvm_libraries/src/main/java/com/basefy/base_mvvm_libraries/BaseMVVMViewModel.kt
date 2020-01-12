package com.basefy.base_mvvm_libraries

import androidx.lifecycle.ViewModel

abstract class BaseMVVMViewModel<CI : BaseMVVMInterfaces> : ViewModel() {

    lateinit var interfaces: BaseMVVMInterfaces

    fun onAttach(callback: CI) {
        this.interfaces = callback
    }

}