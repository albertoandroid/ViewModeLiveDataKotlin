package com.androiddesdecero.viewmodellivedatakotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.androiddesdecero.viewmodellivedatakotlin.R
import com.androiddesdecero.viewmodellivedatakotlin.databinding.ActivityDbldBinding
import com.androiddesdecero.viewmodellivedatakotlin.utils.User
import com.androiddesdecero.viewmodellivedatakotlin.viewmodel.DBLDViewModel

class DBLDActivity : AppCompatActivity() {

    lateinit var viewModel: DBLDViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityDbldBinding = DataBindingUtil.setContentView(this@DBLDActivity, R.layout.activity_dbld)

        binding.setLifecycleOwner(this)

        viewModel =ViewModelProviders.of(this).get(DBLDViewModel::class.java)

        binding.viewModel = viewModel

        val user = User("Alberto", "30")
        viewModel.setUser(user)

    }
}
