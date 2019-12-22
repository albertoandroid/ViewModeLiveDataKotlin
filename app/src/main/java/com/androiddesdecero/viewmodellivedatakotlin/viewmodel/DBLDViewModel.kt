package com.androiddesdecero.viewmodellivedatakotlin.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.androiddesdecero.viewmodellivedatakotlin.utils.User

class DBLDViewModel: ViewModel() {

    var user: MutableLiveData<User> = MutableLiveData()

    fun setUser(user: User){
        this.user.value = user
    }

    fun updateUser(){
        val user = User("Laura", "23")
        this.user.value = user
    }
}