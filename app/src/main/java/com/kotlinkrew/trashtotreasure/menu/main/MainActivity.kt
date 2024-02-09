package com.kotlinkrew.trashtotreasure.menu.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kotlinkrew.trashtotreasure.R
import im.delight.android.location.SimpleLocation

class MainActivity : AppCompatActivity() {

    var REQ_PERMISSION = 100
    var strCurrentLatitude = 0.0
    var strCurrentLongitude = 0.0
    lateinit var strCurrentLocation: String
    lateinit var simpleLocation: SimpleLocation


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setPermission()
        setStatusBar()
        setLocation()
        setInitLayout()
        setCurrentLocation()

    }

    private fun setLocation() {
        simpleLocation = SimpleLocation(this)
        if (!simpleLocation.hasLocationEnabled()) {
            SimpleLocation.openSettings(this)
        }

        // mendapatkan Lokasi
        strCurrentLatitude = simpleLocation.latitude
        strCurrentLongitude = simpleLocation.longitude

        //menegatur Lokasi
        strCurrentLocation = "$strCurrentLatitude,$strCurrentLongitude"
    }t
}