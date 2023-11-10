package com.example.fitnesstrackerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {

    private lateinit var button1: Button
    private lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolBar)
        setSupportActionBar(toolbar)

        button1 = findViewById(R.id.startyoga1)
        button2 = findViewById(R.id.startyoga2)

        button1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val intent = Intent(this@MainActivity, BeforeActivity::class.java)
                startActivity(intent)
            }
        })

        button2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val intent = Intent(this@MainActivity, AfterActivity::class.java)
                startActivity(intent)
            }
        })

    }

    private fun setSupportActionBar(toolbar: Toolbar) {
        TODO("Not yet implemented")
    }

    fun afterage18(view: View) {
        val intent = Intent(this@MainActivity, AfterActivity::class.java)
        startActivity(intent)
    }
    fun beforeage18(view: View) {
        val intent = Intent(this@MainActivity, BeforeActivity::class.java)
        startActivity(intent)
    }
    fun food(view: View) {
        val intent = Intent(this@MainActivity, FoodActivity::class.java)
        startActivity(intent)
    }
}