package com.example.sondeneme

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sondeneme.databinding.FragmentBasBinding
import com.example.sondeneme.databinding.FragmentKayityapBinding



class BasFragment : Fragment() {
    private lateinit var binding: FragmentBasBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentBasBinding.inflate(layoutInflater)
        binding.btgiris.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.girisekranagecis)
        }
        binding.kayit2.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.kayitekraninegecis)
        }

        return binding.root

    }


}