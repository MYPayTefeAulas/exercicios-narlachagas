package com.example.narla1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.narla1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btTroca.setOnClickListener {
//            binding.txtTela.text = "oi"
//            binding.txtTela.text = funcaoDobro()
//            binding.txtTela.text = funcaoMultiplicar()
            binding.txtTela.text = funcaoCalculadora()

        }


        val view = binding.root
        setContentView(view)
    }
    fun funcaoDobro(): String{

        val numerostr = binding.txtnumero2.text.toString()
        val numero = numerostr.toInt()
        val result = 2 * numero
        return result.toString()
    }
    fun funcaoMultiplicar (): String{
        val numeroEntrada1 = binding.txtnumero1.text.toString().toInt()
        val numeroEntrada2 = binding.txtnumero2.text.toString().toInt()
        var resultado = (numeroEntrada1 * numeroEntrada2)
        return resultado.toString()

    }
    fun funcaoCalculadora ():String{
        val operacao = binding.txtOperacao.text.toString()
        val numeroEntrada1 = binding.txtnumero1.text.toString().toInt()
        val numeroEntrada2 = binding.txtnumero2.text.toString().toInt()
        var result = ""
        if (operacao == "+"){
            return (numeroEntrada1 + numeroEntrada2).toString()
            }
        else if (operacao == "-"){
            return (numeroEntrada1 - numeroEntrada2).toString()
        }
        else if (operacao == "*"){
            return (numeroEntrada1 * numeroEntrada2).toString()
        }
        else if (operacao == "/"){
            return (numeroEntrada1 / numeroEntrada2).toString()
        }
        else{
            result = "Operação não encontrada"
        }
        return result.toString()


    }

}