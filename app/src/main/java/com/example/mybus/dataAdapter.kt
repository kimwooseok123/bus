package com.example.mybus

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class dataAdapter(context: Context, resource: Int, objects: List<String>) :
    ArrayAdapter<String>(context, resource, objects) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        val holder: ViewHolder

        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.station, parent, false)
            holder = ViewHolder()

            holder.titleTextView = itemView.findViewById(R.id.tv_bus_number)
            holder.firstBusRemainingTimeTextView = itemView.findViewById(R.id.tv_first_bus_remaining_time)
            holder.secondBusRemainingTimeTextView = itemView.findViewById(R.id.tv_second_bus_remaining_time)
            holder.firstBusRemainingStationTextView = itemView.findViewById(R.id.tv_first_bus_remaining_station)
            holder.firstBusFullOrNotTextView = itemView.findViewById(R.id.tv_first_bus_full_or_not)
            holder.secondBusRemainingStationTextView = itemView.findViewById(R.id.tv_second_bus_remaining_station)
            holder.secondBusFullOrNotTextView = itemView.findViewById(R.id.tv_second_bus_full_or_not)

            itemView.tag = holder
        } else {
            holder = itemView.tag as ViewHolder
        }

        // 각 텍스트뷰에 데이터 설정
        holder.titleTextView.text = getItem(position)
        holder.firstBusRemainingTimeTextView.text = "6분 25초"
        holder.secondBusRemainingTimeTextView.text = "12분 30초"
        holder.firstBusRemainingStationTextView.text = "1번째전"
        holder.firstBusFullOrNotTextView.text = "여유"
        holder.secondBusRemainingStationTextView.text = "5번째전"
        holder.secondBusFullOrNotTextView.text = "여유"

        return itemView!!
    }

    private class ViewHolder {
        lateinit var titleTextView: TextView
        lateinit var firstBusRemainingTimeTextView: TextView
        lateinit var secondBusRemainingTimeTextView: TextView
        lateinit var firstBusRemainingStationTextView: TextView
        lateinit var firstBusFullOrNotTextView: TextView
        lateinit var secondBusRemainingStationTextView: TextView
        lateinit var secondBusFullOrNotTextView: TextView
    }
}