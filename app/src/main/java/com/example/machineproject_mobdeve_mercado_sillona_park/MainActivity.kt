package com.example.machineproject_mobdeve_mercado_sillona_park

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

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
        main_Course_Btn = findViewById(R.id.main_Course_Btn)
        main_Schdule_Btn = findViewById(R.id.main_Schedule_Btn)
    }

    fun initializeListener() {
        main_Schdule_Btn.setOnClickListener {
            loadNextScreen()
        }
    }

    private fun loadNextScreen() {
        var intentLoadNextActivity = Intent(this, MondayActivity::class.java)
        startActivity(intentLoadNextActivity)
    }
}