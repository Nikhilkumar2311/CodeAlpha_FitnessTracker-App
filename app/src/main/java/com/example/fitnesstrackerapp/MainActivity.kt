package com.example.fitnesstrackerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private lateinit var button1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set up the toolbar
        val toolbar: Toolbar = findViewById(R.id.toolBar)
        setSupportActionBar(toolbar)

        // Initialize the button
        button1 = findViewById(R.id.startyoga1)

        // Set a click listener for the button using an anonymous inner class
        button1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                // Start the 'BeforeActivity' when the button is clicked
                val intent = Intent(this@MainActivity, BeforeActivity::class.java)
                startActivity(intent)
            }
        })
    }


    // Function to handle the click event for a different button with the attribute 'android:onClick="beforeage18"'
    fun beforeage18(view: View) {
        // Start the 'BeforeActivity' when the corresponding button is clicked
        val intent = Intent(this@MainActivity, BeforeActivity::class.java)
        startActivity(intent)
    }

    // Function to handle the click event for a different button with the attribute 'android:onClick="food"'
    fun food(view: View) {
        // Start the 'FoodActivity' when the corresponding button is clicked
        val intent = Intent(this@MainActivity, FoodActivity::class.java)
        startActivity(intent)
    }
}
