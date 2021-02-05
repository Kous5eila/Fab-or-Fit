package com.example.flaborfit

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val EXERCICE_TITLE = intent.getStringExtra("Workout")

        val workoutTitle = findViewById<TextView>(R.id.workoutTitle)
        val workoutImg = findViewById<ImageView>(R.id.workoutImg)
        val mainBg = findViewById<LinearLayout>(R.id.mainBg)

        workoutTitle.text = EXERCICE_TITLE

        if (EXERCICE_TITLE.equals( "Yoga")) {
                workoutImg.setImageDrawable(getDrawable(R.drawable.lotus))
                mainBg.setBackgroundColor(Color.parseColor("#916bcd"))
        } else if (EXERCICE_TITLE.equals( "Cardio")) {
                workoutImg.setImageDrawable(getDrawable(R.drawable.heart))
                mainBg.setBackgroundColor(Color.parseColor("#52ad56"))
        } else {
                workoutImg.setImageDrawable(getDrawable(R.drawable.weight))
                mainBg.setBackgroundColor(Color.parseColor("#2ca5f5"))
        }
    }
}