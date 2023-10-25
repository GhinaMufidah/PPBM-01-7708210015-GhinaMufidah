package com.example.ppmba1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Gallery : AppCompatActivity() {

    private lateinit var buttonVenus: Button
    private lateinit var buttonSun: Button
    private lateinit var buttonNeptune: Button
    private lateinit var buttonProfile: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        buttonVenus = findViewById(R.id.venus)
        buttonVenus.setOnClickListener {
            openGalleryVenus()
        }

        buttonSun = findViewById(R.id.sun)
        buttonSun.setOnClickListener {
            openGalleryEarth()
        }

        buttonNeptune = findViewById(R.id.neptune1)
        buttonNeptune.setOnClickListener {
            openGalleryNeptune()
        }

        buttonProfile = findViewById(R.id.imageView)
        buttonProfile.setOnClickListener {
            openProfile()
        }
    }

    private fun openGalleryVenus() {
        val intent = Intent(this, GalleryVenus::class.java)
        startActivity(intent)
    }

    private fun openGalleryEarth() {
        val intent = Intent(this, GalleryEarth::class.java)
        startActivity(intent)
    }

    private fun openGalleryNeptune() {
        val intent = Intent(this, GalleryNeptune::class.java)
        startActivity(intent)
    }

    private fun openProfile() {
        val intent = Intent(this, Profile::class.java)
        startActivity(intent)
    }
}
