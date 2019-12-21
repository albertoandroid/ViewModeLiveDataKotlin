package com.androiddesdecero.viewmodellivedatakotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.androiddesdecero.viewmodellivedatakotlin.R
import com.androiddesdecero.viewmodellivedatakotlin.utils.User
import com.androiddesdecero.viewmodellivedatakotlin.viewmodel.UserViewModel
import kotlinx.android.synthetic.main.activity_user_view_model.*

class UserViewModelActivity : AppCompatActivity() {

    var userList: ArrayList<User> = ArrayList()
    lateinit var userViewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_view_model)
        setUpView()
    }

    fun setUpView(){

        userViewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)

        btSalvar.setOnClickListener{
            var user = User()
            user.edad = etEdad.text.toString()
            user.nombre = etNombre.text.toString()
            userList.add(user)
            userViewModel.addUsuer(user)
        }

        btVer.setOnClickListener{
            var texto = ""
            for(user in userList){
                texto += user.nombre + " " + user.edad + "\n"
            }
            tvUser.text = texto

            texto = ""
            for(user in userViewModel.userList){
                texto += user.nombre + " " + user.edad + "\n"
            }
            tvUserViewModel.text = texto
        }
    }
}
