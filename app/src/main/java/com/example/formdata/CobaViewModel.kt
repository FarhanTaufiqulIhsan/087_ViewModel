package com.example.formdata

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel(){
    var namaUsr: String by mutableStateOf("")
        private set
    var noTelp: String by mutableStateOf("")
        private set
    var jenisKL: String by mutableStateOf("")
        private set
    var email: String by mutableStateOf("")
        private set
    var status: String by mutableStateOf("")
        private set
    var alamat: String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState: StateFlow<DataForm> = _uiState.asStateFlow()

    fun insertData(nm: String, tlp: String,em: String,st: String, jk: String, al: String){
        namaUsr = nm;
        noTelp = tlp;
        email = em;
        status = st;
        jenisKL = jk;
        alamat = al;
    }

    fun setjenisK(pilihJK: String){
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }
    }
    fun setstatusS(pilihST: String){
        _uiState.update { currentState -> currentState.copy(mar = pilihST) }
    }

}