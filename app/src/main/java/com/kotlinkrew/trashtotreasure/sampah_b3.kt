package com.kotlinkrew.trashtotreasure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar

class sampah_b3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sampah_b3)

        val toolbarB3 = findViewById<Toolbar>(R.id.toolbar_b3)
        setSupportActionBar(toolbarB3)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item. itemId) {
            android.R.id.home -> finish()
        }

        return super.onOptionsItemSelected(item)
    }
}