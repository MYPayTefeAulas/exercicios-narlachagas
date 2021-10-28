package com.example.minhaagendareal2

data class ContatoV2 (var  nome :String, var telefone : String){
    companion object{
        var lastId = -1
        fun getProximoId(): Int{
            return lastId++
        }
    }
}