package com.example.minhaagendareal2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.minhaagendareal.databinding.ActivityAgendaV2Binding
import com.example.minhaagendareal.databinding.ItemContatoBinding

class ContatosAdapter(
    val listadeContatos : MutableList<ContatoV2>,
    val onBtEditarClick : (Int)-> Unit
    ) : RecyclerView.Adapter<ContatosAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: ItemContatoBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemContatoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return listadeContatos.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.txtNome.text = listadeContatos[position].nome
        holder.binding.txtTelefone.text = listadeContatos[position].telefone
        holder.binding.btEditaContato.setOnClickListener {
            onBtEditarClick(position)
        }
    }


    fun swapData(novaListasContatos: List<ContatoV2>) {
        listadeContatos.clear()
        listadeContatos.addAll(novaListasContatos)
        notifyDataSetChanged()
    }
}