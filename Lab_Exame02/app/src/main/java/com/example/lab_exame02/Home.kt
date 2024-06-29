package com.example.lab_exame02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val imageView: ImageView = findViewById(R.id.menu)
        imageView.setOnClickListener {
            val intent = Intent(this, Features::class.java)
            startActivity(intent)
        }
        var button5 = findViewById<Button>(R.id.home)
        button5.setOnClickListener {
            val intent1 = Intent(this, Home::class.java)
            startActivity(intent1)
        }
        var button6 = findViewById<Button>(R.id.m)
        button6.setOnClickListener {
            val intent1 = Intent(this, Features::class.java)
            startActivity(intent1)
        }
        var button7 = findViewById<Button>(R.id.favorite)
        button7.setOnClickListener {
            val intent1 = Intent(this, Favorites::class.java)
            startActivity(intent1)
        }
        var button8 = findViewById<Button>(R.id.prof)
        button8.setOnClickListener {
            val intent1 = Intent(this, Profile::class.java)
            startActivity(intent1)
        }

        val imageView1: ImageView = findViewById(R.id.e10)
        imageView1.setOnClickListener {
            val intent = Intent(this, DetailsEvent::class.java)
            startActivity(intent)

        }
        var button9 = findViewById<Button>(R.id.b2)
        button9.setOnClickListener {
            val intent1 = Intent(this, MusicEvents::class.java)
            startActivity(intent1)
        }

    }
}