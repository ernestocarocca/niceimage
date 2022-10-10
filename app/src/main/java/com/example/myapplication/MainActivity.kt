package com.example.myapplication

import android.graphics.drawable.AnimatedImageDrawable
import android.graphics.drawable.AnimatedStateListDrawable
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.voice.VisibleActivityInfo
import android.view.View
import android.view.animation.Animation
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout

lateinit var visa: View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        visa = findViewById(R.id.main_layout)

            //text prov


    }
}