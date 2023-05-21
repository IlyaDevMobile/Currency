package com.example.currency.api

import com.example.currency.pojo.CoinInfoListOfData
import com.example.currency.pojo.CoinPriceInfoRawData
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Single

interface ApiService {

    @GET("top/totalvolfull")
    fun getTopCoinsInfo(
        @Query(Query_PARAM_API_KEY) apiKey: String = "",
        @Query(Query_PARAM_lIMIT) limit: Int = 10,
        @Query(Query_PARAM_lIMIT_TO_SYMBOL) tSym: String = CURRENCY,
    ): Single<CoinInfoListOfData>

    @GET("pricemultifull")
    fun getFullPriceList(
        @Query(Query_PARAM_API_KEY) apiKey: String = "",
        @Query(Query_PARAM_FROM_SYMBOLS) fsyms: String,
        @Query(Query_PARAM_lIMIT_TO_SYMBOLS) tsyms: String = CURRENCY
    ): Single<CoinPriceInfoRawData>

    companion object {
        private const val Query_PARAM_lIMIT = "Limit"
        private const val Query_PARAM_API_KEY = "api_key"
        private const val Query_PARAM_lIMIT_TO_SYMBOL = "tsym"

        private const val CURRENCY = "USD"

        private const val Query_PARAM_FROM_SYMBOLS = "fsyms"
        private const val Query_PARAM_lIMIT_TO_SYMBOLS = "tsyms"



    }
}