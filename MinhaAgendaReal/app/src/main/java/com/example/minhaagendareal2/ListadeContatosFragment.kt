package com.example.minhaagendareal2

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.minhaagendareal.databinding.FragmentListaContatoBinding

class ListadeContatosFragment: Fragment() {

    private var _binding : FragmentListaContatoBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: ContatosAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListaContatoBinding.inflate(inflater, container, false)
        adapter = ContatosAdapter(mutableListOf(), :: onBtEditarClick)

        binding.rvContatos.layoutManager = LinearLayoutManager(context)
        binding.rvContatos.addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.VERTICAL))
        binding.rvContatos.adapter = adapter
        adapter.swapData(Agenda.listadeContatos)
        inicializarLista()

        return binding.root
    }

        override fun onResume() {
            super.onResume()
            adapter.swapData(Agenda.listadeContatos)
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
    fun onBtEditarClick(indiceLista: Int){
        val intent = Intent (context, EditarContato::class.java)
        intent.putExtra("indiceContato", indiceLista)
        startActivity(intent)
    }
}