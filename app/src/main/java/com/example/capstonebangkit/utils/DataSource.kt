package com.example.capstonebangkit.utils

import androidx.lifecycle.LiveData
import com.example.capstonebangkit.model.Franchise
import com.example.capstonebangkit.model.Reseller

interface DataSource {

    fun getReseller() : LiveData<List<Reseller>>
    fun getFranchise() : LiveData<List<Franchise>>
}