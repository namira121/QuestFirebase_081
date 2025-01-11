package com.example.firebasepam.ui.View

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.firebasepam.ui.ViewModel.FormState
import com.example.firebasepam.ui.ViewModel.InsertViewModel
import com.example.firebasepam.ui.ViewModel.PenyediaViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun InsertMhsView(
    onBack: () -> Unit,
    onNavigate: () -> Unit,
    modifier: Modifier= Modifier,
    viewModel: InsertViewModel = viewModel(factory = PenyediaViewModel.Factory)
){
    val uiState = viewModel.uiState // state utama untuk loading success dan error
    val eiEvent = viewModel.uiEvent // state untuk form dan validasii
    val snackbarHostState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()

    //Observasi perubagan state untuks snackbar dan navigasi
    LaunchedEffect(uiState) {
        when(uiState){
            is FormState.Success -> {
                println(
                    "InsertMhsView: uiState is FormState. Success, navigate to home "
                            + uiState.message)
                coroutineScope.launch {
                    snackbarHostState.showSnackbar(uiState.message)//tampilkan snackbar
                }
                delay(700)
                onNavigate()

                viewModel.resetSnackBarMessage()
            }
        }
    }
}