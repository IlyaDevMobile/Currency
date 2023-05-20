package com.example.currency.pojo

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




data class CoinPriceInfo (
    @SerializedName("TYPE")
    @Expose
    private val type: String? = null,

    @SerializedName("MARKET")
    @Expose
    private val market: String? = null,

    @SerializedName("FROMSYMBOL")
    @Expose
    private val fromsymbol: String? = null,

    @SerializedName("TOSYMBOL")
    @Expose
    private val tosymbol: String? = null,

    @SerializedName("FLAGS")
    @Expose
    private val flags: String? = null,

    @SerializedName("PRICE")
    @Expose
    private val price: Double? = null,

    @SerializedName("LASTUPDATE")
    @Expose
    private val lastupdate: Int? = null,

    @SerializedName("MEDIAN")
    @Expose
    private val median: Double? = null,

    @SerializedName("LASTVOLUME")
    @Expose
    private val lastvolume: Double? = null,

    @SerializedName("LASTVOLUMETO")
    @Expose
    private val lastvolumeto: Double? = null,

    @SerializedName("LASTTRADEID")
    @Expose
    private val lasttradeid: String? = null,

    @SerializedName("VOLUMEDAY")
    @Expose
    private val volumeday: Double? = null,

    @SerializedName("VOLUMEDAYTO")
    @Expose
    private val volumedayto: Double? = null,

    @SerializedName("VOLUME24HOUR")
    @Expose
    private val volume24hour: Double? = null,

    @SerializedName("VOLUME24HOURTO")
    @Expose
    private val volume24hourto: Double? = null,

    @SerializedName("OPENDAY")
    @Expose
    private val openday: Int? = null,

    @SerializedName("HIGHDAY")
    @Expose
    private val highday: Double? = null,

    @SerializedName("LOWDAY")
    @Expose
    private val lowday: Double? = null,

    @SerializedName("OPEN24HOUR")
    @Expose
    private val open24hour: Double? = null,

    @SerializedName("HIGH24HOUR")
    @Expose
    private val high24hour: Double? = null,

    @SerializedName("LOW24HOUR")
    @Expose
    private val low24hour: Double? = null,

    @SerializedName("LASTMARKET")
    @Expose
    private val lastmarket: String? = null,

    @SerializedName("VOLUMEHOUR")
    @Expose
    private val volumehour: Double? = null,

    @SerializedName("VOLUMEHOURTO")
    @Expose
    private val volumehourto: Double? = null,

    @SerializedName("OPENHOUR")
    @Expose
    private val openhour: Double? = null,

    @SerializedName("HIGHHOUR")
    @Expose
    private val highhour: Double? = null,

    @SerializedName("LOWHOUR")
    @Expose
    private val lowhour: Double? = null,

    @SerializedName("TOPTIERVOLUME24HOUR")
    @Expose
    private val toptiervolume24hour: Double? = null,

    @SerializedName("TOPTIERVOLUME24HOURTO")
    @Expose
    private val toptiervolume24hourto: Double? = null,

    @SerializedName("CHANGE24HOUR")
    @Expose
    private val change24hour: Double? = null,

    @SerializedName("CHANGEPCT24HOUR")
    @Expose
    private val changepct24hour: Double? = null,

    @SerializedName("CHANGEDAY")
    @Expose
    private val changeday: Double? = null,

    @SerializedName("CHANGEPCTDAY")
    @Expose
    private val changepctday: Double? = null,

    @SerializedName("CHANGEHOUR")
    @Expose
    private val changehour: Double? = null,

    @SerializedName("CHANGEPCTHOUR")
    @Expose
    private val changepcthour: Double? = null,

    @SerializedName("CONVERSIONTYPE")
    @Expose
    private val conversiontype: String? = null,

    @SerializedName("CONVERSIONSYMBOL")
    @Expose
    private val conversionsymbol: String? = null,

    @SerializedName("CONVERSIONLASTUPDATE")
    @Expose
    private val conversionlastupdate: Int? = null,

    @SerializedName("SUPPLY")
    @Expose
    private val supply: Int? = null,

    @SerializedName("MKTCAP")
    @Expose
    private val mktcap: Double? = null,

    @SerializedName("MKTCAPPENALTY")
    @Expose
    private val mktcappenalty: Int? = null,

    @SerializedName("CIRCULATINGSUPPLY")
    @Expose
    private val circulatingsupply: Int? = null,

    @SerializedName("CIRCULATINGSUPPLYMKTCAP")
    @Expose
    private val circulatingsupplymktcap: Double? = null,

    @SerializedName("TOTALVOLUME24H")
    @Expose
    private val totalvolume24h: Double? = null,

    @SerializedName("TOTALVOLUME24HTO")
    @Expose
    private val totalvolume24hto: Double? = null,

    @SerializedName("TOTALTOPTIERVOLUME24H")
    @Expose
    private val totaltoptiervolume24h: Double? = null,

    @SerializedName("TOTALTOPTIERVOLUME24HTO")
    @Expose
    private val totaltoptiervolume24hto: Double? = null,

    @SerializedName("IMAGEURL")
    @Expose
    private val imageurl: String? = null
)