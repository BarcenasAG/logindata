package com.abarcenas.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import com.abarcenas.login.databinding.ActivityMainBinding




class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.button2.setOnClickListener {
            if (binding.tpassword.text.toString().isBlank() || binding.tusername.text.toString().isBlank()) {
                Toast.makeText(baseContext, "agregue datos de usuario y contraseña", LENGTH_LONG).show()
            }else{
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}