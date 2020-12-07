package com.example.koogleplay.model

import com.google.gson.annotations.SerializedName

data class Feed(
    val categories: List<Category>
)

data class Category(
    val title: String,
    val subtitle: String,
    val games: MutableList<Game>
)

data class Game(
    @SerializedName("artworkUrl100") val icon: String,
    @SerializedName("name") val title: String,
    @SerializedName("artistName") val subtitle: String
)
