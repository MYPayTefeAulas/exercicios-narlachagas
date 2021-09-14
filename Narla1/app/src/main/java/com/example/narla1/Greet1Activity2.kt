package com.example.narla1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.narla1.databinding.ActivityGreet12Binding

class Greet1Activity2 : AppCompatActivity() {
    private lateinit var binding: ActivityGreet12Binding
    private val listaNomes = mutableListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGreet12Binding.inflate(layoutInflater)
        //cod conf de variaveis globais da tela
        val greeter1 = Greeter1("olá")
        listaNomes.add("Narla")
        listaNomes.add("Talita")
        listaNomes.add("Anny")



//        conf botões
        binding.btImprimir.setOnClickListener {
            val nomeAtual = listaNomes
           binding.txtSaida.text=greeter1.greet("Rodrigo")

        }


        setContentView(binding.root)

    }
}