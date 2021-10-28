package com.example.minhaagendareal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.minhaagendareal.databinding.ActivityEditarContatoBinding

class EditarContato : AppCompatActivity() {
    private lateinit var binding: ActivityEditarContatoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditarContatoBinding.inflate(layoutInflater)

        setContentView(binding.root)
        setTitle("Editar Contato")

        val indiceContato = intent.getIntExtra("indiceContato", -1)

        val nome : String = Agenda.listadDeContatos[indiceContato].nome
        val telefone : String = Agenda.listadDeContatos[indiceContato].telefone
        binding.txtNomeContato.setText(nome)
        binding.txtTelefoneContato.setText(telefone)

        binding.btSalvarContatoA.setOnClickListener {
            Agenda.listadDeContatos[indiceContato].nome = binding.txtNomeContato.text.toString()
            Agenda.listadDeContatos[indiceContato].telefone = binding.txtTelefoneContato.text.toString()
            Toast.makeText(this, "Contato Salvo!", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}