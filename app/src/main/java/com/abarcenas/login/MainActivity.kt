package com.abarcenas.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       //Utilizamos la funcion setOnClickListener para cuando aplastemos el boton
        button2.setOnClickListener{
            val username = tusername.text.toString().trim() //Declaramos la variable username al id de editor de texto llamda tusername
            val password = tpassword.text.toString().trim() //Declaramos la variable username al id de editor de texto llamada tpassword

            if(username.isEmpty())
            {
                tusername.error = "Introduzca su usuario"
                tusername.requestFocus()
            }
            if (password.isEmpty()){
                tpassword.error = "Introduzca su contraseña"
                tpassword.requestFocus()
            }
            if(username.toString() != "ale" && password.toString() != "12345") //Si la contraseña y el pasworrd son los establecidos
            {                                                                  // nos permitira continuar y pasar al siguiente paso
            }else
            {
             val intent = Intent(this,HomeActivity::class.java)
              startActivity(intent)
            }
        }

    }
}