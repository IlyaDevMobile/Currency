package com.example.currency.data.network

import com.example.currency.data.network.model.CoinInfoJsonContainerDto
import com.example.currency.data.network.model.CoinNamesListDto
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("top/totalvolfull")
    suspend fun getTopCoinsInfo(
        @Query(Query_PARAM_API_KEY) apiKey: String = "",
        @Query(Query_PARAM_lIMIT) limit: Int = 10,
        @Query(Query_PARAM_lIMIT_TO_SYMBOL) tSym: String = CURRENCY,
    ): CoinNamesListDto

    @GET("pricemultifull")
    suspend fun getFullPriceList(
        @Query(Query_PARAM_API_KEY) apiKey: String = "",
        @Query(Query_PARAM_FROM_SYMBOLS) fSyms: String,
        @Query(Query_PARAM_lIMIT_TO_SYMBOLS) tsyms: String = CURRENCY
    ): CoinInfoJsonContainerDto

    companion object {
        private const val Query_PARAM_lIMIT = "Limit"
        private const val Query_PARAM_API_KEY = "api_key"
        private const val Query_PARAM_lIMIT_TO_SYMBOL = "tsym"

        private const val CURRENCY = "USD"

        private const val Query_PARAM_FROM_SYMBOLS = "fsyms"
        private const val Query_PARAM_lIMIT_TO_SYMBOLS = "tsyms"



    }
}