package com.example.androidtest

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*

class MainActivity : AppCompatActivity() {

    private var counter = 0
    private lateinit var linearLayout: LinearLayout
    private lateinit var textViewCounter: TextView
    private lateinit var buttonUp: Button
    private lateinit var buttonDown: Button
    private lateinit var nameEditText: EditText
    private lateinit var name: String

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        linearLayout = findViewById(R.id.linearLayout)
        textViewCounter = findViewById(R.id.textViewCounter)
        buttonUp = findViewById(R.id.buttonUp)
        buttonDown = findViewById(R.id.buttonDown)
        nameEditText = findViewById(R.id.textView)


        buttonUp.setOnClickListener {
            counter++
            if (counter == 10) {
                val intent = Intent(this, SuccessActivity::class.java)
                intent.putExtra("name", name)
                startActivity(intent)
                counter = 0
            }
            textViewCounter.text = "$counter"
        }

        buttonDown.setOnClickListener {
            if (counter > 0) {
                counter--
                textViewCounter.text = "$counter"
            }
        }

        Toast.makeText(applicationContext, "onCreate", Toast.LENGTH_SHORT).show()
        Log.i("MyLog", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext, "onStart", Toast.LENGTH_SHORT).show()
        Log.i("MyLog", "onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.i("MyLog", "onResume")
        Toast.makeText(applicationContext, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i("MyLog", "onPause")
        Toast.makeText(applicationContext, "onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i("MyLog", "onStop")
        Toast.makeText(applicationContext, "onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MyLog", "onDestroy")
        Toast.makeText(applicationContext, "onDestroy", Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("counter", counter)
        Log.i("MyLog", "onSaveInstanceState")
        Toast.makeText(applicationContext, "onSaveInstanceState", Toast.LENGTH_SHORT).show()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        counter = savedInstanceState.getInt("counter")
        Log.i("MyLog", "onRestoreInstanceState")
        Toast.makeText(applicationContext, "onRestoreInstanceState", Toast.LENGTH_SHORT).show()
    }
}


