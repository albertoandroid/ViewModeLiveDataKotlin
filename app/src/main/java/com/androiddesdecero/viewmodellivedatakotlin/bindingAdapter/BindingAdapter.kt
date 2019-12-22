package com.androiddesdecero.viewmodellivedatakotlin.bindingAdapter

import android.view.View
import android.widget.TextView
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

    @JvmStatic
    @BindingAdapter("visibility", "size")
    fun setSizeAndVisibility(view: TextView, visibility: Boolean, size: Float){
        if(visibility == true){
            view.visibility = View.VISIBLE
        }else{
            view.visibility = View.GONE
        }
        view.textSize = size
    }
}