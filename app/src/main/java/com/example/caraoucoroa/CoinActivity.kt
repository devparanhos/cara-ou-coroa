package com.example.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_coin.*

class CoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin)

        val data: Bundle? = intent.extras
        val number = data?.getInt("number")

        if(number == 0) {
            coin_result.setImageResource(R.drawable.moeda_cara)
            text_result.setText("Quem escolheu cara ganhou")
        }else{
            coin_result.setImageResource(R.drawable.moeda_coroa)
            text_result.setText("Quem escolheu coroa ganhou")

        }

        button_back.setOnClickListener {
            finish()
        }
    }
}