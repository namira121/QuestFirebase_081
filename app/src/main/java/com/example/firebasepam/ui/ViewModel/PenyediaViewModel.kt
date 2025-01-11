package com.example.firebasepam.ui.ViewModel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.firebasepam.MahasiswaApplication

object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer { HomeViewModel(MahasiswaApplications().container.mahasiswaRepository)}
        initializer { InsertViewModel(MahasiswaApplications().container.mahasiswaRepository) }
    }
    fun CreationExtras.MahasiswaApplications():MahasiswaApplication =
        (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApplication)
}