package com.example.narla1

class Greeter1 (val cumprimento : String) {
    fun greet(nome: String): String {
        val cumprimentocompleto = "$cumprimento $nome"
        return cumprimentocompleto
    }

}