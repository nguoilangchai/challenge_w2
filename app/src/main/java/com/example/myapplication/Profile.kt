package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        
        var btnCdProfileDetail = findViewById<Button>(R.id.btnCdProfileDetail)

        btnCdProfileDetail.setOnClickListener {

            var edtFullName = findViewById<EditText>(R.id.edtFullName)
            var edtEmail = findViewById<EditText>(R.id.edtEmail)
            var edtPhone = findViewById<EditText>(R.id.edtPhone)

            var fullName = edtFullName.text.toString().trim()
            var email = edtEmail.text.toString().trim()
            var phone = edtPhone.text.toString().trim()

            var intent = Intent(this@Profile, ProfileDetail::class.java)
            var bundle = Bundle()

            bundle.putString("fullName", fullName)
            bundle.putString("email", email)
            bundle.putString("phone", phone)

            intent.putExtras(bundle)
            startActivity(intent)

        }
    }
}