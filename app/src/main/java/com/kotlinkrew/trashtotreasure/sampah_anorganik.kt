package com.kotlinkrew.trashtotreasure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar

class sampah_anorganik : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sampah_anorganik)

        val toolbarAnorganik = findViewById<Toolbar>(R.id.toolbar_anorganik)
        setSupportActionBar(toolbarAnorganik)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item. itemId) {
            android.R.id.home -> finish()
        }

        return super.onOptionsItemSelected(item)
    }
}