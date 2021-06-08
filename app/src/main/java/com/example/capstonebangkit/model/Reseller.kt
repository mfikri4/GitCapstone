package com.example.capstonebangkit.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Reseller (
        val logo : String?,
        val name : String?,
        val contact : String?,
        val capital : String?,
        val rate : String?,
        val address : String?
        ) : Parcelable

