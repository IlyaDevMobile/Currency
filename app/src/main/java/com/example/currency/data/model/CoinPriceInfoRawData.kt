package com.example.currency.data.model

import com.google.gson.JsonObject
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinPriceInfoRawData (
        @SerializedName("RAW")
        @Expose
        val coinPriceInfoJsonObject: JsonObject? = null
        )