package com.example.minhaagendareal2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.minhaagendareal.R
import com.example.minhaagendareal.databinding.ActivityAgendaV2Binding

class AgendaV2 : AppCompatActivity() {
    private lateinit var binding: ActivityAgendaV2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setTitle("Agenda")


        binding = ActivityAgendaV2Binding.inflate(layoutInflater)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainer, ListadeContatosFragment())
            .commit()

        binding.bottomNavigationView2.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.ic_home -> {
                    loadFragments(ListadeContatosFragment(), FRAGMENT_HOME)
                    true
                }
                R.id.ic_ajustes -> {
                   loadFragments(FragmentAjuste(), FRAGMENT_AJUSTES)
                    true
                }
                else-> false
            }

        }
        setContentView(binding.root)
    }

    private fun loadFragments(fragment: Fragment, tag: String){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, fragment, tag)
            commit()
        }
    }
    companion object {
        private const val FRAGMENT_HOME = "FRAGMENT_HOME"
        private const val FRAGMENT_AJUSTES = "FRAGMENT_AJUSTES"
    }
}



