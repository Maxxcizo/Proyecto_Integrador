package com.example.proyecto_integrador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

    }

    fun login_btn(view: View?) {
        Toast.makeText(applicationContext, "LogIn", Toast.LENGTH_SHORT)
            .show()
        val intent = Intent(this, LogIn::class.java)
        startActivity(intent)
    }
}