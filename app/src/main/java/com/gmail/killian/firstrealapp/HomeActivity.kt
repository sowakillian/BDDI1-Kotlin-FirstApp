package com.gmail.killian.firstrealapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val intent = Intent(this, MainActivity::class.java)
        //startActivity(intent)

        val chemin: Uri = Uri.parse("tel:0636376304")
        val naviguer = Intent(Intent.ACTION_VIEW, chemin)
        startActivity(naviguer)

    }
}