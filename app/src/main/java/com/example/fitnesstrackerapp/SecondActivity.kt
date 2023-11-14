package com.example.fitnesstrackerapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import pl.droidsonroids.gif.GifImageView

class SecondActivity : AppCompatActivity() {

    lateinit var buttonValue: String
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = intent
        buttonValue = intent.getStringExtra("value")!!

        val intValue = buttonValue.toInt()

        when(intValue){
            1 ->{
                findViewById<GifImageView>(R.id.basic).setImageResource(R.drawable.exersice_1)
                val step = findViewById<TextView>(R.id.step)
                val step2 = getString(R.string.pose1)
                step.text = step2
            }
            2 ->{
                findViewById<GifImageView>(R.id.basic).setImageResource(R.drawable.exersice_2)
                val step = findViewById<TextView>(R.id.step)
                val step2 = getString(R.string.pose2)
                step.text = step2
            }
            3 ->{
                findViewById<GifImageView>(R.id.basic).setImageResource(R.drawable.exersice_3)
                val step = findViewById<TextView>(R.id.step)
                val step2 = getString(R.string.pose3)
                step.text = step2
            }
            4 ->{
                findViewById<GifImageView>(R.id.basic).setImageResource(R.drawable.exersice_4)
                val step = findViewById<TextView>(R.id.step)
                val step2 = getString(R.string.pose4)
                step.text = step2
            }
            5 ->{
                findViewById<GifImageView>(R.id.basic).setImageResource(R.drawable.exersice_5)
                val step = findViewById<TextView>(R.id.step)
                val step2 = getString(R.string.pose5)
                step.text = step2
            }
            6 ->{
                findViewById<GifImageView>(R.id.basic).setImageResource(R.drawable.exersice_6)
                val step = findViewById<TextView>(R.id.step)
                val step2 = getString(R.string.pose6)
                step.text = step2
            }
            7 ->{
                findViewById<GifImageView>(R.id.basic).setImageResource(R.drawable.exersice_7)
                val step = findViewById<TextView>(R.id.step)
                val step2 = getString(R.string.pose7)
                step.text = step2
            }
            8 ->{
                findViewById<GifImageView>(R.id.basic).setImageResource(R.drawable.exersice_8)
                val step = findViewById<TextView>(R.id.step)
                val step2 = getString(R.string.pose8)
                step.text = step2
            }
            9 ->{
                findViewById<GifImageView>(R.id.basic).setImageResource(R.drawable.exersice_9)
                val step = findViewById<TextView>(R.id.step)
                val step2 = getString(R.string.pose9)
                step.text = step2
            }
            10 ->{
                findViewById<GifImageView>(R.id.basic).setImageResource(R.drawable.exersice_10)
                val step = findViewById<TextView>(R.id.step)
                val step2 = getString(R.string.pose10)
                step.text = step2
            }
            11 ->{
                findViewById<GifImageView>(R.id.basic).setImageResource(R.drawable.exersice_11)
                val step = findViewById<TextView>(R.id.step)
                val step2 = getString(R.string.pose11)
                step.text = step2
            }
            12 ->{
                findViewById<GifImageView>(R.id.basic).setImageResource(R.drawable.exersice_12)
                val step = findViewById<TextView>(R.id.step)
                val step2 = getString(R.string.pose12)
                step.text = step2
            }
            13 ->{
                findViewById<GifImageView>(R.id.basic).setImageResource(R.drawable.exersice_13)
                val step = findViewById<TextView>(R.id.step)
                val step2 = getString(R.string.pose13)
                step.text = step2
            }
            14 ->{
                findViewById<GifImageView>(R.id.basic).setImageResource(R.drawable.exersice_15)
                val step = findViewById<TextView>(R.id.step)
                val step2 = getString(R.string.pose15)
                step.text = step2
            }
            15 ->{
                findViewById<GifImageView>(R.id.basic).setImageResource(R.drawable.exersice_14)
                val step = findViewById<TextView>(R.id.step)
                val step2 = getString(R.string.pose14)
                step.text = step2
            }
            else ->{
                findViewById<GifImageView>(R.id.basic).setImageResource(R.drawable.exersice_1)
                val step = findViewById<TextView>(R.id.step)
                val step2 = getString(R.string.pose1)
                step.text = step2
            }

        }

    }
}