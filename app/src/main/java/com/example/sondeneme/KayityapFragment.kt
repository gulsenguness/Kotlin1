package com.example.sondeneme

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.service.controls.actions.ModeAction
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.sondeneme.databinding.FragmentKayityapBinding


class KayityapFragment : Fragment() {
    private lateinit var binding: FragmentKayityapBinding
    private lateinit var sharedPreferences: SharedPreferences



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding= FragmentKayityapBinding.inflate(inflater,container,false)

        sharedPreferences=requireActivity().getSharedPreferences("Bilgilerimiz",Context.MODE_PRIVATE)
        var editor=sharedPreferences.edit()

        binding.kayitlar.setOnClickListener {

            var kullanicibilgi=binding.kullanic.text.toString()
            var kullanicisoyad=binding.soyadi.text.toString()
            var kulparola=binding.parola.text.toString()

            //veriekleme
            with(editor){
                putString("kullanici","$kullanicibilgi").apply()
                putString("soyadi","$kullanicisoyad").apply()
                putString("parola","$kulparola").apply()
            }
            Toast.makeText(requireActivity(),"Kayıt Başarılı",Toast.LENGTH_SHORT).show()

            with(binding){
                kullanic.text.clear()
                soyadi.text.clear()
                mail.text.clear()
                parola.text.clear()
            }


            Navigation.findNavController(it).navigate(R.id.kayitbilgilerigecis)

        }
        binding.button2.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.üyeyegecis2)
        }

        return binding.root

    }


}