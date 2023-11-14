package com.example.fitnesstrackerapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import pl.droidsonroids.gif.GifImageView

class SecondActivity : AppCompatActivity() {

    // Declaring variables
    lateinit var buttonValue: String
    lateinit var startBtn: Button
    private lateinit var countDownTimer: CountDownTimer
    lateinit var mtextView: TextView
    private var MTimeRunning: Boolean = false
    private var MTimeLeftinmills: Long = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Retrieving value from the intent
        val intent = intent
        buttonValue = intent.getStringExtra("value")!!

        // Converting the button value to an integer
        val intValue = buttonValue.toInt()

        // Setting up UI based on the button value
        when(intValue){
            // Cases for different button values
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
            // Default case
            else ->{
                findViewById<GifImageView>(R.id.basic).setImageResource(R.drawable.exersice_1)
                val step = findViewById<TextView>(R.id.step)
                val step2 = getString(R.string.pose1)
                step.text = step2
            }

        }

        // Initializing UI elements
        startBtn = findViewById(R.id.startbutton)
        mtextView = findViewById(R.id.time)

        // Set click listener for the start button
        startBtn.setOnClickListener {
            if (MTimeRunning) {
                stopTimer()
            } else {
                startTimer()
            }
        }


    }

    // Function to stop the timer
    private fun stopTimer() {
        countDownTimer.cancel()
        MTimeRunning = false
        startBtn.text = "START"
    }

    // Function to start the timer
    private fun startTimer() {
        // Extracting minutes and seconds from the timer text view
        val value1: CharSequence = mtextView.text
        val num1 = value1.toString()
        val num2 = num1.substring(0, 2)
        val num3 = num1.substring(3, 5)
        val number = Integer.valueOf(num2) * 60 + Integer.valueOf(num3)
        MTimeLeftinmills = number * 1000L

        // Update the timer
        updateTimer()

        // Creating a new countdown timer
        countDownTimer = object : CountDownTimer(MTimeLeftinmills, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                MTimeLeftinmills = millisUntilFinished
                updateTimer()
            }

            override fun onFinish() {
                // When the timer finishes, increment the button value and start a new activity
                var newvalue = Integer.valueOf(buttonValue) + 1
                if (newvalue <= 7) {
                    val intent = Intent(this@SecondActivity, SecondActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                    intent.putExtra("value", newvalue.toString())
                    startActivity(intent)
                } else {
                    // If the button value exceeds 7, reset to 1
                    newvalue = 1
                    val intent = Intent(this@SecondActivity, SecondActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                    intent.putExtra("value", newvalue.toString())
                    startActivity(intent)
                }
            }
        }.start()

        // Change button text and set timer running to true
        startBtn.text = "PAUSE"
        MTimeRunning = true
    }

    // Function to update the timer text view
    private fun updateTimer() {
        val minutes = (MTimeLeftinmills / 60000).toInt()
        val seconds = (MTimeLeftinmills % 60000 / 1000).toInt()
        val timeLeftText = StringBuilder()
        if (minutes < 10) {
            timeLeftText.append("0")
        }
        timeLeftText.append("$minutes:")


        if (seconds < 10) {
            timeLeftText.append("0")
        }
        timeLeftText.append(seconds)

        mtextView.text = timeLeftText.toString()
    }

    // Override onBackPressed to handle back button behavior if needed
    override fun onBackPressed() {
        super.onBackPressed()
    }

}