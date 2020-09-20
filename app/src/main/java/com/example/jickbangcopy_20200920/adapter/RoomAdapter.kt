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
import kotlin.math.abs

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
        val floor = getFloorText(room)

        row.findViewById<TextView>(R.id.price).text = "${room.price}"
        row.findViewById<TextView>(R.id.area).text = "${room.area}, $floor"
        row.findViewById<TextView>(R.id.description).text = room.description

        return row
    }


    private fun getFloorText(room: Room): String {
        val floorNo = abs(room.floor)

        val floor = "${floorNo}층"

        if (room.floor == 0) {
            return "반지하"
        }

        if (room.floor < 0) {
            return "지하 $floor"
        }

        return floor

    }

}