package com.example.memes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FifthActivity : AppCompatActivity() {
    lateinit var tvPrevious5: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)
        tvPrevious5 =findViewById(R.id.tvPrevious5)
        tvPrevious5.setOnClickListener {
            val intent =Intent(this,ForthActivity::class.java)
            startActivity(intent)
        }
    }
}