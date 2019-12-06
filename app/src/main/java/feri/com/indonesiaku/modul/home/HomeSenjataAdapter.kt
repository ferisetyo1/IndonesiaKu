package feri.com.indonesiaku.modul.home

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import feri.com.indonesiaku.R
import feri.com.indonesiaku.databinding.ItemSenjataBinding
import feri.com.indonesiaku.model.Senjata
import feri.com.indonesiaku.modul.detailsenjata.DetailActivity

class HomeSenjataAdapter (private val context:Context?,private var listsenjata: MutableList<Senjata>) : RecyclerView.Adapter<HomeSenjataAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding:ItemSenjataBinding= DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_senjata,
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return this.listsenjata.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val senjata=listsenjata.get(position)
        holder.bind(senjata,object : HomeItemAction{

            override fun onClickDetail() {
                val data_intent= Intent(context,DetailActivity::class.java)
                data_intent.putExtra("detail_senjata",senjata)
                context!!.startActivity(data_intent)
            }

        })
    }

    fun replaceData(listsenjata: MutableList<Senjata>) {
        this.listsenjata=listsenjata
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: ItemSenjataBinding) : RecyclerView.ViewHolder(itemView.root) {
        val binding=itemView
        fun bind(senjata: Senjata,action: HomeItemAction) {
            binding.sm=senjata
            binding.action=action
            binding.executePendingBindings()
        }
    }
}