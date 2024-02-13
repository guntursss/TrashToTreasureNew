package com.kotlinkrew.trashtotreasure.menu.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.cardview.widget.CardView
import com.kotlinkrew.trashtotreasure.R
import com.kotlinkrew.trashtotreasure.menu.main.MainActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login : CardView = findViewById(R.id.card_login)
        val editText : EditText = findViewById(R.id.et_login)

        login.setOnClickListener{
            val inputText = editText.text.toString()

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("textFromLoginActivity", inputText)
            startActivity(intent)
        }
    }
}