package com.example.mybus

import BusRouteAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class gilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gil)
        val listView: ListView = findViewById(R.id.listView1) //적용할 리스트뷰 이름

        val busRoutes = listOf(
            "노선 101 - 출발지: A, 도착지: B",   //임의의 데이터들
            "노선 102 - 출발지: B, 도착지: C",
            "노선 103 - 출발지: C, 도착지: D",
            "노선 104 - 출발지: D, 도착지: A"

        )

        // 어댑터 생성 및 설정
        val adapter = BusRouteAdapter(this, R.layout.custom_list_item, busRoutes) //만드는 xml적용
        listView.adapter = adapter
    }
}

