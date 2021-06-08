package com.example.capstonebangkit.di

import android.content.Context
import com.example.capstonebangkit.utils.RemoteDataSource
import com.example.capstonebangkit.repository.Repository

object Injection {

    fun provideRepository(context: Context): Repository {

        val remoteDataSource = RemoteDataSource.getInstance()

        return Repository.getInstance(remoteDataSource)
    }
}