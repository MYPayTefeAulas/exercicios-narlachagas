package com.example.narla1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.narla1.databinding.ActivityMainBinding
import com.example.narla1.databinding.ActivityPessoasBinding

class PessoasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPessoasBinding

    private var nome = ""
    private var idade = 0

    private val ListaPessoas = mutableListOf<Pessoa>()
    private var indiceAtual = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityPessoasBinding.inflate(layoutInflater)

        binding.btImprimir.setOnClickListener {
            binding.txtSair.text = imprimePessoa()
        }
        binding.btSalvar.setOnClickListener {
            nome = binding.txtNome.text.toString()
            binding.txtNome.text.clear()
            idade = binding.txtIdade.text.toString().toInt()
            binding.txtIdade.text.clear()

            val pessoa = Pessoa(nome, idade)
            ListaPessoas.add(pessoa)

        }

        setContentView(binding.root)
    }
    fun imprimePessoa(): String{
        if (indiceAtual >= ListaPessoas.size)
            indiceAtual= 0
        val pessoaAtual = ListaPessoas[indiceAtual]
        indiceAtual++
        return "Nome: ${pessoaAtual.nome}, Idade: ${pessoaAtual.idade}"
    }

}