package com.example.feedback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button2:Button = findViewById(R.id.button2)

        button2.setOnClickListener{
            Toast.makeText(this, "SUCCESSFUL !", Toast.LENGTH_LONG).show()
        }
    }
}