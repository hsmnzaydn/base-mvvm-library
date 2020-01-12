package com.basefy.base_mvvm_libraries.network

interface BaseServiceCallback<T> {

    fun onSuccess(response:T?)
    fun onError(errorCode:Int,errorMessage:String)
}