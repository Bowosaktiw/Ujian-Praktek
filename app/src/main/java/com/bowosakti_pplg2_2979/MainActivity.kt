package com.bowosakti_pplg2_2979

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val biodata = findViewById<TextView>(R.id.biodata)
        biodata.setOnClickListener {
            val intent = Intent(this, BiodataActivity::class.java)
            startActivity(intent)
        }
        val pendidikan = findViewById<TextView>(R.id.pendidikan)
        pendidikan.setOnClickListener {
            val intent = Intent(this, PendidikanActivity::class.java)
            startActivity(intent)
        }
        val portofolio = findViewById<TextView>(R.id.portofolio)
        portofolio.setOnClickListener {
            val intent = Intent(this, PortofolioActivity::class.java)
            startActivity(intent)
        }

    }

}