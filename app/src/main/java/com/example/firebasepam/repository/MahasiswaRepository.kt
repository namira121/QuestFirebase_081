package com.example.firebasepam.repository

import com.example.firebasepam.model.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface MahasiswaRepository{
    suspend fun getMahasiswa(): Flow<List<Mahasiswa>>
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
    suspend fun updateMahasiswa(nim:String, mahasiswa: Mahasiswa)
    suspend fun deleteMahasiswa(mahasiswa: Mahasiswa)
    suspend fun getMahasiswaByNIM(nim: String): Flow<Mahasiswa>
}