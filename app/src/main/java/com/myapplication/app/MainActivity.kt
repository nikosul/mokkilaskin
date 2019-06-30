package com.myapplication.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity;
import android.view.View
import android.widget.EditText
import android.widget.TextView

import kotlin.text.Typography.euro

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun doMath(v: View) {


        val getDestination = findViewById<EditText>(R.id.destination_input)
        val totalDays = findViewById<EditText>(R.id.days_input)
        val totalFood = findViewById<EditText>(R.id.food_input)
        val totalPeople = findViewById<EditText>(R.id.people_input)
        val getResults = findViewById<TextView>(R.id.getResult)

        if (totalPeople.text.toString().isNotEmpty() && getDestination.text.toString().isNotEmpty() && totalDays.text.toString().isNotEmpty()) {

            val peopleParse = java.lang.Double.parseDouble(totalPeople.text.toString())
            val costParse = java.lang.Double.parseDouble(totalFood.text.toString())
            val euronmerkki = euro
            val jako = "Cost for each "

            val total = String.format("%.2f", costParse / peopleParse).toDouble()
            getResults.text = jako + total.toString() + euronmerkki
        }
    }
}
