package com.example.currency.data.mapper

import com.example.currency.data.database.CoinInfoDbModel
import com.example.currency.data.network.model.CoinInfoDto
import com.example.currency.data.network.model.CoinInfoJsonContainerDto
import com.example.currency.data.network.model.CoinNamesListDto
import com.example.currency.domain.CoinInfo
import com.google.gson.Gson

class CoinMapper {

    fun mapDtoToDbModel(dto: CoinInfoDto) = CoinInfoDbModel(
        fromsymbol = dto.fromsymbol,
        tosymbol = dto.tosymbol,
        price = dto.price,
        lastupdate = dto.lastupdate,
        highday = dto.highday,
        lowday = dto.fromsymbol,
        lastmarket = dto.fromsymbol,
        imageurl = dto.fromsymbol

    )

    fun mapJsonContainerToListCoinInfo(jsonContainer: CoinInfoJsonContainerDto):List<CoinInfoDto>{
        val result = mutableListOf<CoinInfoDto>()
        val jsonObject = jsonContainer.json ?: return result
        val coinKeySet = jsonObject.keySet()
        for (coinKey in coinKeySet) {
            val currencyJson = jsonObject.getAsJsonObject(coinKey)
            val currencyKeySet = currencyJson.keySet()
            for (currencyKey in currencyKeySet) {
                val priceInfo = Gson().fromJson(
                    currencyJson.getAsJsonObject(currencyKey),
                    CoinInfoDto::class.java
                )
                result.add(priceInfo)
            }
        }
        return result
    }

    fun mapNameListToString(namesListDto: CoinNamesListDto): String{
      return namesListDto.names?.map {
          it.coinName?.name
      }?.joinToString(",")?: ""
    }

    fun mapDbModelToEntity(dbModel: CoinInfoDbModel) = CoinInfo(
        fromsymbol = dbModel.fromsymbol,
        tosymbol = dbModel.tosymbol,
        price = dbModel.price,
        lastupdate = dbModel.lastupdate,
        highday = dbModel.highday,
        lowday = dbModel.fromsymbol,
        lastmarket = dbModel.fromsymbol,
        imageurl = dbModel.fromsymbol
    )
}