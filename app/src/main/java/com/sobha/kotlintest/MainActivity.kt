package com.sobha.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Button;
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        txtHelloWorld.setText("Hello Wolrd by RK");

        val btn_click_me = findViewById(R.id.btnSayHello) as Button
        btn_click_me.setOnClickListener()
        {
            txtHelloWorld.setText("Hello Wolrd");
            btn_click_me.setText("Hello World")
           // Toast.makeText(this@MainActivity, "Hello Wolrd  by RK", Toast.LENGTH_SHORT).show()

        }
    }
}