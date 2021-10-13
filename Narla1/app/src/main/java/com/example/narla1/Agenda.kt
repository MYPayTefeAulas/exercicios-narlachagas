package com.example.narla1

class Agenda {
    private var listaDeContatos = mutableListOf<Pessoas>()
    private var indiceAtual = 0

    fun salvarContato(novoContato: Pessoas) {
        listaDeContatos.add(novoContato)

    }

    fun proximoNome(): String {
        if (indiceAtual == listaDeContatos.size) {
            indiceAtual = 0
        }
        val contatoAtual = listaDeContatos[indiceAtual]
        indiceAtual++
        return "${contatoAtual.nome}"
    }

    fun proximoTelefone(): String {
        indiceAtual -= 1
        if (indiceAtual == listaDeContatos.size) {
            indiceAtual = 0
        }
        val contatoAtual = listaDeContatos[indiceAtual]
        indiceAtual++
        return "${contatoAtual.telefone}"
    }

    fun deletarContato() {
        if (indiceAtual >= 1) {
            indiceAtual -= 1
        } else {
            val contatoAtual = listaDeContatos[indiceAtual]
            listaDeContatos.remove(contatoAtual)
        }
    }

    fun avisoVazia(): Int {
        return listaDeContatos.size
    }

    fun checarList(): Boolean {
        return listaDeContatos.isEmpty()
    }

    //    fun (novoContato: Pessoas): Boolean{
//        return listaDeContatos.isEmpty()
//    }
    fun contatoIgual(novoContato: Pessoas): Boolean {
        var resultado: Boolean = false
        for (lista in listaDeContatos) {
            if (lista.nome == novoContato.nome) {
                resultado = true
                break
            }
        }
        return resultado
    }
    fun contatoTelIgual(novoContato: Pessoas): Boolean {
        var resultado: Boolean = false
        for (lista in listaDeContatos) {
            if (lista.telefone == novoContato.telefone) {
                resultado = true
                break
            }
        }
        return resultado
    }
}

