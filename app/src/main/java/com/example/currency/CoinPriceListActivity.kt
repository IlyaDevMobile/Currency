package com.example.currency

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.currency.adapters.CoinInfoAdapter
import com.example.currency.databinding.ActivityCoinPriceListBinding
import com.example.currency.pojo.CoinPriceInfo


class CoinPriceListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCoinPriceListBinding

    private lateinit var viewModel: CoinViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoinPriceListBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val adapter = CoinInfoAdapter(this)
        adapter.onCoinClickListener = object : CoinInfoAdapter.OnCoinClickListener{
            override fun onCoinClick(coinPriceInfo: CoinPriceInfo) {
                Log.d("ON_CLICK_TEST", coinPriceInfo.fromsymbol)
            }
        }
        binding.rvCoinPriceList.adapter = adapter
        viewModel = ViewModelProvider(this)[CoinViewModel::class.java]
        viewModel.priceList.observe(this, Observer {
            adapter.coinInfoList = it
        })

    }

}




