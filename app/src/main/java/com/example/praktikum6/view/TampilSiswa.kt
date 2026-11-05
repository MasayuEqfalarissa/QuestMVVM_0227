package com.example.praktikum6.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.R
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.praktikum6.model.Siswa

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    //edit 1 : parameter statusUiSiswa
    statusUiSiswa: Siswa,
    onBackButtonClicked:()-> Unit
){
    //edit 2 : items Pair
    val items = listOf(
        Pair(stringResource(R.string.nama), statusUiSiswa.nama),
        Pair(stringResource(id = R.string.gender), statusUiSiswa.gender),
        Pair(stringResource(id = R.string.alamat), statusUiSiswa.alamat)
    )

}