package com.example.homework3

import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.os.Bundle
import android.view.View
import android.widget.Toast

import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val  rollButton :Button=findViewById(R.id.button)
   val numberText : (TextView)=findViewById(R.id.numberone);

        val text = "Dice Rolled"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)

        rollButton.setOnClickListener{
            (toast)
            toast.show()
        }







    }
}