package com.example.lab_exame02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MusicEvents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_events)

        var button9 = findViewById<Button>(R.id.m0)
        button9.setOnClickListener {
            val intent1 = Intent(this, Home::class.java)
            startActivity(intent1)
        }
        var button10 = findViewById<Button>(R.id.m0)
        button10.setOnClickListener {
            val intent1 = Intent(this, Home::class.java)
            startActivity(intent1)
        }
        var button11 = findViewById<Button>(R.id.m2)
        button11.setOnClickListener {
            val intent1 = Intent(this, Favorites::class.java)
            startActivity(intent1)
        }

        var button12 = findViewById<Button>(R.id.m2)
        button12.setOnClickListener {
            val intent1 = Intent(this, Features::class.java)
            startActivity(intent1)
        }
        var button13 = findViewById<Button>(R.id.fav2)
        button13.setOnClickListener {
            val intent1 = Intent(this, Favorites::class.java)
            startActivity(intent1)
        }

        var button14 = findViewById<Button>(R.id.prof2)
        button14.setOnClickListener {
            val intent1 = Intent(this, Profile::class.java)
            startActivity(intent1)
        }

        var button15 = findViewById<Button>(R.id.home2)
        button15.setOnClickListener {
            val intent1 = Intent(this, Home::class.java)
            startActivity(intent1)
        }

    }
}