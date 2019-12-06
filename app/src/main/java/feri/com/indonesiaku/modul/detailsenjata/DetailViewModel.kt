package feri.com.indonesiaku.modul.detailsenjata

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import feri.com.indonesiaku.model.Senjata

class DetailViewModel : ViewModel() {

    var senjata:ObservableField<Senjata>?=ObservableField()

    fun setSenjata(senjata: Senjata){
        this.senjata?.set(senjata)
    }
}