package com.example.memes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ForthActivity : AppCompatActivity() {
    lateinit var tvNext4: TextView
    lateinit var tvprevious4: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forth)
        tvNext4 =findViewById(R.id.tvNext4)
        tvprevious4 = findViewById(R.id.tvPrevious4)
        tvNext4.setOnClickListener {
            val intent =Intent(this,FifthActivity::class.java)
            startActivity(intent)
        }
        tvprevious4.setOnClickListener {
            val intent =Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}