package com.example.splash

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var btn_log = findViewById<Button>(R.id.btn_log)
        var btn_reg = findViewById<Button>(R.id.btn_reg)


        btn_log.setOnClickListener {

          val nxt = Intent(this, LoginActivity::class.java )
            startActivity(nxt)
        }

        btn_reg.setOnClickListener {
            //Toast.makeText(applicationContext,"This is register activity",Toast.LENGTH_SHORT).show()
            val msg = Toast.makeText(applicationContext,"Successfully registered",Toast.LENGTH_SHORT)
            msg.show()
        }


    }
}