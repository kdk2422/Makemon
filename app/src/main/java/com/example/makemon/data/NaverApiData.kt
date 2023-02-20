package com.example.makemon.data

data class Data (val items : List<Item>)

data class Item(
    val title : String,
    val link : String,
    val image : String,
    val subtitle : String,
    val pubDate : String,
    val director : String,
    val actor : String,
    val usrRating : String
)