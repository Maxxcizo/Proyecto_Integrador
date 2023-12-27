package com.example.proyecto_integrador

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        val email = findViewById<EditText>(R.id.Email_ET)
        val password = findViewById<EditText>(R.id.Password_ET)
        val login_btn = findViewById<Button>(R.id.Login_btn)

        // Creacion del onclicklistener del boton login para el inicio de sesion
        login_btn.setOnClickListener(View.OnClickListener {
            onClickLogin()
        })
    }

    private fun onClickLogin() {
        // Realizar los pasos pertinentes para el inicio de sesion
        Toast.makeText(applicationContext, "Login", Toast.LENGTH_SHORT)
            .show()
    }


    fun signup_btn(view: View?) {
        Toast.makeText(applicationContext, "SignUp", Toast.LENGTH_SHORT)
            .show()
        val intent = Intent(this, SignUp::class.java)
        startActivity(intent)
    }
}