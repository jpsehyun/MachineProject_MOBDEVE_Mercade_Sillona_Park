package com.example.machineproject_mobdeve_mercado_sillona_park

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.lang.IllegalArgumentException

class MainActivity : AppCompatActivity() {
    private lateinit var main_Course_Btn: Button
    private lateinit var main_Schdule_Btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_page_view)

        initializeUI()
        initializeListener()
    }


    fun initializeUI() {
        main_Course_Btn = findViewById(R.id.CV_AddCourse_Btn)
        main_Schdule_Btn = findViewById(R.id.CV_Schedule_Btn)
    }

    fun initializeListener() {
        main_Course_Btn.setOnClickListener {
            loadNextScreen("course")
        }
        main_Schdule_Btn.setOnClickListener {
            loadNextScreen("schedule")
        }
    }

    private fun loadNextScreen(destination: String) {
        var intentLoadNextActivity = when (destination) {
            "course" -> Intent(this, CourseViewActivity::class.java)
            "schedule" -> Intent(this, MondayActivity::class.java)
            else -> throw IllegalArgumentException("Invalid destination: $destination")

        }
        startActivity(intentLoadNextActivity)
    }
}