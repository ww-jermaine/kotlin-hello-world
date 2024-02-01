package com.example.recipeapp

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity: Activity() {

    lateinit var textViewText: TextView
    lateinit var buttonTest: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewText = findViewById<TextView>(R.id.text_view_text)
        buttonTest = findViewById<Button>(R.id.button_text)


        buttonTest.setOnClickListener {
            textViewText.text = "Hello, this is a test!"
        }
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}