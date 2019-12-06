package feri.com.indonesiaku.modul.home

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import feri.com.indonesiaku.model.Senjata

object HomeBinding {

    @BindingAdapter("app:imgurl")
    @JvmStatic
    fun setImgWithGlide(imageView: ImageView,s:String){
        Glide.with(imageView!!.context)
            .load(s!!.toInt())
            .into(imageView)
    }

    @BindingAdapter("app:listsiswa")
    @JvmStatic
    fun setListSiswa(recyclerView: RecyclerView, listSiswa: MutableList<Senjata>) {
        with(recyclerView.adapter as HomeSenjataAdapter){
            replaceData(listSiswa)
        }
    }
}