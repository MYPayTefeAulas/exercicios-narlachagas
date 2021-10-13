package com.example.narla1

class Pessoas(val nome: String, val telefone: String) {
    fun vericarNumVazio() : Boolean{
       return nome == ""
    }

    fun verificarTelVazio() :Boolean {
        return telefone == ""
    }

}