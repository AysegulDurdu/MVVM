package com.example.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainActivityViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

       viewModel.sonuc.observe(this){ sonuc->
           binding.hesapSonuc = sonuc
       }

        binding.mainNesne = this


    }

    fun butonToplamaTikla(alinanSayi1: String, alinanSayi2: String) {
        viewModel.ToplamaYap(alinanSayi1,alinanSayi2)
    }

    fun butonCarpmaTikla(alinanSayi1: String, alinanSayi2: String) {
        viewModel.CarpmaYap(alinanSayi1,alinanSayi2)
    }
}