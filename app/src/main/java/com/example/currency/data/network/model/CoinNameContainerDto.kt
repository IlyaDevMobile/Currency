package com.example.currency.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinNameContainerDto (
    @SerializedName("CoinNameDto")
    @Expose
     var coinName: CoinNameDto? = null
)