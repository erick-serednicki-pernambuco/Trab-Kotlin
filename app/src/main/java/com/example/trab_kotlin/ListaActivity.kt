package com.example.trab_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity: AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle(" ")
        setContentView(R.layout.layou_lista)
        setSupportActionBar(findViewById(R.id.toolbar2))

        val botao = findViewById<Button>(R.id.btnSair)
        botao.setOnClickListener {
            finish()
        }

        val fab = findViewById<FloatingActionButton>(R.id.fabAdicionar)
        fab.setOnClickListener {
            val intent = Intent(applicationContext,
                CadastroActivity :: class.java)
            startActivity(intent)
        }
    }
}