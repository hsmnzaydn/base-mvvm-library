package com.basefy.base_mvvm_libraries.ui.adapter

import androidx.annotation.LayoutRes
import java.io.Serializable

interface RecyclerItem : Serializable {

    @get:LayoutRes
    val layoutId: Int
}