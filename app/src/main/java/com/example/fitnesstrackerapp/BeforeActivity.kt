package com.example.fitnesstrackerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat.startActivity

class BeforeActivity : AppCompatActivity() {
    private lateinit var newArray: IntArray
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_before)

        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolBar)
        setSupportActionBar(toolbar)

        newArray = intArrayOf(
            R.id.bow_pose,
            R.id.bridge_pose,
            R.id.chair_pose,
            R.id.child_pose,
            R.id.cobbler_pose,
            R.id.cow_pose,
            R.id.playji_pose,
            R.id.pauseji_pose,
            R.id.plank_pose,
            R.id.crunches_pose,
            R.id.situp_pose,
            R.id.rotation_pose,
            R.id.twist_pose,
            R.id.windmill_pose,
            R.id.legup_pose
        )
    }

    fun Imagebuttonclicked(view: View) {
        for (i in 0 until newArray.size) {
            if (view.id == newArray[i]) {
                val value = i + 1
                Log.i("FIRST", value.toString())
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("value", value.toString())
                startActivity(intent)
                break
            }
        }
    }
}