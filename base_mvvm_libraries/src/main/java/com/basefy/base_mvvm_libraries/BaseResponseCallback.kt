package com.basefy.base_mvvm_libraries



abstract class BaseResponseCallBack<R> constructor(
    private val baseInterfaces: BaseMVVMInterfaces
) : BaseMVVMServiceCallback<R> {

    override fun onSuccess(response: R?) {
        baseInterfaces.hideLoading()
    }

    override fun onError(errorCode: Int, errorMessage: String) {
        baseInterfaces.hideLoading()
        baseInterfaces.showMessage(errorMessage)
    }
}