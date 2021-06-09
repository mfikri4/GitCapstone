package com.example.capstonebangkit.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Franchise (
        val logo : String?,
        val contact : String?,
        val name : String?,
        val modal : String?,
        val rangeModal : String?,
        val regulation : String?
) : Parcelable

