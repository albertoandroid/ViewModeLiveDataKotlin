package com.androiddesdecero.viewmodellivedatakotlin.bindingAdapter

import android.view.View
import androidx.databinding.BindingAdapter

object BindingAdapter {

    @JvmStatic
    @BindingAdapter("visible")
    fun setVisibility(view: View, visibility: Boolean){
        if(visibility == true){
            view.visibility = View.VISIBLE
        }else{
            view.visibility = View.GONE
        }
    }
}