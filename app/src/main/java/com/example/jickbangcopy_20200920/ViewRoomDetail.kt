package com.example.jickbangcopy_20200920

import android.os.Bundle
import com.example.jickbangcopy_20200920.data.Room
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class ViewRoomDetail : BaseActivity() {

    lateinit var room: Room;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        setup()
    }


    override fun setupEvents() {
    }

    override fun setValues() {
        this.room = intent.getSerializableExtra("detail") as Room

        detailPrice.text = this.room.getPriceText()
        detailDescription.text = this.room.description

        detailArea.text = this.room.area
        detailFloor.text = this.room.getFloorText()
    }
}