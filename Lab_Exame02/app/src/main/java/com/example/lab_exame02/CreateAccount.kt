package com.example.lab_exame02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button

class CreateAccount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        var button20 = findViewById<Button>(R.id.login_button)
        button20.setOnClickListener {
            val intent1= Intent (this,Loading::class.java)
            startActivity(intent1)
        }




    }
}