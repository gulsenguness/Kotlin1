package com.example.sondeneme

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.sondeneme.databinding.FragmentBasBinding
import com.example.sondeneme.databinding.FragmentKayitBilgileriBinding

class KayitBilgileriFragment : Fragment() {
    private lateinit var binding:FragmentKayitBilgileriBinding
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentKayitBilgileriBinding.inflate(layoutInflater)

        sharedPreferences=requireActivity().getSharedPreferences("Bilgilerimiz", Context.MODE_PRIVATE)

        var kayitlikullanicila=sharedPreferences.getString("kullanici","")
        var kayitlisoyad=sharedPreferences.getString("soyadi","")

        with(binding){
            ad.text="Kullanici Adi:"+kayitlikullanicila.toString()
            soyadidir.text="Soyad:"+kayitlisoyad.toString()
        }

        binding.Girisedn.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.giriseyenidengecis)
        }

        return binding.root
    }

}