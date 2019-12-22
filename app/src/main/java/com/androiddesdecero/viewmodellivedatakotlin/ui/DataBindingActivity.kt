package com.androiddesdecero.viewmodellivedatakotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androiddesdecero.viewmodellivedatakotlin.R
import com.androiddesdecero.viewmodellivedatakotlin.utils.User

class DataBindingActivity : AppCompatActivity() {

    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_binding)
    }
}
