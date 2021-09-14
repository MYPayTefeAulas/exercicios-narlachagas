package com.example.narla1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.narla1.databinding.ActivityListasBinding
import com.example.narla1.databinding.ActivityMainBinding

class ListasActivity : AppCompatActivity() {
    private lateinit var binding:ActivityListasBinding

    private val ListaFrutas = listOf("maça", "mamão", "abacate")
    private val ListaVegetais = listOf("pepino", "alface", "pimentão")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityListasBinding.inflate(layoutInflater)

        binding.btAnalisar.setOnClickListener {
            binding.txtSair.text = analisar(binding.txtEbtrada.text.toString())
        }

        setContentView(binding.root)
    }
    fun analisar(entrada: String): String {
        var saida = ""
        var encontrouAlimento = false

        for (fruta in ListaFrutas) {
            if (fruta == entrada) {
                saida = "é uma fruta"
                encontrouAlimento = true
                break
            }
        }
        for (vegetal in ListaVegetais) {
            if (vegetal == entrada) {
                saida = "é uma vegetal"
                break
            }
        }
        if (encontrouAlimento){
            saida = "não sei"
        }

        return saida
    }
}