package com.example.capstonebangkit.repository

import androidx.lifecycle.LiveData
import com.example.capstonebangkit.model.Franchise
import com.example.capstonebangkit.utils.DataSource
import com.example.capstonebangkit.utils.RemoteDataSource
import com.example.capstonebangkit.model.Reseller

class Repository(private val remoteDataSource: RemoteDataSource) : DataSource {
    companion object {

        @Volatile
        private var instance: Repository? = null
        fun getInstance(
            remoteDataSource: RemoteDataSource
        ): Repository =
            instance ?: synchronized(this) {
                instance ?: Repository(remoteDataSource).apply { instance = this }
            }
    }

    override fun getReseller(): LiveData<List<Reseller>> {
        return remoteDataSource.getReseller()
    }

    override fun getFranchise(): LiveData<List<Franchise>> {
        return remoteDataSource.getFranchise()
    }


}