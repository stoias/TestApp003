package com.example.testapp003

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.*
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class MainActivity : AppCompatActivity() {
    var countValue:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countView: TextView = findViewById(R.id.text)
        val addButton: Button = findViewById(R.id.add)
        val pullButton: Button = findViewById(R.id.pull)
        val resetButton: Button = findViewById(R.id.reset)

        addButton.setOnClickListener {
            countValue++
            countView.setText(Integer.toString(countValue))

        }

        pullButton.setOnClickListener {
            countValue--
            countView.setText(Integer.toString(countValue))
        }

        resetButton.setOnClickListener {
            countValue = 0
            countView.setText(Integer.toString(countValue))
        }

        resetButton.setOnClickListener {
            countValue = 0
            countView.setText(Integer.toString(countValue))
        }
        countView.setText("0")

    }


}
