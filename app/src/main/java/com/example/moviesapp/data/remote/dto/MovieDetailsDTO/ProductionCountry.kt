package com.example.moviesapp.data.remote.dto.MovieDetailsDTO


import com.squareup.moshi.Json

data class ProductionCountry(
    @Json(name = "iso_3166_1")
    val iso31661: String = "",
    @Json(name = "name")
    val name: String = ""
)