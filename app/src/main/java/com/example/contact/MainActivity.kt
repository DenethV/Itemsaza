package com.example.contact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var move = findViewById<Button>(R.id.move)
        move.setOnClickListener{

            val intent1 = Intent(this, con2::class.java)
            startActivity(intent1)
        }
    }
}