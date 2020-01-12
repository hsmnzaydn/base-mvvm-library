package com.basefy.base_mvvm_libraries.ui.activity

import com.basefy.base_mvvm_libraries.network.BaseServiceCallback


abstract class BaseResponseCallBack<R> constructor(
    private val baseInterfaces: BaseViewInterfaces
) : BaseServiceCallback<R> {

    override fun onSuccess(response: R?) {
        baseInterfaces.hideLoading()
    }

    override fun onError(errorCode: Int, errorMessage: String) {
        baseInterfaces.hideLoading()
        baseInterfaces.showMessage(errorMessage)
    }
}