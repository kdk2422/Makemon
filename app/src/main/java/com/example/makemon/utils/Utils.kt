package com.example.makemon.utils

import android.util.Log
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone

fun getFormattedDateFromString(date: String): String {
    val country = Locale.getDefault().language

    val formattedDate = SimpleDateFormat("yyyy-MM-dd-hh-mm-ss", Locale.getDefault()).parse(date)
    val year: String =
        SimpleDateFormat("yyyy", Locale.getDefault()).format(formattedDate).toString()
    val month: String
    val day: String = SimpleDateFormat("dd", Locale.getDefault()).format(formattedDate).toString()
    val hour: String = SimpleDateFormat("hh", Locale.getDefault()).format(formattedDate).toString()
    val min: String = SimpleDateFormat("mm", Locale.getDefault()).format(formattedDate).toString()
    val sec: String = SimpleDateFormat("ss", Locale.getDefault()).format(formattedDate).toString()
    when (country) {
        "ko" -> {
            month =
                SimpleDateFormat("M", Locale.getDefault()).format(formattedDate).toString()
            return "${year}년 ${month}월 ${day}일 ${hour}시 ${min}분 ${sec}초"
        }
        "ja" -> {
            month =
                SimpleDateFormat("M", Locale.getDefault()).format(formattedDate).toString()
            return "${year}年 ${month}月 ${day}日 ${hour}時 ${min}分 ${sec}秒"
        }
        else -> {
            month =
                SimpleDateFormat("MMM", Locale.getDefault()).format(formattedDate).toString()
            return "$month-$day-$year $hour:$min:$sec"
        }
    }
}

fun getDateTimeZoneFromUnixTimeGMT(unixTime: Int): String {
    val date = Date(unixTime * 1000L)
    val dataFormat = SimpleDateFormat("yyyy-MM-dd-hh-mm-ss")
    dataFormat.timeZone = TimeZone.getDefault()
    Log.d("getDateTimeZoneFromUnixTimeGMT", "Time: ${dataFormat.format(date)}")
    return dataFormat.format(date)
}