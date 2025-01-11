package com.example.firebasepam.ui.ViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.firebasepam.repository.MahasiswaRepository
import java.text.Normalizer.Form

class InsertViewModel (
    private val mhs: MahasiswaRepository
):ViewModel(){
    var uiEvent: InserUiState by mutableStateOf(InsertUiState())
        private set
    var uiState: FormState by mutableStateOf(FormState.Idle)
        private set


}