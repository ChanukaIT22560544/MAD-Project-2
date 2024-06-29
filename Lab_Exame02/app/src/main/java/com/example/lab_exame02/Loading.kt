package com.example.lab_exame02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar

class Loading : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)


        val progressBar = findViewById<ProgressBar>(R.id.progressBar)

        // Simulate loading process
        simulateLoading(progressBar)
    }

    private fun simulateLoading(progressBar: ProgressBar) {
        // Show the progress bar to start the animation
        progressBar.visibility = View.VISIBLE

        // Simulate loading process in a background thread
        Thread {
            // Simulate some time-consuming task
            Thread.sleep(3000)

            // Hide the progress bar when loading is complete
            runOnUiThread {
                progressBar.visibility = View.GONE
            }
        }.start()

        val handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@Loading, Home::class.java)
            startActivity(intent)
            finish()
        }, 2500)
    }
}