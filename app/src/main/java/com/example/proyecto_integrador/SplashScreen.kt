package com.example.proyecto_integrador

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        val startButton = findViewById<ImageButton>(R.id.startButton_ss)

        startButton.setOnClickListener(View.OnClickListener {
            onClickSend()
        })
    }

    private fun onClickSend() {
        val intent = Intent(this, LogIn::class.java)
        startActivity(intent)
    }
}