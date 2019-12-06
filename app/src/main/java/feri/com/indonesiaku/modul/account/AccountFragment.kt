package feri.com.indonesiaku.modul.account


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders

import feri.com.indonesiaku.databinding.FragmentAccountBinding

/**
 * A simple [Fragment] subclass.
 */
class AccountFragment : Fragment() {

    private lateinit var accountBinding: FragmentAccountBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        accountBinding = FragmentAccountBinding.inflate(inflater, container, false)
            .apply {
                vm = ViewModelProviders
                    .of(this@AccountFragment)
                    .get(AccountViewModel::class.java)!!
            }
        return accountBinding.root
    }

}
