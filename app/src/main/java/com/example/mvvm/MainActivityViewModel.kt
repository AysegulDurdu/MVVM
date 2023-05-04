package com.example.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    var sonuc = MutableLiveData<String>()

    init {
        sonuc = MutableLiveData<String>("0")
    }

    fun ToplamaYap(alinanSayi1:String, alinanSayi2:String){
        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()

        val toplam = sayi1 + sayi2
        sonuc.value = toplam.toString()
    }

    fun CarpmaYap(alinanSayi1:String, alinanSayi2:String){

        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()

        val carpma = sayi1 * sayi2
        sonuc.value = carpma.toString()
    }


}