package com.example.narla1

class Agenda {
    private var listaDeContatos = mutableListOf<Pessoas>()
    private var indiceAtual = 0

    fun salvarContato (novoContato: Pessoas){
        listaDeContatos.add(novoContato)

    }
    fun proximoNome() : String {
        if (indiceAtual == listaDeContatos.size){
            indiceAtual = 0
    }
        val contatoAtual = listaDeContatos[indiceAtual]
        indiceAtual++
        return "${contatoAtual.nome}"
    }
    fun proximoTelefone(): String{
        indiceAtual -=1
        if (indiceAtual == listaDeContatos.size){
            indiceAtual = 0
        }
        val contatoAtual = listaDeContatos[indiceAtual]
        indiceAtual++
        return "${contatoAtual.telefone}"
    }


}