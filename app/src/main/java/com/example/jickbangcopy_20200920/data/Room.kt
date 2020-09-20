package com.example.jickbangcopy_20200920.data

import java.io.Serializable
import java.text.NumberFormat
import java.util.*
import kotlin.math.abs

class Room(
    val price: Int,
    val area: String,
    val floor: Int,
    val description: String
) : Serializable {

    fun getPriceText(): String {
        if (this.price < 10000) {
            return NumberFormat.getInstance(Locale.KOREA).format(price)
        }

        val mk = this.price / 10000
        val thousand = this.price % 10000
        val thousandStr = NumberFormat.getInstance(Locale.KOREA).format(thousand)

        return "${mk}억 $thousandStr"
    }

    fun getFloorText(): String {
        val floorNo = abs(floor)

        val floor = "${floorNo}층"

        if (this.floor > 0) {
            return floor
        }

        if (this.floor < 0) {
            return "지하 $floor"
        }

        return "반지하"
    }
}