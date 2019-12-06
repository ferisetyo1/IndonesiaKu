package feri.com.indonesiaku.modul.detailsenjata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import feri.com.indonesiaku.R
import feri.com.indonesiaku.databinding.ActivityDetailBinding
import feri.com.indonesiaku.model.Senjata

class DetailActivity : AppCompatActivity() {

    private lateinit var binding:ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar!!.hide()
        var intentdata=intent
        binding=DataBindingUtil.setContentView<ActivityDetailBinding>(this,R.layout.activity_detail)
            .apply {
                vm= ViewModelProviders.of(this@DetailActivity).get(DetailViewModel::class.java)
                vm!!.setSenjata(intentdata.getSerializableExtra("detail_senjata") as Senjata)
                action=object :DetailAction{
                    override fun onClickBack() {
                        finish()
                    }

                }
            }
    }
}
