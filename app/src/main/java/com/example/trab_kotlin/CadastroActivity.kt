package com.example.trab_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class CadastroActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setTitle(" ")

        setContentView(R.layout.layout_cadastro)
        setSupportActionBar(findViewById(R.id.toolbar3))
        val botaoSalvar = findViewById<Button>(R.id.btnSalvar)
        botaoSalvar.setOnClickListener {
            val intent = Intent(applicationContext,
                ListaActivity :: class.java)
            startActivity(intent)
        }
        val botaoCancelar = findViewById<Button>(R.id.btnCancelar)
        botaoCancelar.setOnClickListener {
            finish()
        }
    }
}