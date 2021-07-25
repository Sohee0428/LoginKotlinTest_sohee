package com.example.loginkotlintest_sohee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_test.*

class Test : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        loginBtn.setOnClickListener {

            val id = idEdt.text.toString()
            val pw = pwEdt.text.toString()

            if (id == "sohee@google.com" && pw == "1234" ){

                val name = "소희"

                Toast.makeText(this, "$name 관리자입니다.", Toast.LENGTH_SHORT).show()
        }
            else{
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
