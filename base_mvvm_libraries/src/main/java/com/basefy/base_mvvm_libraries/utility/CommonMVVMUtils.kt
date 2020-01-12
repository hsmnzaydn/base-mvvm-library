package com.basefy.base_mvvm_libraries.utility

import android.app.Activity
import android.app.ProgressDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import com.basefy.base_mvvm_libraries.R


class CommonMVVMUtils {


    companion object {
        fun showLoadingDialog(context: Context): ProgressDialog {
            var progressDialog: ProgressDialog = ProgressDialog(context)
            if (!(context as Activity).isFinishing) {
                progressDialog.show()
            }
            if (progressDialog.window != null) {
                progressDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            }
            progressDialog.setContentView(R.layout.progress_dialog)
            progressDialog.setCancelable(false)
            progressDialog.setCanceledOnTouchOutside(false)

            return progressDialog
        }
    }





}
