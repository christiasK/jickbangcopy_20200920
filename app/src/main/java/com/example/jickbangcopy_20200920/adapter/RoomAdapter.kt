package com.example.jickbangcopy_20200920.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.jickbangcopy_20200920.R
import com.example.jickbangcopy_20200920.data.Room

class RoomAdapter(
    mContext: Context,
    resId: Int,
    rooms: List<Room>
) : ArrayAdapter<Room>(mContext, resId, rooms) {

    val inf = LayoutInflater.from(mContext)

    @SuppressLint("InflateParams")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        if (convertView == null) {
            tempRow = inf.inflate(R.layout.activity_room_item, null)
        }

        val row = tempRow!!

        val room = this.getItem(position)!!

        row.findViewById<TextView>(R.id.price).text = room.getPriceText()
        row.findViewById<TextView>(R.id.area).text = "${room.area}, ${room.getFloorText()}"
        row.findViewById<TextView>(R.id.description).text = room.description

        return row
    }

}