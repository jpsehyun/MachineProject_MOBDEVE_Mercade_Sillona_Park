package com.example.machineproject_mobdeve_mercado_sillona_park

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.lang.IllegalArgumentException

class CourseViewActivity: AppCompatActivity() {
    private lateinit var addCourseButton: Button
    private lateinit var scheduleButton: Button
    private lateinit var homeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.course_view)

        initializeUI()
        initializeListener()
    }

    fun initializeUI() {
        addCourseButton = findViewById(R.id.CV_AddCourse_Btn)
        scheduleButton = findViewById(R.id.CV_Schedule_Btn)
        homeButton = findViewById(R.id.CV_Home_Btn)
    }

    fun initializeListener() {
        addCourseButton.setOnClickListener {
            loadNextScreen("courseEdit")
        }
        scheduleButton.setOnClickListener{
            loadNextScreen("schedule")
        }
        homeButton.setOnClickListener{
            loadNextScreen("home")
        }
    }

    private fun loadNextScreen(destination: String) {
        var intentLoadNextActivity = when (destination) {
            "courseEdit" -> Intent(this, AddEditViewActivity::class.java)
            "schedule" -> Intent(this, MondayActivity::class.java)
            "home" -> Intent(this, MainActivity::class.java)
            else -> throw IllegalArgumentException("Invalid destination: $destination")
        }
        startActivity(intentLoadNextActivity)
    }
}