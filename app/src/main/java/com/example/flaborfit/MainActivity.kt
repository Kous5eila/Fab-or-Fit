package com.example.flaborfit

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    val weightLayout = findViewById<ConstraintLayout>(R.id.weightLayout)
    val yogaLayout = findViewById<ConstraintLayout>(R.id.yogaLayout)
    val cardioLayout = findViewById<ConstraintLayout>(R.id.cardioLayout)

    weightLayout.setOnClickListener {
        val weightExercice = Weight()
        loadDetailsActivity(weightExercice)
    }

    yogaLayout.setOnClickListener {
        val YogaExercice = Yoga()
        loadDetailsActivity(YogaExercice)
    }

    cardioLayout.setOnClickListener {
        val cardioExercice = Cardio()
        loadDetailsActivity(cardioExercice)
    }




    }

private fun loadDetailsActivity(detailsActivity:Activity){
        val intent = Intent(this,detailsActivity::class.java)
        startActivity(intent)

    }
}