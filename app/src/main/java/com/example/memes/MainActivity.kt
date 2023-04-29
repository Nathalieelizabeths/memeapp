package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvGetin: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvGetin = findViewById(R.id.tvGetin)
        tvGetin.setOnClickListener {
            val intent =Intent(this,GetstartedActivity::class.java)
            startActivity(intent)
        }
    }
}