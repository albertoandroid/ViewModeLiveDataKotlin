package com.androiddesdecero.viewmodellivedatakotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androiddesdecero.viewmodellivedatakotlin.R
import com.androiddesdecero.viewmodellivedatakotlin.utils.User
import kotlinx.android.synthetic.main.activity_live_data.*

class LiveDataActivity : AppCompatActivity() {

    var numero: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)

        setUpView()
    }

    fun setUpView(){
        btSave.setOnClickListener{
            if(numero == 0){
                val user = User()
                user.nombre = "Alberto"
                user.edad = "30"
            }
            if(numero == 1){
                val user = User()
                user.nombre = "Maria"
                user.edad = "50"
            }
            if(numero == 2){
                val user = User()
                user.nombre = "Manuel"
                user.edad = "40"
            }
        }
    }
}
