package com.example.loginkotlintest_sohee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var inputId = idEdt.text

        var inputPassword = passwordEdt.text


        okTxt.setOnClickListener {




            Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
        }
    }
}