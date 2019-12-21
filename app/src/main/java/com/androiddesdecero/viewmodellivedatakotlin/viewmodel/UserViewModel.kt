package com.androiddesdecero.viewmodellivedatakotlin.viewmodel

import androidx.lifecycle.ViewModel
import com.androiddesdecero.viewmodellivedatakotlin.utils.User

class UserViewModel: ViewModel {

    var userList: MutableList<User>

    constructor(){
        userList = ArrayList()
    }

    fun addUsuer(user: User){
        userList.add(user)
    }
}