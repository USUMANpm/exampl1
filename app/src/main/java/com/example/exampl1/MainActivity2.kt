package com.example.exampl1

import android.R.attr.angle
import android.R.attr.radius
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val btc: Button =findViewById(R.id.butcenter)
        val btvn: Button =findViewById(R.id.butniz)
        val btvl: Button =findViewById(R.id.butvlevo)
        val btve: Button =findViewById(R.id.butverx)
        val btpr: Button =findViewById(R.id.butvpravo)
        val img:ImageView=findViewById(R.id.imageView)
        btc.setOnClickListener(){
            if(img.visibility==View.VISIBLE) {
                img.visibility = View.INVISIBLE
            }
            else{
                img.visibility = View.VISIBLE
            }
        }
        btpr.setOnClickListener(){
            img.x=img.x+25
        }
        btvl.setOnClickListener(){
            img.x=img.x-25
        }
        btve.setOnClickListener(){
            img.y=img.y-25
        }
        var angleRad:Double  = Math.toRadians(5.toDouble())
        btvn.setOnClickListener() {




            img.x= (500.0 + 200.0 * Math.sin(angleRad.toDouble())).toFloat()

           img.y= (500.0 + 200.0 * Math.cos(angleRad.toDouble())).toFloat()
            angleRad=angleRad+ Math.toRadians(5.toDouble())
        }
    }
}