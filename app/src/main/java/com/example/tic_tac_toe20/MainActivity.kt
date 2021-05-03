package com.example.tic_tac_toe20

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val play: Button = findViewById(R.id.play)
        play.setOnClickListener {
            val intent = Intent(this, game::class.java)
            startActivity(intent)

        }
    }
}