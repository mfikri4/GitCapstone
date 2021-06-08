package com.example.capstonebangkit.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Guide(val img : Int?,
                 val title : String?,
                 val description : String?) : Parcelable