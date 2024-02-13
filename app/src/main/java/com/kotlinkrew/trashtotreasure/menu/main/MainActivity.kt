package com.kotlinkrew.trashtotreasure.menu.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.kotlinkrew.trashtotreasure.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name: TextView = findViewById(R.id.tv_name)
        val textFromLogin = intent.getStringExtra("textFromLoginActivity")
        name.text = textFromLogin
    }
}