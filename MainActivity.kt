package com.example.helloworldday4

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var textColorButton:Button
    lateinit var buttonBackgroundColorButton:Button
    lateinit var allButton:Button

    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textColorButton = findViewById(R.id.TextColorButton)
        buttonBackgroundColorButton = findViewById(R.id.ButtonBackgroundColorButton)
        allButton = findViewById(R.id.ALLButton)
        text = findViewById(R.id.textView)

        textColorButton.setOnClickListener { changeTextColor(Color.BLUE) }
        buttonBackgroundColorButton.setOnClickListener{ changeButtonColor(Color.GRAY) }
        allButton.setOnClickListener{ changeAll() }
    }

    fun changeTextColor(color:Int){
        textColorButton.setTextColor(color)
        buttonBackgroundColorButton.setTextColor(color)
        allButton.setTextColor(color)
        text.setTextColor(color)
    }

    fun changeButtonColor(color:Int){
        textColorButton.setBackgroundColor(color)
        buttonBackgroundColorButton.setBackgroundColor(color)
        allButton.setBackgroundColor(color)
    }
    fun changeAll(){
        changeTextColor(Color.YELLOW)
        changeButtonColor(Color.BLACK)
    }
}