package com.example.lab_exame02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnboardScreen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_screen1)

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent1=Intent (this,OnboardScreen2::class.java)
            startActivity(intent1)
        }
    }
}