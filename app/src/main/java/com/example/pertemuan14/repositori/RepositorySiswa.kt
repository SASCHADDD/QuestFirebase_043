package com.example.pertemuan14.repositori

import com.example.pertemuan14.modeldata.Siswa

interface RepositorySiswa{
    suspend fun getDataSiswa(): List<Siswa>
    suspend fun postDataSiswa(siswa : Siswa)
}
