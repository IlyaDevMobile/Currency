package com.example.currency.domain

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.currency.R
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.reactivex.rxjava3.annotations.NonNull


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