package com.example.sondeneme

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.sondeneme.databinding.FragmentUyegirisBinding


class uyegirisFragment : Fragment() {
    private lateinit var binding: FragmentUyegirisBinding
    private lateinit var preferences: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding=FragmentUyegirisBinding.inflate(inflater,container,false)
        preferences=requireActivity().getSharedPreferences("Bilgilerimiz",Context.MODE_PRIVATE)

        binding.iceriyegiris.setOnClickListener {
            var kayitliKullanic=preferences.getString("kullanici","")
            var kayitliparola=preferences.getString("parola","")

            var girisKullanici=binding.editTextText.text.toString()
            var girisparola=binding.editTextsif.text.toString()

            if (kayitliKullanic == girisKullanici && kayitliparola == girisparola){
                   Navigation.findNavController(it).navigate(R.id.icerikekraninagecis)
            }else{
                Toast.makeText(requireActivity(),"Giriş Bilgileri Hatalı",Toast.LENGTH_SHORT).show()
            }

        }


        binding.Kayit3.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.kayitekraninagecis2)
        }

        return binding.root

    }





}