package com.muhadif.fragmentactivitydata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_click = findViewById<Button>(R.id.btn_click)

        btn_click.setOnClickListener {
            HomeFragment.update("Iam Here")
        }
    }

    fun attachFragment() {

    }
}
