// MainActivity.kt
package com.example.sammysupplies

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.st10449855.sammysupplies.R

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val minutesInput = findViewById<EditText>(R.id.minutesInput)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val hoursOutput = findViewById<TextView>(R.id.hoursOutput)
        val minutesOutput = findViewById<TextView>(R.id.minutesOutput)
        val totalCostOutput = findViewById<TextView>(R.id.totalCostOutput)

        calculateButton.setOnClickListener {
            val minutesRented = minutesInput.text.toString().toIntOrNull() ?: 0

            val hoursRented = minutesRented / 60
            val additionalMinutes = minutesRented % 60
            val totalCost = (hoursRented * 400) + additionalMinutes

            hoursOutput.text = "Hours: $hoursRented"
            minutesOutput.text = "Minutes: $additionalMinutes"
            totalCostOutput.text = "Total cost: R$totalCost"
        }
    }
}
