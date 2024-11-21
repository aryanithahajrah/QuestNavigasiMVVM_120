package com.example.prak5.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.prak5.model.DataSiswa


@Composable
fun TampilDataView(
    uiState: DataSiswa,
    onBackButton: () -> Unit
){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        TampilData(parameterNama = "Nama", argum = uiState.nama)
        TampilData(parameterNama = "NIM", argum = uiState.nim)
        TampilData(parameterNama = "Jenis Kelamin", argum = uiState.gender)
        TampilData(parameterNama = "Alamat", argum = uiState.alamat)
        TampilData(parameterNama = "No Telephone", argum = uiState.notelephone)
        Button(onClick = onBackButton) {

            Text(text = "Kembali")
        }
    }
}

@Composable
fun TampilData(
    parameterNama: String,
    argum: String
){
    Column (
        modifier = Modifier.padding(16.dp)
    ){
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = parameterNama,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = argum,
                modifier = Modifier.weight(2f))
        }
    }
}