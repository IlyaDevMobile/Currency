package com.example.currency.data.repository

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.example.currency.data.database.AppDatabase
import com.example.currency.data.mapper.CoinMapper
import com.example.currency.data.network.ApiFactory
import com.example.currency.domain.CoinInfo
import com.example.currency.domain.CoinRepository
import kotlinx.coroutines.delay

class CoinRepositoryImpl(
    private val application: Application
) : CoinRepository {


    private val mapper = CoinMapper()
    private val apiService = ApiFactory.apiService

    private val coinInfoDao = AppDatabase.getInstance(application).coinPriceInfoDao()

    override fun getCoinInfoList(): LiveData<List<CoinInfo>> {
        return coinInfoDao.getPriceList().map { list ->
            list.map { mapper.mapDbModelToEntity(it) }
        }
    }

    override fun getCoinInfo(fromSymbol: String): LiveData<CoinInfo> {
        return coinInfoDao.getPriceInfoAboutCoin(fromSymbol).map {
            mapper.mapDbModelToEntity(it)
        }
    }

    override suspend fun loadData() {
        while (true) {
            val topCoins = apiService.getTopCoinsInfo(limit = 50)
            val fSyms = mapper.mapNameListToString(topCoins)
            val jsonContainer = apiService.getFullPriceList(fSyms = fSyms)
            val coinInfoDtoList = mapper.mapJsonContainerToListCoinInfo(jsonContainer)
            val dbModelList = coinInfoDtoList.map { mapper.mapDtoToDbModel(it) }
            coinInfoDao.insertPriceList(dbModelList)
            delay(10_000)
        }
    }
}