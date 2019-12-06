package feri.com.indonesiaku.modul.home

import android.view.MenuInflater
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableField
import androidx.databinding.ObservableList
import androidx.lifecycle.ViewModel
import feri.com.indonesiaku.data.DataSenjata
import feri.com.indonesiaku.model.Senjata

class HomeViewModel : ViewModel() {

    var rv_senjata:ObservableList<Senjata> = ObservableArrayList()
    init {
        rv_senjata.addAll(DataSenjata.generateSenjata())
    }
}