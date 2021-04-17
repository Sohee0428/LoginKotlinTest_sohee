package com.example.loginkotlintest_sohee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        loginBtn.setOnClickListener {

//            아이디 입력 값, 비번 입력 값을 각각의 변수에 저장

            val inputId = idEdt.text.toString()
            val inputPassword = passwordEdt.text.toString()

//            두개의 변수에 들어있는 값 검사 (맞는 아이디 / 비번)

//            맞을 때 -> 틀릴 때 분기처리(IF문 활용)


//            id도 맞고, 비번도 맞을 때 => 관리자
            if(inputId == "admin@test.com" && inputPassword == "qwer"){

//                둘 다 맞으면 => 관리자 입니다. 토스트

                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
        }
            else {
//                아이디나 비번 둘 중에 하나라도 틀리면 => 로그인 실패 토스트

                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()

            }



        }
    }
}