package com.example.machineproject_mobdeve_mercado_sillona_park

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CourseViewActivity: AppCompatActivity() {
    private lateinit var addCourseButton: Button
    private lateinit var scheduleButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.course_view)

        initializeUI()
        initializeListener()
    }

    fun initializeUI() {
        addCourseButton = findViewById(R.id.CV_AddCourse_Btn)
        scheduleButton = findViewById(R.id.CV_Schedule_Btn)
    }

    fun initializeListener() {
        addCourseButton.setOnClickListener {
            loadAddCourse()
        }
    }

    fun loadAddCourse(){
        val intentLoadNextActivity = Intent(this, AddEditViewActivity::class.java)
        startActivity(intentLoadNextActivity)
    }
}