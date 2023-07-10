package com.example.currency.data.database

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@androidx.room.Dao
interface CoinInfoDao {
    @Query("SELECT * FROM full_price_list ORDER BY lastUpdate DESC" +
            "")
    fun getPriceList():LiveData<List<CoinInfoDbModel>>

    @Query("SELECT * FROM full_price_list WHERE fromSymbol == :fStm LIMIT 1 ")
    fun getPriceInfoAboutCoin(fStm: String): LiveData<CoinInfoDbModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPriceList(priceList: List<CoinInfoDbModel>)
}