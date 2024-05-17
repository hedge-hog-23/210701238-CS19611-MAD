package com.example.textcolorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)

        val changeColorButton: Button = findViewById(R.id.changeColorButton)
        val changeTextStyleButton: Button = findViewById(R.id.changeTextStyleButton)
        val changeBackgroundColorButton: Button = findViewById(R.id.changeBackgroundColorButton)

        changeColorButton.setOnClickListener {
            val randomColor = Color.rgb((0..255).random(), (0..255).random(), (0..255).random())
            textView.setTextColor(randomColor)
        }

        changeTextStyleButton.setOnClickListener {
            // Toggle between bold and normal text styles
            textView.setTypeface(null, if (textView.typeface.isBold) 0 else 1)
        }

        changeBackgroundColorButton.setOnClickListener {
            val randomColor = Color.rgb((0..255).random(), (0..255).random(), (0..255).random())
            textView.setBackgroundColor(randomColor)
        }
    }
}
