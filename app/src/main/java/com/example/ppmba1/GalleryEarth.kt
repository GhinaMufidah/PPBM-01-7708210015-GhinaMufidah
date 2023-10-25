package com.example.ppmba1

import  android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GalleryEarth : AppCompatActivity() {


    class MainActivity : AppCompatActivity() {

        private lateinit var button: Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_gallery_earth)

            button = findViewById(R.id.imageButton)
            button.setOnClickListener {
                Gallery();
            }
        };

        private fun Gallery() {
            val intent = Intent(this, Gallery::class.java)
            startActivity(intent)
        }
    }
}