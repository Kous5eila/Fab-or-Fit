package com.example.flaborfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Yoga : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga)

        val workoutImg = findViewById<ImageView>(R.id.workoutImg)
        workoutImg.setImageDrawable(getDrawable(R.drawable.lotus))

        val nextBtn = findViewById<ImageView>(R.id.nextBtn)

        nextBtn.setOnClickListener {
            val intent = Intent(this,Cardio::class.java)
            startActivity(intent)
        }

    }
}