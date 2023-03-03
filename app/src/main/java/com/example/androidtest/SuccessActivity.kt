package com.example.androidtest

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SuccessActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        val textViewSuccess = findViewById<TextView>(R.id.textViewSuccess)
        val name = intent.getStringExtra("name")
        textViewSuccess.text = "$name uspješno ste došli do 10 koraka."
    }
}