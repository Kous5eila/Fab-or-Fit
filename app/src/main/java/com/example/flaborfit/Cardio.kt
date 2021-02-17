package com.example.flaborfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Cardio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardio)


        val workoutImg = findViewById<ImageView>(R.id.workoutImg)
        workoutImg.setImageDrawable(getDrawable(R.drawable.heart))



    }
}