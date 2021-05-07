package com.kel.pendeteksigejalacovid_19

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tblMasuk = findViewById<CardView>(R.id.btnMasuk)

        tblMasuk.setOnClickListener() {
            val go = Intent(this@MainActivity, DashboardActivity::class.java)
            startActivity(go)
        }
    }
}