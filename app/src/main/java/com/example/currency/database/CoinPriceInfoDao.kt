package com.example.currency.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.example.currency.pojo.CoinPriceInfo


@Dao
interface CoinPriceInfoDao {
    @Query("SELECT * FROM full_price_list ORDER BY lastUpdate")
    fun getPriceList():LiveData<List<CoinPriceInfo>>

    f
}