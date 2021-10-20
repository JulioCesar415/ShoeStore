package com.udacity.shoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class ShoeViewModel : ViewModel(){

    private val _shoeName = MutableLiveData<String>()
    val shoeName : LiveData<String>
    get() = _shoeName

    private val _shoeCompany = MutableLiveData<String>()
    val shoeCompany : LiveData<String>
    get() = _shoeCompany

    private val _shoeSize = MutableLiveData<Double>()
    val shoeSize : LiveData<Double>
    get() = _shoeSize

    private val _shoeDescription = MutableLiveData<String>()
    val shoeDescription : LiveData<String>
    get() = _shoeDescription
}