package com.example.prak5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.prak5.model.jenisKelamin
import com.example.prak5.model.jenisKelamin.JenisKelamin
import com.example.prak5.ui.view.FormulirView
import com.example.prak5.ui.view.TampilData
import com.example.prak5.ui.view.TampilDataView
import com.example.prak5.viewmodel.SiswaViewModel

enum class Halaman{
    FORMULIR,
    TAMPILDATA
}
