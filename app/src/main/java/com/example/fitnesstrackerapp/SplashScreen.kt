package com.example.fitnesstrackerapp

import android.os.Bundle
import android.os.Handler
import android.content.Intent
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.fitnesstrackerapp.MainActivity
import com.example.fitnesstrackerapp.R

class SplashScreen : AppCompatActivity() {
    private lateinit var up: Animation
    private lateinit var down: Animation
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        imageView = findViewById(R.id.appsplash)
        up = AnimationUtils.loadAnimation(applicationContext, R.anim.up)
        imageView.startAnimation(up)

        textView = findViewById(R.id.appname)
        down = AnimationUtils.loadAnimation(applicationContext, R.anim.down)
        textView.startAnimation(down)

        Handler().postDelayed({
            startActivity(Intent(applicationContext, MainActivity::class.java))
            finish()
        }, 3500)
    }
}
