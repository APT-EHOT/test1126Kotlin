package com.example.test1126kotlin


data class MeteoData(
    val dt_txt: String,
    val main: MainInfo
) {

    data class MainInfo(
        val temp: Double,
        val pressure: Double,
        val humidity: Double
    )
}
