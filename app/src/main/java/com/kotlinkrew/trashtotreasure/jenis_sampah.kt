package com.kotlinkrew.trashtotreasure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class jenis_sampah : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jenis_sampah)

        val organikClick: CardView = findViewById(R.id.cv_2)
        organikClick.setOnClickListener {
            val intent = Intent(this,sampah_organik::class.java)
            startActivity(intent)

        }
        val anorganikClick: CardView = findViewById(R.id.cv_1)
        organikClick.setOnClickListener {
            val intent = Intent(this,sampah_anorganik::class.java)
            startActivity(intent)

        }
        val b3Click: CardView = findViewById(R.id.cv_3)
        organikClick.setOnClickListener {
            val intent = Intent(this,sampah_b3::class.java)
            startActivity(intent)

        }
    }
}