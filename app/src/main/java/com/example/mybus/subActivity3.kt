package com.example.mybus

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.SearchView
import roadActivity

class subActivity3 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub3)
        val button6: Button = findViewById(R.id.button6)
        button6.setOnClickListener {
            // 버튼6 클릭 시 substation 화면으로 이동하는 코드
            val intent = Intent(this, substation::class.java)
            startActivity(intent)
        }
        val button7: Button = findViewById(R.id.button7)
        button7.setOnClickListener {
            // 버튼7 클릭 시 roadactivity 화면으로 이동하는 코드
            val intent = Intent(this, gilActivity::class.java)
            startActivity(intent)
        }
    }
}