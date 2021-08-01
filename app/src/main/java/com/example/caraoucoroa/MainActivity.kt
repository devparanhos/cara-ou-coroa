package com.example.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_play.setOnClickListener {
            val intent = Intent(applicationContext, CoinActivity::class.java)
            val number = Random().nextInt(2)

            intent.putExtra("number", number)

            startActivity(intent)
        }
    }
}