package com.example.a35b

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RecyclerViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        // Retrieve data from intent
        val userData = intent.getStringArrayListExtra("USER_DATA") ?: arrayListOf()

        // Map user data to TextViews
        findViewById<TextView>(R.id.tvWelcome).text = "Welcome ${userData[0]}"
        findViewById<TextView>(R.id.tvEmail).text = "Email: ${userData[1]}"
        findViewById<TextView>(R.id.tvGender).text = "Gender: ${userData[2]}"
        findViewById<TextView>(R.id.tvCountry).text = "Country: ${userData[3]}"
        findViewById<TextView>(R.id.tvCity).text = "City: ${userData[4]}"
    }
}