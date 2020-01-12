package com.basefy.base_mvvm_libraries

import com.google.gson.Gson

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit

open class BaseServicesImp  constructor(
    private val retrofit: Retrofit,
    private val gson: Gson
)  {

    fun <T> getRequest(
        callback: BaseServiceCallback<T>,
        observable: () -> Observable<T>
    ): Disposable = observable()
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(onNext(callback)) {
            callback.onError(NetworkError(it).errorCode, NetworkError(it).appErrorMessage)
        }

    fun <T > onNext(callback: BaseServiceCallback<T>): (T) -> Unit = {
        callback.onSuccess(it)
    }







}