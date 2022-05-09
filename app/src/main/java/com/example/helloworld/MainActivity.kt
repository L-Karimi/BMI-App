package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnHome:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnHome=findViewById(R.id.btnhome)
        btnHome.setOnClickListener {
            val intent = Intent(this,SendMoneyActivity::class.java)
            startActivity(intent)
        }
    }
}