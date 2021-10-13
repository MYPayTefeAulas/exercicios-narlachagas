package com.example.narla1

import android.graphics.Color
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

            if (novoContato.vericarNumVazio() && novoContato.verificarTelVazio()){
                binding.txtSaidaContato.setTextColor(Color.rgb(250, 0, 0))
                binding.txtSaidaContato.text = "Erro! Digite um nome e telefone para salvar!"
            }else if (novoContato.vericarNumVazio()){
                binding.txtSaidaContato.setTextColor(Color.rgb(250, 0, 0))
                binding.txtSaidaContato.text = " Erro! Nome vazio, digite um nome!"
            }else if (novoContato.verificarTelVazio()){
                binding.txtSaidaContato.setTextColor(Color.rgb(250, 0, 0))
                binding.txtSaidaContato.text = "Erro! Telefone vazio, digite um telefone!"
            }else if (agenda.contatoIgual(novoContato)){
                binding.txtSaidaContato.setTextColor(Color.rgb(200, 0, 0))
                binding.txtSaidaContato.text = "Erro! Contato igual!"
            }else{

                agenda.salvarContato(novoContato)
                binding.txtNomeContato.setText("")
                binding.txtNumeroContato.setText("")
                binding.txtSaidaContato.setTextColor(Color.rgb(0, 200, 0))
                binding.txtSaidaContato.text = "         CONTATO SALVO!\n" + "Nome: ${nome}  Telefone: ${telefone}"
            }

        }

        binding.btProximoContato.setOnClickListener {
            if (agenda.checarList()){
                binding.txtSaidaContato.text= "Sem contato existente."
                binding.txtSaidaContato.setTextColor(Color.rgb(250, 0, 0))

        }else{
                binding.txtNomeContato.setText(agenda.proximoNome())
                binding.txtNumeroContato.setText(agenda.proximoTelefone())
            }
        }

        binding.btDeletarContato.setOnClickListener {
            if (agenda.avisoVazia() == 0) {
                binding.txtSaidaContato.setTextColor(Color.rgb(200, 10, 10))
                binding.txtSaidaContato.text = "Agenda Vazia"
            } else {
                agenda.deletarContato()
                binding.txtNumeroContato.text.clear()
                binding.txtNomeContato.text.clear()
            }

        }
        setContentView(binding.root)
    }
}