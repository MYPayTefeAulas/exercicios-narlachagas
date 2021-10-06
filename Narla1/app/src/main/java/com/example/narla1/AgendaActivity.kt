package com.example.narla1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.narla1.databinding.ActivityAgendaBinding

class AgendaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAgendaBinding
    private var agenda = Agenda()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAgendaBinding.inflate(layoutInflater)


        binding.btSalvarContato.setOnClickListener {
            val nome = binding.txtNomeContato.text.toString()
            val telefone = binding.txtNumeroContato.text.toString()
            val novoContato = Pessoas(nome, telefone)
            agenda.salvarContato(novoContato)
            binding.txtSaidaContato.text = "Nome: ${nome}  Telefone: ${telefone}"
        }
        binding.btProximoContato.setOnClickListener {
            binding.txtNomeContato.setText(agenda.proximoNome())
            binding.txtNumeroContato.setText(agenda.proximoTelefone())
        }

        setContentView(binding.root)


    }
}