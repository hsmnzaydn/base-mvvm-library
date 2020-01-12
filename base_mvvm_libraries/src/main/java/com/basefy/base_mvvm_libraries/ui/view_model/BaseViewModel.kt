package com.basefy.base_mvvm_libraries.ui.view_model

import androidx.lifecycle.ViewModel
import com.basefy.base_mvvm_libraries.ui.activity.BaseViewInterfaces

abstract class BaseViewModel<CI : BaseViewInterfaces> : ViewModel() {

    lateinit var view: BaseViewInterfaces

    fun onAttach(callback: CI) {
        this.view = callback
    }

}