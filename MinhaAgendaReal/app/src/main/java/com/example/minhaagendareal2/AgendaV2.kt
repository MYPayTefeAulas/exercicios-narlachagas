package com.example.minhaagendareal2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.minhaagendareal.databinding.ActivityAgendaV2Binding

class AgendaV2 : AppCompatActivity() {
    private lateinit var binding: ActivityAgendaV2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inicializarLista()

        binding= ActivityAgendaV2Binding.inflate(layoutInflater)

        binding.rvContatos.layoutManager = LinearLayoutManager(this)
        binding.rvContatos.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
        binding.rvContatos.adapter = ContatosAdapter(Agenda.listadeContatos)


        setContentView(binding.root)


    }
    private fun inicializarLista() {
        Agenda.listadeContatos.addAll(
            listOf(
                ContatoV2("Narla", "11111"),
                ContatoV2("Ivan", "22222"),
                ContatoV2("Keitiane", "33333"),
                ContatoV2("Luiz", "44444"),
                ContatoV2("Israel", "55555"),
                ContatoV2("Nayane", "66666"),
                ContatoV2("Nayla","77777"),
                ContatoV2("Nauan", "88888"),
                ContatoV2("Talita", "99999"),
                ContatoV2("Anny", "10101"),
                ContatoV2("Cauã", "12345"),
                ContatoV2("Tereza", "54321"),
                ContatoV2("Eloisa", "12121")

            )
        )
    }

}