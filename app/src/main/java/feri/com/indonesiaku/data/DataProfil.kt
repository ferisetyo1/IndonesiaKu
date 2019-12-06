package feri.com.indonesiaku.data

import feri.com.indonesiaku.model.Profil
import feri.com.indonesiaku.R

object DataProfil {
    fun getDataProfil():Profil{
        return Profil(
            "Feri Setyo Efendi",
            "ferisetyo1@gmail.com",
            R.drawable.foto_profil
        )
    }
}