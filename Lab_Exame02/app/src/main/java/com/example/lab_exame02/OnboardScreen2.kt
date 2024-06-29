package com.example.lab_exame02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button

class OnboardScreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_screen2)

        var button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            val intent2 = Intent (this,OnboardScreen1::class.java)
            startActivity(intent2)


        }
        var button= findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent3 = Intent(this, CreateAccount::class.java)
            startActivity(intent3)
        }
    }
}