package com.androiddesdecero.viewmodellivedatakotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.androiddesdecero.viewmodellivedatakotlin.R
import com.androiddesdecero.viewmodellivedatakotlin.databinding.ActivityDataBindingBinding
import com.androiddesdecero.viewmodellivedatakotlin.utils.User

class DataBindingActivity : AppCompatActivity() {

    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_data_binding)

        val binding: ActivityDataBindingBinding = DataBindingUtil.setContentView(this@DataBindingActivity,R.layout.activity_data_binding)

        user = User("Alberto", "30")

        binding.user = user
    }
}
