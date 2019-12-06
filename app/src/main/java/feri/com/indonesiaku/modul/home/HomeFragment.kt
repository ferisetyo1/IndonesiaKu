package feri.com.indonesiaku.modul.home


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import feri.com.indonesiaku.data.DataSenjata

import feri.com.indonesiaku.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment(), SearchView.OnQueryTextListener {

    private lateinit var homeBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeBinding = FragmentHomeBinding.inflate(inflater, container, false)
            .apply {
                vm = ViewModelProviders
                    .of(this@HomeFragment)
                    .get(HomeViewModel::class.java)!!
            }
        homeBinding.rvSenjata.apply {
            layoutManager=GridLayoutManager(context,2)
            adapter = HomeSenjataAdapter(context, homeBinding.vm!!.rv_senjata)
        }
        homeBinding.svHome.setOnQueryTextListener(this)
        return homeBinding.root
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        return false
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        homeBinding.rvSenjata.apply {
            (adapter as HomeSenjataAdapter).replaceData(DataSenjata.getSearchData(newText!!))
        }
        return true
    }
}
