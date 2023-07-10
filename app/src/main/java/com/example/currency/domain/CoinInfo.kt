package com.example.currency.domain




data class CoinInfo(


    val fromsymbol: String,
    val tosymbol: String?,
    val price: String?,

    val lastupdate: Long?,
    val highday: String?,
    val lowday: String?,

    val lastmarket: String?,
    val imageurl: String?

)