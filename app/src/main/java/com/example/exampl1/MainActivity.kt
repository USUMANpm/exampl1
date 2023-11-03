package com.example.exampl1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bt: Button =findViewById(R.id.button)
        val bt2: Button =findViewById(R.id.button2)
        val txt: TextView =findViewById(R.id.txt)
        val edt: EditText =findViewById(R.id.editTextText)
        bt.setOnClickListener(){
            txt.text=edt.text
        }
        bt2.setOnClickListener(){
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}