package com.basefy.basemvvm

import androidx.lifecycle.ViewModel
import com.basefy.base_mvvm_libraries.ui.activity.BaseViewInterfaces
import com.hsmnzaydn.term_commands_clean.base.BaseInterfaces

abstract class BaseViewModel<CI : BaseInterfaces> : ViewModel() {

   open lateinit var view: BaseInterfaces

    fun onAttach(callback: CI) {
        this.view = callback
    }

}