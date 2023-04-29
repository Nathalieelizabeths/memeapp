package com.example.memes

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GetstartedActivity : AppCompatActivity() {
    lateinit var tvNext: TextView
    lateinit var tvPrevious: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getstarted2)
        tvNext =findViewById(R.id.tvNext)
        tvPrevious =findViewById(R.id.tvPrevious)
        tvNext.setOnClickListener {
            var intent =Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }
        tvPrevious.setOnClickListener {
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}