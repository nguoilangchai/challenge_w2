package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnBoarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnbtnLogin = findViewById<Button>(R.id.btnLogin)
        btnbtnLogin.setOnClickListener{

            var intent = Intent(this@OnBoarding, SignIn::class.java)
            startActivity(intent)
        }

        var btnSignUp = findViewById<Button>(R.id.btnSignUp)
        btnbtnLogin.setOnClickListener{

            var intent = Intent(this@OnBoarding, SignUp::class.java)
            startActivity(intent)
        }

        var btnDangKy = findViewById<Button>(R.id.btnDangKy)
        btnDangKy.setOnClickListener{

            var intent = Intent(this@OnBoarding, SignUp::class.java)
            startActivity(intent)
        }
    }
}