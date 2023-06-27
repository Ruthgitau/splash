package com.example.splash

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var btn_back = findViewById<Button>(R.id.btn_back)
        var btn_home = findViewById<Button>(R.id.btn_home)

        btn_back.setOnClickListener {
            val back = Intent(this, RegisterActivity::class.java)
            startActivity(back)
        }
        btn_home.setOnClickListener {
            val home = Intent(this, HomeActivity::class.java)
            startActivity(home)
        }
    }
}