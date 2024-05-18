import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.mybus.R

class roadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_road)

        // 테스트용 노선 데이터
        val busRoutes = listOf(
            "노선 101 - 출발지: A, 도착지: B",
            "노선 102 - 출발지: B, 도착지: C",
            "노선 103 - 출발지: C, 도착지: D",
            "노선 104 - 출발지: D, 도착지: A",
            "노선 105 - 출발지: E, 도착지: F",
            "노선 106 - 출발지: F, 도착지: G",
            "노선 107 - 출발지: G, 도착지: H",
            "노선 101 - 출발지: A, 도착지: B",
            "노선 102 - 출발지: B, 도착지: C",
            "노선 103 - 출발지: C, 도착지: D",
            "노선 104 - 출발지: D, 도착지: A",
            "노선 105 - 출발지: E, 도착지: F",
            "노선 106 - 출발지: F, 도착지: G",
            "노선 107 - 출발지: G, 도착지: H",
        )

        // 리스트뷰 참조
        val listView: ListView = findViewById(R.id.listView1)

        // 어댑터 생성 및 설정
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, busRoutes)
        listView.adapter = adapter
    }
}