package com.example.flaborfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Weight : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weight)

        val nextBtn = findViewById<ImageView>(R.id.nextBtn)

        nextBtn.setOnClickListener {
            val intent = Intent(this,Yoga::class.java)
            startActivity(intent)
        }

    }
}