package com.example.prak5.model

import android.provider.ContactsContract.CommonDataKinds.Email

data class DataSiswa(
    //val nilainya tetap satu
    val nama: String = "",
    val nim: String = "",
    val alamat: String = "",
    val gender: String = "",
    val email: String = "",
    val notelephone: String = ""
)


