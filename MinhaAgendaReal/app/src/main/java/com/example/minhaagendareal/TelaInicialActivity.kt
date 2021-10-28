package com.example.minhaagendareal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.minhaagendareal.databinding.ActivityTelaInicialBinding

class TelaInicialActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTelaInicialBinding
    private lateinit var adapter: ArrayAdapter<Contato>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTelaInicialBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setTitle("Agenda")

        Agenda.listadDeContatos.add(Contato("Narla", "111111"))
        Agenda.listadDeContatos.add(Contato("Luiz","22222"))
        Agenda.listadDeContatos.add(Contato("Ivan", "33333"))
        Agenda.listadDeContatos.add(Contato("Israel", "44444"))
        Agenda.listadDeContatos.add(Contato("Keitiane","55555"))
        Agenda.listadDeContatos.add(Contato("Anny", "66666"))
        Agenda.listadDeContatos.add(Contato("Talita", "77777"))
        Agenda.listadDeContatos.add(Contato("Nayane", "88888"))
        Agenda.listadDeContatos.add(Contato("Nauan","99999"))

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, Agenda.listadDeContatos)

        binding.lvContato.adapter= adapter
        binding.lvContato.setOnItemClickListener { parent, view, position, id ->
            val contato = adapter.getItem(position)
            Toast.makeText(this, "${contato!!.nome}", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, EditarContato::class.java)
            intent.putExtra("indiceContato", position)
            startActivity(intent)
        }

    }

    override fun onResume() {
        super.onResume()
        adapter.notifyDataSetChanged()
    }



}