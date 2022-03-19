package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText

class ProfileDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_detail)

        var bundle = intent.extras
        bundle?.let {
            var fullName = it.getString("fullName")
            var email = it.getString("email")
            var phone = it.getString("phone")

            var tempFullName = findViewById<EditText>(R.id.edtFullNameProfileDetail)
            var tempEmail = findViewById<EditText>(R.id.edtEmailProfileDetail)
            var tempPhone = findViewById<EditText>(R.id.edtPhoneProfileDetail)

            tempFullName.text = Editable.Factory.getInstance().newEditable("$fullName")
            tempEmail.text = Editable.Factory.getInstance().newEditable("$email")
            tempPhone.text = Editable.Factory.getInstance().newEditable("$phone")
        }
    }
}