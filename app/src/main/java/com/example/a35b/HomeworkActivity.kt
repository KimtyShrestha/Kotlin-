package com.example.a35b

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeworkActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework)

        val fullName = findViewById<EditText>(R.id.etFullName)
        val email = findViewById<EditText>(R.id.etEmail)
        val password = findViewById<EditText>(R.id.etPassword)
        val genderMale = findViewById<RadioButton>(R.id.radioMale)
        val genderFemale = findViewById<RadioButton>(R.id.radioFemale)
        val countryDropdown = findViewById<Spinner>(R.id.spinnerCountry)
        val cityAutocomplete = findViewById<EditText>(R.id.etAutocompleteCity)
        val agreeTerms = findViewById<CheckBox>(R.id.checkBoxTerms)
        val submitButton = findViewById<Button>(R.id.btnSubmit)

        submitButton.setOnClickListener {
            if (agreeTerms.isChecked) {
                val gender = if (genderMale.isChecked) "Male" else "Female"

                // Collect all data
                val userData = arrayListOf(
                    fullName.text.toString(),
                    email.text.toString(),
                    gender,
                    countryDropdown.selectedItem.toString(),
                    cityAutocomplete.text.toString()
                )

                // Navigate to RecyclerViewActivity
                val intent = Intent(this, RecyclerViewActivity::class.java)
                intent.putStringArrayListExtra("USER_DATA", userData)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please agree to the terms and conditions", Toast.LENGTH_SHORT).show()
            }
        }
    }
}