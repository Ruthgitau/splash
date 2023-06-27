package com.example.splash

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var btn_website = findViewById<Button>(R.id.btn_website)

        btn_website.setOnClickListener {

            val toweb = Intent(Intent.ACTION_VIEW , Uri.parse("https://github.com/Ruthgitau"))
            startActivity(toweb)
        }

    }
}