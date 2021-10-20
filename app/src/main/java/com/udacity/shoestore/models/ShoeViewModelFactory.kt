package com.udacity.shoestore.models

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.udacity.shoestore.ShoeViewModel

class ShoeViewModelFactory(private val shoes: String) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ShoeViewModel::class.java)){
            return ShoeViewModel(shoes) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}