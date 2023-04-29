package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    lateinit var tvNext3: TextView
    lateinit var tvBack: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        tvNext3 = findViewById(R.id.tvNext3)
        tvBack=findViewById(R.id.tvBack)
        tvNext3.setOnClickListener {
            val intent =Intent(this,ForthActivity::class.java)
            startActivity(intent)
        }
        tvBack.setOnClickListener {
            val intent =Intent(this,GetstartedActivity::class.java)
            startActivity(intent)
        }

    }
}