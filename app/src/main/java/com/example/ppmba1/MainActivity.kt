package com.example.ppmba1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.StartButton)
        button.setOnClickListener {
            Login();
        }
    };

    private fun Login() {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }
}
