package com.example.currency.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey



@Entity(tableName = "full_price_list")
data class CoinInfoDbModel(
    @PrimaryKey
    val fromsymbol: String,
    val tosymbol: String?,
    val price: String?,

    val lastupdate: Long?,
    val highday: String?,
    val lowday: String?,

    val lastmarket: String?,
    val imageurl: String?
)