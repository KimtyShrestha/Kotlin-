package com.example.a35b

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeworkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework)

        val submitButton: Button = findViewById(R.id.submitButton)
        val termsCheckBox: CheckBox = findViewById(R.id.termsCheckBox)
        val countryDropdown: AutoCompleteTextView = findViewById(R.id.countryDropdown)

        // Populate Country Dropdown
        val countries = arrayOf("Nepal", "India", "USA", "Australia", "Canada")
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, countries)
        countryDropdown.setAdapter(adapter)

        submitButton.setOnClickListener {
            if (termsCheckBox.isChecked) {
                Toast.makeText(this, "Form Submitted Successfully", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please accept terms and conditions", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
