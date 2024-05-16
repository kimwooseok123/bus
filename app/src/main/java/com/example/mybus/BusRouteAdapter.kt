import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.mybus.R

class BusRouteAdapter(context: Context, resource: Int, objects: List<String>) :
    ArrayAdapter<String>(context, resource, objects) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        val holder: ViewHolder

        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.custom_list_item, parent, false)
            holder = ViewHolder()
            holder.imageView = itemView.findViewById(R.id.imageView11)
            holder.titleTextView = itemView.findViewById(R.id.node1)
            holder.contentTextView = itemView.findViewById(R.id.node2)
            itemView.tag = holder
        } else {
            holder = itemView.tag as ViewHolder
        }

        // 버스 노선 정보 설정 (이미지, 제목, 내용)
        // 여기서는 간단하게 이미지만 설정하고 제목과 내용은 동일한 텍스트로 설정합니다.
        holder.imageView.setImageResource(R.drawable.road2)
        holder.titleTextView.text = getItem(position)
        holder.contentTextView.text = getItem(position)

        return itemView!!
    }

    private class ViewHolder {
        lateinit var imageView: ImageView
        lateinit var titleTextView: TextView
        lateinit var contentTextView: TextView
    }
}