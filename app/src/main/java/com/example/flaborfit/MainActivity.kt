package com.example.flaborfit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    var EXTRA_KEY = "Workout"
    val EXERCICE_LIFTING = "Weight Lifting"
    val EXERCICE_YOGA = "Yoga"
    val EXERCICE_CARDIO = "Cardio"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    val weightLayout = findViewById<ConstraintLayout>(R.id.weightLayout)
    val yogaLayout = findViewById<ConstraintLayout>(R.id.yogaLayout)
    val cardioLayout = findViewById<ConstraintLayout>(R.id.cardioLayout)

    weightLayout.setOnClickListener {
        loadDetailsActivity(EXERCICE_LIFTING)
    }

    yogaLayout.setOnClickListener {
        loadDetailsActivity(EXERCICE_YOGA)
    }

    cardioLayout.setOnClickListener {
        loadDetailsActivity(EXERCICE_CARDIO)
    }




    }

    private fun loadDetailsActivity(exerciceTitle:String){
        val intent = Intent(this,DetailsActivity::class.java)
        intent.putExtra(EXTRA_KEY,exerciceTitle)
        startActivity(intent)

    }
}