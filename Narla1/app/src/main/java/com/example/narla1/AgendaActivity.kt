package com.example.narla1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.narla1.databinding.ActivityAgendaBinding

class AgendaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAgendaBinding
    private var nome = ""
    private var numero = 0
    private var listaDePessoas = mutableListOf<Pessoas>()
    private var indiceAtual = 0
    private var agenda = Agenda()
//    private var nomeAtual =

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAgendaBinding.inflate(layoutInflater)



        binding.btSalvar.setOnClickListener {
            binding.txtAviso.text = salvarContato()
            nome = binding.txtNome.text.toString()
            binding.txtNome.text.clear()
            numero = binding.txtNumero.text.toString().toInt()
            binding.txtNumero.text.clear()

        }




//        binding.btProximo.setOnClickListener {
//            if (nome == nome)
//
//        }


        setContentView(binding.root)


    }
    fun salvarContato (): String{
        if (indiceAtual >= listaDePessoas.size )
            indiceAtual = 0
        val pessoaAtual = listaDePessoas [indiceAtual]
        indiceAtual++
        return "Nome: ${pessoaAtual.nome}, Número: ${pessoaAtual.numero}"

    }
}