package com.example.lab_exame02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailsEvent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_event)

        var button8 = findViewById<Button>(R.id.buyTicket)
        button8.setOnClickListener {
            val intent1 = Intent(this, Payments::class.java)
            startActivity(intent1)

        }


    }
}
