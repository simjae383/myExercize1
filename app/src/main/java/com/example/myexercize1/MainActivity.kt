package com.example.myexercize1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createBtn.setOnClickListener{
            Log.d("MainActivity_회원가입","회원가입")
        }

        loginBtn.setOnClickListener {
            Toast.makeText(this,"로그인을 환영합니다.",Toast.LENGTH_SHORT).show()
        }
    }
}