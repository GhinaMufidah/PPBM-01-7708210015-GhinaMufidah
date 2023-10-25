package com.example.ppmba1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View

class Registrasi : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        button = findViewById(R.id.registrasi)
        button.setOnClickListener {
            Profile();
        }
    };

    private fun Profile() {
        val intent = Intent(this, Profile::class.java)
        startActivity(intent)
    }
}
