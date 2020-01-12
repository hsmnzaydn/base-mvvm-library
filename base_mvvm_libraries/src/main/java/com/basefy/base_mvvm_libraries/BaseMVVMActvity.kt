package com.basefy.base_mvvm_libraries

import android.app.ProgressDialog
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.basefy.base_mvvm_libraries.utility.CommonMVVMUtils
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseMVVMActvity<T : ViewDataBinding, VM : BaseMVVMViewModel<BaseMVVMInterfaces>> :
    DaggerAppCompatActivity(),
    BaseMVVMInterfaces {

    var progressDialog: ProgressDialog? = null

    @LayoutRes
    abstract fun layoutRes(): Int

    abstract fun model(): Any

    protected lateinit var binding: T
        private set

    protected lateinit var viewModel: VM
        private set

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, layoutRes())

        viewModel =
            ViewModelProviders.of(
                this,
                viewModelFactory
            ).get((model() as Class<VM>)).also {
                it.onAttach(this)
            }

    }
    override fun showMessage(message: String) {
        Toast.makeText(this@BaseMVVMActvity, message, Toast.LENGTH_LONG).show()
    }

    override fun showLoading() {
        progressDialog = CommonMVVMUtils.showLoadingDialog(this@BaseMVVMActvity)

    }

    override fun hideLoading() {
        if (progressDialog != null) {
            if (progressDialog!!.isShowing) {
                progressDialog!!.dismiss()

            }
        }
    }
}