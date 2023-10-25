package com.example.ppmba1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var button1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button = findViewById(R.id.masuk)
        button.setOnClickListener {
            Gallery()
        }

        button = findViewById(R.id.LoginGoogle)
        button.setOnClickListener {
            Registrasi()
        }
    }

    private fun Gallery(){
        val intent = Intent(this, Gallery::class.java)
        startActivity(intent)
    }

    private fun Registrasi(){
        val intent = Intent(this, Registrasi::class.java)
        startActivity(intent)
    }
}