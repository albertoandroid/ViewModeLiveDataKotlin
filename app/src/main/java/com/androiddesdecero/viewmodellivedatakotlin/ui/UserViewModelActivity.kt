package com.androiddesdecero.viewmodellivedatakotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androiddesdecero.viewmodellivedatakotlin.R
import com.androiddesdecero.viewmodellivedatakotlin.utils.User
import kotlinx.android.synthetic.main.activity_user_view_model.*

class UserViewModelActivity : AppCompatActivity() {

    var userList: ArrayList<User> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_view_model)
        setUpView()
    }

    fun setUpView(){
        btSalvar.setOnClickListener{
            var user = User()
            user.edad = etEdad.text.toString()
            user.nombre = etNombre.text.toString()
            userList.add(user)
        }

        btVer.setOnClickListener{
            var texto = ""
            for(user in userList){
                texto += user.nombre + " " + user.edad + "\n"
            }
        }
    }
}
