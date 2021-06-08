package com.example.capstonebangkit.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.capstonebangkit.repository.Repository
import com.example.capstonebangkit.model.Reseller

class ResellerViewModel(private val repository: Repository) : ViewModel() {



    fun getReseller() : LiveData<List<Reseller>>{
        return repository.getReseller()

    }
}