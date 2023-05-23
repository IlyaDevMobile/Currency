package com.example.currency

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import com.example.currency.api.ApiFactory
import com.example.currency.database.AppDatabase
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers

class CoinViewModel(application : Application) : AndroidViewModel(application) {
    private val db = AppDatabase.getInstance(application)

    val priceList = db.coinPriceInfoDao().getPriceList()
    private val compositeDisposable = CompositeDisposable()

    fun loadData() {
        val disposable = ApiFactory.apiService.getTopCoinsInfo()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("TEST_OF_LOADING_DATA", it.toString())

            }, {
                Log.d("TEST_OF_LOADING_DATA", it.message.toString())


            })
        compositeDisposable.add(disposable)
    }
}