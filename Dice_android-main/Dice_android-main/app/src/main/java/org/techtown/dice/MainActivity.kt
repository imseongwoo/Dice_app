package org.techtown.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceImage1 = findViewById<ImageView>(R.id.dice1)
        val diceImage2 = findViewById<ImageView>(R.id.dice2)
        val button1 = findViewById<Button>(R.id.diceStartBtn)

        button1.setOnClickListener {
            diceImage1.setImageResource(R.drawable.dice_3)
        }
    }
}