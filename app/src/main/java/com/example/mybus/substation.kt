package com.example.mybus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class substation : AppCompatActivity() {

    private val data = arrayOf("808", "814", "818", "555", "518")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_substation)
        // 리스트뷰 참조
        val listView: ListView = findViewById(R.id.list1)

        // 어댑터 생성 및 설정
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
        listView.adapter = adapter
    }
}