package com.example.fitnesstrackerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {

    lateinit var buttonValue: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = intent
        buttonValue = intent.getStringExtra("value")!!

        val intValue = buttonValue.toInt()


    }
}