package com.gmail.killian.firstrealapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var button:Button
    lateinit var email:EditText
    lateinit var password:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun initViews() {
        button = findViewById<Button>(R.id.buttonConnect)
        email = findViewById<EditText>(R.id.hintEmail)
        password = findViewById<EditText>(R.id.hintPassword)

        button.setOnClickListener {
            val emailContent = email.text
            val passwordContent = password.text
            Log.d("EMAIL", emailContent.toString())
            Log.d("PASSWORD", passwordContent.toString())

            if (emailContent.isEmpty()) {
                Log.d("EMAIL_EMPTY", "Email input is empty")
                email.error = "Enter a email"
            }

            if (passwordContent.isEmpty()) {
                Log.d("PASSWORD_EMPTY", "Password input is empty")
                password.error = "Enter a password"
            }
        }
    }

    override fun onResume() {
        initViews()
    }
}
