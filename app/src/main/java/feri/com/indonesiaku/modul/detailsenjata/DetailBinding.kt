package feri.com.indonesiaku.modul.detailsenjata

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object DetailBinding {
    @BindingAdapter("app:imgurl")
    @JvmStatic
    fun setImgWithGlide(imageView: ImageView, s:String){
        Glide.with(imageView!!.context)
            .load(s!!.trim().toInt())
            .into(imageView)
    }

    @BindingAdapter("app:asal")
    @JvmStatic
    fun setImgWithGlide(textView: TextView, s:String){
        textView.text="(${s})"
    }
}