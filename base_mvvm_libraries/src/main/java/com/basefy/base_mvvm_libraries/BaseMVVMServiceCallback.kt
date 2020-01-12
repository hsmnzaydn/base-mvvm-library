package com.basefy.base_mvvm_libraries

interface BaseMVVMServiceCallback<T> {

    fun onSuccess(response:T?)
    fun onError(errorCode:Int,errorMessage:String)
}