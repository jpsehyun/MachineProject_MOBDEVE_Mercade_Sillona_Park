package com.example.machineproject_mobdeve_mercado_sillona_park

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class AddEditViewActivity: AppCompatActivity() {
    private lateinit var daySpinner: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_edit_view)

        initializeUI()
    }

    fun initializeUI(){
        this.daySpinner = findViewById(R.id.daySpinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.days_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            daySpinner.adapter = adapter
        }
    }
}