package com.example.demoarr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myamber.amberIsCheck
import com.example.myamber.loadImagesWithGlide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        4.4.amberIsCheck()
        //loadImagesWithGlide()
    }
}