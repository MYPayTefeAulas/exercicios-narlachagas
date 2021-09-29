package com.example.narla1

class GreeterTipo1 (val cumprimento : String, val comprimentoSufixo: String) {
    fun greet(nome: String): String {
        val cumprimentoCompleto = "$cumprimento $nome $comprimentoSufixo"
        return cumprimentoCompleto
    }

}