package com.basefy.base_mvvm_libraries

interface BaseServiceCallback<T> {

    fun onSuccess(response:T?)
    fun onError(errorCode:Int,errorMessage:String)
}