package com.example.capstonebangkit.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.capstonebangkit.model.Reseller
import com.example.capstonebangkit.repository.Repository

class FranchiseViewModel(private val repository: Repository) : ViewModel() {

    fun getFranchise () : LiveData<List<Reseller>>{
        return repository.getFranchise()
    }
}