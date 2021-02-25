package com.example.beamer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.button)
        val height = findViewById<EditText>(R.id.height)
        val weight = findViewById<EditText>(R.id.weight)
        val result = findViewById<TextView>(R.id.result)

        button.setOnClickListener {

            val bmiWeight = weight.text.toString().toFloat()
            val bmiHeight = weight.text.toString().toFloat()
            val bmiCalc = bmiWeight/(bmiHeight*bmiHeight)*1000
            result.text = bmiCalc.toString()

        }

    }
}