package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val btnSignIn = findViewById<Button>(R.id.btn_sign_in)
//        btnSignIn.setOnClickListener {
//            val edtEmail = findViewById<EditText>(R.id.edt_email)
//            val edtPassword = findViewById<EditText>(R.id.edt_password)
//            val email = edtEmail.text.toString().trim()
//            val password = edtPassword.text.toString().trim()
//            val intent = Intent(this@MainActivity, Profile::class.java)
//            val bundle = Bundle()
//            bundle.putString("email", email)
//            bundle.putString("password", password)
//            intent.putExtras(bundle)
//
//            startActivity(intent)
//        }
        val btnSignIn = findViewById<Button>(R.id.btn_sign_in)
        btnSignIn.setOnClickListener {
            val edtEmail = findViewById<EditText>(R.id.edt_email)
            val edtPassword = findViewById<EditText>(R.id.edt_password)
            val email = edtEmail.text.toString().trim()
            val password = edtPassword.text.toString().trim()
            val intent = Intent(this, Profile::class.java)
            val bundle = Bundle()
            bundle.putString("email", email)
            bundle.putString("password", password)
            if (email == "ronaldo@gmail.com" && password == "123456") {

                intent.putExtras(bundle)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext, "Email hoặc Password không hợp lệ", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

